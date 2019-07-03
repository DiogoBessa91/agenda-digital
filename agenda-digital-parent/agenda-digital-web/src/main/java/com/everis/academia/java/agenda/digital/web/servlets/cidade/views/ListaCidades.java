package com.everis.academia.java.agenda.digital.web.servlets.cidade.views;

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
	
	public static String format(String original) {
	    if (original == null || original.length() == 0) {
	        return original;
	    }
	    return original.substring(0, 1).toUpperCase() + original.substring(1);
	}
	
	public static void removeCidade(Cidade cidade) {
		cidades.remove(cidade);
	}
	
	

	
	

}