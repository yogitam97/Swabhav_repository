CREATE TABLE CUSTOMERS(
ID VARCHAR(20) PRIMARY KEY,
FIRST_NAME VARCHAR(20),
LAST_NAME VARCHAR(20),
DOB VARCHAR(20),
BALANCE DOUBLE,
CARD VARCHAR(20)
);

INSERT INTO CUSTOMERS VALUES(1,"DEEPAK","GUPTA","24/06/1995",10,"CREDIT");
INSERT INTO CUSTOMERS VALUES(2,"YOGITA","MORE","14/08/1997",10000,"CREDIT");
INSERT INTO CUSTOMERS VALUES(3,"SHEKHAR","PATIL","30/07/1995",1000000,"DEBIT");

SELECT *
FROM CUSTOMERS;

CREATE TABLE USERS(
USER_NAME VARCHAR(20),
PASS VARCHAR(10),
ROLE VARCHAR(20)
);

INSERT INTO USERS VALUES("ADMIN","ADMIN","ADMIN");
INSERT INTO USERS VALUES("ABC","ABC123","CLERK");

SELECT * FROM USERS;