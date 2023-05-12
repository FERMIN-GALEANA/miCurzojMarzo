package com.mx.proyecto.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.mx.proyecto.Dto.VendedoresDto;

public class VendedoresMapper<T> implements RowMapper<VendedoresDto>{

	public VendedoresDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		VendedoresDto objeto = new VendedoresDto();
		
		objeto.setIdVendedores(rs.getLong("ID_VENDEDOR"));
		objeto.setNombre(rs.getString("NOMBRE"));
		objeto.setEdad(rs.getInt("EDAD"));
		objeto.setSexo(rs.getString("SEXO"));
		objeto.setSalario(rs.getInt("SALARIO"));
		objeto.setArea(rs.getString("AREA"));
		objeto.setFechaIngreso(rs.getDate("FECHA_INGRESO"));
		return objeto;
	}

	
	
	
	
}

