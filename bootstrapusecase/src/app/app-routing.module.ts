import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AboutComponent } from './Component/about/about.component';
import { HomeComponent } from './Component/home/home/home.component';
import { ContactComponent } from './Component/contact/contact.component';
import { EmployeeDetailsComponent } from './Component/employee-details/employee-details.component';
import { AddEmployeeComponent } from './Component/add-employee/add-employee.component';

const routes: Routes = [
  // {
  //   path: '', redirectTo: '/home', pathMatch: 'full'
  // },
    {
    path:'about', component:AboutComponent
  },
  {
    path:'home', component:HomeComponent
  },
  {
    path:'contact', component:ContactComponent
  },
  {
    path:'empdetails', component:EmployeeDetailsComponent
  },
  {
    path:'adddetails', component:AddEmployeeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
