import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuario } from '../model/usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  
  BASE_URI_TOKEN ="http://localhost:8080/usuario/auth"
  BASE_URI ="http://localhost:8080/usuario"
  constructor(private htppClient: HttpClient) { }

  saveUser(usuario: Usuario):Observable<Usuario>{
    return this.htppClient.post<Usuario>(`${this.BASE_URI}`,usuario);
  }

  getToken(usuario:Usuario):Observable<Usuario>{
    return this.htppClient.post<Usuario>(`${this.BASE_URI_TOKEN}`,usuario);
  }
}
