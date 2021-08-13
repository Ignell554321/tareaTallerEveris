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
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}
	
}
