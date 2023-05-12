package com.mx.proyecto.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("SolicitudController")

public class Solicitud {
	
	
	
	//servicios
			@RequestMapping("/Solicitud")//nombre del servicio
			public String inicio () {
				return "Solicitud";

	}

}
