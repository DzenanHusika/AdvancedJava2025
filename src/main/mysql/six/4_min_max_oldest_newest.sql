use sakila;
select * from film;

select
	max(release_year) as 'Newest release year'
from film;

select * from film;

select
	min(release_year) as 'Oldest release year'
from film;