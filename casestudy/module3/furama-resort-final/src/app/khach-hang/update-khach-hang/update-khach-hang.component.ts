import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {Khachhang} from '../khach-hang';
import {KhachhangService} from '../khachhang.service';

@Component({
  selector: 'app-update-khach-hang',
  templateUrl: './update-khach-hang.component.html',
  styleUrls: ['./update-khach-hang.component.css']
})
export class UpdateKhachHangComponent implements OnInit {

  khachHang: Khachhang = new Khachhang();
  khachHangForm: FormGroup;
  id: number;

  constructor(private fb: FormBuilder, private khachHangService: KhachhangService,
              private activatedRoute: ActivatedRoute, private router: Router) {
  }


  ngOnInit(): void {
    this.khachHangForm = this.fb.group({
      idKhachHang: ['', [Validators.required, Validators.pattern(/^KH-\d{4}$/)]],
      hoTen: ['', [Validators.required]],
      ngaySinh: ['', [Validators.required]],
      socmnd: ['', [Validators.required, Validators.pattern(/\d{9}|\d{12}/)]],
      sdt: ['', [Validators.required, Validators.pattern(/8490\d{7}|8491\d{7}|090\d{7}|091\d{7}/)]],
      email: ['', [Validators.required, Validators.pattern(/^([a-zA-Z0-9_.-])+@(([a-zA-Z0-9-])+.)+[.]([a-zA-Z0-9]{3,4})+$/)]],
      diaChi: [''],
      idLoaiKhach: ['', [Validators.required]]
    });
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = Number(paramMap.get('id'));

      this.khachHangService.findById(id).subscribe(
        next => {
          console.log('observable process');
          this.khachHang = next;
          this.id = this.khachHang.id;
          this.khachHangForm.patchValue(
            {
              idKhachHang: this.khachHang.idKhachHang,
              hoTen: this.khachHang.hoTen,
              ngaySinh: this.khachHang.ngaySinh,
              socmnd: this.khachHang.socmnd,
              sdt: this.khachHang.sdt,
              email: this.khachHang.email,
              diaChi: this.khachHang.diaChi,
              idLoaiKhach: this.khachHang.idLoaiKhach
            });
        }, error => {
        });
    });
  }

  submitForm(): void {
    this.khachHang = Object.assign({}, this.khachHangForm.value);
    this.khachHang.id = this.id;
    console.log(this.khachHang);

    this.khachHangService.update(this.khachHang).subscribe(
      next => {
        console.log('Update process!');
      }, error => {
        console.log('Update failed!');
      }
    );

    this.router.navigateByUrl('/');
  }

}
