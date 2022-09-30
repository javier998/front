import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from '../app-routing.module';
import { MenupComponent } from './menup/menup.component';
import { VistapComponent } from './body1/vistap/vistap.component';



@NgModule({
  declarations: [
    MenupComponent,
    VistapComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    AppRoutingModule
  ],
  exports:[
    //colocar todos los componentes que se van a crear
    MenupComponent,
    VistapComponent
  ]
})
export class PublicModule { }
