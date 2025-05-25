package models;

import java.sql.Date;

public class User {
	
	public int id;
	public String username;
	public String email;
	public String password;
	public Date create_at;
	public Date update_at;
	
	public User(int id, String username, String email, String password, Date create, Date update) {
		
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.create_at = create;
		this.update_at = update;
		
	}

}