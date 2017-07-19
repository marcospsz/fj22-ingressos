package br.com.caelum.ingresso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SessaoController {
	
	@GetMapping("/admin/sessao")
	public ModelAndView form(@RequestParam("salaid") Integer salaid){
		
		ModelAndView modelAndView  = new ModelAndView("admin/sessao");
		
		return modelAndView;
		
	}	

}
