package br.com.agendaweb.teste;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.agendaweb.dao.ContatoDao;
import br.com.agendaweb.modelo.Contato;

public class TestaPesquisaPorId {

	public static void main(String[] args) throws SQLException {

		// Criando o contato dao
		ContatoDao dao = new ContatoDao();
		long Id = 81;
		// listando contatos com DAO
		List<Contato> contatos = dao.PesquisaPorId(Id);
		for (Contato contato : contatos) {
			// contato.setNome("T");
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereco: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + sdf.format(contato.getDataNascimento().getTime()) + "\n");

		}

	}
}