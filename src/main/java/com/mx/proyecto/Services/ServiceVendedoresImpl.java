package com.mx.proyecto.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mx.proyecto.Dto.VendedoresDto;
import com.mx.proyecto.Repositories.RepositoryVendedores;

@Service
public class ServiceVendedoresImpl implements ServiceVendedores{

	@Autowired
	private RepositoryVendedores repositoryVendedores;
	
	
	public List<VendedoresDto> getVendedores() {
		// TODO Auto-generated method stub
		return repositoryVendedores.getVendedor();
		
		
	}

	public int contarVendedoresNuevos() {
	
		System.out.println("LLEGANDO AL METODO contarVendedoresNuevos DE LA CLASE IMPLEMENTACIÓN DEL SERVICIO");
		return repositoryVendedores.contarVendedoresNuevos();
	}

	
	
	
	public String insertVendedores(VendedoresDto nuevoVendedor) {
		String respuestaFinal="";
		if(nuevoVendedor.getEdad()>99 || nuevoVendedor.getEdad()<1) {
			respuestaFinal=" LA EDAD QUE INGRESASTE ESTA FUERA DE LOS LIMITES PERMITIDOS";
		}
		
		
	else 
	{
		
		int respuesta=repositoryVendedores.insertVendedor(nuevoVendedor);
		
		//si la respuesta es =1
		
		if(respuesta==1)
		{
			respuestaFinal="SE INSERTO CORRECTAMENTE ";
		}
			
		else 
		{
			respuestaFinal="NO SE PUDO INSERTAR EL RESGISTRO ";
		}
		
		
	}
	

	
		return respuestaFinal;
		
		
		
	}
	
	public String updateVendedores(VendedoresDto Vendedor) {
		
		String respuestaFinal="";
		if(Vendedor.getEdad()>99 || Vendedor.getEdad()<1) {
			respuestaFinal=" LA EDAD QUE INGRESASTE ESTA FUERA DE LOS LIMITES PERMITIDOS";
			
		
		}
		else
		{
			int respuesta=repositoryVendedores.updateVendedor(Vendedor);
			if(respuesta==1) {
				respuestaFinal="SE ACTUALIZO CORRECTAMENTE ";
				}
				
			else {
				respuestaFinal="NO SE PUDO ACTULIZAR EL RESGISTRO ";
			}
			
		}
		
		
		return respuestaFinal;
	
	
	}
	
	public String deleteVendedores(VendedoresDto Vendedor) {
		int respuesta= repositoryVendedores.deleteVendedor(Vendedor);
		String respuestaFinal="";
		//si la respuesta es =1
		
		if(respuesta==1) {
			respuestaFinal="SE ELIMINO CORRECTAMENTE ";
			}
			
		else {
			respuestaFinal="NO PUEDES ELIMINAR EL RESGISTRO ";
		}
		
		return respuestaFinal;
	}

}
