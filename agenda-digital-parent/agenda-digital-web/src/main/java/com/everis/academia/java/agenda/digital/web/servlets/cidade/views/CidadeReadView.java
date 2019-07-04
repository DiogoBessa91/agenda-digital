package com.everis.academia.java.agenda.digital.web.servlets.cidade.views;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.entity.Cidade;

@WebServlet(name="CidadeReadView", urlPatterns = "/CidadeReadView")
public class CidadeReadView extends HttpServlet {
	
	ICidadeBusiness business = new CidadeBusiness();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<p></p><a href=\"CidadeCreateView\">Voltar</a>");
		out.println("<table style=\"background-color: skyblue; box-shadow: 5px 10px #888888; margin-top: 10%; border-radius: 3%\" border=\"5\" align='center' border=\"1\">");
		out.println("<tr><td  style=\"align: center;\">Lista Cidades</td></tr>");
		out.println("<tr><th>Id</th><th>Nome</th><th>Remover</th><th>Update</th></tr>");
		
		business.sortByName();

		for (Object cidade : ListaCidades.getCidades()) {
			out.println("<tr><td>" + ((Cidade) cidade).getCodigo() + "</td>");			
			out.println("<td>" + ((Cidade) cidade).getNome() + "</td>");
			out.println("<td style=\"background-color: gold; box-shadow: 3px 2px #5555; height: 25px;border-radius: 10%\"><a href=\"remove?id=" + ((Cidade) cidade).getCodigo() + "&nome=" + ((Cidade) cidade).getNome() + "\">Remover</a></td>");
			out.println("<td style=\"background-color: gold; box-shadow: 3px 2px #5555; height: 25px;border-radius: 10%\"><a href=\"update?id=" + ((Cidade) cidade).getCodigo() + "&nome=" + ((Cidade) cidade).getNome() + "\">Update</a></td></tr>");
			
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		

	} 
	
//	catch (Exception e) {
//		throw new ServletException(e);
//	}


}
