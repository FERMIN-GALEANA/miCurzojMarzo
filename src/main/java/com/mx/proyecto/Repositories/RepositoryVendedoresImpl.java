package com.mx.proyecto.Repositories;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.mx.proyecto.Dto.VendedoresDto;
import com.mx.proyecto.Mapper.VendedoresMapper;

@Repository
public class RepositoryVendedoresImpl  implements RepositoryVendedores{

	

	@Autowired
	private DataSource dataSource;  //PARA LA CONEXIÓN A LA BASE DE DATOS
	
	JdbcTemplate jdbcTemplate = new JdbcTemplate(); // ES EL QUE NOS VA A PERMITIR HACER CONSULTAS A LA BASE DE DATOS MEDIANTE UNA CONEXIÓN A BASE DE DATOS
	
	
	@Override
	public List<VendedoresDto> getVendedor() {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.query("SELECT * FROM VENDEDORES", new VendedoresMapper<VendedoresDto>());
	
	}
	

	public int insertVendedor(VendedoresDto NuevoVendedor) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("INSERT INTO VENDEDORES(NOMBRE,EDAD) VALUES (?,?) ", new Object[] {NuevoVendedor.getNombre(),NuevoVendedor.getEdad()});
	}

	
	@Override
	public int contarVendedoresNuevos() {
		System.out.println("LLEGANDO AL METODO contarVendedoresNuevos DE LA CLASE IMPLEMENTACIÓN DEL REPOSITORIO");
		return 1245;
	}
	

	public int deleteVendedor(VendedoresDto Vendedor) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("DELETE FROM VENDEDORES WHERE ID_VENDEDOR=?", new Object[] {Vendedor.getIdVendedores()});
		}
	
	

	public int updateVendedor(VendedoresDto Vendedor) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("UPDATE VENDEDORES SET NOMBRE=?,NOMBRE=?,SEXO=?, EDAD=? WHERE ID_VENDEDOR=?", new Object[] {Vendedor.getNombre(),Vendedor.getEdad(), Vendedor.getSexo(),Vendedor.getIdVendedores()});
				
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


	
	//
	
	
	
	
}
