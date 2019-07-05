
package com.everis.academia.java.agenda.digital.web.servlets.cidade.controllers;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.entity.Cidade;

@WebServlet(name="CreateController", urlPatterns = "/CreateController")
public class CidadeCreateController extends HttpServlet {

	private ICidadeBusiness business = new CidadeBusiness();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			// Recupera Parametros
			String nome = request.getParameter("nome");

			// Cria Cidade
			Cidade cidade = new Cidade();
			cidade.setNome(nome);

			// Adiciona Cidade
			business.create(cidade);

			// Imprime sucesso
			PrintWriter writer = response.getWriter();
			writer.write("<p>Cidade adicionada com sucesso.</p>" + " <a href=\"create\">Voltar</a> <p></p>"
					+ " <a href=\"read\">Ver Tabela</a>");

		} catch (Exception e) {
			throw new ServletException(e);
		}

	}
}