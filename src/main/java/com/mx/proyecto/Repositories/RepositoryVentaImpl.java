package com.mx.proyecto.Repositories;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.mx.proyecto.Dto.VentaDto;
import com.mx.proyecto.Mapper.VentaMapper;
@Repository
public class RepositoryVentaImpl implements RepositoryVenta {



	@Autowired
	private DataSource dataSource;  //PARA LA CONEXIÓN A LA BASE DE DATOS
	
	JdbcTemplate jdbcTemplate = new JdbcTemplate(); // ES EL QUE NOS VA A PERMITIR HACER CONSULTAS A LA BASE DE DATOS MEDIANTE UNA CONEXIÓN A BASE DE DATOS
	
	
	@Override
	public List<VentaDto> getVenta() {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.query("SELECT * FROM VENTA", new VentaMapper<VentaDto>());
	
	}
	

	public int insertVenta(VentaDto VentaNueva) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("INSERT INTO VENTA (ID_VENTA, USUARIO, DESCUENTO, TOTAL,SUBTOTAL, PAGO, CAMBIO,ESTADO,FECHA,COMPRADOR) VALUES (?,?,?,?,?,?,?,?,?,?)", new Object[] {VentaNueva.getIdVenta(),VentaNueva.getUsuario(),VentaNueva.getDescuento(),VentaNueva.getDescuento(),VentaNueva.getTotal(),VentaNueva.getSubtotal(),VentaNueva.getPago(),VentaNueva.getEstado(),VentaNueva.getFecha(),VentaNueva.getComprador()});             
	}

	
	@Override
	public int contarVentaNueva() {
		System.out.println("LLEGANDO AL METODO contarVendedoresNuevos DE LA CLASE IMPLEMENTACIÓN DEL REPOSITORIO");
		return 1245;
	}
	

	public int deleteVenta(VentaDto Venta) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("DELETE FROM VENTA WHERE ID_VENTA=?", new Object[] {Venta.getIdVenta()});
		}
	
	

	public int updateVenta(VentaDto Venta) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("UPDATE VENTA SET USUARIO=?,DESCUENTO=? WHERE ID_VENTA=?" , new Object[] {Venta.getUsuario(),Venta.getDescuento(),Venta.getIdVenta()}); 			
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
