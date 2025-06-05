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
	public String birth_date;

	// Atributos de dirección
	public int address_id;
	public String street;
	public String number_street;
	public String neighborhood;
	public String city;
	public String state;
	public String postal_code;
	public String country;

	public Client(int id, String name, String rfc, String phone, String email, Float importe, String birth_date,
			Date create, Date update,int address_id, String street, String number_street, String neighborhood,
			String city, String state, String postal_code, String country) {

		this.id = id;
		this.name = name;
		this.rfc = rfc;
		this.phone = phone;
		this.email = email;
		this.importe = importe;
		this.birth_date = birth_date;
		this.create_at = create;
		this.update_at = update;
		this.address_id = address_id;
		this.street = street;
		this.number_street = number_street;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
		this.postal_code = postal_code;
		this.country = country;

	}

	

}