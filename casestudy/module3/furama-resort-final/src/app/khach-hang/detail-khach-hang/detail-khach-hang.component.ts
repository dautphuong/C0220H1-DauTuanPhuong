import {Component, OnInit} from '@angular/core';
import {Khachhang} from '../khach-hang';
import {KhachHangModule} from '../khach-hang.module';
import {KhachhangService} from '../khachhang.service';
import {ActivatedRoute, ParamMap} from '@angular/router';

@Component({
  selector: 'app-detail-khach-hang',
  templateUrl: './detail-khach-hang.component.html',
  styleUrls: ['./detail-khach-hang.component.css']
})
export class DetailKhachHangComponent implements OnInit {

  khachHang: Khachhang = new Khachhang();

  constructor(private khachhangService: KhachhangService, private activatedRoute: ActivatedRoute) {

  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = Number(paramMap.get('id'));

      this.khachhangService.findById(id).subscribe(
        (next) => {
          this.khachHang = next;
        }
      );
    });
  }

}
