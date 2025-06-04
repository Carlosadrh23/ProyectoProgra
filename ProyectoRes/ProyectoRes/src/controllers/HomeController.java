package controllers;


import vistas.HomeView;

import java.util.ArrayList;
import java.util.List;

import models.Client;
import models.Ingredient;
import models.IngredientsModel;
import models.ClientsModel;
import models.Dish;
import models.DishesModel;

public class HomeController {
	
	private HomeView vista;
	private List<Ingredient> ingredientes = new ArrayList<>();
	private List<Client> clients = new ArrayList<>();
	private List<Dish> dishes = new ArrayList<>();

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
		DishesModel Dm = new DishesModel();
		
		dishes = Dm.getAll();

		vista.AbrirCuenta3(dishes);
	}
	public void ConsultaDeCuenta() 
	{
		vista.ConsultaDeCuenta();
	}
	public void IngresarnuevaCuenta() 
	{
		vista.IngresarNuevaOrden(dishes);
	}
	public void HistorialDeFacturacion() 
	{
		ClientsModel Cm = new ClientsModel();
		
		clients = Cm.getAll();

		vista.HistorialDeFacturacion(clients);
	}
	public void ConsultaDeClientes() 
	{
		ClientsModel Cm = new ClientsModel();
		
		clients = Cm.getAll();

		vista.ConsultaDeClientes(clients);
	}
	public void menu() 
	{
		DishesModel Dm = new DishesModel();
		
		dishes = Dm.getAll();

		vista.menu(dishes);
	}
	public void Inventario() 
	{
		IngredientsModel Im = new IngredientsModel();
		
		ingredientes = Im.getAll();

		vista.Inventario(ingredientes);
	}
	public void EditarCliente() 
	{
		ClientsModel Cm = new ClientsModel();
		
		clients = Cm.getAll();

		vista.EditarCliente(clients);
	}
	public void AltaDeClientes() 
	{
		ClientsModel Cm = new ClientsModel();
		
		clients = Cm.getAll();

		vista.AltaDeClientes(clients);
	}
	public void Añadirplatillo() 
	{
		vista.AñadirPlatillo();
	}
	public void AlmacenEditar() 
	{
		IngredientsModel Im = new IngredientsModel();
		ingredientes = Im.getAll();
		vista.AlmacenEditar(ingredientes);
		}
	public void AñadirIngrediente() 
	{
		IngredientsModel Im = new IngredientsModel();
		ingredientes = Im.getAll();
		vista.AñadirIngrediente(ingredientes);
	}

	public void BuscarPorProducto()
	{
		vista.BuscarPorProducto(null);
	}
	public void EditarMenu() {
		vista.EditarMenu();
	}

	public void SeleccionDeCantidadHamburguesa() {
		vista.SeleccionDeCantidadHamburguesa(null);
	}
	
	public void SeleccionDeCantidadBoneless() {
		vista.SeleccionDeCantidadBoneless(null);
	}

	public void SeleccionDeBebida() {
		// TODO Auto-generated method stub
		vista.SeleccionDeBebida(null);
	}


	public void Ticket() {
		// TODO Auto-generated method stub
		vista.Ticket(null);
	}
	public void AlertaEliminarCuenta() {
		// TODO Auto-generated method stub
		vista.AlertaEliminarCuenta(null);
	}

	public void AlertaMenuAdmin() {
		// TODO Auto-generated method stub
		vista.AlertaMenuAdmin(null);
	}

	public void AlertaCuentaEliminada() {
		// TODO Auto-generated method stub
		vista.AlertaCuentaEliminada(null);
	}
	

}