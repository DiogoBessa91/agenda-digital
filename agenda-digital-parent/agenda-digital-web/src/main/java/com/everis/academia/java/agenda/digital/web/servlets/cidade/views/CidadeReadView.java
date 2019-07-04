package com.everis.academia.java.agenda.digital.web.servlets.cidade.views;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.entity.Cidade;

@WebServlet(name="CidadeReadView", urlPatterns = "/CidadeReadView")
public class CidadeReadView extends HttpServlet {
	
	ICidadeBusiness business = new CidadeBusiness();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String nome = request.getParameter("nome");
		
		Cidade cidade = new Cidade();
		
		cidade.setNome(nome);
		
		try {
			business.create(cidade);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<p></p><a href=\"CidadeCreateView\">Voltar</a>");
		out.println("<table style=\"background-color: skyblue; box-shadow: 5px 10px #888888; margin-top: 10%; border-radius: 3%\" border=\"5\" align='center' border=\"1\">");
		out.println("<tr><td  style=\"align: center; font-family: cursive\">Lista Cidades</td></tr>");
		out.println("<tr><th>Id</th><th>Nome</th><th>Remover</th><th>Update</th></tr>");
		
		business.sortByName();

		for (Object cidade1 : business.read()) {
			out.println("<td>" + ((Cidade) cidade1).getCodigo() + "</td>");
			out.println("<td>" + ((Cidade) cidade1).getNome() +"</td>");
			out.println("<td style=\"background-color: crimson; box-shadow: 3px 2px #5555; height: 25px; border-radius: 10%\"><a style=\"text-decoration: none; color: black\" href=\"remove?id=" + ((Cidade) cidade1).getCodigo() + "&nome=" + ((Cidade) cidade).getNome() + "\">Remover</a></td>");
			out.println("<td style=\"background-color: darkseagreen; box-shadow: 3px 2px #5555; height: 25px; border-radius: 10%\"><a style=\"text-decoration: none; color: black\" href=\"update?id=" + ((Cidade) cidade1).getCodigo() + "&nome=" + ((Cidade) cidade).getNome() + "\">Update</a></td></tr>");
			
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		

	} 
	
//	catch (Exception e) {
//		throw new ServletException(e);
//	}


}
