use hr;
select
   e.employee_id,
   e.first_name as 'Employee-Name',
   m.employee_id as 'Manager ID',
   m.first_name as 'Manager Name'
from employees  e
left join employees m
  on e.reports_to=m.employee_id;