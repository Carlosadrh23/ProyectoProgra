
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
	
	public boolean login(String password) {
	    String query = "SELECT * FROM usuario WHERE password_hash = ?";
	    Connection conn = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;

	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        conn = DriverManager.getConnection("jdbc:mysql://sql3.freesqldatabase.com/sql3779414", "sql3779414", "mteKJLYjrB");
	        stmt = conn.prepareStatement(query);
	        stmt.setString(1, password); 
	        
	        rs = stmt.executeQuery();

	        if (rs.next()) {
	       //	  String passwordHash = rs.getString("password_hash");
	       //       if (BCrypt.checkpw(password, passwordHash))
	        	//Se implementara al añadir el registro
	            return true; 
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

	    return false;
	}
}
		  


