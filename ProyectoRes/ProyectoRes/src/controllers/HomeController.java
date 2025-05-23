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
	
	public void abrirCuenta2()
	{
		vista.AbrirCuenta2();
	}
	public void abrirCuenta3()
	{
		vista.AbrirCuenta3();
	}
	public void ConsultaDeCuenta() 
	{
		vista.ConsultaDeCuenta();
	}
	public void IngresarnuevaCuenta() 
	{
		vista.IngresarNuevaOrden();
	}
	public void HistorialDeFacturacion() 
	{
		vista.HistorialDeFacturacion();
	}
	public void ConsultaDeClientes() 
	{
		vista.ConsultaDeClientes();
	}
	public void menu() 
	{
		vista.menu();
	}
	public void Inventario() 
	{
		vista.Inventario();
	}
	public void EditarCliente() 
	{
		vista.EditarCliente();
	}
	public void AltaDeClientes() 
	{
		vista.AltaDeClientes();
	}
	public void Añadirplatillo() 
	{
		vista.AñadirPlatillo();
	}
	

}