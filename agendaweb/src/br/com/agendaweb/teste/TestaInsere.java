package br.com.agendaweb.teste;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.agendaweb.dao.ContatoDao;
import br.com.agendaweb.dao.DaoException;
import br.com.agendaweb.modelo.Contato;



public class TestaInsere {

	public static void main(String[] args) throws DaoException, SQLException {

		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Maria Rita Silva");
		contato.setEmail("mrita@yahoo.com.br");
		contato.setEndereco("R. cheia de casas de pato, 6");

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
