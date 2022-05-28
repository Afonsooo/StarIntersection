package br.com.fiap.StarIntersection.controllers;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.StarIntersection.model.Pedido;
import br.com.fiap.StarIntersection.model.Produto;
import br.com.fiap.StarIntersection.repository.PedidoRepository;

@Controller
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/pedidos")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("pedidos/index");			

		List<Pedido> produtoDaRepository = pedidoRepository.findAll();
		modelView.addObject("listarPedidos", produtoDaRepository);

		return modelView;
	}
	
	
}
