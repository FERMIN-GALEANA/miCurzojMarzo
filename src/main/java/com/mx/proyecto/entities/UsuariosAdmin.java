package com.mx.proyecto.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//readi
// create/ sabe/ createorUpdate
// delete
@Entity//anotacion para indicar que esta clase sera una entidad
@Table(name="USUARIOS_ADMIN", schema="CURSO_MARZO") //ANOTACION TABLE DONDE INDICAMOS EL NOMBRE DE LA TABLA

public class UsuariosAdmin {
	
	@Id //paraindicarle el campo atributo va ser un id o llave primaria
	@Column(name= "ID_USER",unique=true, nullable=false, precision=11,scale=0)// para indicar que es una columna y se pueden agregar propiedades
	private long idUser;
	
	@Column(name="NOMBRE_COMPLETO", length =100)//indica el nombre de la columna
	private String nombreCompleto;
	
	@Column(name="EDAD", length =50)
	private String edad;
	
	@Column(name="DIRECCION", length =100)
	private String direccion;
	
	@Column(name="ESTADO",  precision=11,scale=0)
	private int estado;
	
	@Column(name="ROL" , precision=11,scale=0)
	private int rol;
	
	
	

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getRol() {
		return rol;
	}

	public void setRol(int rol) {
		this.rol = rol;
	}
	
	
	
}
