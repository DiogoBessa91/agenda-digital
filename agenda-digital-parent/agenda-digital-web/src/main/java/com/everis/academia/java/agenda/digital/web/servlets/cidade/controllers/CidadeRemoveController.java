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

@WebServlet (name="CidadeRemoveController", urlPatterns = "/CidadeRemoveController")


public class CidadeRemoveController extends HttpServlet {

	ICidadeBusiness business = new CidadeBusiness();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			PrintWriter writer = resp.getWriter();

			// Recupera Parametros
			String nome = req.getParameter("nome");
			Integer id = Integer.valueOf(req.getParameter("id"));

			// Cria objecto
			Cidade cidade = new Cidade(id, nome);

			// Faz delete
			business.delete(nome);
			
			// Envia Mensagem
			writer.write(
					"<p>Removeste uma cidade.</p>"
					+ " <a href=\"create\">Voltar</a> <p></p>"
					+ " <a href=\"read\">Lista Cidades</a>");
			
		} catch (Exception e) {
			throw new ServletException(e);
		}

		

	}

}
