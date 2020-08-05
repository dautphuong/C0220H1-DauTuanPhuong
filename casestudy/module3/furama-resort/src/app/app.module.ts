import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateKhachHangComponent } from './component/khach-hang/create-khach-hang/create-khach-hang.component';
import { ListKhachHangComponent } from './component/khach-hang/list-khach-hang/list-khach-hang.component';
import { ListNhanVienComponent } from './component/nhan-vien/list-nhan-vien/list-nhan-vien.component';
import { ListDichVuComponent } from './component/dich-vu/list-dich-vu/list-dich-vu.component';
import { CreateDichVuComponent } from './component/dich-vu/create-dich-vu/create-dich-vu.component';
import { CreateHopDongComponent } from './component/hop-dong/create-hop-dong/create-hop-dong.component';
import { CreateHopDongChiTietComponent } from './component/hop-dong/create-hop-dong-chi-tiet/create-hop-dong-chi-tiet.component';
import { CreateNhanVienComponent } from './component/nhan-vien/create-nhan-vien/create-nhan-vien.component';
import { RegisterDichVuComponent } from './component/dich-vu/register-dich-vu/register-dich-vu.component';
import { ReportKhachHangComponent } from './component/khach-hang/report-khach-hang/report-khach-hang.component';
import { ListHopDongComponent } from './component/hop-dong/list-hop-dong/list-hop-dong.component';
import {ReactiveFormsModule} from '@angular/forms';

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
        AppRoutingModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
