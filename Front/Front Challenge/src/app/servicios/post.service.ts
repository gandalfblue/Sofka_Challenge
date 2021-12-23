import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  constructor(private http: HttpClient) { }


  crear(urlapi: string, body: any) {
    return this.http.post(`${urlapi}`,
      body);
  }
  
  codigoRespuesta(urlapi: string, body: any) {
    return this.http.post(`${urlapi}`,
      body, {observe: 'response'});
  }
}
