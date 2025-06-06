package controllers;


import vistas.HomeView;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

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
	public void EditarCliente(int id) 
	{
		ClientsModel Cm = new ClientsModel();
		
		clients = Cm.getAll();

		vista.EditarCliente(id,clients);
	}
	public void AltaDeClientes() 
	{
		ClientsModel Cm = new ClientsModel();
		
		clients = Cm.getAll();

		vista.AltaDeClientes(clients);
	}
	public void Añadirplatillo() 
	{
		IngredientsModel Im = new IngredientsModel();
		
		ingredientes = Im.getAll();


		vista.AñadirPlatillo(ingredientes);
	}
	public void Añadirplatillo2() 
		{	
		IngredientsModel Im = new IngredientsModel();
		
		ingredientes = Im.getAll();

		vista.AñadirPlatillo2();
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
		IngredientsModel Im = new IngredientsModel();
		ingredientes = Im.getAll();
		vista.EditarMenu(ingredientes);
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
	
	public void SeleccionCocaCola() {
		// TODO Auto-generated method stub
		vista.SeleccionCocaCola(null);
	}
	
	public void SeleccionSprite() {
		// TODO Auto-generated method stub
		vista.SeleccionSprite(null);
	}
	
	public void SeleccionManzana() {
		// TODO Auto-generated method stub
		vista.SeleccionManzana(null);
	}
	
	public void SeleccionDePapas() {
		vista.SeleccionDePapas(null);
	}
	public void SeleccionPapasChicas() {
		vista.SeleccionPapasChicas(null);
	}
	
	public void SeleccionPapasMedianas() {
		vista.SeleccionPapasMedianas(null);
	}
	
	public void SeleccionPapasGrandes() {
		vista.SeleccionPapasGrandes(null);
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
	
	
	public void AñadirFactura() {
		vista.AñadirFactura();
	}
	
	public void EditarFactura() {
		vista.EditarFactura();
	}

	public void Añadirplatillo8() {
		// TODO Auto-generated method stub
		vista.AñadirPlatillo8();
	}

	public void AlertaCerrarSesion(JFrame ownerFrame) {
		vista.AlertaCerrarSesion(ownerFrame);
	}
	

}