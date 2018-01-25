package com.curso.spring.mvc.dto;

public class Cliente extends Usuario{

	private int id;	
	private String login;
	private String passWord;
	private String Nombre;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
