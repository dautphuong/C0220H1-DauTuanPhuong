import { NgModule } from '@angular/core';
import {CommonModule} from '@angular/common';
import {ListKhachHangComponent} from './list-khach-hang/list-khach-hang.component';
import {CreateKhachHangComponent} from './create-khach-hang/create-khach-hang.component';
import {KhachhangService} from './khachhang.service';
import {RouterModule} from '@angular/router';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import { UpdateKhachHangComponent } from './update-khach-hang/update-khach-hang.component';
import { DetailKhachHangComponent } from './detail-khach-hang/detail-khach-hang.component';
import { DeleteKhachHangComponent } from './delete-khach-hang/delete-khach-hang.component';
import {MaterialModule} from '../material.module';



@NgModule({
  declarations: [ListKhachHangComponent, CreateKhachHangComponent, UpdateKhachHangComponent, DetailKhachHangComponent, DeleteKhachHangComponent],
  imports: [
    CommonModule,
    RouterModule,
    ReactiveFormsModule,
    FormsModule,
    NgxPaginationModule,
    Ng2SearchPipeModule,
    MaterialModule
  ],
  providers: [KhachhangService],

})
export class KhachHangModule { }
