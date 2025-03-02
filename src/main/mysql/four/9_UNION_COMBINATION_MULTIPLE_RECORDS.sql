select 
 order_id,
 order_date,
 'Active' as status
from orders
where order_date>='2018-01-01'
union
select
  order_id,
  order_date,
  'Archived' as status
from orders
where order_date<'2018-01-01';