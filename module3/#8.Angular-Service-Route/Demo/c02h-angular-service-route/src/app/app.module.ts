import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { StudentListComponent } from './student-list/student-list.component';
import { StudentDetailComponent } from './student-detail/student-detail.component';
import { StudentUpdateComponent } from './student-update/student-update.component';
import {ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {StudentRoutingModule} from './student-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    StudentListComponent,
    StudentDetailComponent,
    StudentUpdateComponent
  ],
    imports: [
        BrowserModule,
        ReactiveFormsModule,
        RouterModule,
        StudentRoutingModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
