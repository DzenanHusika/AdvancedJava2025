SELECT 
    *
FROM
    order_items oi
        LEFT JOIN
    order_item_notes oin USING (order_id , product_id);
--  on oi.order_id=oi.order_id and oi.product_id=oin.product_id;