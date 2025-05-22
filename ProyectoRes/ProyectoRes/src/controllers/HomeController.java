package controllers;

import vistas.Clientes;
import vistas.HomeView;

public class HomeController {
	
	private HomeView vista;
	public HomeController() {
		
		vista = new HomeView();
	}
	
	public void comedor()
	{
		vista.comedor();
	}
	public void abrirCuenta()
	{
		vista.clientes();
	}

}