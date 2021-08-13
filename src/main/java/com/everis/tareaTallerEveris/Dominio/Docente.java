package com.everis.tareaTallerEveris.Dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;


@Entity
public class Docente implements Serializable{
	
	@Transient
	private static final long serialVersionUID = -8482878829026677549L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "dni")
	private Persona persona;
	
	
	@JoinTable(
			name = "EspecialidadDocente",
			joinColumns = @JoinColumn(name="docente_id",nullable = false),
			inverseJoinColumns = @JoinColumn(name="especialidad_id",nullable = false)
			)
	@ManyToMany()
	private List<Especialidad> especialidades;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public List<Especialidad> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}
	
	
	

}
