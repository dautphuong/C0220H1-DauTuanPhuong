import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {CommonModule} from '@angular/common';
import {ListKhachHangComponent} from './khach-hang/list-khach-hang/list-khach-hang.component';
import {CreateKhachHangComponent} from './khach-hang/create-khach-hang/create-khach-hang.component';
import {ListNhanVienComponent} from './nhan-vien/list-nhan-vien/list-nhan-vien.component';
import {CreateNhanVienComponent} from './nhan-vien/create-nhan-vien/create-nhan-vien.component';
import {ListDichVuComponent} from './dich-vu/list-dich-vu/list-dich-vu.component';
import {CreateDichVuComponent} from './dich-vu/create-dich-vu/create-dich-vu.component';
import {RegisterDichVuComponent} from './register-function/register-dich-vu/register-dich-vu.component';
import {ListHopDongComponent} from './hop-dong/list-hop-dong/list-hop-dong.component';
import {CreateHopDongComponent} from './hop-dong/create-hop-dong/create-hop-dong.component';
import {CreateHopDongChiTietComponent} from './register-function/create-hop-dong-chi-tiet/create-hop-dong-chi-tiet.component';
import {ReportKhachHangComponent} from './report/report-khach-hang/report-khach-hang.component';
import {DetailKhachHangComponent} from './khach-hang/detail-khach-hang/detail-khach-hang.component';
import {UpdateKhachHangComponent} from './khach-hang/update-khach-hang/update-khach-hang.component';
import {DeleteKhachHangComponent} from './khach-hang/delete-khach-hang/delete-khach-hang.component';


const routes: Routes = [
  {path: '', redirectTo: 'list-khach-hang', pathMatch: 'full'},
  {
    path: 'list-khach-hang',
    children: [
      {path: '', component: ListKhachHangComponent},
      {path: 'create-khach-hang', component: CreateKhachHangComponent},
      {path: 'detail-khach-hang/:id', component: DetailKhachHangComponent},
      {path: 'update-khach-hang/:id', component: UpdateKhachHangComponent},
      {path: 'delete-khach-hang/:id', component: DeleteKhachHangComponent}
    ]
  },
  {
    path: 'list-nhan-vien',
    children: [
      {path: '', component: ListNhanVienComponent},
      {path: 'create-nhan-vien', component: CreateNhanVienComponent},
    ]
  },
  {
    path: 'list-dich-vu',
    children: [
      {path: '', component: ListDichVuComponent},
      {path: 'create-dich-vu', component: CreateDichVuComponent},
    ]
  },
  {path: 'register-dich-vu', component: RegisterDichVuComponent},
  {
    path: 'list-hop-dong',
    children: [
      {path: '', component: ListHopDongComponent},
      {path: 'create-hop-dong', component: CreateHopDongComponent},
    ]
  },
  {path: 'create-hop-dong-chi-tiet', component: CreateHopDongChiTietComponent},
  {path: 'report-khach-hang', component: ReportKhachHangComponent},
];

@NgModule({
  imports: [CommonModule, RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
