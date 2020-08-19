import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from '@angular/router';
import {StudentDetailComponent} from './student-detail/student-detail.component';
import {StudentUpdateComponent} from './student-update/student-update.component';
import {StudentListComponent} from './student-list/student-list.component';

const routes: Routes = [
  {path: '', redirectTo: 'student-list', pathMatch: 'full'},
  {path: 'student-list',
    children: [
      {path: '', component: StudentListComponent},
      {path: 'student-detail/:id', component: StudentDetailComponent},
      {path: 'student-update/:id', component: StudentUpdateComponent}
    ]}
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ]
})
export class StudentRoutingModule { }
