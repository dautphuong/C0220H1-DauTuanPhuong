import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {CreateDichVuComponent} from './create-dich-vu/create-dich-vu.component';
import {ListDichVuComponent} from './list-dich-vu/list-dich-vu.component';
import {RouterModule} from '@angular/router';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';


@NgModule({
  declarations: [CreateDichVuComponent, ListDichVuComponent],
  imports: [
    CommonModule,
    RouterModule,
    ReactiveFormsModule,
    FormsModule,
  ]
})
export class DichVuModule {
}
