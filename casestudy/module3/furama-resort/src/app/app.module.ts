import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateKhachHangComponent } from './create-khach-hang/create-khach-hang.component';
import { ListKhachHangComponent } from './list-khach-hang/list-khach-hang.component';
import { ListNhanVienComponent } from './list-nhan-vien/list-nhan-vien.component';
import { ListDichVuComponent } from './list-dich-vu/list-dich-vu.component';
import { CreateDichVuComponent } from './create-dich-vu/create-dich-vu.component';
import { CreateHopDongComponent } from './create-hop-dong/create-hop-dong.component';
import { CreateHopDongChiTietComponent } from './create-hop-dong-chi-tiet/create-hop-dong-chi-tiet.component';
import { CreateNhanVienComponent } from './create-nhan-vien/create-nhan-vien.component';
import { RegisterDichVuComponent } from './register-dich-vu/register-dich-vu.component';
import { ReportKhachHangComponent } from './report-khach-hang/report-khach-hang.component';

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
    ReportKhachHangComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
