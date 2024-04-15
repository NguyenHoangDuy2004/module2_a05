create database quan_ly_ban_hang ;
use quan_ly_ban_hang ;

create table customer (
cId int primary key ,
cName varchar (50) ,
cAge datetime 
);

create table orderr (
oId int primary key ,
cid int ,
oDate datetime,
oTotal float ,
foreign key (cid) references customer (cId)
);

create table product (
pID int primary key ,
pName varchar (50) ,
pPrice float
);

create table orderdetail (
oId int ,
pId int ,
odQTY varchar(50) ,
foreign key (oId) references orderr (oId) ,
foreign key (pId) references product (pID)
);
