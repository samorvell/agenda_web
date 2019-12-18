package br.com.agenda_web.testes;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.agenda_web.dao.ContatoDao;
import br.com.agenda_web.modelo.Contato;

public class TestaListaContato {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao(); // cria o contato

		List<Contato> contatos = dao.getLista(); // lista os contatos com o DAO

		for (Contato contato : contatos) {
			System.out.println("Nome:_____________________" + contato.getNome());
			System.out.println("Email:____________________" + contato.getEmail());
			System.out.println("Endereço:_________________" + contato.getEndereco());
			System.out.println("ID:_______________________" + contato.getId());
			// Calendar data = Calendar.getInstance();
			// System.out.println("Data de Nascimento: " +
			// contato.getDataNascimento().getTime() + "\n"); //forma antiga

			// SimpleDateFormat para formatar o formato da data (dd/MM/yyyy)
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

			// System.out.println("Data de Nascimento: " + contato.getDataNascimento());
			System.out.println("Data de Nascimento:_______" + sdf.format(contato.getDataNascimento().getTime()) + "\n");

			System.out.println("----------------------------------__---------------------------------------");

		}

	}

}