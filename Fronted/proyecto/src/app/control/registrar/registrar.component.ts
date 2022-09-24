import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Usuario } from 'src/app/core/model/usuario';

@Component({
  selector: 'app-registrar',
  templateUrl: './registrar.component.html',
  styleUrls: ['./registrar.component.css']
})
export class RegistrarComponent implements OnInit {
  usuario : Usuario = new Usuario()
  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  enviar(){
    this.router.navigate(['login']);
  }
}
