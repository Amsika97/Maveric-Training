
-- 1.   Select the department name of the company which is assigned to the employee whose employee id is grater 103.

----    select deptname from empdept where deptid in (select department from emp_try where emp_id>103)


-- 2.   Select the name of the employee who is working under Abhishek.

-----   select a.emp_name from emp_try a where a.emphead_id = (select emp_id from emp_try where emp_name = 'Abhishek');

-- 3.   Select the name of the employee who is department head of HR.

-----   select emp_name from emp_try where emp_id = (select depthead from empdept where deptname = 'HR');

-- 4.   Select the name of the employee head who is permanent.

-----   select emp_name from emp_try where emphead_id in (select empid from empsalary where ispermanent = 'Yes') and emp_id in (select emphead_id from emp_try);
;

-- 5.   Select the name and email of the Dept Head who is not Permanent.


----   select emp_name, emaild_id from emp_try where emp_id in (select empid from empsalary where ispermanent ='No') and emp_id in (select depthead from empdept);

-- 6.   Select the employee whose department off is monday

----    select emp_name from emp_try where department = (select deptid from empdept where dept_off = 'Monday');


-- 7.   select the indian clinets details.

----    select * from emp_try where department in (select deptid from empdept where deptname='development')


-- 8.   select the details of all employee working in development department.

-----   select emp_name from emp_try where emphead_id in (select emp_id from emp_try where emp_name  IN ('Abhishek','priya') )





