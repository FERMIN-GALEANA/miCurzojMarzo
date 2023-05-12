package com.mx.proyecto.Services;

import java.util.List;

import com.mx.proyecto.Dto.CompradoresDto;

public interface ServiceCompradores {
	List<CompradoresDto> getCompra();
	int contarCompraNueva();
	String insertCompra(CompradoresDto compraNueva);
	String updateCompra(CompradoresDto compra);
	String deleteCompra(CompradoresDto compra);

}
