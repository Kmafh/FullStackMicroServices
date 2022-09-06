import { Component, OnInit } from '@angular/core';
import { Alumno } from 'src/app/models/alumno';
import { AlumnosService } from 'src/app/services/alumnos.service';

@Component({
  selector: 'app-alumnos',
  templateUrl: './alumnos.component.html',
  styleUrls: ['./alumnos.component.css']
})
export class AlumnosComponent implements OnInit {

  constructor(private service: AlumnosService) { }

  alumnos: Alumno[];
  ngOnInit(): void {
    this.service.listar().subscribe(alumnos => this.alumnos=alumnos);
  }

}
