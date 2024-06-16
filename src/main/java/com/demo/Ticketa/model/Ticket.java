package com.demo.Ticketa.model;


import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String titulo;
	private String descripcion;
	private int id_solicitante;
	private int id_encargado;
	private int id_supervisor;
	private LocalDate fecha_creacion;
	private LocalDate fecha_limite;
	private LocalDate fecha_inicio;
	private Integer creador;
	
	@ManyToOne
	private Usuarios usuario;
	
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Ticket(int id, String titulo, String descripcion, int id_solicitante, int id_encargado, int id_supervisor, LocalDate fecha_creacion,
			LocalDate fecha_limite, LocalDate fecha_inicio, Integer creador) {
		
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.id_solicitante = id_solicitante;
		this.id_encargado = id_encargado;
		this.id_supervisor = id_supervisor;
		this.fecha_creacion=fecha_creacion;
		this.fecha_limite=fecha_limite;
		this.fecha_inicio=fecha_inicio;
		this.creador=creador;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getId_solicitante() {
		return id_solicitante;
	}


	public void setId_solicitante(int id_solicitante) {
		this.id_solicitante = id_solicitante;
	}


	public int getId_encargado() {
		return id_encargado;
	}


	public void setId_encargado(int id_encargado) {
		this.id_encargado = id_encargado;
	}


	public int getId_supervisor() {
		return id_supervisor;
	}


	public void setId_supervisor(int id_supervisor) {
		this.id_supervisor = id_supervisor;
	}


	public LocalDate getFecha_creacion() {
		return fecha_creacion;
	}


	public void setFecha_creacion(LocalDate fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}


	public LocalDate getFecha_limite() {
		return fecha_limite;
	}


	public void setFecha_limite(LocalDate fecha_limite) {
		this.fecha_limite = fecha_limite;
	}


	public LocalDate getFecha_inicio() {
		return fecha_inicio;
	}


	public void setFecha_inicio(LocalDate fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}


	public Integer getCreador() {
		return creador;
	}


	public void setCreador(Integer creador) {
		this.creador = creador;
	}


	public Usuarios getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}
	
	
	
}
