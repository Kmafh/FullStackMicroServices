import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Alumno } from '../models/alumno';

@Injectable({
  providedIn: 'root'
})
export class AlumnosService {

  private baseEndPoint="http://localhost:8090/api/alumnos"
  private cabeceras: HttpHeaders = new HttpHeaders({"Content-Type": "aplication/json"});
  constructor(private http: HttpClient) { }

  public listar(): Observable<Alumno[]>{
    return this.http.get<Alumno[]>(this.baseEndPoint);
  }

public listarPages(page: string,size: string): Observable<any>{
  const params = new HttpParams()
  .set("page", page)
  .set("size",size);
  return this.http.get<any>(`${this.baseEndPoint}/pag`,{params:params})
}

  public ver(id:number): Observable<Alumno>{
    return this.http.get<Alumno>( `${this.baseEndPoint}/${id}`);
  }

  public crear(alumno:Alumno): Observable<Alumno>{
    return this.http.post<Alumno>(this.baseEndPoint,alumno,{headers:this.cabeceras})
  }
  public editarr(alumno:Alumno): Observable<Alumno>{
    return this.http.put<Alumno>(`${this.baseEndPoint}/${alumno.id}`,
    alumno,{headers:this.cabeceras})
  }
  public eliminar(id:number): Observable<void>{
    return this.http.delete<void>(`${this.baseEndPoint}/${id}`);
  }
}
