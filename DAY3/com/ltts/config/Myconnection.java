package com.ltts.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Myconnection {
	public static Connection getConnection() throws Exception {
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/IPL","root","root");
			return con;
	}

}
