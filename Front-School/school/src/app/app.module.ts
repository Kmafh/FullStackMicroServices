import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AlumnosComponent } from './component/alumnos/alumnos.component';
import { CursosComponent } from './component/cursos/cursos.component';
import { ExamenesComponent } from './component/examenes/examenes.component';
import { LayoutModule } from './layout/layout.module';
import {HttpClientModule} from "@angular/common/http"
@NgModule({
  declarations: [
    AppComponent,
    AlumnosComponent,
    CursosComponent,
    ExamenesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    LayoutModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
