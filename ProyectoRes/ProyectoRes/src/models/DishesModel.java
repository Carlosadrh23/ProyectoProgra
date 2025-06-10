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
import javax.swing.table.DefaultTableModel;

public class DishesModel {

	private List<Dish> dishes = new ArrayList<>();

	public DishesModel() {
		// TODO Auto-generated constructor stub
	}
	class OrderItem {
	    private int dishId;
	    private String code;
	    private String name;
	    private double price;
	    private int quantity;
	    
	    public OrderItem(int dishId, String code, String name, double price) {
	        this.dishId = dishId;
	        this.code = code;
	        this.name = name;
	        this.price = price;
	        this.quantity = 1; // Cantidad inicial
	    }
	    
	    // Getters y setters
	    public int getDishId() { return dishId; }
	    public String getCode() { return code; }
	    public String getName() { return name; }
	    public double getPrice() { return price; }
	    public int getQuantity() { return quantity; }
	    public void setQuantity(int quantity) { this.quantity = quantity; }
	    public double getSubtotal() { return price * quantity; }
	}

	// Lista temporal para manejar el pedido actual
	List<OrderItem> currentOrder = new ArrayList<>();
	public List getAll() {

		String query = "select * from dishes;";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
					"*e9EZn3Nr@KBrde");
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

