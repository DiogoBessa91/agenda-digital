
package com.everis.academia.java.agenda.digital.dao;

import com.everis.academia.java.agenda.digital.entity.Cidade;

import java.util.Collection;

public interface ICidadeDAO {

	Boolean create(Cidade cidade);

	Collection<Cidade> read();

	Boolean update(Cidade cidade);

	Boolean delete(Cidade cidade);
}
