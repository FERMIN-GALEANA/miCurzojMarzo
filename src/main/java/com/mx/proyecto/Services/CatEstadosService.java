package com.mx.proyecto.Services;

import java.util.List;
import com.mx.proyecto.Dto.CatEstadosDto;
import com.mx.proyecto.entities.CatEstados;



public interface CatEstadosService {
	 List<CatEstados> getCatEstados();
	 
	 String agregarNuevoEstados(CatEstadosDto nuevoEstado);
	 String eliminarEstados(CatEstadosDto idEstado);
	 String actualizarEstados(CatEstados estados);
	

}
