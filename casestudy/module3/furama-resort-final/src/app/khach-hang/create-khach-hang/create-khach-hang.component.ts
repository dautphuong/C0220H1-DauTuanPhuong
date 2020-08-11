import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {KhachhangService} from '../khachhang.service';

@Component({
  selector: 'app-create-khach-hang',
  templateUrl: './create-khach-hang.component.html',
  styleUrls: ['./create-khach-hang.component.css']
})
export class CreateKhachHangComponent implements OnInit {
  khachHangForm: FormGroup;

  constructor(private fb: FormBuilder, private khachhangService: KhachhangService, private router: Router) {
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
  }

  onSubmit() {
    this.khachhangService.save(this.khachHangForm.value);
    this.router.navigateByUrl('');
  }
}
