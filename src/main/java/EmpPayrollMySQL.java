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
}
