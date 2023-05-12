package com.mx.proyecto.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.mx.proyecto.Dto.CompradoresDto;



public class CompradoresMapper  <T>implements RowMapper<CompradoresDto> {
	

	public CompradoresDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		CompradoresDto objeto = new CompradoresDto();
		
		objeto.setIdCompradores(rs.getLong("ID_COMPRADOR"));
		objeto.setNombre(rs.getString("NOMBRE"));
		objeto.setEdad(rs.getInt("EDAD"));
		objeto.setSexo(rs.getString("SEXO"));
		objeto.setDomicilio(rs.getString("DOMICILIO"));
				
				return objeto;
	}

}
