import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {StudentListComponent} from './student-list/student-list.component';
import {StudentDetailComponent} from './student-detail/student-detail.component';
import { StudentUpdateComponent } from './student-update/student-update.component';
import {ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {StudentRoutingModule} from './student-routing.module';
import {InstructorService} from '../instructor-list/instructor.service';
import {StudentService} from './student.service';


@NgModule({
  declarations: [StudentListComponent, StudentDetailComponent, StudentUpdateComponent],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    RouterModule,
    StudentRoutingModule
  ],
  providers: [
    InstructorService,
    StudentService
  ]
})
export class StudentListModule {
}
