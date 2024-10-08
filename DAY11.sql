create table customers(custId serial primary key,companyName varchar(255),contactName varchar(255),contactTitle varchar(50),Address varchar(45),City varchar(50),postalCode varchar(50),country varchar(50) default 'canada',Phone varchar(20));

create table Shippers(shipperId serial primary key,companyName varchar(255) not null unique);

create table Products(productId serial primary key,supplierId int,category int,productName varchar(255) not null,quantityPerUnit varchar(50),unitsInStock int,unitsInOrder int,reOrderLevel int,discontinued boolean);

create table orders(
orderId int primary key,
customerId int references customers(custId),
empId int,
orderDate date not null,
requiredDate date,
shippedDate date check(shippedDate>orderDate),
shipVia int references Shippers(shipperId),
shipName varchar(255),
shipAddress varchar(255),
shipCity varchar(255),
shipRegion varchar(50),
shipCountry varchar(50)
);


create table orderDetails(
orderId int references orders(orderId),
productId int references Products(productId),
unitPrice decimal(10,2) not null,
quantity int check (Quantity > 0),
discount decimal(8,2),
primary key(orderId, productId)
);

insert into customers(companyName, contactName, contactTitle, address,city, postalCode, country,phone)
values
('acme corp','john','manager','123 main street','new york','10001','usa','12738'),
('global IN','jane','CEO','4354 main street','LA','36749','usa','64783');

insert into Shippers(companyName)
values
('fedEx'),('Amazon'),('DHL');

insert into Products(supplierId, category, productId, productName, quantityPerUnit,  unitsInStock, unitsInOrder,reOrderLevel, Dis)
values
(1,2,'laptop','1 unit', 50,10,5,FALSE),
(2,1,'samart phone','1 unit',100,20,10, FALSE);
