# First Simple Hibernate Demo
## Course "Hibernate Fundamentals for Absolute Beginners" on Udemy

Used the latest versions of hibaernate-core and mysql-connector-java (5.4.1.Final and 8.0.14 at the time).

## SQL - MySQL-DB is used in the COurse

SQL to create the DataBase:<br>
`CREATE DATABASE bookdb;`<br><br>
`CREATE TABLE 'book'`<br>`(`<br>
  `'id' int(11) NOT NULL,`<br>
  `'book_name' varchar(100) DEFAULT NULL,`<br>
  `'book_author' varchar(100) DEFAULT NULL,`<br>
  `PRIMARY KEY ('id')`<br>
`);`
