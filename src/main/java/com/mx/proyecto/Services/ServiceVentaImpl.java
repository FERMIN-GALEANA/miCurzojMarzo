package com.mx.proyecto.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mx.proyecto.Dto.VentaDto;
import com.mx.proyecto.Repositories.RepositoryVenta;

@Service
public class ServiceVentaImpl implements ServiceVenta {

	@Autowired
	private RepositoryVenta repositoryVenta;
	
	
	public List<VentaDto> getVenta() {
		// TODO Auto-generated method stub
		return repositoryVenta.getVenta();
		
		
	}

	public int contarVentaNueva() {
	
		System.out.println("LLEGANDO AL METODO contarVendedoresNuevos DE LA CLASE IMPLEMENTACIÓN DEL SERVICIO");
		return repositoryVenta.contarVentaNueva();
	}

	
	
	
	public String insertVenta(VentaDto NuevaVenta) {
		int respuesta=repositoryVenta.insertVenta(NuevaVenta);
		String respuestaFinal="";
		
		//si la respuesta es =1
		
		

		if(respuesta==1) {
			respuestaFinal="SE INSERTO CORRECTAMENTE ";
			}
			
			
		else {
			respuestaFinal="NO SE PUDO INSERTAR EL RESGISTRO ";
		}
		
		return respuestaFinal;
		
		
		
	}
	
	public String updateVenta(VentaDto Venta) {
		int respuesta=repositoryVenta.updateVenta(Venta);
		
		String respuestaFinal="";
		//String edad="";
		
		
		if(respuesta==1) {
			respuestaFinal="SE ACTUALIZO CORRECTAMENTE ";
			}
			
		else {
			respuestaFinal="NO SE PUDO ACTULIZAR EL RESGISTRO ";
		}
		
		return respuestaFinal;
	
	
	}

	public String deleteVenta(VentaDto Venta) {
		int respuesta= repositoryVenta.deleteVenta(Venta);
		String respuestaFinal="";
		//si la respuesta es =1
		
		if(respuesta==1) {
			respuestaFinal="EL REGISTRO FUE ELIMINADO DE LA BASE DE DATOS ";
			}
			
		else {
			respuestaFinal=" EL REGISTRO NO SE ENCONTRO EN LA BASE DE DATOS ";
		}
		
		return respuestaFinal;
	}

	

}
