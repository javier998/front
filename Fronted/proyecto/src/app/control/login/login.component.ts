import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Usuario } from 'src/app/core/model/usuario';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  usuario: Usuario = new Usuario()

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  enviar(){
    this.router.navigate(['listar-tarea']);
    sessionStorage.setItem('id',"Javier");
    }

    registrar(){

    }

}
