package com.curso.spring.mvc.dto;

public class Operador extends Usuario{

	private int id;	
	private String cif;
	private String webPage;
	private Producto producto;
	private String factorConversion;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getWebPage() {
		return webPage;
	}

	public void setWebPage(String webPage) {
		this.webPage = webPage;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getFactorConversion() {
		return factorConversion;
	}

	public void setFactorConversion(String factorConversion) {
		this.factorConversion = factorConversion;
	}

	public Operador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
