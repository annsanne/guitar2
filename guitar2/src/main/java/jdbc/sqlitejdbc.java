package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class sqlitejdbc {
	public static Connection getConnection(){
	    try {
	    	Class.forName("org.sqlite.JDBC");
	        Connection conn = DriverManager.getConnection("jdbc:sqlite:guitar.db");        
	        return conn;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null; 
    }
}
