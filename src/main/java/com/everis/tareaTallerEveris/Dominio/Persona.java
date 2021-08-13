package com.everis.tareaTallerEveris.Dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Persona implements Serializable{ //Para convertir un objeto a bytes, permite su envio a travez de la red
	
	@Transient
	private static final long serialVersionUID = 5161022846605181314L;

	@Id
	@Column(name="dni",nullable = false,length = 8)
	private String dni;
	
	@Column( name = "nombres", nullable = false, length = 80)
	private String nombres;
	
	@Column( name = "apellidos", nullable = false, length = 80)
	private String apellidos;
	
	@Column( name = "telefono", nullable = false, length = 9)
	private String telefono;
	
	@Column( name = "email", nullable = false, length = 120)
	private String email;
	
	@Column( name = "direccion", nullable = false, length = 140)
	private String direccion;
	
	@Column( name = "fechaNacimiento", nullable = false, length =50)
	private String fechaNacimiento;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	
	
}
