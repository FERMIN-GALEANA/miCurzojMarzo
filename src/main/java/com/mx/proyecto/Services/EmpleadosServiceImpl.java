package com.mx.proyecto.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mx.proyecto.Dto.EmpleadosDTO;
import com.mx.proyecto.Dto.Response;
import com.mx.proyecto.Repositories.EmpleadosDAO;
import com.mx.proyecto.entities.Empleados;

@Service
public class EmpleadosServiceImpl implements EmpleadosService {

	@Autowired 
	private EmpleadosDAO empleadosDAO;

	/**@Override
	public Response getEmpleados(EmpleadosDTO sexo) {
		Response response=new Response();
		System.out.println("#31 MI RESPUESTA "+ sexo+" prueba");
		
		try{
			Empleados masculino=empleadosDAO.obtenerEmpleado(sexo.getSexo());
		
		if  (masculino != null) {//condicion  SI EXISTE UN REGISTRO
			response.setMessage("empleados masculinos");
			response.setCode(100);		
		}else {
			
		}
	}catch(Exception e) {
		Empleados ob=new Empleados();
		ob.setIdEmpleado(sexo.getIdEmpleados());
		ob.setNombreCompleto(sexo.getNombreCompleto());
		ob.setRfc(sexo.getRfc());
		ob.setCurp(sexo.getCurp());
		ob.setEdad(sexo.getEdad());
		ob.setSexo(sexo.getSexo());
		ob.setDireccion(sexo.getDireccion());
		ob.setNss(sexo.getNss());
		ob.setTelefono(sexo.getTelefono());
		ob.setActivo(sexo.getActivo());
		
		
		empleadosDAO.create(ob);
		
		response.setMessage("RESGISTRO COMPLETADO");
		response.setCode(200);
	
		}
	return response;
		}**/
		@SuppressWarnings("unused")
		@Override
	public Response agregarEmpleados(EmpleadosDTO curp) {//consulta select
		Response response=new Response();
		System.out.println("#31 MI RESPUESTA "+ curp+" prueba");
		//String res=null;			
			try{
				
				Empleados existeCurp=empleadosDAO.buscarPorCur(curp.getCurp()); //select *froma tabla consulta
				System.out.println("# 33 MI RESPUESTA "+ curp+"...");
				System.out.println("#34 OTRA RESPUESTA"+ existeCurp.getIdEmpleado());
				System.out.println("#35 OTRA RESPUESTA"+ existeCurp.getNombreCompleto());
				
				if  (existeCurp != null) {//condicion  SI EXISTE UN REGISTRO
					response.setMessage("EL USUARIO YA ESTA REGISTRADO EN LA DB");
					response.setCode(100);
					
				}else{
					Empleados ob=new Empleados();
					ob.setIdEmpleado(curp.getIdEmpleados());
					ob.setNombreCompleto(curp.getNombreCompleto());
					ob.setRfc(curp.getRfc());
					ob.setCurp(curp.getCurp());
					ob.setEdad(curp.getEdad());
					ob.setSexo(curp.getSexo());
					ob.setDireccion(curp.getDireccion());
					ob.setNss(curp.getNss());
					ob.setTelefono(curp.getTelefono());
					ob.setActivo(curp.getActivo());				
					empleadosDAO.create(ob);
					response.setMessage("RESGISTRO COMPLETADO");
					response.setCode(200);				
				}
		
		}catch(Exception e) {
			response.setMessage("ocurrio un problema al intentar registrar el usuario");
			
		}
		return response;
	}

//2.- Servicio para eliminar un empleado 
//REGLA I.- Se puede eliminar siempre y cuando este dado de baja, si no esta dado de baja
//ese empleado mostrar un mensaje de -> "Imposible eliminar Empleado, Sigue Laborando (Activo)...! ", 
//En caso contrario el siguiente mensaje -> "Empleado eliminado correctamente"

	
		
	
	
/**
	@SuppressWarnings("unused")
	@Override
	public Response eliminarEmpleadoNoActivo(EmpleadosDTO activo) {
		System.out.println("#119 ESTOY EN EL METODO DE ELIMINAR"+activo.getIdEmpleados());
		Response response=new Response();
			try {
			//Empleados existe=empleadosDAO.read(activo.getIdEmpleados()); //validar 
				Empleados existe=empleadosDAO.buacarId(activo.getIdEmpleados());
			System.out.println("#123 OTRA RESPUESTA"+ existe);
			System.out.println("#123 OTRA RESPUESTA"+ existe.getIdEmpleado());
			System.out.println("#124 OTRA RESPUESTA"+ existe.getActivo());
			if(existe!=null) { // dudas, preguntar si se esta realizando coresctamente,  o si se debe convertir a entero 
			response.setMessage("Imposible eliminar Empleado, Sigue Laborando (Activo)");
			response.setCode(100);
			}else
			{
				
			//	Empleados ob=new Empleados();lineas no utilizables para este metodo
				//ob.setIdEmpleados(activo.getIdEmpleados());lineas no utilizables para este metodo
				//ob.setActivo(activo.getActivo());lineas no utilizables para este metodo
				empleadosDAO.delete(activo.getIdEmpleados());
				response.setMessage("Empleado eliminado correctamente");
				response.setCode(200);
			}
		}catch(Exception e) {
			response.setMessage("ocurrio un problema al intentar eliminar el usuario");			
		}
			return response;
		
	}
**/

@Override
public Response eliminarEmpleadoNoActivo(EmpleadosDTO activo) {
	System.out.println("#119 ESTOY EN EL METODO DE ELIMINAR"+activo.getIdEmpleados());
	Response response=new Response();
		try {
			Empleados exiReg=empleadosDAO.read(activo.getIdEmpleados()); //validar 
		//Empleados existe=empleadosDAO.buacarId(activo.getIdEmpleados());
		System.out.println("#123 OTRA RESPUESTA");
	//	System.out.println("#123 OTRA RESPUESTA"+.getEmpleados(sexo)tIdEmpleado());
		//System.out.println("#124 OTRA RESPUESTA"+ existe.getActivo());
		if(activo.getIdEmpleados()==0) { // dudas, preguntar si se esta realizando coresctamente,  o si se debe convertir a entero 
		//	Empleados existe=empleadosDAO.buacarId(activo.getIdEmpleados());
		response.setMessage("Imposible eliminar Empleado, Sigue Laborando (Activo)");
		response.setCode(100);
		} else {
			//Empleados ob=new Empleados();lineas no utilizables para este metodo
			//ob.setIdEmpleados(activo.getIdEmpleados());lineas no utilizables para este metodo
			//ob.setActivo(activo.getActivo());lineas no utilizables para este metodo
			empleadosDAO.delete(activo.getIdEmpleados());
			response.setMessage("Empleado eliminado correctamente");
			response.setCode(200);
		}
	}catch(Exception e) {
		response.setMessage("ocurrio un problema al intentar eliminar el usuario");			
	}
		return response;

}
}

	

	
	


	

	

