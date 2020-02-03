package br.com.agendaweb.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.agendaweb.jdbc.ConnectionFactory;
import br.com.agendaweb.modelo.Contato;

public class ContatoDao {

	// a conexão com o banco de dados
	private Connection connection;

	public ContatoDao() {
		this.connection = new ConnectionFactory().getConnection();

	}

	public void adiciona(Contato contato) throws DaoException, SQLException {
		// SQL para inserir no banco
		String sql = "insert into contatos " + "(nome,email,endereco,dataNascimento)" + " values (?,?,?,?)";
		try {
			// prepared statement para inserção (sql para inserir no banco)
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta os valores
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

			// executa
			stmt.execute();
			stmt.close();
		} catch (DaoException e) {
			throw new RuntimeException(e);

		}
	}

	public List<Contato> getLista() {
		try {
			List<Contato> contatos = new ArrayList<Contato>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from contatos order by Id");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Contato
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));

				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
				// contato.setDataNascimento(Calendar.getInstance());
				// contato.setDataNascimento(rs.getDate("dataNascimento"));

				// contato.setDataNascimento(data);

				// adicionando o objeto à lista
				contatos.add(contato);

			}

			rs.close();
			stmt.close();
			return contatos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Contato> getListPartDoNome(String Nome) { // cria a busca por parte do nome
		try {
			List<Contato> contatos = new ArrayList<Contato>(); // Cria a lista de contatos
			// String sql = "select * from contatos where nome like ?"; // String com o sql
			// para buscar na base de dados
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from contatos " + " where nome like ? " + "order by Id"); // Cria a
																											// conexão e
																											// usar a
			// string para
			// buscar na base
			stmt.setString(1, Nome + "%");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// Criando o objeto contato
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				// montando data atraves da calendar
				// Calendar data = Calendar.getInstance();
				// data.setTime(rs.getDate("dataNascimento"));
				// montando data atraves da calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
				// Adiciona objeto a lista
				contatos.add(contato);

			}

			rs.close();
			stmt.close();
			return contatos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Contato> PesquisaPorId(Long Id) throws SQLException {

		List<Contato> contatos = new ArrayList<Contato>();
		PreparedStatement stmt = this.connection.prepareStatement("select * from contatos where id = ?");
		stmt.setLong(1, Id);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			// Criando o objeto contato
			Contato contato = new Contato();
			// contato.setId(rs.getLong("id"));
			contato.setNome(rs.getString("nome"));
			contato.setEmail(rs.getString("email"));
			contato.setEndereco(rs.getString("endereco"));

			// montando data atraves da calendar
			Calendar data = Calendar.getInstance();
			data.setTime(rs.getDate("dataNascimento"));
			contato.setDataNascimento(data);
			// Adicionando Valores a lista
			contatos.add(contato);

		}
		rs.close();
		stmt.close();
		return contatos;

	}

	public void alteracontato(Contato contato) throws DaoException {

		String sql = "update contatos set nome=?, email=?, endereco=?, dataNascimento=? where id =?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.setLong(5, contato.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void remove(Contato contato) throws DaoException {

		try {
			PreparedStatement stmt = connection.prepareStatement("delete from contatos where id=?");
			stmt.setLong(1, contato.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
