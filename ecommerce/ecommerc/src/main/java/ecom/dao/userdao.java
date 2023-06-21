package ecom.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ecom.model.user;

public class userdao {

	Connection connection ;
	user use ;
	private PreparedStatement pst ;
	private ResultSet rs ;
	String query ="select * from users where email = ? and  password = ?";
	//String url ="jdbc:mysql://127.0.0.1:3306/ecommerce_cart";
	 //String username="root";
	 //String passwordd ="john7639";
	public userdao(Connection connection){
		 this.connection = connection;
	}
	
	 public  user userlogin(String email , String password) throws SQLException {
		// Connection connection = DriverManager.getConnection(url,username,passwordd);
		 pst = connection.prepareStatement(query);
		pst.setString(1, email);
		pst.setString(2, password);
	    rs=	pst.executeQuery();
		 if(rs.next()) {
			 use = new user();
			 
			 use.setId(rs.getInt("id"));
         	use.setName(rs.getString("name"));
         	use.setEmail(rs.getString("email"));
			 
		 }
		 
		 
		 
		 return use ;
	 }
	
}