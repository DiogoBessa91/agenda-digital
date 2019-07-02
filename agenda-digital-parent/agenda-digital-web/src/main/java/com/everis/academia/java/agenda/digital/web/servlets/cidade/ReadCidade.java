package com.everis.academia.java.agenda.digital.web.servlets.cidade;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.everis.academia.java.agenda.digital.entity.Cidade;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ReadCidade", urlPatterns = "/ReadCidade")
public class ReadCidade extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Integer id = 0;
		String nome = "";
		try {
			id = Integer.valueOf(request.getParameter("id"));
			nome = request.getParameter("nome");	
		} catch (Exception e) {
			
		}
		try {
			nome = request.getParameter("id");
			id = Integer.valueOf(request.getParameter("nome"));
		} catch (Exception e ){
			PrintWriter out = response.getWriter();
			out.println("<html><a href=\"/agenda-digital-web/CreateCidade\">Voltar</a></html>");
			
		}
		
				
		if (id != 0 && !nome.equals("")) {
			Cidade got = new Cidade(id, nome);
			if (!ListaCidades.getCidades().contains(got))
				ListaCidades.addCidade(got);
			Collections.sort(ListaCidades.getCidades());
			}
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<table style=\"background-color: skyblue; box-shadow: 5px 10px #888888; margin-top: 10%; border-radius: 3%\" align='center' border=\"5\">");
		out.println("<tr><td align='center' colspan=\"4\">Lista Cidades</td></tr>");
		out.println("<tr><th>Id</th><th>Nome</th></tr>");
		
		for (Object cidade : ListaCidades.getCidades()) {
			out.println("<tr><td>" + ((Cidade) cidade).getCodigo() + "</td>");			
			out.println("<td>" + ((Cidade) cidade).getNome() + "</td>");
			out.println("<td><button style=\"background-color: crimson; box-shadow: 3px 2px #5555; height: 25px; border-radius: 10%\" href=\"/agenda-digital-web/RemoverCidade?id=" + ((Cidade) cidade).getCodigo() + "&nome=" + ((Cidade) cidade).getNome() + "\">Remover</a></td>");
			out.println("<td><button style=\"background-color: greenyellow; box-shadow: 3px 2px #5555; height: 25px; border-radius: 10%\" href=\"/agenda-digital-web/CreateCidade\">Update</a></td></tr>");
			
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
