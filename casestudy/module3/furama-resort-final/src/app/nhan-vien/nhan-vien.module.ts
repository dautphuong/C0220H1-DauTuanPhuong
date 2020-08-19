import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateNhanVienComponent } from './create-nhan-vien/create-nhan-vien.component';
import { ListNhanVienComponent } from './list-nhan-vien/list-nhan-vien.component';
import {RouterModule} from '@angular/router';
import {NhanvienService} from './nhanvien.service';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';



@NgModule({
  declarations: [CreateNhanVienComponent, ListNhanVienComponent],
  imports: [
    CommonModule,
    RouterModule,
    ReactiveFormsModule,
    FormsModule,
    NgxPaginationModule
  ],
  providers: [NhanvienService],
})
export class NhanVienModule { }
