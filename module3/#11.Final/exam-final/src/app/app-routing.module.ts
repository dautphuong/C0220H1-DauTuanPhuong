import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ListComponent} from './list/list.component';
import {PageNotFoundComponent} from './page-not-found/page-not-found.component';
import {CreateComponent} from './create/create.component';

const routes: Routes = [
  {path: '', redirectTo: 'list', pathMatch: 'full'},
  {
    path: 'list',
    children: [
      {path: '', component: ListComponent},
      {path: 'create', component: CreateComponent},
      // {path: 'detail-khach-hang/:id', component: DetailKhachHangComponent},
      // {path: 'update-khach-hang/:id', component: UpdateKhachHangComponent},
      // {path: 'delete-khach-hang/:id', component: DeleteKhachHangComponent}
    ]
  },


  {path: '**', component: PageNotFoundComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
