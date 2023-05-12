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

import com.mx.proyecto.Dto.CompradoresDto;
import com.mx.proyecto.Services.ServiceCompradores;


@Controller
@RequestMapping("PrincipalController")
public class ControllersCompradores {

	//INYECCION DE DEPENDENCIAS
		//INSTANCIAR, LLAMAR O HACER USO DE UNA CLASE QUE TENGA UNA ANOTACIÓN DE SPRING, EJEMPLO:
		//@Service, @Repository, @Bean
		@Autowired
		private ServiceCompradores serviceCompradores;
		
		//SERVICIOS
			
		
		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/getCompradores", method = RequestMethod.GET, produces = "application/json") //= select * from Aspirantes
		ResponseEntity < List<CompradoresDto> > getCompra(){
			final HttpHeaders httpHeaders = new HttpHeaders();
			List<CompradoresDto> lista = serviceCompradores.getCompra();
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			return new ResponseEntity <List<CompradoresDto>> (lista, httpHeaders, HttpStatus.OK);	
	    } 
		
		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/insertCompradores", method = RequestMethod.POST, produces = "application/json") //= select * from 
		ResponseEntity <  String >  insertApirantes(@RequestBody CompradoresDto compraNueva){
			final HttpHeaders httpHeaders = new HttpHeaders();
			
			String respuesta = serviceCompradores.insertCompra(compraNueva);
			
		
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			
			return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK);	
	    } 
		
		
		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/updateCompradores", method = RequestMethod.PUT, produces = "application/json") //= select * from Aspirantes
		ResponseEntity <  String >  updateAspirantes(@RequestBody CompradoresDto Compra){
			final HttpHeaders httpHeaders = new HttpHeaders();
			
			String respuesta = serviceCompradores.updateCompra(Compra);
			
		
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			
			return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK);	
	    } 

		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/deleteCompradores", method = RequestMethod.DELETE, produces = "application/json") //= select * from Aspirantes
		ResponseEntity <  String >  deleteAspitantes(@RequestBody CompradoresDto Compra){
			final HttpHeaders httpHeaders = new HttpHeaders();
			
			String respuesta = serviceCompradores.deleteCompra(Compra);
			
		
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			
			return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK);	
	    } 

}
