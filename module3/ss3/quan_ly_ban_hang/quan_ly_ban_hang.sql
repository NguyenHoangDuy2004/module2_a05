create database ss3_quan_ly_ban_hang ;
use ss3_quan_ly_ban_hang ;

create table Customer(
cId int primary key , 
cName varchar (25) ,
cAge tinyInt 
);

create table Orderr (
oId  int primary key ,
cId int ,
oDate datetime ,
oTotal int ,
foreign key (cId) references Customer (cId) 
);

create table Product (
pId int primary key ,
pName varchar (25) , 
pPrice int 
);

create table OrderDetail (
oId int ,
pId int ,
odQTY int ,
foreign key (oId) references Orderr (oId) ,
foreign key (pId) references Product (pId)
)