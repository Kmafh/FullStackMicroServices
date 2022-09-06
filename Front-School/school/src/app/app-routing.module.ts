import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AlumnosComponent } from './component/alumnos/alumnos.component';
import { CursosComponent } from './component/cursos/cursos.component';
import { ExamenesComponent } from './component/examenes/examenes.component';

const routes: Routes = [
  {path: "alumnos",component:AlumnosComponent},
  {path:"cursos",component:CursosComponent},
  {path: "examenes", component:ExamenesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
