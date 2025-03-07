use movies;
select 
	count(m.movie_id) as 'ukupan brj filmova specificnog zanra',
    g.genre_title,
    m.director
from movies m
join genres g on g.genre_id=m.genre_id
group by g.genre_title, m.director;