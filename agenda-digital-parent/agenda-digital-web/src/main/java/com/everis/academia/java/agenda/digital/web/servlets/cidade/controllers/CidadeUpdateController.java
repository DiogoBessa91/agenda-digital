
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
import com.everis.academia.java.agenda.digital.web.servlets.cidade.views.ListaCidades;

@WebServlet(name="CidadeUpdateController", urlPatterns = "/CidadeUpdateController")
public class CidadeUpdateController extends HttpServlet {
	
	ICidadeBusiness business = new CidadeBusiness();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		try {
			
			// Busca parametros
			String nome = request.getParameter("nome");
			Integer id = Integer.valueOf(request.getParameter("id"));
		
			// Cria cidade e chama update
			Cidade cidade = new Cidade(id, nome);
			business.update(cidade);
		
			// Imprime sucesso
			PrintWriter writer = response.getWriter();
			writer.write("<p>Cidade alterada com sucesso.</p> "
					+ "<a href=\"create\">Voltar</a> <p></p>"
					+ " <a href=\"read\">Ver Tabela</a>");
			
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		
		
		
	}
}