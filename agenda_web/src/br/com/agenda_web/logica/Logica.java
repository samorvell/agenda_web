package br.com.agenda_web.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {
	
	String executa (HttpServletRequest req, HttpServletResponse resp) throws Exception;
}
