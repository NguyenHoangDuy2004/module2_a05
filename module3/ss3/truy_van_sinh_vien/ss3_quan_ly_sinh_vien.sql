create database ss3_quan_ly_sinh_vien ;
use ss3_quan_ly_sinh_vien;

create table Class (
ClassID  int primary key not null  auto_increment,
 ClassName varchar (60) not null ,
 StartDate datetime not null ,
 Status bit 
);

create table Student (
StudentID int not null primary key auto_increment,
StudentName varchar (30) not null ,
Address varchar (50) ,
Phone varchar (20),
Status bit ,
ClassId int not null,
foreign key (ClassId) references class (ClassID)
);

create table Subject (
SubID int not null primary key auto_increment,
SubName varchar (50) not null ,
Credit tinyint not null default  1  check (Credit >=1),
Status Bit default  1
);

create table Mark (
MarkID int not null primary key auto_increment,
SubId int not null,
StudentId int not null ,
Mark float,
foreign key(SubId) references subject( SubID ),
foreign key(StudentId) references student( StudentID ),
ExamTime tinyint
);

select *
from Student where StudentName like 'H%';

select * 
from Class where month (StartDate) = 12 ;

select * 
from Subject where Credit between 3 and 5 ;

insert into 
UPDATE Student Set ClassId = 2 where StudentName = 'Hung' ;