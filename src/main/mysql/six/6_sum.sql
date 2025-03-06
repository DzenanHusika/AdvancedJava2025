use invoicing;
select * from invoices;

select max(invoice_total)
from invoices;
select 
	i.client_id, 
	sum(i.invoice_total) as 'Ukupno fakturisano',
    sum(i.payment_total) as 'Ukupno plaćeno'
from invoices i
group by client_id