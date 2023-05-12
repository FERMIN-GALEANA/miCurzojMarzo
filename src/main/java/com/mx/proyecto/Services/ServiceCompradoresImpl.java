package com.mx.proyecto.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.proyecto.Dto.CompradoresDto;
import com.mx.proyecto.Repositories.RepositoryCompradores;

@Service
public class ServiceCompradoresImpl implements ServiceCompradores {

	@Autowired
	private RepositoryCompradores repositoryCompradores;
	
	
	public List<CompradoresDto> getCompra() {
		// TODO Auto-generated method stub
		return repositoryCompradores.getCompra();
		
		
	}

	public int contarCompraNueva() {
	
		System.out.println("LLEGANDO AL METODO contarVentaNueva DE LA CLASE IMPLEMENTACIÓN DEL SERVICIO");
		return repositoryCompradores.contarCompraNueva();
	}


	public String insertCompra(CompradoresDto CompraNueva) {
		String respuestaFinal="";
		
		
	if (CompraNueva.getEdad()>99 || CompraNueva.getEdad()<1){
		respuestaFinal=" LA EDAD QUE INGRESASTE ESTA FUERA DE LOS LIMITES PERMITIDOS";
		
		}
	else {
		
	
				int respuesta=repositoryCompradores.insertCompradores(CompraNueva);
				
				//si la respuesta es =1
				
				if(respuesta==1) {
					respuestaFinal="SE INSERTO CORRECTAMENTE ";
					}
					
				else {
					respuestaFinal="NO SE PUDO INSERTAR EL RESGISTRO ";
				}

	}		
		return respuestaFinal;
		
		
		
	}
	
	
	public String updateCompra(CompradoresDto Compra) {	
		String respuestaFinal="";
		if(Compra.getEdad()>99 || Compra.getEdad()<1) {
			respuestaFinal=" LA EDAD QUE INGRESASTE ESTA FUERA DE LOS LIMITES PERMITIDOS";
			
		}
		else
		{
			int respuesta=repositoryCompradores.updateCompradores(Compra);
			
			if(respuesta==1) {
				respuestaFinal="SE ACTUALIZO CORRECTAMENTE ";
				}
			else {
				respuestaFinal="NO SE PUDO ACTULIZAR EL RESGISTRO ";
			}			
				
		}
		return respuestaFinal;	
	
	}

	public String deleteCompra(CompradoresDto Compra) {
		int respuesta= repositoryCompradores.deleteCompradores(Compra);
		String respuestaFinal="";
		//si la respuesta es =1
		
		if(respuesta==1) {
			respuestaFinal="EL REGISTRO FUE ELIMINADO DE LA BASE DE DATOS ";
			}
			
		else {
			respuestaFinal="EL REGISTRO NO SE ENCONTRO EN LA BASE DE DATOS  ";
		}
		
		return respuestaFinal;
	}

	



	
	

	


}
