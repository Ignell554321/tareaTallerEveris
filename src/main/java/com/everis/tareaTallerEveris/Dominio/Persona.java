package com.everis.tareaTallerEveris.Dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
public class Persona implements Serializable{ 
	
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

	
	
}
