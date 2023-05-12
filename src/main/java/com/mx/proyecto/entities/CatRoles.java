package com.mx.proyecto.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//readi
//create/ sabe/ createorUpdate
//delete
@Entity//anotacion para indicar que esta clase sera una entidad
@Table(name="CAT_ROLES", schema="CURSO_MARZO") //ANOTACION TABLE DONDE INDICAMOS EL NOMBRE DE LA TABLA

public class CatRoles {
	
	@Id //paraindicarle el campo atributo va ser un id o llave primaria
	@Column(name= "ID_ROL",unique=true, nullable=false, precision=11,scale=0)// para indicar que es una columna y se pueden agregar propiedades
	private long idRol;
	
	@Column(name="NOMBRE", length =100)//indica el nombre de la columna
	private String nombre;
	
	@Column(name="DESCRIPCION", length =100)
	private String descripcion;

	public long getIdRol() {
		return idRol;
	}

	public void setIdRol(long idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
