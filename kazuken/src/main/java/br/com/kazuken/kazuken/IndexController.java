package br.com.kazuken.kazuken;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
		
	}
	
	@RequestMapping("/paginaconstrucao")
	public String pagina_construcao() {
		return "pagina_construcao";
	}

	@RequestMapping("/inaugura")
	public String pagina_inauguracao() {
		return "inauguracao";
	}
	
}
