
package models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;
import javax.swing.JOptionPane;

public class AuthModel {

	public AuthModel() {
		
	}	       

	
	
public boolean login(String username, String password) {
	String query = "SELECT * FROM users WHERE username = ? AND password = ?";
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://sql3.freesqldatabase.com/sql3781023", "sql3781023", "X9HKF7IsKB");

        stmt = conn.prepareStatement(query);
        stmt.setString(1, username);
        stmt.setString(2, password);

        rs = stmt.executeQuery();

        if (rs.next()) {
            String storedHash = rs.getString("password");
            
            // Verificar la contraseña ingresada contra el hash almacenado
                return true; // Login exitoso
            
        }

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    return false; // Login fallido
}

}
		  


