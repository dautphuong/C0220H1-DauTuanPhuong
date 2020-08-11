import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {KhachhangService} from '../../../Service/khachhang.service';
import {Router} from '@angular/router';
import {NhanvienService} from '../../../Service/nhanvien.service';

@Component({
  selector: 'app-create-nhan-vien',
  templateUrl: './create-nhan-vien.component.html',
  styleUrls: ['./create-nhan-vien.component.css']
})
export class CreateNhanVienComponent implements OnInit {
  nhanVienForm: FormGroup;

  constructor(private fb: FormBuilder, private NhanVienService: NhanvienService, private router: Router) {

  }

  ngOnInit(): void {
    this.nhanVienForm = this.fb.group({
      idNhanVien: ['', [Validators.required, Validators.pattern(/^NV-\d{4}$/)]],
      hoTen: ['', [Validators.required]],
      idViTri: ['1'],
      idTrinhDo: ['1'],
      idBoPhan: ['1'],
      ngaySinh: ['', [Validators.required]],
      socmnd: ['', [Validators.required, Validators.pattern(/\d{9}|\d{12}/)]],
      sdt: ['', [Validators.required, Validators.pattern(/8490\d{7}|8491\d{7}|090\d{7}|091\d{7}/)]],
      email: ['', [Validators.required, Validators.pattern(/^([a-zA-Z0-9_.-])+@(([a-zA-Z0-9-])+.)+[.]([a-zA-Z0-9]{3,4})+$/)]],
      diaChi: [''],
      luong: ['0', [Validators.required, Validators.min(0)]]
    });
  }

  onSubmit() {
    this.NhanVienService.save(this.nhanVienForm.value);
    this.router.navigateByUrl('list-nhan-vien');
  }

}
