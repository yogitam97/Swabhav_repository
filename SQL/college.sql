create table college(
college_id int primary key,
college_name varchar(20),
college_location varchar(20)
);
insert into college values(1,"Vidyalankar","Wadala");
insert into college values(2,"GPM","Bandra");
insert into college values(3,"YTP","Bhivpuri");
select *from college;

create table students(
id int primary key,
name varchar(20),
college_id int,
foreign key(college_id) references college(college_id)
);
insert into students values(101,"Yogita",1);
insert into students values(102,"Shekhar",3);
insert into students values(103,"Deepak",2);
insert into students values(104,"Abhishek",2);
insert into students values(105,"Mahesh",3);
select * from students;

create table professor(
professor_id int,
subject varchar(20),
college_id int,
foreign key(college_id) references college(college_id)
);
insert into professor values(10,"C",1);
insert into professor values(10,"Java",1);
insert into professor values(17,"Python",2);
insert into professor values(20,"Angular",3);
insert into professor values(10,"C++",1);
select * from professor;