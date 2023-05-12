package com.mx.proyecto.Services;

import java.util.List;

import com.mx.proyecto.Dto.VendedoresDto;;

public interface ServiceVendedores {

	
	List<VendedoresDto> getVendedores();
	int contarVendedoresNuevos();
	String insertVendedores(VendedoresDto nuevoVendedor);
	String updateVendedores(VendedoresDto vendedor);
	String deleteVendedores(VendedoresDto vendedor);
}
