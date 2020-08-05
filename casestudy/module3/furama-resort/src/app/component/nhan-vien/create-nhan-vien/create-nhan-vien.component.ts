import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-create-nhan-vien',
  templateUrl: './create-nhan-vien.component.html',
  styleUrls: ['./create-nhan-vien.component.css']
})
export class CreateNhanVienComponent implements OnInit {
  nhanVienForm: FormGroup;

  constructor(private fb: FormBuilder) {
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
    console.log(this.nhanVienForm);
  }

}
