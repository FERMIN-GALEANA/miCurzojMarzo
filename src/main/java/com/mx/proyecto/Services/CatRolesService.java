package com.mx.proyecto.Services;

import java.util.List;

import com.mx.proyecto.Dto.CatRolesDTO;
import com.mx.proyecto.entities.CatRoles;

public interface CatRolesService {
	 List<CatRoles> getRol();
	 
	 String agregarNuevoRol(CatRolesDTO nuevoRol);
	 String eliminarRol(CatRolesDTO idRol);
	 String actualizarRol(CatRoles rol);

}
