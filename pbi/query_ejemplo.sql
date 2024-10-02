select e.*, level nivel
from labcl01.cl_empleados e
start with e.id_empleado=100
connect by prior e.id_empleado=e.id_gerente
