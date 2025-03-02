

insert 
into orders
(customer_id, order_date, status)
values (1, '2025-01-16', 1);

insert
into order_items
values 
(last_insert_id(), 1, 3, 2.95),
(last_insert_id(), 1, 3, 2.95),
(last_insert_id(), 1, 3, 2.95),
(last_insert_id(), 1, 3, 2.95)
;