create table customer(
customer_id int primary key,
name varchar(20)
);

create table orders(
order_id int primary key,
cost int,
customer_id int,
foreign key(customer_id) references customer(customer_id)
);

create table product(
product_id int primary key,
name varchar(20),
price float
)

create table lineitem(
lineitem_id int,
quantity int,
product_id int,
foreign key(product_id) references product(product_id)
)

insert into customer values(101,"yogita");
insert into orders values(11,2000,101);
insert into product values(152,"watch",1000);
insert into product values(154,"mobile",1000);
insert into lineitem values(1,2,152);
select * from customer;
select * from orders;
select * from product;
select * from lineitem;