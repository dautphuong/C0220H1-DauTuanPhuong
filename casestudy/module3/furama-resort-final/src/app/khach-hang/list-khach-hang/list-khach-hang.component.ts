import {Component, Input, OnInit} from '@angular/core';
import {Khachhang} from '../khach-hang';
import {KhachhangService} from '../khachhang.service';

@Component({
  selector: 'app-list-khach-hang',
  templateUrl: './list-khach-hang.component.html',
  styleUrls: ['./list-khach-hang.component.css']
})
export class ListKhachHangComponent implements OnInit {
  listKhachHang: Khachhang[];

  constructor(private khachhangService: KhachhangService) {
    this.listKhachHang = khachhangService.findAll();
  }

  ngOnInit(): void {
  }

}
