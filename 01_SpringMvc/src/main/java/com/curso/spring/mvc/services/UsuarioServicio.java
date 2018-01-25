package com.curso.spring.mvc.services;

import org.springframework.stereotype.Service;

import com.curso.spring.mvc.dto.Usuario;

@Service
public interface UsuarioServicio {	
		public Usuario login(Usuario usuario);
}
