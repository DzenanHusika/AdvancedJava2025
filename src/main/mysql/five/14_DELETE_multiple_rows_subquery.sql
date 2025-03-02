SELECT * FROM invoicing.invoices
join clients c using (client_id)
where c.name='Myworks';