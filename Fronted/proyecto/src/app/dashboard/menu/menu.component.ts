import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
 nombre=sessionStorage.getItem('nombre')

  constructor(private router:Router) { }

  ngOnInit(): void {
    if(sessionStorage.getItem('username')==null){
      this.router.navigate(['login']);
    }
  }

  cerrarSesion(){
    sessionStorage.removeItem('username');
    sessionStorage.removeItem('nombre');
    this.router.navigate(['login']);
  }

}
