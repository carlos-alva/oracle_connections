create view v_vista1 as
select e.*, level nivel
from labcl01.cl_empleados e
start with e.id_empleado=100
connect by prior e.id_empleado=e.id_gerente;

select *
from v_vista1;
