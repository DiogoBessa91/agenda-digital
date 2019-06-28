package com.everis.academia.java.agenda.digital;

public class PrestadorServico {

	
			private Integer codigo;
			private String nome;
			private String bairro;
			private String cep;
			private String logradouro;
			private String complemento;
			private String numero;
			private String email;

			public PrestadorServico(String nome, Integer codigo, String bairro, String logradouro, String complemento, String numero, String email, String cep) {
				super();
				this.nome = nome;
				this.codigo = codigo;
				this.bairro = bairro;
				this.cep = cep;
				this.logradouro = logradouro;
				this.complemento = complemento;
				this.numero = numero;
				this.email = email;
			}

}
