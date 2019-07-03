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

@WebServlet (name="CidadeRemoveController", urlPatterns = "/CidadeRemoveController")

public class CidadeRemoveController extends HttpServlet {
	
	@Override
	protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		PrintWriter writer = resp.getWriter();
		
		String nome = req.getParameter("nome");
		Integer id = Integer.valueOf(req.getParameter("id"));
		
		Cidade cidade = new Cidade(id, nome);
		ListaCidades.removeCidade(cidade);
		

		writer.write("<p>Cidade removida!</p> <a href=\"CidadeReadView\">Voltar</a>");
		
	}

	

}
