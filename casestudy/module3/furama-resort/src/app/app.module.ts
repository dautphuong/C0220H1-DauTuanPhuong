import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateKhachHangComponent } from './khach-hang/create-khach-hang/create-khach-hang.component';
import { ListKhachHangComponent } from './khach-hang/list-khach-hang/list-khach-hang.component';
import { ListNhanVienComponent } from './nhan-vien/list-nhan-vien/list-nhan-vien.component';
import { ListDichVuComponent } from './dich-vu/list-dich-vu/list-dich-vu.component';
import { CreateDichVuComponent } from './dich-vu/create-dich-vu/create-dich-vu.component';
import { CreateHopDongComponent } from './hop-dong/create-hop-dong/create-hop-dong.component';
import { CreateHopDongChiTietComponent } from './hop-dong/create-hop-dong-chi-tiet/create-hop-dong-chi-tiet.component';
import { CreateNhanVienComponent } from './nhan-vien/create-nhan-vien/create-nhan-vien.component';
import { RegisterDichVuComponent } from './dich-vu/register-dich-vu/register-dich-vu.component';
import { ReportKhachHangComponent } from './khach-hang/report-khach-hang/report-khach-hang.component';
import { ListHopDongComponent } from './hop-dong/list-hop-dong/list-hop-dong.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateKhachHangComponent,
    ListKhachHangComponent,
    ListNhanVienComponent,
    ListDichVuComponent,
    CreateDichVuComponent,
    CreateHopDongComponent,
    CreateHopDongChiTietComponent,
    CreateNhanVienComponent,
    RegisterDichVuComponent,
    ReportKhachHangComponent,
    ListHopDongComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
