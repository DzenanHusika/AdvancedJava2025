use store;
select
o.order_id,
c.first_name
from orders o
natural join  customers c