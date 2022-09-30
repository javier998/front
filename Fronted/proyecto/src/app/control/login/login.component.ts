import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Usuario } from 'src/app/core/model/usuario';
import { UsuarioService } from 'src/app/core/service/usuario.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  usuario: Usuario = new Usuario()
  mensaje= "";
  constructor(private router: Router, private usuarioService: UsuarioService) { }

  ngOnInit(): void {
  }

  enviar() {
    this.usuarioService.getToken(this.usuario).subscribe(data=>{
      this.usuario = data
      sessionStorage.setItem('username',""+this.usuario.usuario_id)
      sessionStorage.setItem('nombre',""+this.usuario.persona.nombre)
      this.router.navigate(['listar-b1']);
    },err=>{
      this.mensaje=err.error.mensaje
    });

  }

  registrar() {
    
  }

  cambiar(){
    this.router.navigate(['registrar']);
  }

  cambiarVista(){
    this.router.navigate(['vista']);
  }
}
