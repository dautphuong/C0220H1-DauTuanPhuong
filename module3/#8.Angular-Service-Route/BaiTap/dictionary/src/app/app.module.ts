import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DictionaryDetailComponent } from './dictionary-detail/dictionary-detail.component';
import { DictionaryPageComponent } from './dictionary-page/dictionary-page.component';
import { DictionaryComponent } from './dictionary/dictionary.component';
import {ReactiveFormsModule} from "@angular/forms";
import {DictionaryService} from "./dictionary.service";

@NgModule({
  declarations: [
    AppComponent,
    DictionaryDetailComponent,
    DictionaryPageComponent,
    DictionaryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [DictionaryService],
  bootstrap: [AppComponent]
})
export class AppModule { }
