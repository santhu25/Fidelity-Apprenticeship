--DELIVERY PARTNER DETAILS BASED ON RATING
select partner_id,partner_name,phone_no
from delivery_partners
where rating between 3 and 5
order by partner_id;

--HUNGER EATS UPDATE TABLE
update customers
set phone_no=9876543210
where customer_id='CUST1004';

select * from customers;

--CUSTOMERS HAVING EMAILID
select customer_id,customer_name,address,phone_no
from customers
where email_id like '%@gmail.com'
order by customer_id;

--CHANGE THE DATATYPE
alter table customers
alter column customer_id type int using customer_id::INT;

--CHANGE THE FIELD NAME
alter table hotel_details
rename column rating to hotel_rating;

--HOTEL INFO
select concat(hotel_name,'is a',hotel_type,'hotel') as HOTEL_INFO
from hotel_details
order by hotel_name DESC;

--HOTELS THAT TOOK ORDER MORE THAN FIVE TIMES
select hd.hotel_id,hd.hotel_name,count(o.order_id) as NO_OF_ORDERS
from hotel_details hd
join orders o on hd.hotel_id=o.hotel_id
group by hd.hotel_id, hd.hotel_name
having count(o.order_id)>=5
order by hd.hotel_id ASC;

--HOTELS NOT TAKEN ORDERS IN A SPECIFIC MONTH
select hd.hotel_id,hd.hotel_name,hd.hotel_type
from hotel_details hd
left join orders o on hd.hotel_id=o.hotel_id and DATE_TRUNC('month',o.order_date)='2019-05-01'
where o.order_id is null
order by hd.hotel_id ASC;

--ORDER DETAILS
select o.order_id, c.customer_name,hd.hotel_name,o.order_amount
from orders o
join customers c on o.customer_id=c.customer_id
join hotel_details hd on o.hotel_id=hd.hotel_id
order by o.order_id ASC;