# First Simple Hibernate Demo
## Course "Hibernate Fundamentals for Absolute Beginners" on Udemy

Used the latest versions of hibaernate-core and mysql-connector-java (5.4.1.Final and 8.0.14 at the time).

## SQL - MySQL-DB is used in the Course

#### SQL to create the DataBase:
`CREATE DATABASE bookdb;`<br><br>
`CREATE TABLE 'book'`<br>`(`<br>
  `'id' int(11) NOT NULL,`<br>
  `'book_name' varchar(100) DEFAULT NULL,`<br>
  `'book_author' varchar(100) DEFAULT NULL,`<br>
  `PRIMARY KEY ('id')`<br>
`);`
<br><br>
Change the Hibernate-Config-File (src/main/resoures/hibernate.cfg.xml) according to your DB-Settings. Esp. the username and password lines ;-)
<br><br>
## Hibernate
Mapping is shown using an XML-File instead of annotations.
Annotations being covered later in the Course.
<br><br>
Mapping file has to be named as: <br>
`<classname>.hbm.cml`<br>
And goes under `src/main/resoures` as all the configuration files.
