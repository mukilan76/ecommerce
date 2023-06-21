package ecom.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnect {

static String url ="jdbc:mysql://127.0.0.1:3306/ecommerce_cart";
static String username="root";
static String password ="john7639";

public static Connection getconnection() throws ClassNotFoundException, SQLException {
	
	

		
		Connection connection = DriverManager.getConnection(url,username,password);
		
	
	return connection;
	
}


}