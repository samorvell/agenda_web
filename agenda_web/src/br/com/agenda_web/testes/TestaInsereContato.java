package br.com.agenda_web.testes;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;

import br.com.agenda_web.dao.ContatoDao;
import br.com.agenda_web.modelo.Contato;

public class TestaInsereContato {

	public static void main(String[] args) throws ParseException, SQLException {
		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Pedro Manoel Santana Silva");
		contato.setEmail("pmanoelssilva@yahoo.com.br");
		contato.setEndereco("R. cheia de casas de pato, 100");

		// contato.setDataNascimento(datn);
		// Date datn = (Date)new SimpleDateFormat("YYYY/MM/DD").parse("1985/08/19");
		contato.setDataNascimento(Calendar.getInstance());

		// grave nessa conexão!!!
		ContatoDao dao = new ContatoDao();

		// método elegante
		dao.adiciona(contato);

		System.out.println("Gravado!");

	}

}
