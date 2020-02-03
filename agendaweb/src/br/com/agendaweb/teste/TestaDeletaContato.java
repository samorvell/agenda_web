package br.com.agendaweb.teste;

import br.com.agendaweb.dao.ContatoDao;
import br.com.agendaweb.modelo.Contato;

public class TestaDeletaContato {

	public static void main(String[] args) {
			
		// pronto para gravar
				Contato contato = new Contato();
				// long Id = 82;
				contato.setId((long) 82);

				// grave nessa conexão!!!
				ContatoDao dao = new ContatoDao();

				dao.remove(contato);

				System.out.println("Contato removido!");
	}

}
