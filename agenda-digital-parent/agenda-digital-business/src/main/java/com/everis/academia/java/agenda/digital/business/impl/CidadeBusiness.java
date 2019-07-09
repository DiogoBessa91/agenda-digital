package com.everis.academia.java.agenda.digital.business.impl;

import java.util.Collection;

import com.everis.academia.java.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.dao.ICidadeDAO;
import com.everis.academia.java.agenda.digital.dao.impl.CidadeDAO;

public class CidadeBusiness implements ICidadeBusiness {

	private ICidadeDAO cidadeDAO = new CidadeDAO();

	@Override
	public void create(Cidade cidade) throws BusinessException {
		validaNome(cidade.getNome());
		cidadeDAO.create(cidade);
	}

	@Override
	public Collection<Cidade> read() {
		return cidadeDAO.read();
	}

	@Override
	public void update(Cidade cidade) throws BusinessException {
		cidadeDAO.update(cidade);
	}

	

	private void validaNome(String nome) throws BusinessException {
		if (nome == null || nome.trim().isEmpty()) {
			throw new BusinessException("Nome da cidade não pode ser vazio nem nulo!");
		}
		if (cidadeDAO.contains(nome)) {
			throw new BusinessException("Esta cidade já existe!");
		}
	}

	@Override
	public Boolean delete(String nome) throws BusinessException {
		
		return cidadeDAO.delete(nome);
	}

	@Override
	public void sortByName() {
		// TODO Auto-generated method stub
		
	}

	

}