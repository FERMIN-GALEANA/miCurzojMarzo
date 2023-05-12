package com.mx.proyecto.Repositories;

import java.util.List;

import com.mx.proyecto.entities.UsuariosAdmin;

public interface UsuariosAdminDAO {

	 List<UsuariosAdmin> obtenerUsuario();
		Integer insertaUsuario(UsuariosAdmin datosAInsertar);
		Integer eliminarRegistro(Long idUser);
		Integer actualizarUsuario(UsuariosAdmin datos);

}
