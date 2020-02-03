package br.com.agendaweb.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.agendaweb.dao.ContatoDao;
import br.com.agendaweb.modelo.Contato;

;

public class TestaListaPorParteDoNome {

	public static void main(String[] args) {

		// Criando o contato dao
		ContatoDao dao = new ContatoDao();
		String Nome = "D";
		// listando contatos com DAO
		List<Contato> contatos = dao.getListPartDoNome(Nome);

		for (Contato contato : contatos) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("ID: 		 " + contato.getId());
			System.out.println("Nome: 		 " + contato.getNome());
			System.out.println("Email: 		 " + contato.getEmail());
			System.out.println("Endereço: 	 " + contato.getEndereco());
			System.out
					.println("Data de Nascimento: 		" + sdf.format(contato.getDataNascimento().getTime()) + "\n");
			System.out.println("-----------------------------------");
			// String data = sdf.format(new Date());
			// System.out.println("Data de Nascimento: " + data + "\n");

		}
	}

}
