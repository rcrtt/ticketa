package com.demo.Ticketa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Ticketa.model.Ticket;
import com.demo.Ticketa.repository.ITicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	ITicketRepository ticketRepository;
	
	@Override
	public Ticket saveTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketRepository.save(ticket);
	}

	@Override
	public Optional<Ticket> getTicket(Integer id) {
		// TODO Auto-generated method stub
		return Optional.of(ticketRepository.getById(id));
	}

	@Override
	public void updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		ticketRepository.save(ticket);
	}

	@Override
	public void deleteTicket(Integer id) {
		// TODO Auto-generated method stub
		ticketRepository.deleteById(id);
	}

	@Override
	public List<Ticket> findAll() {
		// TODO Auto-generated method stub
		return ticketRepository.findAll();
	}

	@Override
	public Optional<Ticket> findById(int id) {
		// TODO Auto-generated method stub
		return ticketRepository.findById(id);
	}

}
