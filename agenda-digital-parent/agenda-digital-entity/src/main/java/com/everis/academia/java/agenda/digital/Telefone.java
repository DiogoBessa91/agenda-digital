package com.everis.academia.java.agenda.digital;

public class Telefone {
	

	private Integer	codigo;
	private Integer	ddd;
	private Integer	numero;

	public Telefone(Integer ddd, Integer numero, Integer codigo) {
		super();
		this.codigo = codigo;
		this.ddd = ddd;
		this.numero = numero;
	}
	

	public Integer getDdd() {
		return ddd;
	}
	
	public void setDdd(Integer ddd) {
	}
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
	}
		
}