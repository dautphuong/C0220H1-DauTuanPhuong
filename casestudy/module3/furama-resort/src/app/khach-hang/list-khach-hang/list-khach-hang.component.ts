import {Component, Input, OnInit} from '@angular/core';
import {listKhachHang} from '../../khachhang.model';

@Component({
  selector: 'app-list-khach-hang',
  templateUrl: './list-khach-hang.component.html',
  styleUrls: ['./list-khach-hang.component.css']
})
export class ListKhachHangComponent implements OnInit {
  @Input() listKhachHang = listKhachHang;

  constructor() { }

  ngOnInit(): void {
  }

}
