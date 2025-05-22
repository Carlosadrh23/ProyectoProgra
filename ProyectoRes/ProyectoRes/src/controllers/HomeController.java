package controllers;


import vistas.HomeView;

public class HomeController {
	
	private HomeView vista;
	public HomeController() {
		
		vista = new HomeView();
	}
	
	public void comedor()
	{
		vista.Comedor();
	}
	public void abrirCuenta()
	{
		vista.AbrirCuenta();
	}

}