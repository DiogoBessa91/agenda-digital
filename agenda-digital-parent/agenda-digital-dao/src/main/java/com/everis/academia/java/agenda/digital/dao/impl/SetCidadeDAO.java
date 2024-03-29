package com.everis.academia.java.agenda.digital.dao.impl;


import java.util.HashSet;
import java.util.Set;

import com.everis.academia.java.agenda.digital.dao.ICidadeDAO;
import com.everis.academia.java.agenda.digital.entity.Cidade;

public class SetCidadeDAO implements ICidadeDAO {

	private static final Set<Cidade> cidades = new HashSet<Cidade>();

	@Override
	public void create(Cidade cidade) {
		cidades.add(cidade);
	}

	@Override
	public Set<Cidade> read() {
		return cidades;
	}

	@Override
	public void update(Cidade cidade) {
		cidades.forEach(c -> {
			if (c.getNome().equals(cidade.getNome())) {
				cidades.remove(c);
				cidades.add(cidade);
			}
		});

	}

	@Override
	public Boolean delete(String nome) {
		return cidades.removeIf(c -> c.getNome().equals(nome));
	}

	@Override
	public Boolean contains(String nome) {
		for (Cidade c : cidades) {
			if (c.getNome().trim().equals(nome)) {
				return true;
			}
		}
		return false;
	}

}