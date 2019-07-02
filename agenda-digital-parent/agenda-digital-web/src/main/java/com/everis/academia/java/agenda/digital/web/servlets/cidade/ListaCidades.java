package com.everis.academia.java.agenda.digital.web.servlets.cidade;

import java.util.ArrayList;
import java.util.List;

import com.everis.academia.java.agenda.digital.entity.Cidade;

public class ListaCidades {

	private static List<Cidade> cidades = new ArrayList<>();
	
	public ListaCidades() {
		super();
	}
	
	public static void addCidade(Cidade cidade) {
		cidades.add(cidade);
	}

	public static List getCidades() {
		return cidades;
	}

	public static void setCidades(List cidades) {
		
	}
	
	public static void removeCidade(Cidade cidade) {
		cidades.remove(cidade);
	}
	
	

	
	

}
