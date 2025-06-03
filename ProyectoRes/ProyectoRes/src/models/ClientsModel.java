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

import javax.swing.JOptionPane;


public class ClientsModel {

	
	private List<Client> clientes = new ArrayList<>();
	
	public ClientsModel() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Client> getAll() {
	    String query = "SELECT *, SUM(o.total) AS IMPORTE FROM customers c " +
	                   "JOIN orders o ON c.customer_id = o.customer_id " +
	                   "GROUP BY c.customer_id";
	    
	    try (Connection conn = DriverManager.getConnection(
	             "jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde");
	         PreparedStatement stmt = conn.prepareStatement(query);
	         ResultSet rs = stmt.executeQuery()) {
	        
	        while (rs.next()) {
	            Integer id = rs.getInt("customer_id");
	            String name = rs.getString("name");
	            String rfc = rs.getString("rfc");
	            String phone = rs.getString("phone");
	            String email = rs.getString("email");
	            Float importe = rs.getFloat("IMPORTE");
	            
	            clientes.add(new Client(id, name, rfc, phone, email, importe,null,null));
	        }
	        
	    } catch (Exception e) {
	        e.printStackTrace();
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
	    Connection conn = null;
	    PreparedStatement stmt1 = null;
	    PreparedStatement stmt2 = null;
	    PreparedStatement stmt3 = null;
	    
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde");
	        
	        // Start transaction
	        conn.setAutoCommit(false);
	        
	        // First, delete orders associated with this customer
	        String deleteOrdersQuery = "DELETE FROM orders WHERE customer_id = ?";
	        stmt1 = conn.prepareStatement(deleteOrdersQuery);
	        stmt1.setInt(1, id);
	        stmt1.executeUpdate();
	        
	        // Second, delete addresses associated with this customer
	        String deleteAddressesQuery = "DELETE FROM addresses WHERE customer_id = ?";
	        stmt2 = conn.prepareStatement(deleteAddressesQuery);
	        stmt2.setInt(1, id);
	        stmt2.executeUpdate();
	        
	        // Finally, delete the customer
	        String deleteCustomerQuery = "DELETE FROM customers WHERE customer_id = ?";
	        stmt3 = conn.prepareStatement(deleteCustomerQuery);
	        stmt3.setInt(1, id);
	        int rowsAffected = stmt3.executeUpdate();
	        
	        // Commit transaction
	        conn.commit();
	        
	        // Return true if at least one row was deleted
	        return rowsAffected > 0;
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	        // Rollback transaction in case of error
	        if (conn != null) {
	            try {
	                conn.rollback();
	            } catch (SQLException rollbackEx) {
	                rollbackEx.printStackTrace();
	            }
	        }
	        return false;
	        
	    } finally {
	        // Close resources
	        try {
	            if (stmt1 != null) stmt1.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        try {
	            if (stmt2 != null) stmt2.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        try {
	            if (stmt3 != null) stmt3.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        try {
	            if (conn != null) {
	                conn.setAutoCommit(true); // Reset auto-commit
	                conn.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
	private boolean validateFields(String firstName, String firstLastName, String rfc, String email, String phone) {
	    if (firstName.trim().isEmpty() || firstLastName.trim().isEmpty()) {
	        JOptionPane.showMessageDialog(null, "El primer nombre y primer apellido son obligatorios.", "Error de validación", JOptionPane.ERROR_MESSAGE);
	        return false;
	    }
	    
	    if (rfc.trim().isEmpty() || rfc.length() < 10) {
	        JOptionPane.showMessageDialog(null, "El RFC debe tener al menos 10 caracteres.", "Error de validación", JOptionPane.ERROR_MESSAGE);
	        return false;
	    }
	    
	    if (email.trim().isEmpty() || !email.contains("@")) {
	        JOptionPane.showMessageDialog(null, "Ingrese un email válido.", "Error de validación", JOptionPane.ERROR_MESSAGE);
	        return false;
	    }
	    
	    if (phone.trim().isEmpty() || phone.length() < 10) {
	        JOptionPane.showMessageDialog(null, "El teléfono debe tener al menos 10 dígitos.", "Error de validación", JOptionPane.ERROR_MESSAGE);
	        return false;
	    }
	    
	    return true;
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
	public void updateCustomer(int customerId, String name, String rfc, String phone, String email, 
            String street, String neighborhood, String city, String state, 
            String postalCode, String country) {
		 String updateCustomerQuery = "UPDATE customers SET name = ?, rfc = ?, phone = ?, email = ?, updated_at = CURRENT_TIMESTAMP WHERE customer_id = ?";
		 String updateAddressQuery = "UPDATE addresses SET street = ?, neighborhood = ?, city = ?, state = ?, postal_code = ?, country = ? WHERE customer_id = ?";
		    		
		 try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde")) {
		        
		        // Usar transacción para asegurar que ambas actualizaciones se ejecuten correctamente
		        conn.setAutoCommit(false);
		        
		        try {
		            // Actualizar datos del cliente
		            PreparedStatement pstmt1 = conn.prepareStatement(updateCustomerQuery);
		            pstmt1.setString(1, name);
		            pstmt1.setString(2, rfc);
		            pstmt1.setString(3, phone);
		            pstmt1.setString(4, email);
		            pstmt1.setInt(5, customerId);
		            
		            int customerRowsAffected = pstmt1.executeUpdate();
		            
		            // Actualizar dirección del cliente
		            PreparedStatement pstmt2 = conn.prepareStatement(updateAddressQuery);
		            pstmt2.setString(1, street);
		            pstmt2.setString(2, neighborhood);
		            pstmt2.setString(3, city);
		            pstmt2.setString(4, state);
		            pstmt2.setString(5, postalCode);
		            pstmt2.setString(6, country);
		            pstmt2.setInt(7, customerId);
		            
		            int addressRowsAffected = pstmt2.executeUpdate();
		            
		            // Confirmar transacción
		            conn.commit();
		            
		            if (customerRowsAffected > 0 && addressRowsAffected > 0) {
		                System.out.println("Cliente y dirección actualizados correctamente.");
		            } else if (customerRowsAffected > 0) {
		                System.out.println("Cliente actualizado, pero no se encontró dirección para actualizar.");
		            } else {
		                System.out.println("No se encontró el cliente con ID: " + customerId);
		            }
		            
		            pstmt1.close();
		            pstmt2.close();
		            
		        } catch (SQLException e) {
		            // Si hay error, hacer rollback
		            conn.rollback();
		            throw e;
		        }
		        
		    } catch (Exception e) {
		        System.err.println("Error al actualizar cliente: " + e.getMessage());
		        e.printStackTrace();
		    }
		}
	public void updateCustomer(int customerId, String name, String rfc, String phone, String email,
            String street, String neighborhood, String city, String state,
            String postalCode, String country, String day, String month, String year) {

		String updateCustomerQuery = "UPDATE customers SET name = ?, rfc = ?, phone = ?, email = ?, birth_date = ?, updated_at = CURRENT_TIMESTAMP WHERE customer_id = ?";
		String updateAddressQuery = "UPDATE addresses SET street = ?, neighborhood = ?, city = ?, state = ?, postal_code = ?, country = ? WHERE customer_id = ?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin", "*e9EZn3Nr@KBrde")) {

			conn.setAutoCommit(false);

			try {
				// Crear fecha de nacimiento en formato YYYY-MM-DD
				String birthDate = year + "-" + String.format("%02d", Integer.parseInt(month)) + "-" + String.format("%02d", Integer.parseInt(day));

				// Actualizar datos del cliente incluyendo fecha de nacimiento
				PreparedStatement pstmt1 = conn.prepareStatement(updateCustomerQuery);
				pstmt1.setString(1, name);
				pstmt1.setString(2, rfc);
				pstmt1.setString(3, phone);
				pstmt1.setString(4, email);
	pstmt1.setString(5, birthDate);
	pstmt1.setInt(6, customerId);

	int customerRowsAffected = pstmt1.executeUpdate();

	// Actualizar dirección del cliente
	PreparedStatement pstmt2 = conn.prepareStatement(updateAddressQuery);
	pstmt2.setString(1, street);
	pstmt2.setString(2, neighborhood);
	pstmt2.setString(3, city);
	pstmt2.setString(4, state);
	pstmt2.setString(5, postalCode);
	pstmt2.setString(6, country);
	pstmt2.setInt(7, customerId);

	int addressRowsAffected = pstmt2.executeUpdate();

	conn.commit();

	if (customerRowsAffected > 0 && addressRowsAffected > 0) {
		System.out.println("Cliente y dirección actualizados correctamente.");
	} else if (customerRowsAffected > 0) {
		System.out.println("Cliente actualizado, pero no se encontró dirección para actualizar.");
	} else {
		System.out.println("No se encontró el cliente con ID: " + customerId);
	}

	pstmt1.close();
	pstmt2.close();

			} catch (SQLException e) {
				conn.rollback();
				throw e;
			}

		} catch (Exception e) {
			System.err.println("Error al actualizar cliente: " + e.getMessage());
			e.printStackTrace();
		}
	}
}