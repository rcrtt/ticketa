package com.demo.Ticketa.service;

import java.util.List;
import java.util.Optional;

import com.demo.Ticketa.model.Ticket;
import com.demo.Ticketa.model.Usuarios;



public interface TicketService {
	
	public Ticket saveTicket(Ticket producto);
	public Optional<Ticket> getTicket(Integer id);
	public void updateTicket(Ticket producto);
	public void deleteTicket(Integer id);
	public List<Ticket> findAll();
	Optional<Ticket> findById(int id);
	
}
