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
import com.mx.proyecto.Dto.CatEstadosDto;
import com.mx.proyecto.Services.CatEstadosService;
import com.mx.proyecto.entities.CatEstados;



@Controller
@RequestMapping("Estados")
public class CatEstadosControllers {
	
	@Autowired
	private  CatEstadosService catEstadosService;
	
	@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
    @RequestMapping(value="/getEstados", method = RequestMethod.GET, produces = "application/json") //= select * from Aspirantes
	public ResponseEntity < List<CatEstados> > obtenerEstados(){
		final HttpHeaders httpHeaders = new HttpHeaders();
		List<CatEstados> respuesta = catEstadosService.getCatEstados();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity <List<CatEstados>> (respuesta, httpHeaders, HttpStatus.OK);	
   
    }
	
	
	

	@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
    @RequestMapping(value="/insertarEstado", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	public ResponseEntity < String> insertarNuevoEstado( @RequestBody CatEstadosDto nuevoEstado){
		final HttpHeaders httpHeaders = new HttpHeaders();
		String respuesta = catEstadosService.agregarNuevoEstados(nuevoEstado);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity <String>(respuesta, httpHeaders, HttpStatus.OK);	
   
    }
	
	
	
	@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
    @RequestMapping(value="/eliminarEstado", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	public ResponseEntity < String> eliminarEstado( @RequestBody CatEstadosDto idEstado){
		final HttpHeaders httpHeaders = new HttpHeaders();
		String respuesta = catEstadosService.eliminarEstados(idEstado);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity <String>(respuesta, httpHeaders, HttpStatus.OK);	
	}

    
	
	@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
    @RequestMapping(value="/actualizarEstado", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	public ResponseEntity < String> actualizarEstados( @RequestBody CatEstados estados){
		final HttpHeaders httpHeaders = new HttpHeaders();
		String respuesta = catEstadosService.actualizarEstados(estados);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity <String>(respuesta, httpHeaders, HttpStatus.OK);	

	
	}
	
}
