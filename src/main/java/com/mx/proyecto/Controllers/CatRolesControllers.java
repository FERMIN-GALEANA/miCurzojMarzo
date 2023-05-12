package com.mx.proyecto.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mx.proyecto.Dto.CatRolesDTO;
import com.mx.proyecto.Services.CatRolesService;
import com.mx.proyecto.entities.CatRoles;

@Controller
@RequestMapping("Rol")
public class CatRolesControllers {
	
	
	@Autowired
	private  CatRolesService catRolesService;
	
	
	//CONSULTA

		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/getRol", method = RequestMethod.GET, produces = "application/json") //= select * from Aspirantes
		public ResponseEntity < List<CatRoles> > obtenerRol(){
			final HttpHeaders httpHeaders = new HttpHeaders();
			List<CatRoles> respuesta = catRolesService.getRol();
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			return new ResponseEntity <List<CatRoles>> (respuesta, httpHeaders, HttpStatus.OK);	
	   
	    }
	
		
		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/insertarRol", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
		public ResponseEntity < String> insertarNuevoRol( @RequestBody CatRolesDTO nuevoRol){
			final HttpHeaders httpHeaders = new HttpHeaders();
			String respuesta = catRolesService.agregarNuevoRol(nuevoRol);
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			return new ResponseEntity <String>(respuesta, httpHeaders, HttpStatus.OK);	
	   
	    }
		
		
		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/eliminarRol", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
		public ResponseEntity < String> eliminarRol( @RequestBody CatRolesDTO idRol){
			final HttpHeaders httpHeaders = new HttpHeaders();
			String respuesta = catRolesService.eliminarRol(idRol);
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			return new ResponseEntity <String>(respuesta, httpHeaders, HttpStatus.OK);	
		}
		
		
		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/actualizarRol", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
		public ResponseEntity < String> actualizarRol( @RequestBody CatRoles rol){
			final HttpHeaders httpHeaders = new HttpHeaders();
			String respuesta = catRolesService.actualizarRol(rol);
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			return new ResponseEntity <String>(respuesta, httpHeaders, HttpStatus.OK);	

		
		}

}


