use ss3_quan_ly_sinh_vien ;

insert into Class
value ( 1 , 'A1' , '2008-12-20' , 1);
insert into Class
value ( 2 , 'A2' , '2008-12-22' , 1);
insert into Class
value ( 3 , 'A3' , current_date , 0);

insert into Student (StudentName, Address, Phone, Status, ClassId)
values ('Hung', 'Ha Noi', '0912113113', 1, 1);
insert into Student (StudentName, Address, Status, ClassId)
values ('Hoa', 'Hai phong', 1, 1);
insert into Student (StudentName, Address, Phone, Status, ClassId)
value ('Manh', 'HCM', '0123123123', 0, 2);

insert into Subject
value (1 , 'CF' , 5 , 1),
      (2 , 'C' , 6 , 1),
	  (3 , 'HDJ' , 5 , 1),
	  (4 , 'RDBMS' , 10 , 1);
insert into Mark (SubId, StudentId, Mark, ExamTime )
value (1, 1, 8, 1),
      (1, 2, 10, 2),
      (2, 1, 12, 1);