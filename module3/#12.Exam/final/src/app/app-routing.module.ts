import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListSinhVienComponent} from './list-sinh-vien/list-sinh-vien.component';
import {EditSinhVienComponent} from './edit-sinh-vien/edit-sinh-vien.component';
import {DeleteSinhVienComponent} from './delete-sinh-vien/delete-sinh-vien.component';

const routes: Routes = [
  {path: '', redirectTo: 'students', pathMatch: 'full'},
  {
    path: 'students',
    children: [
      {path: '', component: ListSinhVienComponent},
      // {path: 'create', component: CreateComponent},
      // {path: 'detail-khach-hang/:id', component: DetailKhachHangComponent},
      {path: 'edit-student/:id', component: EditSinhVienComponent},
      {path: 'delete-student/:id', component: DeleteSinhVienComponent}
    ]
  },


  // {path: '**', component: PageNotFoundComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
