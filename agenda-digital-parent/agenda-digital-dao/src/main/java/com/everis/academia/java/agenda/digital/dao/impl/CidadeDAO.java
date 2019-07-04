package com.everis.academia.java.agenda.digital.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.everis.academia.java.agenda.digital.dao.ICidadeDAO;
import com.everis.academia.java.agenda.digital.entity.Cidade;

public class CidadeDAO implements ICidadeDAO {

	private static final List<Cidade> cidades = new ArrayList<Cidade>();
	
	public static short id = 0;
	
	public CidadeDAO() {
	}

	@Override
	public void create(Cidade cidade) {
		
		id++;
		
		cidade.setCodigo(id);
		
		cidades.add(cidade);
	}

	@Override
	public List<Cidade> read() {
		return cidades;
	}


	@Override
	public void update(Cidade newCidade) {
		cidades.set(cidades.indexOf(newCidade), newCidade);
	}

	@Override
	public Boolean delete(String nome) {
		return cidades.removeIf(c -> c.getNome().equals(nome));
	}

	@Override
	public Boolean contains(String nomeCidade) {
		for (Cidade cidade : cidades) {
			if (cidade.getNome().trim().equals(nomeCidade)) {
				return true;
			}
		}
		return false;
	}

}