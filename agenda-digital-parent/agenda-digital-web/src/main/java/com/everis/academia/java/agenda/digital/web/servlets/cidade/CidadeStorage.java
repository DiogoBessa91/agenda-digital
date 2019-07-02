package com.everis.academia.java.agenda.digital.web.servlets.cidade;


import java.util.HashSet;
import java.util.Set;

import com.everis.academia.java.agenda.digital.entity.Cidade;

public class CidadeStorage {
	
	private static Set<Cidade> cidades = new HashSet<>();

	static {
		cidades.add(new Cidade(1,"Lisboa"));
		cidades.add(new Cidade(2, "Porto"));
	}
	
	
	public static Set<Cidade> getCidades() {
		return cidades;
	}

	
	public static Cidade inserirCidade(String cidade) {
		Integer codigo = cidades.size() + 1;
		cidades.add(new Cidade(codigo, cidade));
		
		Cidade cidadeNova = new Cidade(codigo, cidade);
		
		return cidadeNova;
	}
	
	public static void UpdateCidade(Integer codigo, String cidade) {
		
		for (Cidade cidadeActual : cidades) {
			
			if (cidadeActual.getCodigo() == codigo) {
				
				cidadeActual.setNome(cidade);
			}
		}
	}
	
	public static void RemoverCidade(String cidade) {
		
		for (Cidade cidadeActual : cidades) {
			
			if (cidadeActual.getNome().equals(cidade)) {
				
				cidades.remove(cidadeActual);
			}
		}
	}
}