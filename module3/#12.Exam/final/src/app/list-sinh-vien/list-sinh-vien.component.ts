import {Component, OnInit} from '@angular/core';
import {SinhVien} from '../sinh-vien';
import {SinhVienService} from '../sinh-vien.service';

@Component({
  selector: 'app-list-sinh-vien',
  templateUrl: './list-sinh-vien.component.html',
  styleUrls: ['./list-sinh-vien.component.css']
})
export class ListSinhVienComponent implements OnInit {
  listSinhVienAPI: SinhVien[];
  listSinhVien: SinhVien[];

  constructor(private sinhVienService: SinhVienService) {
    this.sinhVienService.findAll().subscribe(
      next => {
        this.listSinhVienAPI = next; // trường hợp đang xử lý
      }, error => {
        this.listSinhVien = []; // lỗi thì mảng rỗng
      }, () => {
        this.listSinhVien = this.listSinhVienAPI;
      }
    );
  }

  ngOnInit(): void {
  }

}
