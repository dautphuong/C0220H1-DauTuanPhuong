import {Component, OnInit} from '@angular/core';
import {SinhVienService} from '../sinh-vien.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {SinhVien} from '../sinh-vien';

@Component({
  selector: 'app-edit-sinh-vien',
  templateUrl: './edit-sinh-vien.component.html',
  styleUrls: ['./edit-sinh-vien.component.css']
})
export class EditSinhVienComponent implements OnInit {

  sinhVien: SinhVien = new SinhVien();
  sinhVienForm: FormGroup;

  constructor(private fb: FormBuilder, private sinhVienService: SinhVienService,
              private activatedRoute: ActivatedRoute, private router: Router) {
  }

  ngOnInit(): void {
    this.sinhVienForm = this.fb.group({
      id: [''],
      tenSinhVien: ['', [Validators.required]],
      tenNhom: ['', [Validators.required, Validators.pattern(/nhóm [1|2|3]/)]],
      tenDeTai: ['', [Validators.required]],
      giaoVienHuongDan: [''],
      email: ['', [Validators.required, Validators.pattern(/^([a-zA-Z0-9_.-])+@(([a-zA-Z0-9-])+.)+[.]([a-zA-Z0-9]{3,4})+$/)]],
      soDienThoai: ['', Validators.pattern(/[0-9]{10}|[0-9]{12}/)],
    });

    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = Number(paramMap.get('id'));

      this.sinhVienService.findById(id).subscribe(
        next => {
          console.log('observable process');
          this.sinhVien = next;
          this.sinhVienForm.patchValue(
            {
              id: this.sinhVien.id,
              tenSinhVien: this.sinhVien.tenSinhVien,
              tenDeTai: this.sinhVien.tenDeTai,
              tenNhom: this.sinhVien.tenNhom,
              soDienThoai: this.sinhVien.soDienThoai,
              email: this.sinhVien.email,
              giaoVienHuongDan: this.sinhVien.giaoVienHuongDan,
            });
        }, error => {
        });
    });

  }

  submitForm(): void {
    this.sinhVien = Object.assign({}, this.sinhVienForm.value);
    console.log(this.sinhVien);

    this.sinhVienService.update(this.sinhVien).subscribe(
      next => {
        console.log('Update process!');
      }, error => {
        console.log('Update failed!');
      }
    );

    this.router.navigateByUrl('/');
  }
}
