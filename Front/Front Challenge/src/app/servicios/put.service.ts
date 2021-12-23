import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PutService {

  constructor(private http: HttpClient) { }

  actualizar(urlapi: string, username: string, body: any): any {
   return this.http.put(`${urlapi}${username}`,
    body);
  }
  
  codigoRespuesta(urlapi: string, username: string, body: any): any {
   return this.http.put(`${urlapi}${username}`,
    body, { observe: 'response'});
  }
}
