package com.mx.proyecto.Repositories;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.mx.proyecto.Dto.CompradoresDto;
import com.mx.proyecto.Mapper.CompradoresMapper;



@Repository
public class RepositoryCompradoresImpl implements RepositoryCompradores {
	
	@Autowired
	private DataSource dataSource;  //PARA LA CONEXIÓN A LA BASE DE DATOS
	
	JdbcTemplate jdbcTemplate = new JdbcTemplate(); // ES EL QUE NOS VA A PERMITIR HACER CONSULTAS A LA BASE DE DATOS MEDIANTE UNA CONEXIÓN A BASE DE DATOS
	

	
	@Override
	public List<CompradoresDto> getCompra() {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.query("SELECT * FROM COMPRADORES", new CompradoresMapper<CompradoresDto>());
	
	}
	


	public int insertCompradores(CompradoresDto CompraNueva) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("INSERT INTO COMPRADORES(NOMBRE,EDAD) VALUES (?,?)", new Object[] { CompraNueva.getNombre(),CompraNueva.getEdad()});
	}

	
	@Override
	public int contarCompraNueva() {
		System.out.println("LLEGANDO AL METODO contarVendedoresNuevos DE LA CLASE IMPLEMENTACIÓN DEL REPOSITORIO");
		return 1245;
	}
	

	public int deleteCompradores(CompradoresDto Compra) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("DELETE FROM COMPRADORES WHERE ID_COMPRADOR=?", new Object[] {Compra.getIdCompradores()});
		}
	
	

	public int updateCompradores(CompradoresDto compra) { 
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("UPDATE COMPRADORES SET EDAD=? WHERE NOMBRE=?", new Object[] {compra.getEdad(),compra.getNombre()});
				
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	





	
	

}
