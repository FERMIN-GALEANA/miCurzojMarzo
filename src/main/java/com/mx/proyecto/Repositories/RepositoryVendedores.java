package com.mx.proyecto.Repositories;

import java.util.List;

import com.mx.proyecto.Dto.VendedoresDto;


public interface RepositoryVendedores {
	
	List<VendedoresDto> getVendedor();
	int contarVendedoresNuevos();
	int insertVendedor(VendedoresDto nuevoVendedor);
	int updateVendedor(VendedoresDto Vendedor);
	int deleteVendedor(VendedoresDto Vendedor);

	
	
}
