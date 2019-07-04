package com.everis.academia.java.agenda.digital.business;

import java.util.Collection;

import com.everis.academia.java.agenda.digital.entity.Cidade;

public interface ICidadeBusiness {


	void create(Cidade cidade) throws BusinessException;

	Collection<Cidade> read();

	void update(Cidade cidade) throws BusinessException;

	Boolean delete(String nome) throws BusinessException;

	void sortByName();
}
