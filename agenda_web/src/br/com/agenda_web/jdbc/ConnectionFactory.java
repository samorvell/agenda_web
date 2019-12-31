package br.com.agenda_web.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;





public class ConnectionFactory {

	public Connection getConnection() {
	//public static void main(String args[]) throws ClassNotFoundException{ 
		try {
			//step1 load the driver class  
			//Class.forName("oracle.jdbc.driver.OracleDriver");  
			//step2 create  the connection object  
			//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@kazuken.ddns.net:23001:orcl", "SAMUEL","Rfaella2812");
			
			
			DriverManager.registerDriver(new OracleDriver());
			return DriverManager.getConnection("jdbc:oracle:thin:@kazuken.ddns.net:23001:orcl", "SAMUEL","Rfaella2812");
			// return DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb", "root", "Leroy123");
			// return DriverManager.getConnection (
			// "jdbc:oracle:thin:sys:R@faella2812:@kazuken.ddns.net:23001:orcl");			
			// return
			// DriverManager.getConnection("jdbc:oracle:thin:@kazukendbazr.brazilsouth.cloudapp.azure.com:1521:orcl","samorvell","Rafaella2812");

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}