How to use this project :
1. 
Create database with 5 column inside "customer" table :

CREATE DATABASE GUEST
USE GUEST

CREATE TABLE customer (
    CUSTOMER_PHONE VARCHAR(15) PRIMARY KEY,
    NAME VARCHAR(100),
    ADDRESS VARCHAR(255),
    CITY VARCHAR(100),
    DATEOFBIRTH DATE
);

Create database with 3 column inside "admin" table :

CREATE TABLE admin (
	id INT PRIMARY KEY AUTO_INCREMENT,
	username VARCHAR(255),
	password VARCHAR(255)
);

2. Clone this project
  
3. Make sure these following line correct in connectionDB.java (inside swing package) :
  - String url="jdbc:mysql://localhost:3306/guest"; 
  - String user="root"; 
  - String pass="";
  
4. Run the project.
