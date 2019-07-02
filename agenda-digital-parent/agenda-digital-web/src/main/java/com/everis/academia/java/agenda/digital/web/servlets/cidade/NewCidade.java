package com.everis.academia.java.agenda.digital.web.servlets.cidade;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.java.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.web.servlets.cidade.CidadeStorage;

@WebServlet(name = "NewCidade", urlPatterns = "/NewCidade")
public class NewCidade extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cidade = request.getParameter("cidade");

		Cidade cidadeNova = CidadeStorage.inserirCidade(cidade);

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<table border=\"1\">");
		out.println("<tr><td align='center' colspan=\"4\">Lista Cidades</td></tr>");
		out.println("<tr><th>Id</th><th>Nome</th><th>Remover</th><th>Update</th></tr>");

		out.println("<tr><td>" + cidadeNova.getCodigo() + "</td>");
		out.println("<td>" + cidadeNova.getNome() + "</td>");
		out.println("<td><a href=\"/agenda-digital-web/RemoverCidade?id=" + cidadeNova.getCodigo() + "&nome="
				+ cidadeNova.getNome() + "\">Remover</a></td>");
		out.println("<td><a href=\"/agenda-digital-web/CreateCidade\">Update</a></td></tr>");

		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
}