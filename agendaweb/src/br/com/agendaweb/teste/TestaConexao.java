package br.com.agendaweb.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.agendaweb.jdbc.ConnectionFactory;



public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão Aberta!");
		connection.close();

	}

}
