# Create database

create database todo;

# Create the required table 

create table todo(id int NOT NULL AUTO_INCREMENT, title varchar(45) DEFAULT NULL, description varchar(100) DEFAULT NULL, done boolean, PRIMARY KEY(id));