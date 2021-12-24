import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  constructor(private http: HttpClient) { }

  //Metodo asincrono que sirve para realizar un post a la database
  crear(urlapi: string, body: any) {
    return this.http.post(`${urlapi}`,
      body);
  }
  
  //Metodo asincrono que sirve para traer la respuesta del estado que se da 
  //al hacer un post a la database 
  codigoRespuesta(urlapi: string, body: any) {
    return this.http.post(`${urlapi}`,
      body, {observe: 'response'});
  }
}
