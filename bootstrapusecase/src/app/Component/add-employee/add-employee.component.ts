import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/employee';
import { EmployeeServiceService } from 'src/app/employee-service.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent  {
  
employees: Employee = new Employee();
 constructor(private employeeService: EmployeeServiceService)
 {

 }
  AddEmployee(){
 console.log(this.employees);
 this.employeeService.AddEmployee(this.employees).subscribe(data=>{
  alert("Details is added successfully.");
 },error=>alert("Sorry Data is not inserted.")
 )
  }

}
