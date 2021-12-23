import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class GetService {

  sies!: any[];

  content!: any[];
  constructor(private http: HttpClient) { }

  leerTodos(urlapi: string) {
    return this.http.get(urlapi);
  }

  leer(urlapi: string, nivel: number) {
    return this.http.get(`${urlapi}${nivel}`);

  }

  codigoRespuesta(urlapi: string, nivel: number) {
    return this.http.get(`${urlapi}${nivel}`, { observe: 'response' });

  }

  leer2(urlapi: string, username: string) {
    return this.http.get(`${urlapi}${username}`);

  }

  codigoRespuesta2(urlapi: string, username: string) {
    return this.http.get(`${urlapi}${username}`, { observe: 'response' });

  }
}
