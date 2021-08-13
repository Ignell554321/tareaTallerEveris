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

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
public class Especialidad implements Serializable{

	@Transient
	private static final long serialVersionUID = -2769540160269917392L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",nullable = false)
	private short id;
	
	@Column(name = "nombre",nullable = false,length = 45)
	private String nombre;
	
	@JsonBackReference
	@ManyToMany(mappedBy = "especialidades")
	private List<Docente> docentes;


}
