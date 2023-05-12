package com.mx.proyecto.Repositories;

import java.util.List;

import com.mx.proyecto.Dto.VentaDto;

public interface RepositoryVenta {
	List<VentaDto> getVenta();
	int contarVentaNueva();
	int insertVenta(VentaDto VentaNueva);
	int updateVenta(VentaDto Venta);
	int deleteVenta(VentaDto Venta);
	//int Edad(VentaDto edad);


}
