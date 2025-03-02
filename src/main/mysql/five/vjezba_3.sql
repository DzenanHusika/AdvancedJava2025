use store;
update orders
set comments='Zlatni kupci'
where customer_id in (
select customer_id
from customers
where points>3000);