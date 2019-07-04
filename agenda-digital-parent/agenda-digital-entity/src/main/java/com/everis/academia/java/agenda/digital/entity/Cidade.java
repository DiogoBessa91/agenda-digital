package com.everis.academia.java.agenda.digital.entity;

public class Cidade {
	
	
	private int id;
	private Integer codigo;
	private String nome;
	
	public Cidade() {
		
		super();
	}
	
	 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cidade(int id) {
	        this.id = id;
	    }
	 
	public Cidade(Integer codigo) {
		
		this();
		this.codigo = codigo;
	}
	
	public Cidade(Integer codigo, String nome) {
		
		this(codigo);
		this.nome = nome;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public String trim() {
		// TODO Auto-generated method stub
		return null;
	}
}
