package com.mx.proyecto.Services;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.proyecto.Dto.PersonaDTO;
import com.mx.proyecto.Dto.Response;
import com.mx.proyecto.Repositories.PersonaDAO;
import com.mx.proyecto.entities.Persona;

/**@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = persona.class)
public @interface idPersona {
    String message() default "El ID debe ser un número.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}**/

@Service
public class ServicePersonaImpl implements ServicePersona{
 
	
	@Autowired 
	private PersonaDAO personaDAO;
	


	@Override
	public String getPersona(com.mx.proyecto.Dto.PersonaDTO idPersona) {
		String respuesta=null;
		Persona objecto=personaDAO.read(idPersona.getIdPersona());
		
		System.out.print("propiedades de obj ->"+ objecto);
		System.out.print("propiedades de obj 1->"+ objecto.getIdPersona()+ objecto.getNombres() );
		
		
		if(objecto != null) {
			respuesta=("existe el registro en la base de datos");
		}
		else{
			respuesta=("el registro NO existe en la base de datos");
		}
		return respuesta;
		
	}



	@Override
	public String guardarPersona(PersonaDTO datos) {
		Persona obj =new Persona();
		obj.setIdPersona(datos.getIdPersona());
		obj.setNombres(datos.getNombres());
		obj.setEdad(datos.getEdad());
		obj.setSexo(datos.getSexo());
		
		long addPersona = personaDAO.create(obj);//esta linea es el insert de la tabla
		if(addPersona!=0) {
			return "DATO REGISTRADO";
		}else {
			return "ERROR AL REGISTRAR";

		}
		
		
	}



	@Override
	public String eliminarPersona(PersonaDTO idPersona) {
		personaDAO.delete(idPersona.getIdPersona());//ELIMINAR REGISTRO
		return "REGISTRO ELIMINADO";
	}


/**		reglas de negocios......
 * 1. verificar si el id  que se manda desde el posmant no sea null o cero(incorrecto)
 * 2. verificar/consultar si existe la persona con ese id
 * 3. evaluar si existe el estado consultado  por el ide
 * 4. validar que no se inserten letras en el id
 */
	@Override
	@Transactional
	public Response eliminarPersonaId(PersonaDTO idPersona) {
		Response response=new Response();
		String cadenaUno = "1234";
		String cadenaDos = "No soy un numero";
		
		try {
	//validacion 1
		if (idPersona.getIdPersona()!=null || idPersona.getIdPersona()!=0 || validaNumerico(idPersona.getIdPersona())) {//regla 1
			
			Persona existeReg=personaDAO.read(idPersona.getIdPersona()); //regla 2.1
			
			if(existeReg!=null) { //2.2
				personaDAO.delete(idPersona.getIdPersona());//ELIMINAR REGISTRO
				response.setMessage("Persona eliminada correctamnete");
				response.setCode(200);
	
				}else {
					response.setMessage("la informacion no existe");
					response.setCode(100);
				}
		//	if(idPersona.getIdPersona().matches("[A-Z]*")){
			//	existeReg = false;
				//}
		}
		else {
			
			response.setMessage("Los datos enviados son incorrectos");
			response.setCode(500);
		}
		
	}catch(Exception e) {
		response.setMessage("ocurrio un error al intentar eliminar el registro");// usasrlo dentro del catch
	}
		return response;
	}



private boolean validaNumerico(long idPersona) {

	return false;
}



/**private boolean validaNumerico(boolean idPersona) {// long idpersona -> log persona
	//String dato=idPersona.toString();
	//boolean isNumeric= StringUtils.isNumberic();
//	String regex = "\\d+"; // Expresión regular que solo permite números
	//  return idPersona.matches(regex);
	return null;**/











}

