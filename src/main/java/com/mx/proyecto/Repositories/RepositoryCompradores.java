package com.mx.proyecto.Repositories;

import java.util.List;

import com.mx.proyecto.Dto.CompradoresDto;


public interface RepositoryCompradores {
		List<CompradoresDto> getCompra();
		int contarCompraNueva();
		int insertCompradores(CompradoresDto CompraNueva);
		int updateCompradores(CompradoresDto Compra);
		int deleteCompradores(CompradoresDto Compra);



}