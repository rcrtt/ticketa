package com.demo.Ticketa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Ticketa.model.Ticket;

@Repository
public interface ITicketRepository extends JpaRepository<Ticket, Integer>{
	public List<Ticket> findAll();
	Optional<Ticket> findById(int id);
}
