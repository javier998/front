import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Usuario } from 'src/app/core/model/usuario';
import { UsuarioService } from 'src/app/core/service/usuario.service';

@Component({
  selector: 'app-registrar',
  templateUrl: './registrar.component.html',
  styleUrls: ['./registrar.component.css']
})
export class RegistrarComponent implements OnInit {
  mensaje=""
  usuario : Usuario = new Usuario()
  constructor(private router:Router, private usuarioService: UsuarioService) { }

  ngOnInit(): void {
  }

  enviar(){
    this.usuarioService.saveUser(this.usuario).subscribe(data=>{
      console.log("envia: "+this.usuario)
      this.router.navigate(['login']);
      
    },err=>{
      console.log("envia: "+this.usuario.usuario_id)
        this.mensaje= err.error.mensaje
    });
    
  }

  cambiar(){
    this.router.navigate(['login']);
  }
}
