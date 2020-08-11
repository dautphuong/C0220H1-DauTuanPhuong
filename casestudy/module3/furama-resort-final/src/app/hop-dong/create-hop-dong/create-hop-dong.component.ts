import {Component, Input, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {HopdongService} from '../hopdong.service';

@Component({
  selector: 'app-create-hop-dong',
  templateUrl: './create-hop-dong.component.html',
  styleUrls: ['./create-hop-dong.component.css']
})
export class CreateHopDongComponent implements OnInit {
  hopDongForm: FormGroup;
  constructor(private fb: FormBuilder, private hopDongService: HopdongService, private router: Router) {
  }


  ngOnInit(): void {
    this.hopDongForm = this.fb.group({
      idHopDong: ['', [Validators.required, Validators.pattern(/^HD-\d{4}$/)]],
      idKhachHang: ['', [Validators.required, Validators.pattern(/^KH-\d{4}$/)]],
      idNhanVien: ['', [Validators.required, Validators.pattern(/^NV-\d{4}$/)]],
      ngayLamHopDong: ['', [Validators.required]],
      ngayKetThuc: ['', [Validators.required]],
    });
  }

  onSubmit() {
    console.log(this.hopDongForm);
    this.hopDongService.save(this.hopDongForm.value);
    this.router.navigateByUrl('');
  }
}
