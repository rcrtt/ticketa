package com.demo.Ticketa.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.demo.Ticketa.service.TicketService;
import com.demo.Ticketa.service.UsuarioService;


@Controller
@RequestMapping("/")
public class HomeController {
	
	private final org.slf4j.Logger LOGGER=LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UsuarioService usuarioServ;
	
	@Autowired
	private TicketService ticketService;
	
	@GetMapping("/")
	public String home(Model model) {
		
		model.addAttribute("tickets", ticketService.findAll());
		
		return "usuario/home";
	}
	
	@GetMapping("/agregarTicket")
	public String aggTicket(Model model) {
		
		model.addAttribute("usuarios", usuarioServ.findAll());
		return "usuario/agregarticket";
	}
	
}
