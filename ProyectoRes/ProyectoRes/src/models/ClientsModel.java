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

	/*public List<Client> getAll() {
		String query = "SELECT *, COALESCE(SUM(o.total), 0) AS IMPORTE FROM customers c \r\n"
				+ "LEFT JOIN orders o ON c.customer_id = o.customer_id \r\n"
				+ "GROUP BY c.customer_id";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
				"*e9EZn3Nr@KBrde");
				PreparedStatement stmt = conn.prepareStatement(query);
				ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				Integer id = rs.getInt("customer_id");
				String name = rs.getString("name");
				String rfc = rs.getString("rfc");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				 String birthDate = rs.getString("birth_date");
				Float importe = rs.getFloat("IMPORTE");
					
				clientes.add(new Client(id, name, rfc, phone, email, importe,birthDate ,null, null));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return clientes;
	}*/
	public List<Client> getAll() {
	    List<Client> clientes = new ArrayList<>();

	    String query = "SELECT c.customer_id, c.first_name, c.second_name, c.lastname, c.second_lastname, c.rfc, c.phone, c.email,COALESCE(SUM(o.total), 0) AS IMPORTE ,c.birth_date, a.address_id, a.street, a.number_street, a.neighborhood, a.city, a.state, a.postal_code, a.country FROM restaurantedDB.customers c LEFT JOIN restaurantedDB.addresses a ON c.customer_id = a.customer_id LEFT JOIN orders o ON c.customer_id = o.customer_id GROUP BY \r\n"
	    		+ "  c.customer_id, c.first_name, c.rfc, c.phone, c.email, c.birth_date,\r\n"
	    		+ "  a.address_id, a.street, a.number_street, a.neighborhood, a.city, a.state, a.postal_code, a.country;";


	    try (Connection conn = DriverManager.getConnection(
	            "jdbc:mysql://pro.freedb.tech/restaurantedDB", 
	            "admin", 
	            "*e9EZn3Nr@KBrde");
	         PreparedStatement stmt = conn.prepareStatement(query);
	    		
	         ResultSet rs = stmt.executeQuery()) {

	        while (rs.next()) {
	            int id = rs.getInt("customer_id");
	            String first_name = rs.getString("first_name");
	            String second_name = rs.getString("second_name");
	            String lastname = rs.getString("lastname");
	            String second_lastname = rs.getString("second_lastname");

	            String rfc = rs.getString("rfc");
	            String phone = rs.getString("phone");
	            String email = rs.getString("email");
	            String birthDate = rs.getString("birth_date");
				Float importe = rs.getFloat("IMPORTE");

				 // Dirección
	            int address_id = rs.getInt("address_id");
	            String street = rs.getString("street");
	            String numberStreet = rs.getString("number_street");
	            String neighborhood = rs.getString("neighborhood");
	            String city = rs.getString("city");
	            String state = rs.getString("state");
	            String postalCode = rs.getString("postal_code");
	            String country = rs.getString("country");

	            clientes.add(new Client(id, first_name,second_name, lastname, second_lastname, rfc, phone, email, importe, birthDate, null, null,
	                    address_id, street, numberStreet, neighborhood, city, state, postalCode, country));
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return clientes;
	}
/*
	public User get(int id_Target) {

		String query = "select * from customers where user_id = " + id_Target;
		Connection conn = null;
		Statement stmt = null;
		User myuser = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
					"*e9EZn3Nr@KBrde");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {

				Integer id = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String email = rs.getString(4);

				System.out.println("");
				myuser = new User(id, name, phone, email, null, null);
			}

			rs.close();

			return myuser;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}

		return myuser;
	}
*/
	public boolean remove(int id) {
		Connection conn = null;
		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;
		PreparedStatement stmt3 = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
					"*e9EZn3Nr@KBrde");

			// Start transaction
			conn.setAutoCommit(false);

			// primero remueve las ordenes asociadas con el cliente
			String deleteOrdersQuery = "DELETE FROM orders WHERE customer_id = ?";
			stmt1 = conn.prepareStatement(deleteOrdersQuery);
			stmt1.setInt(1, id);
			stmt1.executeUpdate();

			// segundo remuevo las direcciones asociadas con el cliente
			String deleteAddressesQuery = "DELETE FROM addresses WHERE customer_id = ?";
			stmt2 = conn.prepareStatement(deleteAddressesQuery);
			stmt2.setInt(1, id);
			stmt2.executeUpdate();

			// tercero borra el cliente
			String deleteCustomerQuery = "DELETE FROM customers WHERE customer_id = ?";
			stmt3 = conn.prepareStatement(deleteCustomerQuery);
			stmt3.setInt(1, id);
			int rowsAffected = stmt3.executeUpdate();

			conn.commit();

			return rowsAffected > 0;

		} catch (Exception e) {
			e.printStackTrace();
			if (conn != null) {
				try {
					conn.rollback();
				} catch (SQLException rollbackEx) {
					rollbackEx.printStackTrace();
				}
			}
			return false;

		} finally {
			try {
				if (stmt1 != null)
					stmt1.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (stmt2 != null)
					stmt2.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (stmt3 != null)
					stmt3.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null) {
					conn.setAutoCommit(true);
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void addClient(String first_name, String second_name, String lastname, String second_lastname, String rfc, String phone, String email,String birth_date, String street, String neighborhood,
			String city, String state, String postalCode, String country,String number_street) {

// Query para insertar cliente 
		String insertCustomerQuery = "INSERT INTO customers (first_name, second_name, lastname,second_lastname,rfc, phone, email, birth_date) VALUES (?, ?, ?, ?,?,?, ?,?)";

// Query para insertar dirección
		String insertAddressQuery = "INSERT INTO addresses (customer_id, street, neighborhood, city, state, postal_code, country,number_street) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?,?)";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
				"*e9EZn3Nr@KBrde")) {
			conn.setAutoCommit(false);
			try {
				// Insertar cliente
				PreparedStatement customerStmt = conn.prepareStatement(insertCustomerQuery,
						Statement.RETURN_GENERATED_KEYS);
				customerStmt.setString(1, first_name);
				customerStmt.setString(2, second_name);
				customerStmt.setString(3, lastname);
				customerStmt.setString(4, second_lastname);
				customerStmt.setString(5, rfc.isEmpty() ? null : rfc); // RFC puede ser NULL
				customerStmt.setString(6, phone.isEmpty() ? null : phone); // Phone puede ser NULL
				customerStmt.setString(7, email);
				customerStmt.setString(8, birth_date);

				int rowsAffected = customerStmt.executeUpdate();

				if (rowsAffected > 0) {
					// Obtener el ID generado del cliente
					ResultSet generatedKeys = customerStmt.getGeneratedKeys();
					if (generatedKeys.next()) {
						int customerId = generatedKeys.getInt(1);

						// Insertar dirección
						PreparedStatement addressStmt = conn.prepareStatement(insertAddressQuery);
						addressStmt.setInt(1, customerId);
						addressStmt.setString(2, street);
						addressStmt.setString(3, neighborhood.isEmpty() ? null : neighborhood); // Neighborhood puede ser null																// ser NULL
						addressStmt.setString(4, city);
						addressStmt.setString(5, state.isEmpty() ? null : state); // State puede ser NULL
						addressStmt.setString(6, postalCode.isEmpty() ? null : postalCode); // Postal code puede ser
						addressStmt.setString(7, country);
						addressStmt.setString(8, number_street);

						addressStmt.executeUpdate();
						addressStmt.close();

						// Confirmar transacción
						conn.commit();
						System.out.println("Cliente agregado exitosamente con ID: " + customerId);
						System.out.println("Nombre: " + first_name);
						System.out.println("Email: " + email);
						System.out.println("Dirección: " + street + ", " + city + ", " + country);
					}
					generatedKeys.close();
				}
				customerStmt.close();

			} catch (SQLException e) {
				// Revertir transacción en caso de error
				conn.rollback();
				throw e;
			} finally {
				// Restaurar autocommit
				conn.setAutoCommit(true);
			}

		} catch (SQLException e) {
			System.err.println("Error al agregar cliente: " + e.getMessage());
			e.printStackTrace();
		}
	}

//Método con validaciones
	public void addClientWithValidations(String first_name, String second_name, String lastname, String second_lastname, String rfc, String phone, String email, String birth_date, String street,
			String neighborhood, String city, String state, String postalCode, String country, String number_street) {

// Validaciones básicas según la estructura de la BD
		if (first_name == null || first_name.trim().isEmpty()) {
			throw new IllegalArgumentException("El nombre es requerido");
		}
		if (first_name.length() > 100) {
			throw new IllegalArgumentException("El nombre no puede exceder 100 caracteres");
		}
		if (second_name.length() > 100) {
			throw new IllegalArgumentException("El nombre no puede exceder 100 caracteres");
		}
		if (lastname.length() > 100) {
			
			throw new IllegalArgumentException("El nombre no puede exceder 100 caracteres");
		}
		if (second_lastname.length() > 100) {
			throw new IllegalArgumentException("El nombre no puede exceder 100 caracteres");
		}
		if (email == null || email.trim().isEmpty()) {
			throw new IllegalArgumentException("El email es requerido");
		}
		if (email.length() > 100) {
			throw new IllegalArgumentException("El email no puede exceder 100 caracteres");
		}
		if (!email.contains("@") || !email.contains(".")) {
			throw new IllegalArgumentException("Formato de email inválido");
		}
		if (street == null || street.trim().isEmpty()) {
			throw new IllegalArgumentException("La calle es requerida");
		}
		if (street.length() > 150) {
			throw new IllegalArgumentException("La calle no puede exceder 150 caracteres");
		}
		if (city == null || city.trim().isEmpty()) {
			throw new IllegalArgumentException("La ciudad es requerida");
		}
		if (city.length() > 100) {
			throw new IllegalArgumentException("La ciudad no puede exceder 100 caracteres");
		}
		if (country == null || country.trim().isEmpty()) {
			throw new IllegalArgumentException("El país es requerido");
		}
		if (country.length() > 50) {
			throw new IllegalArgumentException("El país no puede exceder 50 caracteres");
		}

// Validaciones opcionales con límites de longitud
		if (rfc != null && rfc.length() > 20) {
			throw new IllegalArgumentException("El RFC no puede exceder 20 caracteres");
		}
		if (phone != null && phone.length() > 20) {
			throw new IllegalArgumentException("El teléfono no puede exceder 20 caracteres");
		}
		if (neighborhood != null && neighborhood.length() > 100) {
			throw new IllegalArgumentException("La colonia no puede exceder 100 caracteres");
		}
		if (state != null && state.length() > 100) {
			throw new IllegalArgumentException("El estado no puede exceder 100 caracteres");
		}
		if (postalCode != null && postalCode.length() > 10) {
			throw new IllegalArgumentException("El código postal no puede exceder 10 caracteres");
		}

// Llamar al método principal
		addClient(first_name, second_name, lastname, second_lastname, rfc, phone, email,birth_date, street, neighborhood, city, state, postalCode, country,number_street);
	}

//Método simplificado para usar con tu formulario
	public void addClientFromForm(String firstName, String secondName, String firstLastName, String secondLastName,
			String rfc, String phone, String email,String birth_date, String street, String number, String neighborhood, String city,
			String state, String postalCode,String number_street) {

// Construir nombre completo
		StringBuilder fullName = new StringBuilder();
		if (firstName != null && !firstName.trim().isEmpty()) {
			fullName.append(firstName.trim());
		}
		if (secondName != null && !secondName.trim().isEmpty()) {
			if (fullName.length() > 0)
				fullName.append(" ");
			fullName.append(secondName.trim());
		}
		if (firstLastName != null && !firstLastName.trim().isEmpty()) {
			if (fullName.length() > 0)
				fullName.append(" ");
			fullName.append(firstLastName.trim());
		}
		if (secondLastName != null && !secondLastName.trim().isEmpty()) {
			if (fullName.length() > 0)
				fullName.append(" ");
			fullName.append(secondLastName.trim());
		}

// Construir dirección completa incluyendo número
		String fullStreet = street;
		if (number != null && !number.trim().isEmpty()) {
			fullStreet = street + " " + number;
		}

// Llamar al método principal con país predeterminado
		addClientWithValidations(firstName, secondName, firstLastName, secondLastName, rfc, phone, email, birth_date, fullStreet, neighborhood, city, state,
				postalCode, "México",number_street);
	}



	/*public void updateCustomer(int customerId, String name, String rfc, String phone, String email, String street,
			String neighborhood, String city, String state, String postalCode, String country) {
		String updateCustomerQuery = "UPDATE customers SET name = ?, rfc = ?, phone = ?, email = ?, updated_at = CURRENT_TIMESTAMP WHERE customer_id = ?";
		String updateAddressQuery = "UPDATE addresses SET street = ?, neighborhood = ?, city = ?, state = ?, postal_code = ?, country = ? WHERE customer_id = ?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
				"*e9EZn3Nr@KBrde")) {

			// Usar transacción para asegurar que ambas actualizaciones se ejecuten
			// correctamente
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
     */
	public void updateCustomer(int customerId,String first_name, String second_name, String lastname, String second_lastname, String rfc, String phone, String email, String street,String numberStreet,
			String neighborhood, String city, String state, String postalCode, String country, String day, String month,
			String year) {

		String updateCustomerQuery = "UPDATE customers SET first_name = ?, second_name= ?, lastname = ?, second_lastname = ?, rfc = ?, phone = ?, email = ?, birth_date = ?, updated_at = CURRENT_TIMESTAMP WHERE customer_id = ?";
		String updateAddressQuery = "UPDATE addresses SET street = ?, number_street = ?, neighborhood = ?, city = ?, state = ?, postal_code = ?, country = ? WHERE customer_id = ?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
				"*e9EZn3Nr@KBrde")) {

			conn.setAutoCommit(false);

			try {
				// Crear fecha de nacimiento en formato YYYY-MM-DD para mysql
				String birthDate = year + "-" + String.format("%02d", Integer.parseInt(month)) + "-"
						+ String.format("%02d", Integer.parseInt(day));



				// Actualizar datos del cliente incluyendo fecha de nacimiento
				PreparedStatement pstmt1 = conn.prepareStatement(updateCustomerQuery);
				pstmt1.setString(1, first_name);
				pstmt1.setString(2, second_name);
				pstmt1.setString(3, lastname);
				pstmt1.setString(4, second_lastname);
				pstmt1.setString(5, rfc);
				pstmt1.setString(6, phone);
				pstmt1.setString(7, email);
				pstmt1.setString(8, birthDate);
				pstmt1.setInt(9, customerId);

				int customerRowsAffected = pstmt1.executeUpdate();

				// Actualizar dirección del cliente
				PreparedStatement pstmt2 = conn.prepareStatement(updateAddressQuery);
				pstmt2.setString(1, street);
				pstmt2.setString(2, numberStreet);
				pstmt2.setString(3, neighborhood);
				pstmt2.setString(4, city);
				pstmt2.setString(5, state);
				pstmt2.setString(6, postalCode);
				pstmt2.setString(7, country);
				pstmt2.setInt(8, customerId);

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