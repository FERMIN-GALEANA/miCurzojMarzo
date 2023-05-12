package com.mx.proyecto.Repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.proyecto.entities.CatRoles;
import com.mx.proyecto.entities.Persona;


//									DAO<CLASE ENTIDADES, TIPO DE DATO DE LA PK
@Service
public interface PersonaDAO extends DAO<Persona, Long> {
	
	String obtenerPersona();
	
		
		
		
		
	
	
	
	
	

}
