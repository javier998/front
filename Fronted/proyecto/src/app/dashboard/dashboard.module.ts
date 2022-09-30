import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MenuComponent } from './menu/menu.component';
import { AppRoutingModule } from '../app-routing.module';
import { CrearBody1Component } from './body1/crear-body1/crear-body1.component';
import { ListarBody1Component } from './body1/listar-body1/listar-body1.component';
import { ActualizarBody1Component } from './body1/actualizar-body1/actualizar-body1.component';



@NgModule({
  declarations: [
    MenuComponent,
    CrearBody1Component,
    ListarBody1Component,
    ActualizarBody1Component
  ],
  imports: [
    CommonModule,
    AppRoutingModule
  ], exports:[
    //OJO: Colocar los componentes crreados en el moudulo
    MenuComponent,
    ActualizarBody1Component,
    CrearBody1Component,
    ListarBody1Component
    
  ]
})
export class DashboardModule { }
