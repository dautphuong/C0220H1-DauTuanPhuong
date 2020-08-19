import {Component, Inject, OnInit} from '@angular/core';
import {Khachhang} from '../khach-hang';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {KhachhangService} from '../khachhang.service';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';

@Component({
  selector: 'app-delete-khach-hang',
  templateUrl: './delete-khach-hang.component.html',
  styleUrls: ['./delete-khach-hang.component.css']
})
export class DeleteKhachHangComponent implements OnInit {

  constructor(private router: Router, private khachhangService: KhachhangService, private activatedRoute: ActivatedRoute,
              public dialogRef: MatDialogRef<DeleteKhachHangComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = Number(paramMap.get('id'));
      this.khachhangService.delete(id).subscribe();
      this.router.navigateByUrl('/');
    });
  }

  // onYes(): void {
  //   this.khachhangService.delete(this.data.id).subscribe(data => {
  //     this.dialogRef.close();
  //   });
  // }
  //
  // onNoClick(): void {
  //   this.dialogRef.close();
  // }

}
