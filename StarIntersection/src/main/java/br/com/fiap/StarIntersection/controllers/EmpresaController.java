package br.com.fiap.StarIntersection.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.fiap.StarIntersection.repository.EmpresaRepository;

@Controller
public class EmpresaController {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
}
