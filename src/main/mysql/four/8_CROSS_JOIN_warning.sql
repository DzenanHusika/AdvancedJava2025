select
c.first_name as custmer,
p.name as product
from customers c
cross join products p
order by c.first_name;

select
c.first_name as customer,
p.name as product
from customers c
join products p
order by c.first_name;
