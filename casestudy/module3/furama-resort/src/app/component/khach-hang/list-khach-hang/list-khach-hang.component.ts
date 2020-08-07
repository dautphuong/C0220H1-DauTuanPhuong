import {Component, Input, OnInit} from '@angular/core';
import {KhachhangModel, listKhachHang} from '../../../model/khachhang.model';
import {KhachhangService} from '../../../Service/khachhang.service';

@Component({
  selector: 'app-list-khach-hang',
  templateUrl: './list-khach-hang.component.html',
  styleUrls: ['./list-khach-hang.component.css']
})
export class ListKhachHangComponent implements OnInit {
  // listKhachHang = listKhachHang;
  listKhachHang: KhachhangModel[];

  constructor(private khachhangService: KhachhangService) {
    this.listKhachHang = khachhangService.findAll();
  }

  ngOnInit(): void {
  }

}
