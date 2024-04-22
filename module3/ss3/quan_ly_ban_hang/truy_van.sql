use ss3_quan_ly_ban_hang ;


select oId , oDate , oTotal from Orderr ; 
select Customer.cId, Customer.cName, Product.pID, Product.pName
from Customer
inner join Orderr on Customer.cId = Orderr.cId
inner join OrderDetail on Orderr.oId = OrderDetail.oId
inner join Product on OrderDetail.pId = Product.pId;

select cId, cName from Customer where cId not in (select distinct cId from Orderr);

select Orderr.oId, Orderr.oDate, sum(OrderDetail.odQty * Product.pPrice) as TotalPrice
from Orderr
inner join OrderDetail on Orderr.oId = OrderDetail.oId
inner join Product on OrderDetail.pId = Product.pId
group by Orderr.oId, Orderr.oDate;