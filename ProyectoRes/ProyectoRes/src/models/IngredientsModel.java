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


public class IngredientsModel {

	
	private List<Ingredient> ingredientes = new ArrayList<>();
	
	public IngredientsModel() {
		// TODO Auto-generated constructor stub
	}
	
	public List getAll()
	{
		
		String query = "SELECT i.ingredient_id, i.name, inv.current_quantity, i.unit, i.price FROM ingredients i JOIN inventories inv ON i.ingredient_id = inv.ingredient_id";
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
				Integer quantity = rs.getInt(3); 
				String units = rs.getString(4); 
				Float cost = rs.getFloat(5);

				System.out.println("empId:" + id);
				System.out.println("name:" + name);
				
			
				
				 
				System.out.println(""); 
				
				ingredientes.add(new Ingredient(id,name,quantity,units,cost));
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
				String name = rs.getString(2); 
				Integer quantity = rs.getInt(3); 
				String units = rs.getString(4); 
				Float cost = rs.getFloat(5);
				
			
				
				 
				System.out.println(""); 
				
				ingredientes.add(new Ingredient(id,name,quantity,units,cost));
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

	public void addUser(String nombre,String email,String password) {
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
/*
	public void  mostrarUsuarios(JTable tablaTotalUsuarios){
	       Clases.CConexion objetoConexion = new Clases.CConexion();

	        DefaultTableModel modelo = new DefaultTableModel();
	        
	        String sql="";
	        modelo.addColumn("Id");
	        modelo.addColumn("Nombre");
	        modelo.addColumn("Apellidos");
	        modelo.addColumn("Sexo");
	        modelo.addColumn("Edad");
	        modelo.addColumn("FNacimiento");
	        modelo.addColumn("Foto");
	        
	        tablaTotalUsuarios.setModel(modelo);
	        sql="SELECT u.id,u.nombres,u.apellidos,sexo.sexo,u.edad,u.fnacimiento,u.foto from usuarios as u INNER JOIN sexo ON u.sexo_id = sexo.id;";
	        
	        try {
	            Statement st = objetoConexion.estableceConexion().createStatement();
	            ResultSet rs = st.executeQuery(sql);
	            
	            while (rs.next()) {                
	                String id = rs.getString("id");
	                String nombres = rs.getString("nombres");
	                String apellidos = rs.getString("apellidos");
	                String sexo = rs.getString("sexo");
	                String edad = rs.getString("edad");
	                
	                SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyyy");
	                java.sql.Date fechaSQL = rs.getDate("fnacimiento");
	                String nuevaFecha = stf.format(fechaSQL);
	                
	                byte [] ImageBytes = rs.getBytes("foto");
	                Image foto = null;
	                if (ImageBytes!=null) {
	                    try {
	                        ImageIcon imageIcon = new ImageIcon(ImageBytes);
	                        foto= imageIcon.getImage();
	                    } catch (Exception e) {
	                    JOptionPane.showMessageDialog(null, "Ocurrio un error: "+e);
	                    }
	                    modelo.addRow(new Object[]{id,nombres,apellidos,sexo,edad,nuevaFecha,foto});
	                }
	                tablaTotalUsuarios.setModel(modelo);
	            }
	        } catch (Exception e) {
	JOptionPane.showMessageDialog(null, "Error al mostrar usuarios : "+e);
	        }
	        finally{
	            objetoConexion.cerrarConexion();
	        }
	    }*/
}