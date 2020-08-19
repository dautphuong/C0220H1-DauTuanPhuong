import {Component, Input, OnInit} from '@angular/core';
import {Khachhang} from '../khach-hang';
import {KhachhangService} from '../khachhang.service';
import {MatDialog} from '@angular/material/dialog';
import {DeleteKhachHangComponent} from '../delete-khach-hang/delete-khach-hang.component';
import {ActivatedRoute, ParamMap} from '@angular/router';

@Component({
  selector: 'app-list-khach-hang',
  templateUrl: './list-khach-hang.component.html',
  styleUrls: ['./list-khach-hang.component.css']
})
export class ListKhachHangComponent implements OnInit {

  listKhachHangAPI: Khachhang[];
  listKhachHang: Khachhang[];
  curPage = 1;
  keywordId = '';
  keywordName = '';
  regexId: string;
  regexName: string;
  khachHang: Khachhang;

  constructor(private khachhangService: KhachhangService, public dialog: MatDialog, private activatedRoute: ActivatedRoute) {
    // this.listKhachHang = khachhangService.findAll();
    this.khachhangService.findAll().subscribe(
      next => {
        this.listKhachHangAPI = next; // trường hợp đang xử lý
      }, error => {
        this.listKhachHang = []; // lỗi thì mảng rỗng
      }, () => {
        console.log('Get list khach hang successfully'); // trường hợp xong (không có cũng dc)
        this.listKhachHang = this.listKhachHangAPI;
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
      this.listKhachHang = this.listKhachHangAPI.filter(res => {
        return res.idKhachHang.match('' + this.regexId) && res.hoTen.match('' + this.regexName);
      });
    } else {
      this.listKhachHang = this.listKhachHangAPI;
    }
  }


  // openDialog(i): void {
  //   this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
  //     const id = Number(paramMap.get('id'));
  //
  //     this.khachhangService.findById(id).subscribe(
  //       (next) => {
  //         this.khachHang = next;
  //       }, error => {
  //         console.log('error');
  //       }, () => {
  //
  //
  //         const dialogRef = this.dialog.open(DeleteKhachHangComponent, {
  //           width: '500px',
  //           data: {khachHang: this.khachHang},
  //           disableClose: true,
  //       })
  //         ;
  //
  //         dialogRef.afterClosed().subscribe(result => {
  //           console.log('The dialog was closed');
  //         });
  //       }
  //     );
  //   });
  // }


}
