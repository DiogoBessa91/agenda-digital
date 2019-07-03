package com.everis.academia.java.agenda.digital.web.servlets.cidade.views;

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

@WebServlet(name="CidadeUpdateView", urlPatterns = "/CidadeUpdateView")
public class CidadeUpdateView extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
	
		String nome ="";
		String id = request.getParameter("id");
	
		if (request.getParameter("nome")!= null) {
			nome = request.getParameter("nome");
		}
	
		String msg = request.getParameter("msg");
	
		out.println("<html>");
		out.println("<body>");
	
		if (msg != null) {
			if (msg.equals("contains")) {
				msg = "Esta cidade já existe";
				out.println("<h2 align='center'> " + msg + "</h2><p></p>");
			}
		
			if (msg.equals("null")) {
				msg = "O nome não pode ficar em branco";
				out.println("<h2 align='center'> " + msg + "</h2><p></p>");
			}		
		}

		out.println("<form action=\"UpdateController\">");
		out.println("<table border=\"2\" align='center'>");
		out.println("<tr><td colspan=\"2\" align='center'>Update "+ nome +"</td></tr>");
		out.println("<tr><td>Id:</td><td><input type=\"hidden\" value="+id+" name=\"id\"/>"+id+"</td></tr>");
		out.println("<tr><td>Nome da Cidade:</td><td><input type=\"text\" name=\"nome\"/></td></tr>");
		out.println("<tr><td colspan=\"2\" align=\"center\">");
	
		out.println("<input type=\"submit\" value=\"Update\"/>");
		out.println("<input type=\"reset\" value=\"Limpar\"/>");
	
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	
	}
}
