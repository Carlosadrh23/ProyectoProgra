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
		String query = "SELECT *, SUM(o.total) AS IMPORTE FROM customers c "
				+ "JOIN orders o ON c.customer_id = o.customer_id " + "GROUP BY c.customer_id";

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
				Float importe = rs.getFloat("IMPORTE");

				clientes.add(new Client(id, name, rfc, phone, email, importe, null, null));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return clientes;
	}

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
					conn.setAutoCommit(true); // Reset auto-commit
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void addClient(String name, String rfc, String phone, String email, String street, String neighborhood,
			String city, String state, String postalCode, String country) {

// Query para insertar cliente según la estructura real de la BD
		String insertCustomerQuery = "INSERT INTO customers (name, rfc, phone, email) VALUES (?, ?, ?, ?)";

// Query para insertar dirección según la estructura real de la BD
		String insertAddressQuery = "INSERT INTO addresses (customer_id, street, neighborhood, city, state, postal_code, country) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?)";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
				"*e9EZn3Nr@KBrde")) {

// Deshabilitar autocommit para manejar transacciones
			conn.setAutoCommit(false);

			try {
				// Insertar cliente
				PreparedStatement customerStmt = conn.prepareStatement(insertCustomerQuery,
						Statement.RETURN_GENERATED_KEYS);
				customerStmt.setString(1, name);
				customerStmt.setString(2, rfc.isEmpty() ? null : rfc); // RFC puede ser NULL
				customerStmt.setString(3, phone.isEmpty() ? null : phone); // Phone puede ser NULL
				customerStmt.setString(4, email);

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
						addressStmt.setString(3, neighborhood.isEmpty() ? null : neighborhood); // Neighborhood puede
																								// ser NULL
						addressStmt.setString(4, city);
						addressStmt.setString(5, state.isEmpty() ? null : state); // State puede ser NULL
						addressStmt.setString(6, postalCode.isEmpty() ? null : postalCode); // Postal code puede ser
																							// NULL
						addressStmt.setString(7, country);

						addressStmt.executeUpdate();
						addressStmt.close();

						// Confirmar transacción
						conn.commit();
						System.out.println("Cliente agregado exitosamente con ID: " + customerId);
						System.out.println("Nombre: " + name);
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
	public void addClientWithValidations(String name, String rfc, String phone, String email, String street,
			String neighborhood, String city, String state, String postalCode, String country) {

// Validaciones básicas según la estructura de la BD
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("El nombre es requerido");
		}
		if (name.length() > 100) {
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
		addClient(name, rfc, phone, email, street, neighborhood, city, state, postalCode, country);
	}

//Método simplificado para usar con tu formulario
	public void addClientFromForm(String firstName, String secondName, String firstLastName, String secondLastName,
			String rfc, String phone, String email, String street, String number, String neighborhood, String city,
			String state, String postalCode) {

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
		addClientWithValidations(fullName.toString(), rfc, phone, email, fullStreet, neighborhood, city, state,
				postalCode, "México");
	}

//Método auxiliar para formatear fecha
	private String formatBirthDate(String day, String month, String year) {
		try {
			int dayInt = Integer.parseInt(day.trim());
			int monthInt = Integer.parseInt(month.trim());
			int yearInt = Integer.parseInt(year.trim());

// Formato MySQL: YYYY-MM-DD
			return yearInt + "-" + String.format("%02d", monthInt) + "-" + String.format("%02d", dayInt);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Error en formato de fecha: " + e.getMessage());
		}
	}

	public void updateCustomer(int customerId, String name, String rfc, String phone, String email, String street,
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

	public void updateCustomer(int customerId, String name, String rfc, String phone, String email, String street,
			String neighborhood, String city, String state, String postalCode, String country, String day, String month,
			String year) {

		String updateCustomerQuery = "UPDATE customers SET name = ?, rfc = ?, phone = ?, email = ?, birth_date = ?, updated_at = CURRENT_TIMESTAMP WHERE customer_id = ?";
		String updateAddressQuery = "UPDATE addresses SET street = ?, neighborhood = ?, city = ?, state = ?, postal_code = ?, country = ? WHERE customer_id = ?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
				"*e9EZn3Nr@KBrde")) {

			conn.setAutoCommit(false);

			try {
				// Crear fecha de nacimiento en formato YYYY-MM-DD
				String birthDate = year + "-" + String.format("%02d", Integer.parseInt(month)) + "-"
						+ String.format("%02d", Integer.parseInt(day));

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