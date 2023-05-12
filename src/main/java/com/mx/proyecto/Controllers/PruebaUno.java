package com.mx.proyecto.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("PuebaUnolController")


public class PruebaUno {
	
	//servicios
		@RequestMapping("/PruebaUno")//nombre del servicio
		public String inicio () {
			return "PruebaUno";

}
}