package com.mx.proyecto.Dto;


public class UsuariosAdminDTO {
		private long idUser;
        private String nombreCompleto;
		private String edad;
		private String direccion;
		private int estado;
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
