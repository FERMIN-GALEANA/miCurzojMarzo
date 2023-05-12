package com.mx.proyecto.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.proyecto.Dto.CatRolesDTO;
import com.mx.proyecto.Repositories.CatRolesDAO;
import com.mx.proyecto.entities.CatRoles;

@Service
public class CatRolesImpl  implements  CatRolesService{

	

	@Autowired
	private CatRolesDAO catRolesDAO;  //PARA LA CONEXIÓN A LA BASE DE DATOS

	
	@Override
	public List<CatRoles> getRol() {
		 List<CatRoles> listaRol= catRolesDAO.obtenerRol();
			return listaRol;
	
	}

	@Override
	public String agregarNuevoRol(CatRolesDTO nuevoRol) {
		CatRoles datosAInsertar= new CatRoles();//declara un nuevo obj
		datosAInsertar.setIdRol(nuevoRol.getIdRol());
		datosAInsertar.setNombre(nuevoRol.getNombre());
		datosAInsertar.setDescripcion(nuevoRol.getDescripcion());
		
		Integer resp=catRolesDAO.insertaRol(datosAInsertar);
		String resInsertar;
		if(resp==1){
			resInsertar="se  inserto el registro";
		}else
		{
			resInsertar="no se pudo insertar el registro";
		}
		return resInsertar;
	}

	@Override
	public String eliminarRol(CatRolesDTO idRol) {
		Integer respuesta=catRolesDAO.eliminarRol(idRol.getIdRol());
		String resDelete;
		if(respuesta==1){
			resDelete="se  elimino el registro";
		}else
		{
			resDelete="no se pudo eliminar el registro";
		}
		return resDelete;
	}

	@Override
	public String actualizarRol(CatRoles rol) {
		Integer respuesta=catRolesDAO.actualizarRol(rol);
		String resUpdate;
		if(respuesta==1){
			resUpdate="se  actualizo el registro";
		}else
		{
			resUpdate="no se pudo actualizar el registro";
		}
		return resUpdate;
	}


}
