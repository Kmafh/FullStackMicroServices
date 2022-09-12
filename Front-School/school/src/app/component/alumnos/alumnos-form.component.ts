import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { Alumno } from 'src/app/models/alumno';
import { AlumnosService } from 'src/app/services/alumnos.service';

@Component({
  selector: 'app-alumnos-form',
  templateUrl: './alumnos-form.component.html',
  styleUrls: ['./alumnos-form.component.css']
})
export class AlumnosFormComponent implements OnInit {

  alumno: Alumno = new Alumno();


  constructor( private service: AlumnosService, private router: Router) { }

  ngOnInit(): void {

  }

  public crear():void {
    this.service.crear(this.alumno).subscribe(alumno => {
      console.log(`alumno ${alumno.name} creado con exito.`);
      alert(`alumno ${alumno.name} creado con exito.`);
      this.router.navigate(['/alumnos']);
    });
  }
}
