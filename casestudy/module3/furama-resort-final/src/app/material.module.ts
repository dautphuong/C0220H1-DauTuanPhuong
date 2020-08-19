import {NgModule} from '@angular/core';
import {
  MatDialogModule
} from '@angular/material/dialog';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {DeleteKhachHangComponent} from './khach-hang/delete-khach-hang/delete-khach-hang.component';

@NgModule({
  imports: [
    BrowserAnimationsModule,
    MatDialogModule
  ],
  exports: [

    BrowserAnimationsModule,
    MatDialogModule
  ],
  providers: [],
  entryComponents: [DeleteKhachHangComponent]
})

export class MaterialModule {
}
