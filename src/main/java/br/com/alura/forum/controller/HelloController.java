package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	
	@RequestMapping("/") /*Coment: O @ utilizado para quando eu for chamar o localhost 8080, vai cair nesse método.*/
	@ResponseBody
	public String hello() {
		return "Hello World!";
	}

}
