package com.mx.proyecto.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//readi
//create/ sabe/ createorUpdate
//delete
@Entity//anotacion para indicar que esta clase sera una entidad
@Table(name="CAT_ESTADOS", schema="CURSO_MARZO") //ANOTACION TABLE DONDE INDICAMOS EL NOMBRE DE LA TABLA
public class CatEstados {
	@Id //paraindicarle el campo atributo va ser un id o llave primaria
	@Column(name= "ID_ESTADO",unique=true, nullable=false, precision=11,scale=0)// para indicar que es una columna y se pueden agregar propiedades
	private long idEstado;
	@Column(name="NOMBRE", length =100)//indica el nombre de la columna
	private String nombre;
	@Column(name="ABREVIATURA", length =50)//indica el nombre de la columna
	private String abreviatura;

	public long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(long idEstado) {
		this.idEstado = idEstado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abrebiatura) {
		this.abreviatura = abrebiatura;
	}

	


}
