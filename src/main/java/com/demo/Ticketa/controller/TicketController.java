package com.demo.Ticketa.controller;

import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.Ticketa.model.Ticket;
import com.demo.Ticketa.model.Usuarios;
import com.demo.Ticketa.service.TicketService;
import com.demo.Ticketa.service.UsuarioService;


@Controller
@RequestMapping("/ticket")
public class TicketController {
	
	private final org.slf4j.Logger LOGGER=LoggerFactory.getLogger(TicketController.class);
	
	@Autowired
	private UsuarioService usuarioServ;
	
	@Autowired
	private TicketService ticketServ;

	
	@PostMapping("/save")
	public String saveTicket(@RequestParam("solicitante") String solicitante, @RequestParam("solicitante") String encargado,
			@RequestParam("solicitante") String supervisor, Ticket ticket, Model model) {
		
		Usuarios u=new Usuarios();
		
		ticket.setId_supervisor(Integer.parseInt(supervisor));
		ticket.setId_solicitante(Integer.parseInt(solicitante));
		ticket.setId_encargado(Integer.parseInt(encargado));
		//ticket.setCreador(u.getId());
		//LOGGER.info("creaodr: {}", ticket.setCreador(u.getId()));
		
		
		LOGGER.info("Sesion del usuario: {}", u.getId());
		
		ticketServ.saveTicket(ticket);
		
		
		return "redirect:/";
	}
	
	@GetMapping("detalleTicket/{id}")
	public String productohome(@PathVariable Integer id, Model model) {
		
		
		Ticket ticket=new Ticket();
		Optional<Ticket> optionalTicket=ticketServ.getTicket(id);
		ticket=optionalTicket.get();
		
		Usuarios usuarios=new Usuarios();
		Optional<Usuarios> optionalSolicitante=usuarioServ.findById(ticket.getId_solicitante());
		usuarios=optionalSolicitante.get();
		
		Usuarios usuarioe=new Usuarios();
		Optional<Usuarios> optionalEncargado=usuarioServ.findById(ticket.getId_encargado());
		usuarioe=optionalEncargado.get();
		
		Usuarios usuarioSup=new Usuarios();
		Optional<Usuarios> optionalSup=usuarioServ.findById(ticket.getId_supervisor());
		usuarioSup=optionalSup.get();
		
		Usuarios usuarioCreador=new Usuarios();
		Optional<Usuarios> optionalCreador=usuarioServ.findById(ticket.getCreador());
		usuarioCreador=optionalCreador.get();
		
		
		
		model.addAttribute("ticket", ticket);
		model.addAttribute("solicitante", usuarios.getUsuario());
		model.addAttribute("encargado", usuarioe.getUsuario());
		model.addAttribute("supervisor", usuarioSup.getUsuario());
		model.addAttribute("creador", usuarioCreador.getUsuario());
		
		return "usuario/detalleTicket";
	}
}
