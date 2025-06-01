package models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ClientsModel {

	
	private List<Client> clientes = new ArrayList<>();
	
	public ClientsModel() {
		// TODO Auto-generated constructor stub
	}
	
	public List getAll()
	{
		
		String query = "select * from customers";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) { 
				
				Integer id = rs.getInt(1);
				String name = rs.getString(2); 
				String phone = rs.getString(3); 
				String email = rs.getString(4); 
				String rfc = rs.getString(5); 

				
				clientes.add(new Client(id,name,phone,email,null,null,rfc));
			}
			
			rs.close();
			
			return clientes;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
		return clientes;
	}
	
	
	public User get(int id_Target)
	{
		
		String query = "select * from customers where user_id = "+id_Target;
		Connection conn = null;
		Statement stmt = null;
		User myuser = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) { 
				
				Integer id = rs.getInt(1);
				String name = rs.getString(2); 
				String phone = rs.getString(3); 
				String email = rs.getString(4);  

			
				
				 
				System.out.println(""); 
				 myuser = new User(id,name,phone,email,null,null);
			}
			
			rs.close();
			
			return myuser;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
		return myuser;
	}
	
	public boolean remove(int id) {
		
		String query = "DELETE FROM customers WHERE `users`.`user.id` ="+id;
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde");
			stmt = conn.createStatement();
			
			stmt.executeUpdate(query);
			
			return true; 
				
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
		
		return false;
		
	}

	public void addUser(String nombre,String email,String password) {
	 String query = "INSERT INTO customers (username, password, email) VALUES (?, ?, ?)";
	    try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde");
	         PreparedStatement pstmt = conn.prepareStatement(query)) {
	        
	        pstmt.setString(1, nombre);
	        pstmt.setString(2, password);
	        pstmt.setString(3, email);
	      

	        pstmt.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
}
	public void update(int id, String name, String email, String password) {
	    String query = "UPDATE customers SET username=?, email=?, password=? WHERE id=?";
	    
	    try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde");
	         PreparedStatement pstmt = conn.prepareStatement(query)) {
	        
	        pstmt.setString(1, name);
	        pstmt.setString(2, email);
	        pstmt.setString(3, password);
	        pstmt.setInt(4, id);
	        
	        int rowsAffected = pstmt.executeUpdate();
	        if (rowsAffected > 0) {
	            System.out.println("Usuario actualizado correctamente.");
	        } else {
	            System.out.println("No se encontró el usuario con ID: " + id);
	        }
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}