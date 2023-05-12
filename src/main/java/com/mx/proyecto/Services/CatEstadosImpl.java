package com.mx.proyecto.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mx.proyecto.Dto.CatEstadosDto;
import com.mx.proyecto.Repositories.CatEstadosDAO;
import com.mx.proyecto.entities.CatEstados;


@Service
public class CatEstadosImpl implements CatEstadosService {
	
	

	@Autowired
	private CatEstadosDAO catEstadosDAO;  //PARA LA CONEXIÓN A LA BASE DE DATOS

	@Override
	public List<CatEstados> getCatEstados() {
		  List<CatEstados> listaEstados= catEstadosDAO.obtenerEstados();
		return listaEstados;
	}

	
	@Override    
	public String agregarNuevoEstados(CatEstadosDto nuevoEstado) {
		CatEstados estadoAInsertar= new CatEstados();//declara un nuevo obj
		estadoAInsertar.setIdEstado(nuevoEstado.getIdEstado());
		estadoAInsertar.setNombre(nuevoEstado.getNombre());
		estadoAInsertar.setAbreviatura(nuevoEstado.getAbreviatura());
		//al final en esta posicion de obj  -<datos a insertar tiene toda la informacion
				Integer resp=catEstadosDAO.insertaEstado(estadoAInsertar);
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
	public String eliminarEstados(CatEstadosDto idEstado){
		Integer respuesta=catEstadosDAO.eliminaEstado(idEstado.getIdEstado());
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
	public String actualizarEstados(CatEstados estados) {
		Integer respuesta=catEstadosDAO.actualizaEstado(estados);
		String resUpdate;
		if(respuesta==1){
			resUpdate="no se pudo actualizar el registro";
		}else
		{
			resUpdate=" registro actualizado";
		}
		return resUpdate;
	}

		
	

	


	
	
}
