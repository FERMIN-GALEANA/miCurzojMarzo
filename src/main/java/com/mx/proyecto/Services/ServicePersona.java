package com.mx.proyecto.Services;

import com.mx.proyecto.Dto.PersonaDTO;
import com.mx.proyecto.Dto.Response;

public interface ServicePersona {
	String getPersona(PersonaDTO idPersona);
	String guardarPersona(PersonaDTO nuevaPersona);
	String eliminarPersona(PersonaDTO idPersona);
	
	Response eliminarPersonaId(PersonaDTO idPersona);
	
	
	
}
