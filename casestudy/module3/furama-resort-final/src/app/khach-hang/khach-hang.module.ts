import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ListKhachHangComponent} from './list-khach-hang/list-khach-hang.component';
import {CreateKhachHangComponent} from './create-khach-hang/create-khach-hang.component';
import {KhachhangService} from './khachhang.service';
import {RouterModule} from '@angular/router';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';



@NgModule({
  declarations: [ListKhachHangComponent, CreateKhachHangComponent],
  imports: [
    CommonModule,
    RouterModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [KhachhangService],

})
export class KhachHangModule { }
