package models;

import java.sql.Date;

public class Dish {
	
	public int id;
	public String code;
	public String name;
	public String description;
	public Float cost;
	public int category_id;
	public Float price;
	public String photo_url;
	public Date create_at;
	public Date update_at;
	
	public Dish(int id,String code, String name,String description,int category_id,Float price, String photo_url,Date create_at,Date update_at) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.description = description;
		this.category_id = category_id;
		this.price = price;
		this.photo_url = photo_url;
		this.create_at = create_at;
		this.update_at = update_at;
	}

}