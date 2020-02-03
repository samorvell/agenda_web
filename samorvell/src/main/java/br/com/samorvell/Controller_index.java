package br.com.samorvell;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller_index {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
