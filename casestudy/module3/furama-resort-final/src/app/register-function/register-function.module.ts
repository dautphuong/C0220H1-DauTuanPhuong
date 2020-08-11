import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RegisterDichVuComponent} from './register-dich-vu/register-dich-vu.component';
import {CreateHopDongChiTietComponent} from './create-hop-dong-chi-tiet/create-hop-dong-chi-tiet.component';
import {RouterModule} from '@angular/router';
import {FormsModule} from '@angular/forms';


@NgModule({
  declarations: [RegisterDichVuComponent, CreateHopDongChiTietComponent],
  imports: [
    CommonModule,
    RouterModule,
    FormsModule
  ]
})
export class RegisterFunctionModule {
}
