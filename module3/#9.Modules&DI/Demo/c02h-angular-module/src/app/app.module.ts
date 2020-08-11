import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {StudentListModule} from './student-list/student-list.module';
import {RouterModule} from '@angular/router';
import {InstructorListModule} from './instructor-list/instructor-list.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    StudentListModule,
    RouterModule,
    InstructorListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
