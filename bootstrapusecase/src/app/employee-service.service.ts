import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './employee';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {

  baseURL ="http://localhost:8080";
  constructor(private httpClient: HttpClient) { }

  AddEmployee(employee: Employee){
    console.log(employee);
    const additionalPath = "/adddetails";
    return this.httpClient.post(`${this.baseURL}${additionalPath}`, employee);
  }
  getEmployeesList(): Observable<Employee[]>{
    const additionalPath = "/empdetails";
    return this.httpClient.get<Employee[]>(`${this.baseURL}${additionalPath}`);
  }
}
