SELECT
  c.customer_id,
  c.first_name,
  o.order_id,
  sh.name
FROM customers c
LEFT JOIN orders o
  on c.customer_id=o.customer_id
LEFT JOIN shippers sh
  on o.shipper_id=sh.shipper_id
  ORDER BY c.customer_id;