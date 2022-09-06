import { Alumno } from "./alumno";
import { Examen } from "./examen";

export class Curso {
  id: number;
  name: string;
  createAt: Date;
  alumnos: Alumno[]=[];
  examenes: Examen[]=[];
}
