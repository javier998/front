import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-actualizar-body1',
  templateUrl: './actualizar-body1.component.html',
  styleUrls: ['./actualizar-body1.component.css']
})
export class ActualizarBody1Component implements OnInit {
  mensaje="";
  id: Number | undefined
  constructor(private router: Router, private route:ActivatedRoute) { }

  ngOnInit(): void {
    if(sessionStorage.getItem('username')==null){
      this.router.navigate(['login']);
    }

    this.obtener();
  }

  onSubmit(){
    this.router.navigate(['listar-b1']);
  }

  obtener(){
    this.id = this.route.snapshot.params[`id`];
  }
}
