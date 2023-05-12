package com.mx.proyecto.Repositories;

import java.util.List;

import com.mx.proyecto.entities.CatRoles;
public interface CatRolesDAO {
	List<CatRoles> obtenerRol();
		
		Integer insertaRol(CatRoles datosAInsertar);
		Integer eliminarRol(Long idRol);
		Integer actualizarRol(CatRoles rol);
		
	}
	


