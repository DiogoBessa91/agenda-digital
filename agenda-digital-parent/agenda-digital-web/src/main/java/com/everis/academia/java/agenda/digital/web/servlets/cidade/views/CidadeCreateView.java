package com.everis.academia.java.agenda.digital.web.servlets.cidade.views;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (name="CidadeCreateView", urlPatterns="/CidadeCreateView")
public class CidadeCreateView extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
		String msg = request.getParameter("msg");
		if (msg != null) {
			if (msg.equals("null")) {
				msg = "O nome não pode ficar em branco";
				out.println("<h2 align='center'> " + msg + "</h2><p></p>");
			}
			if (msg.equals("contains")) {
				msg = "Essa cidade já existe";
				out.println("<h2 align='center'> " + msg + "</h2><p></p>");	
			}
		}
		


		out.println("<form action=\"CreateController\">");
		out.println("<table style=\"background-color: skyblue; box-shadow: 5px 10px #888888; margin-top: 10%; border-radius: 3%\" border=\"5\" align='center'>");
		out.println("<tr><td style='padding: 8px;'colspan=\"2\" align='center'>Adicionar Cidade</td></tr>");
		out.println("<tr><td>Nome da Cidade:</td><td><input type=\"text\" name=\"nome\"/></td></tr>");
		out.println("<tr><td style='padding: 8px;' colspan=\"2\" align=\"center\">");
		out.println("<input style=\"background-color: gold; box-shadow: 3px 2px #5555; height: 25px; border-radius: 10%\" type=\"submit\" value=\"Enviar\"/>");
		out.println("<input style=\"background-color: gold; box-shadow: 3px 2px #5555; height: 25px;border-radius: 10%\" type=\"reset\" value=\"Limpar\"/>");
	
		
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}
