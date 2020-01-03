package br.com.agenda_web.logica;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda_web.dao.ContatoDao;
import br.com.agenda_web.dao.DaoException;
import br.com.agenda_web.modelo.Contato;

@WebServlet("/adicionaContato")
public class AdicionaContatoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// busca o writer
		PrintWriter out = response.getWriter();

		// buscando os parâmetros no request
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		String dataEmTexto = request.getParameter("dataNascimento");
		Calendar dataNascimento = null;
		// fazendo a conversão da data de texto para tipo data
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
		} catch (ParseException e) {
			out.println("Erro de conversão da data");
			return; // para a execução do método
		}

		// monta um objeto contato
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEndereco(endereco);
		contato.setEmail(email);
		contato.setDataNascimento(dataNascimento);

		// salva o contato
		ContatoDao dao = new ContatoDao();

		try {
			dao.adiciona(contato);
		} catch (DaoException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// imprime o nome do contato que foi adicionado
		RequestDispatcher rd = request.getRequestDispatcher("/contato-adicionado.jsp");
		rd.forward(request, response);

	}
}