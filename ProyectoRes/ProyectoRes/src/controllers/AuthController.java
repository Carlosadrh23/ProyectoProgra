package controllers;

import vistas.AuthView;

public class AuthController {
	
	private AuthView vista;
	
	public AuthController() { 
		
		vista = new AuthView();
	}
	
	public void login() {
		
	vista.Login();
	
	}
	public void register() {
		
		vista.Register();
		
		}
	


}