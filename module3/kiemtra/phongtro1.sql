create database phongtro ;
use phongtro ;

create table phongtro(
id int auto_increment primary key ,
name varchar(50) ,
phoneNumber varchar(50) ,
startDate date ,
description varchar (50) ,
thanhtoan_id int , 
foreign key (thanhtoan_id) references thanhtoan(id)
);

create table thanhtoan(
id int auto_increment primary key ,
thanhtoan varchar (50) 	
)
