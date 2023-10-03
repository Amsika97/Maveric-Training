import { Component } from '@angular/core';
import { Employee } from 'src/app/employee';
import { EmployeeServiceService } from 'src/app/employee-service.service';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent {
  employees!: Employee[]
  constructor(private employeeService: EmployeeServiceService) {}

  ngOnInit(): void {
    console.log(this.employees);
    this.getEmployees();
  }
  private getEmployees(){
    this.employeeService.getEmployeesList().subscribe((data) => {
      this.employees = data;
    });
  }
}
