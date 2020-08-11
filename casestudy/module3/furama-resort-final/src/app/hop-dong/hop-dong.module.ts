import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {CreateHopDongComponent} from './create-hop-dong/create-hop-dong.component';
import {ListHopDongComponent} from './list-hop-dong/list-hop-dong.component';
import {RouterModule} from '@angular/router';
import {FormGroup, FormsModule, ReactiveFormsModule} from '@angular/forms';


@NgModule({
  declarations: [CreateHopDongComponent, ListHopDongComponent],
  imports: [
    CommonModule,
    RouterModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class HopDongModule {
}
