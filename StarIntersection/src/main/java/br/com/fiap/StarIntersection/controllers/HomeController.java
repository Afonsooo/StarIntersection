package br.com.fiap.StarIntersection.controllers;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.fiap.StarIntersection.repository.EmpresaRepository;

@Controller
public class HomeController {

	
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		request.setAttribute("nomeUsuario", "Gabriel Afonso");
		
		return "home";
	}
	
	@GetMapping("/sobre")
	public String sobre(HttpServletRequest request) {
		
		
		return "/sobre/index";
	}
	
}
