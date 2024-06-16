package com.demo.Ticketa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Ticketa.model.Ticket;
import com.demo.Ticketa.model.Usuarios;


@Repository
public interface IUsuarioRepository extends JpaRepository<Usuarios, Integer> {
	
	Optional<Usuarios> findByUsuario(String usuario);
	public List<Usuarios> findAll();
	
}
