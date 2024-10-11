create table Worker(
worker_id int primary key,
first_name varchar(50),
last_name varchar(50),
salary decimal(8,2),
joining_date date,
department varchar(50)
);

create table Title (
worker_ref_id int,
worker_title varchar(50),
affected_from date,
foreign key (worker_ref_id)references Worker(worker_id)
);

create table Bonus (
worker_ref_id int,
bonus_amount decimal(8,2),
bonus_date date,
foreign key (worker_ref_id) references Worker(worker_id)
);

insert into Worker(worker_id,first_name,last_name,salary,joining_date,department)
values
(1,'MONIKA','ARORA',100000.00,'2020-02-14','HR'),
(2,'NIHARIKA','VARMA',800000.00,'2011-02-14','ADMIN'),
(3,'VISHAL','SINGHAI',300000.00,'2020-02-14','HR'),
(4,'AMITABH','SINGH',500000.00,'2020-02-14','ADMIN'),
(5,'VIVEK','BHATI',500000.00,'2011-06-14','ADMIN'),
(6,'VIPUL','DIWAN',200000.00,'2011-06-14','ACCOUNT'),
(7,'SATISH','KUMAR',75000,'2011-01-14','ACCOUNT'),
(8,'GEETIKA ','CHAUHAN',90000.00,'2011-04-14','ADMIN');

insert into Bonus(worker_ref_id,bonus_amount,bonus_date)
values
(1,5000.00,'2020-04-15'),
(2,3000.00,'2020-09-12'),
(3,4000.00,'2011-01-14'),
(4,4500.00,'2020-03-15'),
(5,3500.00,'2011-02-12');

truncate table Title;
select * from title;

insert into Title(worker_ref_id,worker_title,affected_from)
values
(1,'MANAGER','2020-12-22'),
(2,'EXECUTIVE','2011-01-12'),
(8,'EXECUTIVE','2018-03-10'),
(5,'MANAGER','2016-09-12'),
(4,'ASST.MANAGER','2016-08-13'),
(7,'EXECUTIVE','2016-05-22'),
(6,'LEAD','2016-06-11'),
(3,'LEAD','2016-06-24');

select 
worker.first_name,
worker.salary,
title.worker_title
from
Worker
join
Title
on
Worker.worker_id = Title.worker_ref_id;

--PLPGSQL

create or replace function get_worker_count_by_nth_highest_salary(n int)
returns integer as
$$
declare
  nth_highest_salary decimal;
  worker_count int;
begin

   select salary into nth_highest_salary
   from(
        select distinct salary
		from Worker
		order by salary DESC
		limit 1 OFFSET(n-1)
   ) as nth_salary;

   select count(*)
   into worker_count
   from Worker
   where salary=nth_highest_salary;

   return worker_count;

end;
$$ language plpgsql;


select get_worker_count_by_nth_highest_salary(4);
