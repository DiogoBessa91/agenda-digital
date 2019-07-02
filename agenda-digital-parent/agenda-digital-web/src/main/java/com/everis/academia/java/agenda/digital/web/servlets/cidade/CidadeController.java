package com.everis.academia.java.agenda.digital.web.servlets.cidade;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.java.agenda.digital.entity.Cidade;

@WebServlet (name = "CidadeController", urlPatterns = "/CidadeController")
public class CidadeController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private List<Cidade> lista = new ArrayList<>();
	
	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NumberFormatException {

		String nome = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();
		
		switch (nome) {
		
		case ("create"): {
			if ((!lista.contains(new Cidade())) && (!nome.isEmpty()) && (nome != null)) {
				lista.add(new Cidade());
				lista.sort(null);
			}
			getBack(out);
			break;
		}
		case ("read"): {
			out.println("<html>");
			out.println("<body>");
			out.println("<table border=\"1\">");
			out.println("<tr><td>Id</td><td>Nome</td></tr>");

			for (Cidade cidade : lista) {
				out.println("<tr>" + "<td>" + cidade.getNome() + "</td>" + "</tr>");
			}
			out.println("</table>");
			tinyGetBack(out);
			out.println("</body>");
			out.println("</html>");
			
			break;
		}
		case ("update"):{
			if (lista.contains(new Cidade()) && (!nome.isEmpty()) && (nome != null)) {
				int index = lista.indexOf(new Cidade());
				lista.remove(index);
				lista.add(new Cidade());
				lista.sort(null);
			}
			getBack(out);
			break;
		}
		case ("delete"):{
			int index = lista.indexOf(new Cidade());
			if (index != -1)
				lista.remove(index);
			getBack(out);
			break;
		}
		default:{
			out.println("<html>");
			out.println("<body>");
			out.println("Something is wrong");
			tinyGetBack(out);
			out.println("</body>");
			out.println("</html>");
			break;
		}
		}
	}
	
	private void tinyGetBack(PrintWriter out) {
		out.println(System.lineSeparator());
		out.println("<a href=\"http://localhost:8080/agenda-digital-web/FormCidade\"><a>");
	}
	
	private void getBack(PrintWriter out) {
		out.println("<html>");
		out.println("<body>");
		tinyGetBack(out);
		out.println("</body>");
		out.println("</html>");
	}
}