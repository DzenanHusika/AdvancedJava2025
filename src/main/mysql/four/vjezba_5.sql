use store;
select
customer_id, 
first_name, 
points, 
'bronze' as 'type of customer'
from customers
where points<2000
union
select
customer_id, 
first_name, 
points, 
'silver' as 'type of customer'
from customers
where points>=2000 and points<3000
union
select
customer_id, 
first_name, 
points, 
'gold' as 'type of customer'
from customers
where points>=3000;