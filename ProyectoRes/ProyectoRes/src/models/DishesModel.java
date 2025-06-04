package models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;


public class DishesModel {

	
	private List<Dish> dishes = new ArrayList<>();
	
	public DishesModel() {
		// TODO Auto-generated constructor stub
	}
	
	public List getAll()
	{
		
		String query = "select * from dishes;";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        			        conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) { 
				
				Integer id = rs.getInt(1);
				String code = rs.getString(2); 
				String name = rs.getString(3); 
				String description = rs.getString(4); 
				Integer category_id = rs.getInt(5);
				Float price = rs.getFloat(6); 
				String photo_url = rs.getString(7);
				
				dishes.add(new Dish(id,code,name,description,category_id,price,photo_url,null,null));
			}
			
			rs.close();
			
			return dishes;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
		return dishes;
	}
	
	// SELECT unit AS unidad,COUNT(*) AS cantidad_de_ingredientes FROM ingredients GROUP BY unit;
	public List getUnits()
	{
		
		String query = "SELECT unit AS unidad,COUNT(*) AS cantidad_de_ingredientes FROM ingredients GROUP BY unit";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        			        conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) { 
				

				Integer id = rs.getInt(1);
				String code = rs.getString(2); 
				String name = rs.getString(3); 
				String description = rs.getString(4); 
				Integer category_id = rs.getInt(5);
				Float price = rs.getFloat(6); 
				String photo_url = rs.getString(7);
				
				dishes.add(new Dish(id,code,name,description,category_id,price,photo_url,null,null));
			}
			
			rs.close();
			
			return dishes;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
		return dishes;
	}
	
	
	public boolean remove(int id) {
		
		String query = "DELETE FROM ingredients WHERE `users`.`user.id` ="+id;
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

	public void addIngredient(String nombre,String email,String password) {
	 String query = "INSERT INTO ingredients (username, password, email) VALUES (?, ?, ?)";
	    try (Connection 			        conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde");
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
	    String query = "UPDATE ingredients SET username=?, email=?, password=? WHERE id=?";
	    
	    try (Connection 			        conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde");
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