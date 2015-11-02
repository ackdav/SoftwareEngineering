package com.google.gwt.sample.MovieDataBase.server;

import com.google.api.server.spi.auth.common.User;
import com.google.cloud.sql.jdbc.Connection;
import com.google.cloud.sql.jdbc.ResultSet;
import com.google.gwt.sample.MovieDataBase.client.DBConnection;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.mysql.jdbc.PreparedStatement;

import java.sql.SQLException;
import java.util.*;
public class MySQLConnection  extends RemoteServiceServlet implements DBConnection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	int MovieID;
//	char MovieDirectory;
//	String name;
//	
	private Connection conn = null;        
	private String status;        
	private String url  = "http://localhost/phpmyadmin/#PMAURL-4:sql.php?db=moviedatabase&table=moviedatabase&server=1&target=&token=0576f5e2c664ca711ca0a5162027cfbd";        
	private User user = "DBuser";        
	private String pass = "DBpass";
	Scanner sc = new Scanner(System.in);
	public MySQLConnection() {
		 try {                        
			 Class.forName("com.mysql.jdbc.Driver").newInstance();                        
			 conn = DriverManager.getConnection(url, user, pass);                
			 } catch (Exception e) {                        
				 //NEVER catch exceptions like this                
			 }
		 }
	String nameInput = sc.nextLine();
	public void FilterName (String name) {
		try {
			com.google.cloud.sql.jdbc.PreparedStatement ps = conn.prepareStatement(
				"select * from users where username = \"" + 
			user + 
			"\" AND " + "password = \"" + pass + "\"");
			 ResultSet result = ps.executeQuery(); 
			 while (result.next()) 
				 user = new User(result.getString(1), result.getString(2));
			 result.close();
			 ps.close();
		} catch (SQLException sql2) {
			
		}
		return user;
	}
}

