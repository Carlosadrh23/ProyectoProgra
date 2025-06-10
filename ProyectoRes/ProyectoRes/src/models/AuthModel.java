
package models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;
import java.sql.*;

public class AuthModel {

	public AuthModel() {

	}

	public boolean login(String username, char[] password) {

		final String sql = "SELECT password FROM users WHERE username = ?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://pro.freedb.tech/restaurantedDB", "admin",
				"*e9EZn3Nr@KBrde"); PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setString(1, username);
			try (ResultSet rs = ps.executeQuery()) {

				if (rs.next()) {
					String storedHash = rs.getString("password");

					// convierte el char[] a String solo para la verificación
					String plain = new String(password);
					boolean ok = BCrypt.checkpw(plain, storedHash);

					Arrays.fill(password, '\0'); // borra el array por seguridad
					plain = null; // ayuda al GC

					return ok; // true si coinciden
				}
			}

		} catch (SQLException ex) {
			ex.printStackTrace(); // en producción envíalo a un logger
		}

		return false; // usuario inexistente o contraseña incorrecta
	}

}
