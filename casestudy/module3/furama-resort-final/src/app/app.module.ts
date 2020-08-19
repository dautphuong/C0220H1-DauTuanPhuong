import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {ReportModule} from './report/report.module';
import {RegisterFunctionModule} from './register-function/register-function.module';
import {NhanVienModule} from './nhan-vien/nhan-vien.module';
import {KhachHangModule} from './khach-hang/khach-hang.module';
import {HopDongModule} from './hop-dong/hop-dong.module';
import {DichVuModule} from './dich-vu/dich-vu.module';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReportModule,
    RegisterFunctionModule,
    NhanVienModule,
    KhachHangModule,
    HopDongModule,
    DichVuModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
