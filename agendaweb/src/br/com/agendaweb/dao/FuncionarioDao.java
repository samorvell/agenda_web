package br.com.agendaweb.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.agendaweb.jdbc.ConnectionFactory;
import br.com.agendaweb.modelo.Funcionario;

public class FuncionarioDao {

	// a conexão com o banco de dados
	private Connection connection;

	public FuncionarioDao() {
		this.connection = new ConnectionFactory().getConnection();

	}

	public void adicionafuncionario(Funcionario funcionario) throws SQLException {
		// SQL para inserir no banco
		String sql = "insert into funcionarios " + "(nome,email,endereco,dataNascimento,usuario,senha)"
				+ " values (?,?,?,?,?,?)";
		try {
			// prepared statement para inserção (sql para inserir no banco)
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta os valores
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getEmail());
			stmt.setString(3, funcionario.getEndereco());
			stmt.setDate(4, new Date(funcionario.getDataNascimento().getTimeInMillis()));
			stmt.setString(5, funcionario.getUsuario());
			stmt.setString(6, funcionario.getSenha());

			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);

		}
	}

}
