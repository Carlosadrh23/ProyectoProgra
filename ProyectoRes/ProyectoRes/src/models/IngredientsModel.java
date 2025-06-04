package models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;


public class IngredientsModel {

	
	private List<Ingredient> ingredientes = new ArrayList<>();
	
	public IngredientsModel() {
		// TODO Auto-generated constructor stub
	}
	
	public List getAll()
	{
		
		String query = "SELECT i.ingredient_id,i.code, i.name, inv.current_quantity, i.unit, i.price FROM ingredients i JOIN inventories inv ON i.ingredient_id = inv.ingredient_id";
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
				Integer quantity = rs.getInt(4); 
				String units = rs.getString(5); 
				Float cost = rs.getFloat(6);
		
				ingredientes.add(new Ingredient(id,code,name,quantity,units,cost));
			}
			
			rs.close();
			
			return ingredientes;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
		return ingredientes;
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
				Integer quantity = rs.getInt(4); 
				String units = rs.getString(5); 
				Float cost = rs.getFloat(6);
		
				ingredientes.add(new Ingredient(id,code,name,quantity,units,cost));
			}
			
			rs.close();
			
			return ingredientes;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
		return ingredientes;
	}
	public void addIngredient(String name, String unit, Float price) {
		 String query =  "INSERT INTO ingredients (name, unit, price) VALUES (?, ?, ?)";
		    try (Connection         conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde");
		         PreparedStatement pstmt = conn.prepareStatement(query)) {
		        
		    	pstmt.setString(1, name);
		    	pstmt.setString(2, unit);
		    	pstmt.setFloat(3, price);
		      

		        pstmt.executeUpdate();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	}
	
	public User get(int id_Target)
	{
		
		String query = "select * from ingredients where user_id = "+id_Target;
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
				String email = rs.getString(3); 
				String password = rs.getString(4); 

				System.out.println("empId:" + id);
				System.out.println("firstName:" + name);
				System.out.println("email:" + email);
				System.out.println("role:" + password);
			
				
				 
				System.out.println(""); 
				 myuser = new User(id,name,email,password,null,null);
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

	 public String generateNextIngredientCode() throws SQLException {
	        String sql = "SELECT COALESCE(MAX(ingredient_id), 0) + 1 as next_id FROM ingredients";
	        Connection  conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde");

	        try (PreparedStatement stmt = conn.prepareStatement(sql);
	             ResultSet rs = stmt.executeQuery()) {
	            
	            if (rs.next()) {
	                int nextId = rs.getInt("next_id");
	                return String.format("ING%03d", nextId);
	            }
	        }
	        return "ING001"; // Por defecto
	    }
	    
	    public int insertIngredient(String name, String unit, Float price) 
	            throws SQLException {
	    	Connection  conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde");

	        String code = generateNextIngredientCode();
	        
	        String sql = "INSERT INTO ingredients (code, name, unit, price) VALUES (?, ?, ?, ?)";
	        
	        try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
	            stmt.setString(1, code);
	            stmt.setString(2, name);
	            stmt.setString(3, unit);
	            stmt.setFloat(4, price);
	            
	            int rowsAffected = stmt.executeUpdate();
	            
	            if (rowsAffected > 0) {
	                try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
	                    if (generatedKeys.next()) {
	                        return generatedKeys.getInt(1); // Retorna el ID generado
	                    }
	                }
	            }
	        }
	        return -1;
	    }

	
	public void update(int id, String name, String email, String password) {
	    String query = "UPDATE ingredients SET username=?, email=?, password=? WHERE id=?";
	    
	    try (Connection  conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde");
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