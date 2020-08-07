import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ListKhachHangComponent} from './component/khach-hang/list-khach-hang/list-khach-hang.component';
import {CreateKhachHangComponent} from './component/khach-hang/create-khach-hang/create-khach-hang.component';
import {UpdateKhachHangComponent} from './component/khach-hang/update-khach-hang/update-khach-hang.component';
import {CommonModule} from '@angular/common';
import {ListNhanVienComponent} from './component/nhan-vien/list-nhan-vien/list-nhan-vien.component';
import {CreateNhanVienComponent} from './component/nhan-vien/create-nhan-vien/create-nhan-vien.component';
import {ListDichVuComponent} from './component/dich-vu/list-dich-vu/list-dich-vu.component';
import {CreateDichVuComponent} from './component/dich-vu/create-dich-vu/create-dich-vu.component';
import {RegisterDichVuComponent} from './component/dich-vu/register-dich-vu/register-dich-vu.component';
import {ListHopDongComponent} from './component/hop-dong/list-hop-dong/list-hop-dong.component';
import {CreateHopDongComponent} from './component/hop-dong/create-hop-dong/create-hop-dong.component';
import {CreateHopDongChiTietComponent} from './component/hop-dong/create-hop-dong-chi-tiet/create-hop-dong-chi-tiet.component';
import {ReportKhachHangComponent} from './component/khach-hang/report-khach-hang/report-khach-hang.component';

const routes: Routes = [
  {path: '', redirectTo: 'list-khach-hang', pathMatch: 'full'},
  {
    path: 'list-khach-hang',
    children: [
      {path: '', component: ListKhachHangComponent},
      {path: 'create-khach-hang', component: CreateKhachHangComponent},
      {path: 'update-khach-hang/:id', component: UpdateKhachHangComponent}
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
