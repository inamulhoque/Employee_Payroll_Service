public class EmpPayrollMySQL {
    //UC1
    create database payroll_service;
    show databases;
    use payroll_service;
    //UC2
    create table employee_payroll(id int not null primary key auto_increment, name varchar(40), salary int, start_date date);
    //UC3
    insert into employee_payroll(name, salary, start_date) values("Inamul Hoque", 30000, "2022-07-16");
    insert into employee_payroll(name, salary, start_date) values("Santosh Naik", 36000, "2022-07-10");
    insert into employee_payroll(name, salary, start_date) values("Niharika Vanapari", 33000, "2022-07-05");
    insert into employee_payroll(name, salary, start_date) values("Syed Sehjad", 31000, "2022-07-01");
    insert into employee_payroll(name, salary, start_date) values("Nilima Hanun", 40000, "2022-06-29");
    //UC4
    select * from employee_payroll;
    //UC5
    select salary from employee_payroll where name = "Inamul Hoque";
    select * from employee_payroll where start_date between cast("2022-06-29" as date) and date(now());
    //UC6
    alter table employee_payroll add column gender varchar(6);
    update employee_payroll set gender = 'M' where name = "Inamul Hoque" or name  = "Santosh Naik" or name = "Syed Sehjad";
    update employee_payroll set gender = 'F' where name = "Niharika Vanapari" or name  = "Nilima Hanun";
    //UC7
    select sum(salary) from employee_payroll where gender = 'M' group by gender;
    select avg(salary) from employee_payroll where gender = 'M' group by gender;
    select min(salary) from employee_payroll where gender = 'M' group by gender;
    select max(salary) from employee_payroll where gender = 'M' group by gender;
    select count(salary) from employee_payroll where gender = 'M' group by gender;
    //UC8
    alter table employee_payroll add column phone int;
    alter table employee_payroll add column address varchar(40);
    alter table employee_payroll add column department varchar(20);
    //UC9
    alter table employee_payroll add column Basic_Pay int, add column Deductions int,add column Taxable_Pay int,add column Income_Tax int,add column Net_Pay int;
    //UC10
    insert into employee_payroll(name,salary,start_date,gender,phone,address,department,Basic_Pay,Deductions,Taxable_Pay,Income_Tax,Net_Pay) values("Terrisa",4000,"2021-12-01",'F',9854011236,"Guwahati",'Sales',4000,200,1000,300,2700);
    insert into employee_payroll(name,salary,start_date,gender,phone,address,department,Basic_Pay,Deductions,Taxable_Pay,Income_Tax,Net_Pay) values("Terrisa",4000,"2021-12-01",'F',9854011236,"Guwahati",'Sales',4000,200,1000,300,2700);
    select * from employee_payroll where name = "Terrisa";
    //UC11

    create table Employee_Department(Employee_ID int not null primary key auto_increment, department_Name varchar(30));
    insert into Employee_Department values(1, "Marketing");
    insert into Employee_Department values(2, "Sales");
    select * from Employee_Department;
    create table emp_Dept (eID int Not Null , Employee_ID int Not Null);
    insert into emp_dept values(3,1);
    insert into emp_dept values(3,2);
    select * from emp_dept;
    select employee_payroll.name, emp_dept.Employee_ID from employee_payroll inner Join emp_dept ON employee_payroll.id = emp_dept.eID;
}
