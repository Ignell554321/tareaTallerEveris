package com.everis.tareaTallerEveris.Dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
public class Curso implements Serializable{
	
	@Transient
	private static final long serialVersionUID = 6842326523089890444L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "docente_id")
	private Docente docente;
	
	@Column(name = "servicio",nullable = false,length = 50)
	private String servicio;
	
	@Column(name = "tipo",nullable = false,length = 35)
	private String tipo;
	
	@Column(name = "nivel",nullable = false,length = 35)
	private String nivel;
	
	@Column(name = "ciclo",nullable = false,length = 2)
	private String ciclo;
	
	@Column(name = "fechaInicio",nullable = false,length = 10)
	private String fechaInicio;
	
	@Column(name = "fechaFin",nullable = false,length = 10)
	private String fechaFin;
	
	@Column(name = "aula",nullable = false,length = 2)
	private String aula;
	
}
