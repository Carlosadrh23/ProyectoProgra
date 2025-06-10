package models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class IngredientsModel {

	private List<Ingredient> ingredientes = new ArrayList<>();

	public IngredientsModel() {
		// TODO Auto-generated constructor stub
	}

	public List getAll() {

		String query = "SELECT i.ingredient_id,i.code, i.name, inv.current_quantity, i.unit, i.price FROM ingredients i JOIN inventories inv ON i.ingredient_id = inv.ingredient_id";
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
				Integer quantity = rs.getInt(4);
				String units = rs.getString(5);
				Float cost = rs.getFloat(6);

				ingredientes.add(new Ingredient(id, code, name, quantity, units, cost));
			}

			rs.close();

			return ingredientes;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}

		return ingredientes;
	}

	

	    public float sumarPreciosPorCodigo(String[] codes)  {
	    	
	    	String placeholders = String.join(",", Collections.nCopies(codes.length, "?"));
	    	String sql = "SELECT SUM(price) AS total_price FROM ingredients WHERE name IN (" + placeholders + ")";
	    	

	        try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
					"*e9EZn3Nr@KBrde");
	        		PreparedStatement stmt = conn.prepareStatement(sql)) {
	            for (int i = 0; i < codes.length; i++) {
	                stmt.setString(i + 1, codes[i]);
	            }

	            ResultSet rs = stmt.executeQuery();
	            if (rs.next()) {
	                return rs.getFloat("total_price");
	            } else {
	                return 0f; // No resultados
	            }
	        }catch (Exception e) {
				e.printStackTrace();
			}
	        return 0f; 
	    }
	
	        public List<Ingredient> getIngredientsForDish(String nombre) {
	            List<Ingredient> ingredientes = new ArrayList<>();

	            String sql = """
	            	    SELECT 
	            	        i.ingredient_id, 
	            	        i.code, 
	            	        i.name, 
	            	        di.quantity_per_dish, 
	            	        i.unit, 
	            	        i.price
	            	    FROM dish_ingredients di
	            	    JOIN ingredients i ON di.ingredient_id = i.ingredient_id
	            	    JOIN dishes d ON di.dish_id = d.dish_id
	            	    WHERE d.name = ?
	            	""";


	            try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
						"*e9EZn3Nr@KBrde");
	            		PreparedStatement stmt = conn.prepareStatement(sql)) {
	                stmt.setString(1, nombre);
	                ResultSet rs = stmt.executeQuery();

	                while (rs.next()) {
	                    int id = rs.getInt("ingredient_id");
	                    String code = rs.getString("code");
	                    String name = rs.getString("name");
	                    int quantity = rs.getInt("quantity_per_dish");
	                    String unit = rs.getString("unit");
	                    float cost = rs.getFloat("price");

	                    Ingredient ingredient = new Ingredient(id, code, name, quantity, unit, cost);
	                    ingredientes.add(ingredient);
	                }

	            } catch (SQLException e) {
	                e.printStackTrace(); // Puedes reemplazar con logs
	            }

	            return ingredientes;
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
				Integer quantity = rs.getInt(4);
				String units = rs.getString(5);
				Float cost = rs.getFloat(6);

				ingredientes.add(new Ingredient(id, code, name, quantity, units, cost));
			}

			rs.close();

			return ingredientes;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}

		return ingredientes;
	}

	public User get(int id_Target) {

		String query = "select * from ingredients where user_id = " + id_Target;
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
				String email = rs.getString(3);
				String password = rs.getString(4);

				System.out.println("empId:" + id);
				System.out.println("firstName:" + name);
				System.out.println("email:" + email);
				System.out.println("role:" + password);

				System.out.println("");
				myuser = new User(id, name, email, password, null, null);
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

	public boolean remove(int ingredientId) {
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

			// Primero elimina las referencias en dish_ingredients
			String deleteDishIngredientsQuery = "DELETE FROM dish_ingredients WHERE ingredient_id = ?";
			stmt1 = conn.prepareStatement(deleteDishIngredientsQuery);
			stmt1.setInt(1, ingredientId);
			stmt1.executeUpdate();

			// Segundo elimina las referencias en inventories
			String deleteInventoriesQuery = "DELETE FROM inventories WHERE ingredient_id = ?";
			stmt2 = conn.prepareStatement(deleteInventoriesQuery);
			stmt2.setInt(1, ingredientId);
			stmt2.executeUpdate();

			// Tercero elimina el ingrediente
			String deleteIngredientQuery = "DELETE FROM ingredients WHERE ingredient_id = ?";
			stmt3 = conn.prepareStatement(deleteIngredientQuery);
			stmt3.setInt(1, ingredientId);
			int rowsAffected = stmt3.executeUpdate();

			// Commit transaction
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
				return String.format("ING%03d", nextId);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "ING001"; // Por defecto

	}

	public int addIngredient(String name, String unit, Float price) {

		String code = generateNextIngredientCode();

		String sql = "INSERT INTO ingredients (code, name, unit, price) VALUES (?, ?, ?, ?)";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
				"*e9EZn3Nr@KBrde");
				PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public void update(String code, String name, String unit, Float price) {
		String query = "UPDATE ingredients SET name=?, unit=?, price=? WHERE code=?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
				"*e9EZn3Nr@KBrde"); PreparedStatement pstmt = conn.prepareStatement(query)) {

			pstmt.setString(1, name);
			pstmt.setString(2, unit);
			pstmt.setFloat(3, price);
			pstmt.setString(4, code);

			int rowsAffected = pstmt.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Usuario actualizado correctamente.");
			} else {
				System.out.println("No se encontró el ingediente con codigo: " + code);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean updateIngredients(int id , List<IngredientsInDish> ingredients) {
	    PreparedStatement deleteStmt = null;
	    PreparedStatement insertStmt = null;
	    Connection conn = null;
	    String deleteSQL = "DELETE FROM dish_ingredients WHERE dish,id = ?";
	    String insertSQL = "INSERT INTO dish_ingredients (dish_id, ingredient_id, quantity, unit, cost) VALUES (?, ?, ?, ?, ?)";

	    try {
	    	 conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
					"*e9EZn3Nr@KBrde");
	        conn.setAutoCommit(false); // importante: transacción

	        // 1. Eliminar ingredientes anteriores
	        deleteStmt = conn.prepareStatement(deleteSQL);
	        deleteStmt.setInt(1, id);
	        deleteStmt.executeUpdate();

	        // 2. Insertar los nuevos ingredientes
	        insertStmt = conn.prepareStatement(insertSQL);
	        for (IngredientsInDish ing : ingredients) {
	            insertStmt.setInt(1, id);
	            insertStmt.setString(2, ing.getIngredientId());
	            insertStmt.setDouble(3, ing.getQuantity());
	            insertStmt.setString(4, ing.getUnit());
	            insertStmt.setDouble(5, ing.getCost());
	            insertStmt.addBatch();
	        }
	        insertStmt.executeBatch();

	        conn.commit();
	        return true;

	    } catch (SQLException e) {
	        e.printStackTrace();
	        if (conn != null) {
	            try { conn.rollback(); } catch (SQLException ex) { ex.printStackTrace(); }
	        }
	        return false;

	    } finally {
	        try {
	            if (deleteStmt != null) deleteStmt.close();
	            if (insertStmt != null) insertStmt.close();
	            if (conn != null) conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


}