
package com.everis.academia.java.agenda.digital.web.servlets.cidade.controllers;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.java.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.web.servlets.cidade.views.ListaCidades;

@WebServlet(name="CidadeUpdateController", urlPatterns = "/CidadeUpdateController")
public class CidadeUpdateController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PrintWriter writer = response.getWriter();
		
		String nome ="";
		String id = "";
		
		if (request.getParameter("nome")!= null) {
			nome = request.getParameter("nome");
			id = request.getParameter("id");
		}
			

		if (nome == null || nome.trim().isEmpty()) {		
			response.sendRedirect("update?msg=null&id="+id);
			return;
	
		} 
		
		if (ListaCidades.getCidades().contains(new Cidade(1, nome))) {	
			response.sendRedirect("update?msg=contains&id="+id);
			return;
	
		}
		
		for ( Object cidade : ListaCidades.getCidades()) {
			Cidade o = (Cidade) cidade;
			if (o.getCodigo() == Integer.valueOf(id)) {
				o.setNome(ListaCidades.format(nome));
			}
		}
		
		writer.write("<p>Cidade alterada!</p> <a href=\"CidadeReadView\">Voltar</a>");
		
		
		
		
		
	}
}
