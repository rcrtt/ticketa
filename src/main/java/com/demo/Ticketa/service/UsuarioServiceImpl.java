package com.demo.Ticketa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Ticketa.model.Usuarios;
import com.demo.Ticketa.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@Override
	public Optional<Usuarios> findById(Integer id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id);
	}

	@Override
	public List<Usuarios> findAll() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	@Override
	public Usuarios save(Usuarios usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(usuario);
	}

	@Override
	public Optional<Usuarios> findByUsuario(String usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.findByUsuario(usuario);
	}

}
