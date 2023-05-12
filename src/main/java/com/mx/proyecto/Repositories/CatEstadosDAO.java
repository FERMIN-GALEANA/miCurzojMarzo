package com.mx.proyecto.Repositories;

import java.util.List;


import com.mx.proyecto.entities.CatEstados;

public interface CatEstadosDAO {


	List<CatEstados> obtenerEstados();
	 
	Integer insertaEstado(CatEstados estadoAInsertar);
	Integer eliminaEstado(Long idEstado);
	Integer actualizaEstado(CatEstados estado);
}
