package com.upci.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {
	
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripion")
	private String descripion;
	
	@Column(name="precio")
	private int precio;
	
	@Column(name="horas")
	private int horas;
	
	
	public Curso() {
		super();
	}
	public Curso(int id, String nombre, String descripion, int precio, int horas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripion = descripion;
		this.precio = precio;
		this.horas = horas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripion() {
		return descripion;
	}
	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	

}
