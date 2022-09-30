import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-crear-body1',
  templateUrl: './crear-body1.component.html',
  styleUrls: ['./crear-body1.component.css']
})
export class CrearBody1Component implements OnInit {
  mensaje = "";
  constructor(private router:Router) { }

  ngOnInit(): void {
    if(sessionStorage.getItem('username')==null){
      this.router.navigate(['login']);
    }
  }

  onSubmit(){

  }
}
