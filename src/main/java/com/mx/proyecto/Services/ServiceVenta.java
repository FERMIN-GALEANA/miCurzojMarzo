package com.mx.proyecto.Services;

import java.util.List;


import com.mx.proyecto.Dto.VentaDto;

public interface ServiceVenta {
	List<VentaDto> getVenta();
	int contarVentaNueva();
	String insertVenta(VentaDto ventaNueva);
	String updateVenta(VentaDto venta);
	String deleteVenta(VentaDto venta);

}
