use movies;
create view scifi as
select
m.movie_id,
m.movie_title,
g.genre_title
from movies m
join genres g on m.genre_id=g.genre_id