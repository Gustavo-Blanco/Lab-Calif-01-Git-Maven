package com.tecsup.lab01.view;
import com.tecsup.lab01.controller.*;
import com.tecsup.lab01.model.*;

public class UserView {
	public static void main(String[] args) {
		
		User u = new Userr("Tomas","Espinoza Rojaz"+16);
		UserController b = new UserController(u);
		c=b.imprimir();
		System.out.println("Mi nombre: "+c);
	}
	
}