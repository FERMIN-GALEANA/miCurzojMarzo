package com.mx.proyecto.Dto;

import java.util.Date;

public class VendedoresDto {
	
	

	private long idVendedores;
	private String nombre;
	private  int edad;
	private String sexo;
	private  int salario;
	private String area;
	private Date fechaIngreso;
	
	
	public long getIdVendedores() {
		return idVendedores;
	}
	public void setIdVendedores(long idVendedores) {
		this.idVendedores = idVendedores;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	

}
