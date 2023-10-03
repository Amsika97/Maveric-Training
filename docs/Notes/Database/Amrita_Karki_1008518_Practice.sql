
-- 1.   Select the detail of the employee whose name start with P.

----    select * from emp_try a where a.emp_name like 'p%';

-- 2.   How many permanent candidate take salary more than 5000.

----    select * from empsalary a  where a.ispermanent = 'Yes' and salary>5000;

-- 3.   Select the detail of employee whose emailId is in gmail.

----    select * from emp_try a where a.emaild_id like '%gmail%';


-- 4.   Select the details of the employee who work either for department E-104 or E-102.

----    select * from emp_try a where a.department = 'E-104' or a.department = 'E-102';


-- 5.   What is the department name for DeptID E-102?

----   select a.deptname from empdept a where a.deptid = 'E-102';



-- 6.  What is total salary that is paid to permanent employees?

----   select sum (salary) from empsalary;


-- 7.  List name of all employees whose name ends with a.

----   select emp_name from emp_try where emp_name like '%a';


-- 8.  List the number of department of employees in each project.

----   select count(empid) as emp_try, projectid from empproject group by projectid;


--  9.  How many project started in year 2010.

----    select count (*) from empproject where startyear = '2010';


-- 10.  How many project started and finished in the same year.

----   select * from empproject where startyear = endyear;


-- 11.  select the name of the employee whose name's 3rd charactor is 'h'.

----    select * from emp_try where emp_name like '__h%';


