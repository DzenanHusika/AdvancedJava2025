-- VARCHAR(50) -> tip podatka vezan za kolonu
-- možemo imati maksimalno u tooj koloni podatak
-- dug 50, ali možemo primiti i manje od 50 karaktera

-- CHAR(50) -> ima fiksnu dužinu karakteru i vrlo često neeefikasan
-- ako mi ubacimo 3 karaktera MySQL će insertovati dodatne spaces
-- da zadovolji 50 dužinu. NEPOTREBNO gubimo memory space
insert into customers
values(default, 'John', 'Doe', '1990-01-01', default, 'Zmaja od noćaja', 'Sarajevo', 'BA', default);

insert into customers(first_name, last_name, birth_date, address, city, state)
values('Tarik', 'Bulić', '1980-01-01', 'Zmaja od Bosne', 'Gradačac', 'BA');
