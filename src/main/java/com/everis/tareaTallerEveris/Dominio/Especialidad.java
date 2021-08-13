package com.everis.tareaTallerEveris.Dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

@Entity
public class Especialidad implements Serializable{

	@Transient
	private static final long serialVersionUID = -2769540160269917392L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",nullable = false,columnDefinition = "smallint")
	private short id;
	
	@Column(name = "nombre",nullable = false,length = 45)
	private String nombre;
	
	@ManyToMany(mappedBy = "especialidades")
	private List<Docente> docentes;

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
