package com.everis.academia.java.agenda.digital;

public class TipoServico {
	

	private Integer	codigo;
	private String descricao;

	public TipoServico(String descricao, Integer codigo) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
	}
	
	public String getdescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
	}
		

}
