package com.tecsup.lab01.model;

public class User {
	private String nombre;
	private String apellidoPaterno;
	private int edad;
	
	public User(String nombre, String apellidoPaterno, int edad) {
		super();
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
