import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule} from '@angular/router';
import {ReportKhachHangComponent} from './report-khach-hang/report-khach-hang.component';



@NgModule({
  declarations: [ReportKhachHangComponent],
  imports: [
    CommonModule,
    RouterModule,
  ]
})
export class ReportModule { }
