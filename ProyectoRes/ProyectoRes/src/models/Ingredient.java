package models;

import java.sql.Date;

public class Ingredient {
	
	public int id;
	public String name;
	public String unit;
	public Float cost;
	public int quantity;

	
	
	public Ingredient(int id, String name,int quantity, String unit,Float cost) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unit = unit;
		this.cost = cost;
		
	}

}