package com.mx.proyecto.Repositories;


import com.mx.proyecto.entities.Empleados;


public interface EmpleadosDAO extends DAO<Empleados, Long> {
//	Empleados obtenerEmpleado(String sexo);
	 Empleados buscarPorCur(String curp); //metodo personalizado para buscar por curp
	 Empleados eliminarEmpleadoNoActivo(Empleados activo);
//	Empleados actualizarEmpleados(Empleados rfc);
	//Empleados obtenerEmpleadoFemeninoEdad(String sexo, int edad);
	
	
	Empleados buacarId(long idEmpleados);
	
		
	

	

	
}
