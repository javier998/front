import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './control/login/login.component';
import { RegistrarComponent } from './control/registrar/registrar.component';
import { ActualizarBody1Component } from './dashboard/body1/actualizar-body1/actualizar-body1.component';
import { CrearBody1Component } from './dashboard/body1/crear-body1/crear-body1.component';
import { ListarBody1Component } from './dashboard/body1/listar-body1/listar-body1.component';
import { VistapComponent } from './public/body1/vistap/vistap.component';

const routes: Routes = [
  {path:'', redirectTo:'vista', pathMatch:"full"},
  {path:'login', component:LoginComponent},
  {path:'registrar', component: RegistrarComponent},
  {path:'listar-b1', component: ListarBody1Component},
  {path:'crear-b1', component: CrearBody1Component},
  {path:'actualizar-b1/:id', component: ActualizarBody1Component},
  {path:'vista', component: VistapComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
