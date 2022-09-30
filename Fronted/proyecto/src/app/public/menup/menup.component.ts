import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menup',
  templateUrl: './menup.component.html',
  styleUrls: ['./menup.component.css']
})
export class MenupComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  login(){
    this.router.navigate(['login']);
  }
}
