import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-listar-body1',
  templateUrl: './listar-body1.component.html',
  styleUrls: ['./listar-body1.component.css']
})
export class ListarBody1Component implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
    if(sessionStorage.getItem('username')==null){
      this.router.navigate(['login']);
    }

    this.obtenerLista();
  }

  obtenerLista(){

  }
  
  actualizar(id:Number){
    this.router.navigate(['actualizar-b1',id]);
  }

}
