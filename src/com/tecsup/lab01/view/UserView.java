package com.tecsup.lab01.view;
import com.tecsup.lab01.controller.*;
import com.tecsup.lab01.model.*;

public class UserView {
	public static void main(String[] args) {
		
		User u = new User("Tomas","Espinoza Rojaz",16);
		UserController b = new UserController(u);
		System.out.println("Mi nombre: "+b.imprimir());
	}
	
}