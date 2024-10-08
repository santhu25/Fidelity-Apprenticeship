insert into Products(supplierid,
category, 
productName,
quantityPerUnit,  
unitsInStock,
unitsInOrder,
reOrderLevel,
Discontinued)
values
(1,2,'laptop','1 unit', 50,10,5,FALSE),
(2,1,'samart phone','1 unit',100,20,10, FALSE);

insert into orders(customerId,empId,orderDate,requiredDate,shippedDate,shipvia,shipName,shipAddress,shipCity,shipRegion,shipCountry)
values
(1,101,'2024-10-01','2024-10-05','2024-10-03',1,'Acme corp','123 Main street','New York','NY','USA');
insert into orderDetails(orderId,productId,unitPrice,quantity,discount)
values
(1,1,1000.00,2,0.05),
(2,2,600.00,3,0.10);