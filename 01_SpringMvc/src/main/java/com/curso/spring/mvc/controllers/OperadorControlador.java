package com.curso.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.curso.spring.mvc.dto.Cliente;
import com.curso.spring.mvc.services.ClienteServicio;


@Controller
@RequestMapping("/operador")
public class OperadorControlador {

	//@Autowired
	//private ClienteServicio clienteServicio;
	
	@RequestMapping(path="/irAlta", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody public Cliente irAlta(@RequestBody Cliente cliente) {	
		//clienteServicio
		return cliente;		
	}
	
	
	@RequestMapping(path="/alta", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody public Cliente altaCliente(@RequestBody Cliente cliente) {	
		//clienteServicio
		return cliente;		
	}
	
	@RequestMapping(path="/consultaPuntos", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody public Cliente consultaPuntos(@RequestBody Cliente cliente) {
		//clienteServicio 
		return cliente;		
	}
	
	
	
}
