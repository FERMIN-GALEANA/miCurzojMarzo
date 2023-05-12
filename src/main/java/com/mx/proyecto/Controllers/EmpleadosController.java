package com.mx.proyecto.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mx.proyecto.Dto.EmpleadosDTO;
import com.mx.proyecto.Dto.Response;
import com.mx.proyecto.Services.EmpleadosService;

@Controller
@RequestMapping(value="Empleado")
public class EmpleadosController {
	

			@Autowired
			private EmpleadosService empleadosService;
			/**
			@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
		    @RequestMapping(value="/getEmpleadosMasculino", method =   RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
			public Response getEmpleados(@RequestBody EmpleadosDTO empleado){
				return empleadosService.getEmpleados(empleado);
				//return respuesta;
			}
			
			@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
		    @RequestMapping(value="/getEmpleadosFemeninoEdad", method =   RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
			public Response getEmpleadosFemenino(@RequestBody EmpleadosDTO empleado){
				return empleadosService.getEmpleados(empleado);
				//return respuesta;
			}
			
			**/
			@ResponseBody 
			@RequestMapping(value="/agregarEmpleados", method = RequestMethod.POST, produces = "application/json") 
			public Response agregarEmpleados(@RequestBody EmpleadosDTO curp){
				System.out.println("----"+ curp);
				System.out.println("CONTROLADOR---"+ curp.getCurp());
				return empleadosService.agregarEmpleados(curp);//final HttpHeaders httpHeaders = new HttpHeaders();
				
				//String respuesta = empleadosService.agregarEmpleado(curp);º
			//	httpHeaders.setContentType(MediaType.APPLICATION_JSON);
				//return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK);	
		    }
			
			//eliminar persona
			@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
		    @RequestMapping(value="/eliminarEmpleado", method =   RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
			public Response eliminarEmpleado(@RequestBody EmpleadosDTO idEmpleado){
				System.out.println("#75 ESTOY EN EL CONTROLADOR"+idEmpleado.getIdEmpleados());
				return empleadosService.eliminarEmpleadoNoActivo(idEmpleado);
							
		    }
			/**
			@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
		    @RequestMapping(value="/actualizarEmpleado", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
			public ResponseEntity < String> actualizarEmpleados( @RequestBody EmpleadosDTO empleados){
				final HttpHeaders httpHeaders = new HttpHeaders();
				String respuesta = empleadosService.actualizarEmpleados(empleados);
				httpHeaders.setContentType(MediaType.APPLICATION_JSON);
				return new ResponseEntity <String>(respuesta, httpHeaders, HttpStatus.OK);	

			
			}
**/
}
