package br.com.agendaweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			// return DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb", "root", "Leroy123");
			 //return DriverManager.getConnection ("jdbc:oracle:thin:sys:Rfaella2812:@kazuken.ddns.net:23001:orcl");
			 return DriverManager.getConnection ("jdbc:oracle:thin:@kazuken.ddns.net:23001:orcl", "SAMUEL","Rfaella2812");
			// return
			//DriverManager.getConnection("jdbc:oracle:thin:@kazukendbazr.brazilsouth.cloudapp.azure.com:1521:orcl","samorvell","Rafaella2812");

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
