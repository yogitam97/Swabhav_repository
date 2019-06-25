CREATE TABLE Student(
id int primary key,
name varchar(20),
cgpa float
);
insert into Student values(7,"Yogita",7.08);
insert into Student values(20,"Shekhar",9);
insert into Student values(27,"Deepak",8);
insert into Student values(29,"Abhishek",8.5);
delete from Student where name="Deepak";
select * from Student;
alter table Student add course_id int;
alter table Student add foreign key (course_id) references Course(course_id);
update Student set course_id="1" where name="Yogita";
update Student set course_id="3" where name="Shekhar";
update Student set course_id="2" where name="Abhishek";


create table course(
course_id int primary key,
course_name varchar(30),
course_fee int
);
insert into course values(1,"CN",7500);
insert into course values(2,"SOOAD",7600);
insert into course values(3,"JAVA",8000);
select * from course;

