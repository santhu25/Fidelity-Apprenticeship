create table customers (
cust_id varchar(10) primary key,
cust_name varchar(20),
cust_phone bigint,
cust_address varchar(20)
);

create table delivery_partners (
partner_id varchar(10) primary key,
partner_name varchar(15),
rating int
);

create table pizza(
pizza_id varchar(10),
cust_id varchar(10),
partner_id varchar(10),
pizza_name varchar(15),
pizza_type varchar(15),
order_date date,
amount bigint,
foreign key(cust_id) references customers(cust_id),
foreign key(partner_id) references delivery_partners(partner_id)
);


insert into customers(cust_id,cust_name,cust_phone,cust_address)
values
('C001','TOMMY',9845678945,'DELHI'),
('C002','JOHN',6789456745,'BANGLORE'),
('C003','ARTHUR',8923456789,'PUNJAB');

insert into delivery_partners(partner_id,partner_name,rating)
values
('P001','DELIVER NOW',4),
('P002','SWIGGY',5),
('POO3','ZOMATO',3);

insert into pizza(pizza_id,cust_id,partner_id,pizza_name,pizza_type,order_date,amount)
values
('Z001','C001','P001','PEPPORONI','M','2024-10-01',1500),
('Z002','C002','P002','VEG','L','2024-10-03',2000),
('Z003','C003','POO3','CHICKEN','XL','2024-10-05',2000),
('Z0004','C001','P001','CHEESE PIZZA','XL','2024-10-07',1500);

UPDATE PIZZA 
SET AMOUNT = AMOUNT * 0.97
WHERE PIZZA_TYPE = 'XL';

SELECT * FROM PIZZA
WHERE PIZZA_TYPE='XL';

create table salesman (
salesman_id numeric(5) primary key,
name varchar(30),
city varchar(15),
commission decimal(5,2)
);
GO


create table orders (
order_no numeric(5) primary key,
purch_amt decimal(8,2),
ord_date date,
customer_id numeric(5),
salesman_id numeric(5),
foreign key (salesman_id) references salesman(salesman_id)
);
GO

create table supplier(
supplier_id numeric(5) primary key,
supplier_name varchar(150),
address varchar(150),
city varchar(50),
state varchar(15),
country varchar(15),
contact varchar(10),
constraint chk_contact_length check (length(contact)=10)
);

insert into supplier(supplier_id,supplier_name,address,city,state,country,contact)
values
('10001','GLOBAL SUPPLIERS','123 MAIN STREET','NEW YORK','NY','USA','1234567890'),
('10002','LOCAL SUPPLIERS','12 SECOND MAIN','NCR','DELHI','INDIA','098321');

insert into supplier(supplier_id,supplier_name,address,city,state,country,contact)
values
('1004','TEST SUPPLIERS','114 TEST STREET','TEST','TA','INDIA',1234);