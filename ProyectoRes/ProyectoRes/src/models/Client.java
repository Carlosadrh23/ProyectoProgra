package models;

import java.sql.Date;

public class Client {
	
	public int id;
	public String name;
	public String phone;
	public String email;
	public Date create_at;
	public Date update_at;
	public String rfc;
	public Client(int id, String name, String phone, String email, Date create, Date update, String rfc) {
		
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.create_at = create;
		this.update_at = update;
		this.rfc = rfc;
	}

}