				dishes.add(new Dish(id, code, name, description, category_id, price, photo_url, null, null));
			}

			rs.close();

			return dishes;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}

		return dishes;
	}

	// SELECT unit AS unidad,COUNT(*) AS cantidad_de_ingredientes FROM ingredients
	// GROUP BY unit;
	public List getUnits() {

		String query = "SELECT unit AS unidad,COUNT(*) AS cantidad_de_ingredientes FROM ingredients GROUP BY unit";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
					"*e9EZn3Nr@KBrde");
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

				dishes.add(new Dish(id, code, name, description, category_id, price, photo_url, null, null));
			}

			rs.close();

			return dishes;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}

		return dishes;
	}

	public List<String> buscarPlatillosPorNombre(String busqueda) {
		List<String> resultados = new ArrayList<>();

		String sql = "SELECT * FROM dishes WHERE name LIKE ?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
				"*e9EZn3Nr@KBrde"); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, "%" + busqueda + "%"); // % para búsqueda parcial

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				resultados.add(rs.getString("name"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultados;
	}

	public boolean remove(int id) {
		String deleteOrderDetails = "DELETE FROM order_details WHERE dish_id = ?";
		String deleteDish = "DELETE FROM dishes WHERE dish_id = ?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
				"*e9EZn3Nr@KBrde");
				PreparedStatement stmt1 = conn.prepareStatement(deleteOrderDetails);
				PreparedStatement stmt2 = conn.prepareStatement(deleteDish)) {

			conn.setAutoCommit(false); // iniciar transacción

			stmt1.setInt(1, id);
			stmt1.executeUpdate();

			stmt2.setInt(1, id);
			stmt2.executeUpdate();

			conn.commit(); // confirmar todo

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public String generateNextIngredientCode() {
		String sql = "SELECT COALESCE(MAX(ingredient_id), 0) + 1 as next_id FROM ingredients";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
					"*e9EZn3Nr@KBrde");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int nextId = rs.getInt("next_id");
				return String.format("PLA%03d", nextId);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "ING001"; // Por defecto

	}

	public int addDish(String name, Float price,int category) {

		String code = generateNextIngredientCode();

		String sql = "INSERT INTO dishes (code, name, price,category_id) VALUES (?, ?, ?,?)";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
				"*e9EZn3Nr@KBrde");
				PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			stmt.setString(1, code);
			stmt.setString(2, name);
			
			stmt.setFloat(3, price);
			stmt.setInt(4, category);
			int rowsAffected = stmt.executeUpdate();

			if (rowsAffected > 0) {
				try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
					if (generatedKeys.next()) {
						return generatedKeys.getInt(1); // Retorna el ID generado
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public void update(int id, String name, String email, String password) {
		String query = "UPDATE dishes SET name=?, description=?, password=? WHERE id=?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
				"*e9EZn3Nr@KBrde"); PreparedStatement pstmt = conn.prepareStatement(query)) {

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
	private void guardarOrden(int customerId, int userId,List currentOrder) {
	    try {
	        // 1. Insertar orden principal
	        String insertOrderSQL = "INSERT INTO orders (customer_id, total, created_by) VALUES (?, ?, ?)";
	        Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
					"*e9EZn3Nr@KBrde");
	        PreparedStatement orderStmt = conn.prepareStatement(insertOrderSQL, Statement.RETURN_GENERATED_KEYS);
	        
	        double total = currentOrder.stream().mapToDouble(OrderItem::getSubtotal).sum();
	        orderStmt.setInt(1, customerId);
	        orderStmt.setDouble(2, total);
	        orderStmt.setInt(3, userId);
	        
	        orderStmt.executeUpdate();
	        
	        // Obtener ID de la orden creada
	        ResultSet generatedKeys = orderStmt.getGeneratedKeys();
	        int orderId = 0;
	        if (generatedKeys.next()) {
	            orderId = generatedKeys.getInt(1);
	        }
	        
	        // 2. Insertar detalles de la orden
	        String insertDetailSQL = "INSERT INTO order_details (order_id, dish_id, quantity, unit_price, subtotal) VALUES (?, ?, ?, ?, ?)";
	        Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
					"*e9EZn3Nr@KBrde");
	        PreparedStatement detailStmt = conn.prepareStatement(insertDetailSQL);
	        
	        for (OrderItem item : currentOrder) {
	            if (item.getQuantity() > 0) { // Solo items con cantidad > 0
	                detailStmt.setInt(1, orderId);
	                detailStmt.setInt(2, item.getDishId());
	                detailStmt.setInt(3, item.getQuantity());
	                detailStmt.setDouble(4, item.getPrice());
	                detailStmt.setDouble(5, item.getSubtotal());
	                detailStmt.addBatch();
	            }
	        }
	        
	        detailStmt.executeBatch();
	        
	        // 3. Actualizar inventario (opcional)
	        actualizarInventario();
	        
	        System.out.println("Orden guardada exitosamente con ID: " + orderId);
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	// Método para actualizar inventario basado en los ingredientes
	private void actualizarInventario() {
	    try {
	        String updateInventorySQL = """
	            UPDATE inventories i 
	            JOIN dish_ingredients di ON i.ingredient_id = di.ingredient_id 
	            SET i.current_quantity = i.current_quantity - (di.quantity_per_dish * ?) 
	            WHERE di.dish_id = ?
	        """;
	        Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
					"*e9EZn3Nr@KBrde");
	        PreparedStatement stmt = conn.prepareStatement(updateInventorySQL);
	        
	        for (OrderItem item : currentOrder) {
	            if (item.getQuantity() > 0) {
	                stmt.setInt(1, item.getQuantity());
	                stmt.setInt(2, item.getDishId());
	                stmt.addBatch();
	            }
	        }
	        
	        stmt.executeBatch();
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	// Validar disponibilidad de inventario antes de guardar
	private boolean validarInventario() {
	    try {
	        String checkInventorySQL = """
	            SELECT i.current_quantity, 
	                   SUM(di.quantity_per_dish * ?) as required_quantity,
	                   ing.name
	            FROM inventories i
	            JOIN dish_ingredients di ON i.ingredient_id = di.ingredient_id
	            JOIN ingredients ing ON i.ingredient_id = ing.ingredient_id
	            WHERE di.dish_id = ?
	            GROUP BY i.inventory_id, i.current_quantity, ing.name
	            HAVING i.current_quantity < required_quantity
	        """;
	        Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
					"*e9EZn3Nr@KBrde");
	        
	        PreparedStatement stmt = conn.prepareStatement(checkInventorySQL);
	        
	        for (OrderItem item : currentOrder) {
	            if (item.getQuantity() > 0) {
	                stmt.setInt(1, item.getQuantity());
	                stmt.setInt(2, item.getDishId());
	                
	                ResultSet rs = stmt.executeQuery();
	                if (rs.next()) {
	                    String ingredientName = rs.getString("name");
	                    JOptionPane.showMessageDialog(null, 
	                        "Inventario insuficiente para: " + ingredientName + 
	                        " en el platillo: " + item.getName());
	                    return false;
	                }
	            }
	        }
	        
	        return true;
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}*/
}