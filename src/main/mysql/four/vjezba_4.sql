SELECT 
    sh.name AS shipper, p.name AS product
FROM
    products p
        CROSS JOIN
    shippers sh
ORDER BY sh.name;

SELECT 
    sh.name AS shipper, p.name AS product
FROM
    products p,
    shippers sh
ORDER BY sh.name;