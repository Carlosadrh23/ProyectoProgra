package models;

import java.sql.Date;

public class Client {
	
	public int id;
	public String name;
	public String rfc;
	public String phone;
	public String email;
	public Float importe;
	public Date create_at;
	public Date update_at;
	public Client(int id, String name, String rfc, String phone, String email,Float importe, Date create, Date update) {
		
		this.id = id;
		this.name = name;
		this.rfc = rfc;
		this.phone = phone;
		this.email = email;
		this.importe = importe;
		this.create_at = create;
		this.update_at = update;
		
	}

}