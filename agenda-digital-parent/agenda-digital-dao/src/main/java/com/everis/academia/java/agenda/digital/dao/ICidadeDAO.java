
package com.everis.academia.java.agenda.digital.dao;

import com.everis.academia.java.agenda.digital.entity.Cidade;

import java.util.Collection;

public interface ICidadeDAO {
	
	void create(Cidade cidade);

	Collection<Cidade> read();

	void update(Cidade cidade);

	Boolean delete(String nome);

	Boolean contains(String nome);
}
