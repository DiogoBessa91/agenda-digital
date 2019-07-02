package com.everis.academia.java.agenda.digital.web.servlets.cidade;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.java.agenda.digital.entity.Cidade;

@WebServlet(name="RemoverCidade", urlPatterns = "/RemoverCidade")
public class RemoverCidade extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		String nome = request.getParameter("nome");
		Cidade got = new Cidade(id, nome);
		if (ListaCidades.getCidades().contains(got))
		ListaCidades.removeCidade(got);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<table border=\"1\">");
		out.println("<tr><td align='center' colspan=\"4\">Lista Cidades</td></tr>");
		out.println("<tr><th>Id</th><th>Nome</th><th>Remover</th><th>Update</th></tr>");
		
		for (Object cidade : ListaCidades.getCidades()) {
			out.println("<tr><td>" + ((Cidade) cidade).getCodigo() + "</td>");			
			out.println("<td>" + ((Cidade) cidade).getNome() + "</td>");
			out.println("<td><a href=\"/agenda-digital-web/RemoverCidade?id=" + ((Cidade) cidade).getCodigo() + "&nome=" + ((Cidade) cidade).getNome() + "\">Remover</a></td>");
			out.println("<td><a href=\"/agenda-digital-web/CreateCidade\">Update</a></td></tr>");
			
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

	

}
