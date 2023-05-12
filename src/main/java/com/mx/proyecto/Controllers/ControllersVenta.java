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


import com.mx.proyecto.Dto.VentaDto;
import com.mx.proyecto.Services.ServiceVenta;

@Controller
@RequestMapping("PrincipalController")
public class ControllersVenta {
	
	
	//INYECCION DE DEPENDENCIAS
		//INSTANCIAR, LLAMAR O HACER USO DE UNA CLASE QUE TENGA UNA ANOTACIÓN DE SPRING, EJEMPLO:
		//@Service, @Repository, @Bean
		@Autowired
		private ServiceVenta serviceVenta;
		
		//SERVICIOS
			
		
		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/getVenta", method = RequestMethod.GET, produces = "application/json") //= select * from Aspirantes
		ResponseEntity < List<VentaDto> > getVenta(){
			final HttpHeaders httpHeaders = new HttpHeaders();
			List<VentaDto> lista = serviceVenta.getVenta();
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			return new ResponseEntity <List<VentaDto>> (lista, httpHeaders, HttpStatus.OK);	
	    } 
		
		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/insertVenta", method = RequestMethod.POST, produces = "application/json") //= select * from 
		ResponseEntity <  String >  insertApirantes(@RequestBody VentaDto NuevaVenta){
			final HttpHeaders httpHeaders = new HttpHeaders();
			
			String respuesta = serviceVenta.insertVenta(NuevaVenta);
			
		
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			
			return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK);	
	    } 
		
		
		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/updateVenta", method = RequestMethod.PUT, produces = "application/json") //= select * from Aspirantes
		ResponseEntity <  String >  updateAspirantes(@RequestBody VentaDto Venta){
			final HttpHeaders httpHeaders = new HttpHeaders();
			
			String respuesta = serviceVenta.updateVenta(Venta);
			
		
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			
			return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK);	
	    } 

		@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	    @RequestMapping(value="/deleteVenta", method = RequestMethod.DELETE, produces = "application/json") //= select * from Aspirantes
		ResponseEntity <  String >  deleteAspitantes(@RequestBody VentaDto Venta){
			final HttpHeaders httpHeaders = new HttpHeaders();
			
			String respuesta = serviceVenta.deleteVenta(Venta);
			
		
			httpHeaders.setContentType(MediaType.APPLICATION_JSON);
			
			return new ResponseEntity <String> (respuesta, httpHeaders, HttpStatus.OK);	
	    } 

}
