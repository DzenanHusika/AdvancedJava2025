use invoicing;
select
  p.date,
  c.name as 'Client',
  p.amount,
  pm.name as 'Payment method'
  from clients c
  join payments p using (client_id)
  join payment_methods pm
	on p.payment_method=pm.payment_method_id;