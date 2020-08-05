import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-create-dich-vu',
  templateUrl: './create-dich-vu.component.html',
  styleUrls: ['./create-dich-vu.component.css']
})
export class CreateDichVuComponent implements OnInit {
  dichVuForm: FormGroup;

  constructor(private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this.dichVuForm = this.fb.group({
      idDichVu: ['', [Validators.required, Validators.pattern(/^DV-\d{4}$/)]],
      tenDichVu: ['', [Validators.required]],
      dienTich: ['', [Validators.required]],
      soTang: ['', [Validators.required]],
      soNguoiToiDa: [''],
      chiPhiThue: [''],
      idKieuThue: ['1', [Validators.required]],
      idLoaiDichVu: ['1', [Validators.required]],
      trangThai: [''],
    });
  }

  onSubmit() {
    console.log(this.dichVuForm);
  }

}
