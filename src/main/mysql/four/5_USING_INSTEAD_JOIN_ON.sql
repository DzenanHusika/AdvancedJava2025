use store;
select
  o.order_id,
  c.first_name,
  sh.name
from orders o
join customers c using (customer_id)
join shippers sh using (shipper_id);