import { Asignatura } from "./asignatura";
import { Pregunta } from "./pregunta";

export class Examen {
  id: number;
  name: string;
  createAt: Date;
  preguntas: Pregunta[]=[];
  asignaturas: Asignatura[]=[];
  respondido: boolean;
}
