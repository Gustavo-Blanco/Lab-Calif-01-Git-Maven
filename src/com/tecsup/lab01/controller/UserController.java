package com.tecsup.lab01.controller;

import com.tecsup.lab01.model.*;

public class UserController {
	private User user;

	public UserController(User user) {
		super();
		this.user = user;
	}
	
	public String imprimir(){
		return user.getNombre() +" "+ user.getApellidoPaterno() + " Y mi edad es: " + user.getEdad();
	}
	
}
