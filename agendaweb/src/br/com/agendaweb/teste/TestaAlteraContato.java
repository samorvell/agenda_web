package br.com.agendaweb.teste;

import java.util.Calendar;

import br.com.agendaweb.dao.ContatoDao;
import br.com.agendaweb.modelo.Contato;

public class TestaAlteraContato {

	public static void main(String[] args) {

		// pronto para gravar
		Contato contato = new Contato();
		// long Id = 82;
		contato.setId((long) 82);
		contato.setNome("Sandra Regina de Melo Silva");
		contato.setEmail("sandrareginamelo@yahoo.com.br");
		contato.setEndereco("R. Canuto Luiz do Nascimento, N° 433");

		// contato.setDataNascimento(datn);
		// Date datn = (Date)new SimpleDateFormat("YYYY/MM/DD").parse("1985/08/19");
		contato.setDataNascimento(Calendar.getInstance());

		// grave nessa conexão!!!
		ContatoDao dao = new ContatoDao();

		dao.alteracontato(contato);

		System.out.println("Atualizado!");

	}

}
