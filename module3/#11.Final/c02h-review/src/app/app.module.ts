import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {StudentListModule} from './student-list/student-list.module';
import {RouterModule} from '@angular/router';
import {InstructorListModule} from './instructor-list/instructor-list.module';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    StudentListModule,
    RouterModule,
    InstructorListModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
