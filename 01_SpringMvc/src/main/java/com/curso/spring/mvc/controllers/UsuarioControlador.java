package com.curso.spring.mvc.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.curso.spring.mvc.dto.Usuario;
import com.curso.spring.mvc.services.UsuarioServicio;


@Controller
public class UsuarioControlador {

	//@Autowired
	//private UsuarioServicio usuarioServicio;
	
	@ModelAttribute("usuario")
	public Usuario usuario() {
		return new Usuario();
	}
	
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String iniciarFormulario(Map<String, Object> model) {
		return "login";
	}
	
	@RequestMapping(path = "/comprobarlogin", method = RequestMethod.POST)
	public String procesarFormulario(@ModelAttribute Usuario usuario, Errors errors) {	
		//usuarioServicio.login(usuario);		
		return "altaUsuario";
	}

}
