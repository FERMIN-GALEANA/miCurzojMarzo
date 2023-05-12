package com.mx.proyecto.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mx.proyecto.Dto.PersonaDTO;
import com.mx.proyecto.Dto.Response;
import com.mx.proyecto.Services.ServicePersona;


@Controller
@RequestMapping("Persona")
public class PersonaControllers {
	
	
	//INYECCION DE DEPENDENCIAS
			//INSTANCIAR, LLAMAR O HACER USO DE UNA CLASE QUE TENGA UNA ANOTACIÓN DE SPRING, EJEMPLO:
			//@Service, @Repository, @Bean
			@Autowired
			private ServicePersona servicePersona;
	
	
	@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
    @RequestMapping(value="/getPersona", method =   RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	public String getPersona(@RequestBody PersonaDTO idPersona){
		
		String respuesta=servicePersona.getPersona(idPersona);
		return respuesta;
		
    }
	
	//registro de una nueva persona
	@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
    @RequestMapping(value="/guardarPersona", method =   RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	public String guardarPersona(@RequestBody PersonaDTO datos){
		
		String respuesta=servicePersona.guardarPersona(datos);
		return respuesta;
		
    }

	
	//eliminar persona
		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/eliminarPersona", method =   RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
		public String eliminarPersona(@RequestBody PersonaDTO idPersona){
			
			String respuesta=servicePersona.eliminarPersona(idPersona);
			return respuesta;
			
	    }
		
		
		//eliminar persona
				@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
			    @RequestMapping(value="/eliminarPersonaId", method =   RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
				public Response eliminarPersonaId(@RequestBody PersonaDTO idPersona){
					
					return servicePersona.eliminarPersonaId(idPersona);
					
					
			    }



}
