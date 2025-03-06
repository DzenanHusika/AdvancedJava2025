select
	c.name, fc.category_id, count(fc.film_id) as film_count
from film_category fc
join category c on fc.category_id=c.category_id
group by fc.category_id
order by film_count desc;