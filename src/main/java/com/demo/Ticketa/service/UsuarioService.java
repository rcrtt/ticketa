package com.demo.Ticketa.service;

import java.util.List;
import java.util.Optional;

import com.demo.Ticketa.model.Usuarios;


public interface UsuarioService {
	Optional<Usuarios> findById(Integer id);
	List<Usuarios> findAll();
	Usuarios save(Usuarios usuario);
	Optional<Usuarios> findByUsuario(String usuario);
}
