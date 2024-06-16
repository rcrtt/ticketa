package com.demo.Ticketa.controller;

import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.Ticketa.model.Ticket;
import com.demo.Ticketa.service.TicketService;
import com.demo.Ticketa.service.UsuarioService;

;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private final org.slf4j.Logger LOGGER=LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private UsuarioService usuarioServ;
	
	@Autowired
	private TicketService ticketService;
	
	@GetMapping("/")
	public String home(Model model) {
		
		model.addAttribute("tickets", ticketService.findAll());
		
		return "administrador/home";
	}
	
	@GetMapping("/usuarios")
	public String usuarios(Model model) {
		
		model.addAttribute("usuarios", usuarioServ.findAll());
		return "administrador/usuarios";
	}
	
	@GetMapping("/detalle/{id}")
	public String detalle(Model model, @PathVariable Integer id) {
		//Orden orden=ordenesService.findByid(id).get();
		
		
		
		model.addAttribute("detalles", ticketService.findById(id));
		
		
		return "administrador/detalleorden";
	}
	
}
