CREATE TABLE BANK_MASTER(
NAME VARCHAR(50) PRIMARY KEY,
PASSWORD VARCHAR(20),
BALANCE DOUBLE
)
SELECT * FROM BANK_MASTER
CREATE TABLE BANK_TRANSACTION(
NAME VARCHAR(50),
DATE DATETIME,
TYPE VARCHAR(10),
AMOUNT DOUBLE,
FOREIGN KEY(NAME) REFERENCES BANK_MASTER(NAME)
)
SELECT * FROM BANK_TRANSACTION