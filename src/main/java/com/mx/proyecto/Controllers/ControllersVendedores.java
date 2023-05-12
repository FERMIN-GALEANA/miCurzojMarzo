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


import com.mx.proyecto.Dto.VendedoresDto;
import com.mx.proyecto.Services.ServiceVendedores;



//ADMINISTRAR LAS PETICONES DEL USUARIO

@Controller
@RequestMapping("PrincipalController")
public class ControllersVendedores {
	
	
	
	//INYECCION DE DEPENDENCIAS
		//INSTANCIAR, LLAMAR O HACER USO DE UNA CLASE QUE TENGA UNA ANOTACIÓN DE SPRING, EJEMPLO:
		//@Service, @Repository, @Bean
		@Autowired
		private ServiceVendedores serviceVendedores;
		
		//SERVICIOS
			
		
		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/getVendedores", method = RequestMethod.GET, produces = "application/json") //= select * from Aspirantes
		ResponseEntity < List<VendedoresDto> > getVendedores(){
			final HttpHeaders httpHeaders = new HttpHeaders();
			List<VendedoresDto> lista = serviceVendedores.getVendedores();
			
		
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			
			return new ResponseEntity <List<VendedoresDto>> (lista, httpHeaders, HttpStatus.OK);	
	    } 
		
		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/insertVendedores", method = RequestMethod.POST, produces = "application/json") //= select * from 
		ResponseEntity <  String >  insertApirantes(@RequestBody VendedoresDto NuevoVendedor){
			final HttpHeaders httpHeaders = new HttpHeaders();
			
			String respuesta = serviceVendedores.insertVendedores(NuevoVendedor);
			
		
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			
			return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK);	
	    } 
		
		
		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/updateVendedores", method = RequestMethod.PUT, produces = "application/json") //= select * from Aspirantes
		ResponseEntity <  String >  updateAspirantes(@RequestBody VendedoresDto Vendedor){
			final HttpHeaders httpHeaders = new HttpHeaders();
			
			String respuesta = serviceVendedores.updateVendedores(Vendedor);
			
		
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			
			return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK);	
	    } 

		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/deleteVendedores", method = RequestMethod.DELETE, produces = "application/json") //= select * from Aspirantes
		ResponseEntity <  String >  deleteAspitantes(@RequestBody VendedoresDto Vendedor){
			final HttpHeaders httpHeaders = new HttpHeaders();
			
			String respuesta = serviceVendedores.deleteVendedores(Vendedor);
			
		
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			
			return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK);	
	    } 
}
