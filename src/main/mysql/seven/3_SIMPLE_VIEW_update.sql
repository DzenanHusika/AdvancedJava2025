use movies;
select * from scifi;

update scifi
set movie_title='Umjetna Inteligencija'
where movie_id=15;
select *
from movies;