package com.mx.proyecto.Repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mx.proyecto.entities.Persona;


@Repository 
public class PersonaDAOImpl  extends GenericDAO<Persona, Long> implements PersonaDAO{

	@Override
	public String obtenerPersona() {
	
		return null;
	}

	

}
