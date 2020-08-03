import {Component, Input, OnInit} from '@angular/core';
import {listNhanVien} from '../../../model/nhanvien.model';

@Component({
  selector: 'app-list-nhan-vien',
  templateUrl: './list-nhan-vien.component.html',
  styleUrls: ['./list-nhan-vien.component.css']
})
export class ListNhanVienComponent implements OnInit {
  @Input() listNhanVien = listNhanVien;
  constructor() { }

  ngOnInit(): void {
  }

}
