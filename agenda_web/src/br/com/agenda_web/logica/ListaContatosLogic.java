package br.com.agenda_web.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda_web.dao.ContatoDao;
import br.com.agenda_web.modelo.Contato;

public class ListaContatosLogic implements Logica{
	
	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		// Monta a lista de contatos
			List<Contato> contatos = new ContatoDao().getLista();
			
			// Guarda a lista no request
			req.setAttribute("contatos", contatos);
			
			return "/WEB-INF/JSP/lista-contatos.jsp";
			}

}
