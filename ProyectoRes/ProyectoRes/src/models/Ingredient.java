package models;

import java.sql.Date;

public class Ingredient {
	
	public int id;
	public String code;
	public String name;
	public String unit;
	public Float cost;
	public int quantity;

	
	
	public Ingredient(int id,String code, String name,int quantity, String unit,Float cost) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.unit = unit;
		this.cost = cost;
		
	}
	public Ingredient(String code, String name, String unit,Float cost) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.unit = unit;
		this.cost = cost;
		
	}
}