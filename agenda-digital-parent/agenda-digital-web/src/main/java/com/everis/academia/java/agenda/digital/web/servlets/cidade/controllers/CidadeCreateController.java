
package com.everis.academia.java.agenda.digital.web.servlets.cidade.controllers;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.everis.academia.java.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.web.servlets.cidade.views.ListaCidades;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="CreateController", urlPatterns = "/CreateController")
public class CidadeCreateController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PrintWriter writer = response.getWriter();

		
		String nome = request.getParameter("nome");
		
		if (nome == null || nome.trim().isEmpty()) {
			response.sendRedirect("create?msg=null");
			return;
		
			
		}		
		
		Integer id = ListaCidades.getCidades().size() + 1;
		
		for ( Object cidade : ListaCidades.getCidades()) {
			Cidade o = (Cidade) cidade;
			if (o.getCodigo() == id)
				id++;
		}
					
		Cidade cidade = new Cidade(id, ListaCidades.format(nome));
		
		if (ListaCidades.getCidades().contains(cidade)) {
			response.sendRedirect("create?msg=contains");
			return;
		}
		
		ListaCidades.addCidade(cidade);
		
		writer.write("<p>Cidade adicionada!</p> <a href=\"CidadeCreateView\">Voltar</a> <p></p> <a href=\"CidadeReadView\">Lista Cidades</a>");

		
	}
}
