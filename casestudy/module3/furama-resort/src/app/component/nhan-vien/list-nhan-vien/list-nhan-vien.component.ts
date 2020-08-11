import {Component, Input, OnInit} from '@angular/core';
import {listNhanVien, NhanvienModel} from '../../../model/nhanvien.model';
import {NhanvienService} from '../../../Service/nhanvien.service';

@Component({
  selector: 'app-list-nhan-vien',
  templateUrl: './list-nhan-vien.component.html',
  styleUrls: ['./list-nhan-vien.component.css']
})
export class ListNhanVienComponent implements OnInit {
  listNhanVien: NhanvienModel[];

  constructor(private NhanVienService: NhanvienService) {
    this.listNhanVien = NhanVienService.findAll();
  }

  ngOnInit(): void {
  }

}
