package com.mx.proyecto.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.proyecto.Dto.UsuariosAdminDTO;
import com.mx.proyecto.Repositories.UsuariosAdminDAO;
import com.mx.proyecto.entities.UsuariosAdmin;

@Service
public class UsuariosAdminImpl implements UsuariosAdminService  {

	@Autowired
	private UsuariosAdminDAO usuariosAdminDAO;  //PARA LA CONEXIÓN A LA BASE DE DATOS

	@Override
	public List<UsuariosAdmin> getUsuarios() {
		  List<UsuariosAdmin> listaUsuarios= usuariosAdminDAO.obtenerUsuario();
		return listaUsuarios;
	}

	@Override
	public String agregarNuevoUsuario(UsuariosAdminDTO nuevoUsuario) {
		UsuariosAdmin datosAInsertar= new UsuariosAdmin();//declara un nuevo obj
		datosAInsertar.setIdUser(nuevoUsuario.getIdUser());
		datosAInsertar.setNombreCompleto(nuevoUsuario.getNombreCompleto());
		datosAInsertar.setEdad(nuevoUsuario.getEdad());
		datosAInsertar.setDireccion(nuevoUsuario.getDireccion());
		datosAInsertar.setEstado(nuevoUsuario.getEstado());
		datosAInsertar.setRol(nuevoUsuario.getRol());
		//al final en esta posicion de obj  -<datos a insertar tiene toda la informacion
		Integer resp=usuariosAdminDAO.insertaUsuario(datosAInsertar);
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
	public String eliminarUsuario(UsuariosAdminDTO idUser) {
		Integer respuesta=usuariosAdminDAO.eliminarRegistro(idUser.getIdUser());
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
	public String actualizarUsuario(UsuariosAdmin datos) {
		
		Integer respuesta=usuariosAdminDAO.actualizarUsuario(datos);
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
