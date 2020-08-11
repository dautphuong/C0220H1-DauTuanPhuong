import {Component, Input, OnInit} from '@angular/core';
import {Nhanvien} from '../nhan-vien';
import {NhanvienService} from '../nhanvien.service';

@Component({
  selector: 'app-list-nhan-vien',
  templateUrl: './list-nhan-vien.component.html',
  styleUrls: ['./list-nhan-vien.component.css']
})
export class ListNhanVienComponent implements OnInit {
  listNhanVien: Nhanvien[];

  constructor(private NhanVienService: NhanvienService) {
    this.listNhanVien = NhanVienService.findAll();
  }

  ngOnInit(): void {
  }

}
