import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class GetService {

  sies!: any[];

  content!: any[];
  constructor(private http: HttpClient) { }

  //Metodo asincrono que sirve para traer todos los usuarios que estan
  //almacenados en la database
  leerTodos(urlapi: string) {
    return this.http.get(urlapi);
  }

  //Metodo asincrono que sirve para traer las preguntas de un solo nivel que estan
  //almacenadas en la database
  leer(urlapi: string, nivel: number) {
    return this.http.get(`${urlapi}${nivel}`);

  }

  //Metodo asincrono que sirve para traer la respuesta del estado que se da 
  //al hacer el get para traer las preguntas de un solo nivel en la database
  codigoRespuesta(urlapi: string, nivel: number) {
    return this.http.get(`${urlapi}${nivel}`, { observe: 'response' });

  }
}
