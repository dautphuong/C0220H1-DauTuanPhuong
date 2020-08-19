import {Component, Input, OnInit} from '@angular/core';
import {Nhanvien} from '../nhan-vien';
import {NhanvienService} from '../nhanvien.service';

@Component({
  selector: 'app-list-nhan-vien',
  templateUrl: './list-nhan-vien.component.html',
  styleUrls: ['./list-nhan-vien.component.css']
})
export class ListNhanVienComponent implements OnInit {
  listNhanVienAPI: Nhanvien[];
  listNhanVien: Nhanvien[];
  keywordId = '';
  keywordName = '';
  regexId: string;
  regexName: string;
  curPage: 1;

  constructor(private NhanVienService: NhanvienService) {
    this.NhanVienService.findAll().subscribe(
      next => {
        this.listNhanVienAPI = next; // trường hợp đang xử lý
      }, error => {
        this.listNhanVien = []; // lỗi thì mảng rỗng
      }, () => {
        console.log('Get list khach hang successfully'); // trường hợp xong (không có cũng dc)
        this.listNhanVien = this.listNhanVienAPI;
      }
    );
  }

  ngOnInit(): void {
  }

  search(): void {
    this.regexId = this.keywordId;
    this.regexName = this.keywordName;
    // tslint:disable-next-line:triple-equals
    if (this.regexId != '' || this.regexName != '') {
      this.listNhanVien = this.listNhanVienAPI.filter(res => {
        return res.idNhanVien.match('' + this.regexId) && res.hoTen.match('' + this.regexName);
      });
    } else {
      this.listNhanVien = this.listNhanVienAPI;
    }
  }
}
