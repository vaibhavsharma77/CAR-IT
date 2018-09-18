# Spring Boot REST + JPA + Hibernate + MySQL based Application with Swagger 2 documentation

Before Using the Application Please follow the below mentioned steps:


## 1. Create a carit DB using mysql and use it as shown below ##

- CREATE DATABASE IF NOT EXISTS carit;

- USE carit;

## 2. Create a table named as "user" ##

- CREATE TABLE `user`(USER_ID int NOT NULL AUTO_INCREMENT primary key ,USER_NAME varchar(50),CAR_NUMBER varchar(20))

## 3. Dumping data for table carit.`user`: ~6 rows (approximately) ##

- INSERT INTO carit.`user`(USER_ID, USER_NAME, CAR_NUMBER)VALUES(101, 'virat', 'Jaguar'),(102, 'ajay', 'Twz X');

## 4. Use the application and see the swagger UI for more understanding on rest endpoints. ##
