# CAR-IT
Spring Boot REST + JPA + Hibernate + MySQL based Application

Before Using the Application Please follow the below mentioned steps:
1.Create a carit DB using mysql and use it as shown below
-- Dumping database structure for carit
CREATE DATABASE IF NOT EXISTS carit;
USE carit;

2.-- Dumping structure for table carit.`user` (Create a table name it as "user" with db 
create table `user`
(USER_ID int NOT NULL AUTO_INCREMENT primary key ,
USER_NAME varchar(50),CAR_NUMBER varchar(20))

3.-- Dumping data for table carit.`user`: ~6 rows (approximately)
INSERT INTO carit.`user`
(USER_ID, USER_NAME, CAR_NUMBER)
VALUES(100, 'srishant', 'BMW'),
(101, 'virat', 'Jaguar'),
(102, 'ajay', 'Twz X'),
(103, 'Abhi', 'Toyota X'),
(104, 'Ankit', 'Audi SERIES X'),
(105, 'Prashant', 'Telsa SERIES X');

4.Now Use the application and see the swagger ui for api documentation.
