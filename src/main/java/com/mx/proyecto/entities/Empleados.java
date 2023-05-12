package com.mx.proyecto.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

@Entity//anotacion para indicar que esta clase sera una entidad
@Table(name="EMPLEADOS", schema="CURSO_MARZO") //ANOTACION TABLE DONDE INDICAMOS EL NOMBRE DE LA TABLA
public class Empleados {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Digits(integer=11, fraction=0)
		@Id //paraindicarle el campo atributo va ser un id o llave primaria
		@Column(name= "ID_EMPLEADO", unique = true, nullable = false, precision = 11, scale = 0)// para indicar que es una columna y se pueden agregar propiedades
		private Long idEmpleado;
		@Column(name="NOMBRE_COMPLETO")//indica el nombre de la columna
		private String nombreCompleto;
		@Column(name="RFC")//indica el nombre de la columna
		private String rfc;
		@Column(name="CURP")//indica el nombre de la columna
		private String curp;
		@Column(name="EDAD")//indica el nombre de la columna
		private int edad;
		@Column(name="SEXO")//indica el nombre de la columna
		private String sexo;
		@Column(name="DIRECCION")//indica el nombre de la columna
		private String direccion;
		@Column(name="NSS")//indica el nombre de la columna
		private String nss;
		@Column(name="TELEFONO")//indica el nombre de la columna
		private int telefono;
		@Column(name="ACTIVO")//indica el nombre de la columna
		private int activo;
		
		
		public Long getIdEmpleado() {
			return idEmpleado;
		}
		public void setIdEmpleado(Long idEmpleado) {
			this.idEmpleado = idEmpleado;
		}
		public String getNombreCompleto() {
			return nombreCompleto;
		}
		public void setNombreCompleto(String nombreCompleto) {
			this.nombreCompleto = nombreCompleto;
		}
		public String getRfc() {
			return rfc;
		}
		public void setRfc(String rfc) {
			this.rfc = rfc;
		}
		public String getCurp() {
			return curp;
		}
		public void setCurp(String curp) {
			this.curp = curp;
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
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getNss() {
			return nss;
		}
		public void setNss(String nss) {
			this.nss = nss;
		}
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		public int getActivo() {
			return activo;
		}
		public void setActivo(int activo) {
			this.activo = activo;
		}
		
		
}
