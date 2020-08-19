import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListSinhVienComponent } from './list-sinh-vien/list-sinh-vien.component';
import {HttpClientModule} from '@angular/common/http';
import { EditSinhVienComponent } from './edit-sinh-vien/edit-sinh-vien.component';
import { DeleteSinhVienComponent } from './delete-sinh-vien/delete-sinh-vien.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
@NgModule({
  declarations: [
    AppComponent,
    ListSinhVienComponent,
    EditSinhVienComponent,
    DeleteSinhVienComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    CommonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
