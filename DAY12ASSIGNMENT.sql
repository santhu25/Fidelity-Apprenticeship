create table customers(
customer_id varchar(10) primary key,
customer_name varchar(20) not null,
address varchar(20),
phone_no bigint,
email_id varchar(20)
);

create table delivery_partners(
partner_id varchar(10) primary key ,
partner_name varchar(20) not null,
phone_no bigint,
rating int
);

create table hotel_details(
hotel_id varchar(10) primary key,
hotel_name varchar(20) not null,
hotel_type varchar(20),
rating int
);

create table orders(
order_id varchar(10) primary key,
customer_id varchar(10),
hotel_id varchar(10),
partner_id varchar(10),
order_date date,
order_amount int,

constraint fk_customer_id foreign key(customer_id) references customers(customer_id),
constraint fk_hotel_id foreign key(hotel_id) references hotel_details(hotel_id),
constraint fk_partner_id foreign key(partner_id) references delivery_partners(partner_id)
);

insert into customers(customer_id,customer_name,address,phone_no,email_id)
values
('C101','Santhosh','123 main street',9835378564,'santhu@example.com'),
('C102','Walter','123 second cross',4578399739,'walter@example.com');

insert into delivery_partners(partner_id,partner_name,phone_no,rating)
values
('DP101','Jesse',7893778394,4),
('DP102','Jane',4563836894,5);

insert into hotel_details(hotel_id,hotel_name,hotel_type,rating)
values
('H101','Grand Hotel','Luxury',5),
('H102','City INN','Five star',3);

insert into orders(order_id,customer_id,hotel_id,partner_id,order_date,order_amount)
values
('O101','C101','H101','DP101','2024-10-09',100),
('O102','C102','H102','DP102','2024-10-08',150);


--1).DELIVERY PARTNERS DETAILS BASED ON RATING

select partner_id,partner_name,phone_no
from delivery_partners
where rating between 3 and 5
order by partner_id;

--2)HUNGER EATS-UPDATE TABLE
insert into customers(customer_id,customer_name,address,phone_no,email_id)
values
('CUST1001','THOMAS','KOCHI',9856325486,'thomas@gmail.com'),
('CUST1002','CHARLES','ALLEPY',9856367486,'charles@gmail.com'),
('CUST1003','SUDHAKAR','KOCHI',9856323869,'sudhakar@gmail.com'),
('CUST1004','JAGADISH','ERNAKULAM',9856326666,'jagadish@gmail.com'),
('CUST1005','ALBERT','ALLEPY',9856328659,'alber@gmail.com'),
('CUST1006','ASHWIN DAS','KANPUR',9856325659,'ashwindas@gmail.com');

update customers
set phone_no=9876543210
where customer_id='CUST1004';

select*from customers
where customer_id='CUST1004';

--3)CUSTOMER HAVING GAMAILID
select customer_id,customer_name,address,phone_no
from customers
where email_id like '%@gmail.com'
order by customer_id;

--4)HUNGER EATS CHANGE DATATYPE
alter table customers
alter column customer_id type int using customer_id::int;

--5)HUNGER EATS CAHNGE FIELD NAME
alter table hotel_details
rename column rating to hotel_rating;

select * from hotel_details;

--6)HOTEL INFO
select concat(hotel_name,'is a',hotel_type,'hotel') as hotel_info
from hotel_details
order by hotel_name DESC;

--7)HOTELS THAT TOOK ORDERS MORE THAN FIVE TIMES
select hd.hotel_id, hd.hotel_name, count(o.order_id) as no_of_orders
from hotel_details hd
join orders o on hd.hotel_id=o.hotel_id
group by hd.hotel_id,hd.hotel_name
having count(o.order_id) > 5
order by hd.hotel_id ASC;

--8)HOTELS NOT TAKEN ORDER IN A SPECIFIC MONTH
insert into hotel_details(hotel_id,hotel_name,hotel_type)
values
('H104','HOTEL1','VEG'),
('H106','HOTEL2','NONVEG'),
('H109','HOTEL3','VEG');

insert into orders(order_id,hotel_id,order_date)
values
('O10001','H104','2019-05-12'),
('O10002','H106','2019-04-05'),
('O10003','H109','2019-05-15');

select hd.hotel_id,hd.hotel_name,hd.hotel_type
from hotel_details hd
left join orders o on hd.hotel_id=o.hotel_id and date_trunc('month',o.order_date)='2019-05-01'
where o.order_id is null
order by hd.hotel_id ASC;

--9)ORDER DETAILS
insert into customers(customer_id,customer_name,address,phone_no,email_id)
values
('C001','tommy','DELHI',1234567889,'tommy@example.com'),
('C002','ARTHUR','BOMBAY',2345667789,'arthur@example.com'),
('C003','FINN','BANGLORE',4567893789,'finn@example.com');

insert into hotel_details(hotel_id,hotel_name,hotel_type)
values
('H001','HOTEL A','VEG'),
('H002','HOTEL B','NON VEG'),
('H003','HOTEL C','VEG');

insert into orders(order_id,customer_id,hotel_id,order_date,order_amount)
values
('O001','C001','H001','2019-05-12',100.00),
('O002','C002','H002','2019-05-13',150.00),
('O003','C003','H003','2019-05-14',200.00);

select o.order_id, c.customer_name, hd.hotel_name,o.order_amount
from orders o
join customers c on o.customer_id=c.customer_id
join hotel_details hd on o.hotel_id=hd.hotel_id
order by o.order_id ASC;




