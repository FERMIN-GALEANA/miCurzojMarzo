package com.mx.proyecto.Services;

import com.mx.proyecto.Dto.EmpleadosDTO;
import com.mx.proyecto.Dto.Response;




public interface EmpleadosService {

	//Response getEmpleados(EmpleadosDTO sexo);
	//Response obtenerEmpleadoFemeninoEdad(EmpleadosDTO sexo, int edad);
	Response agregarEmpleados(EmpleadosDTO curp);
	Response eliminarEmpleadoNoActivo(EmpleadosDTO curp);
	//String actualizarEmpleados(EmpleadosDTO empleados);

}
