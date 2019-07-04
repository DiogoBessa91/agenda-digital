<%@page import="com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness"%>
<%@page import="com.everis.academia.java.agenda.digital.business.ICidadeBusiness"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<% ICidadeBusiness business = new CidadeBusiness(); %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table
		style="background-color: skyblue; box-shadow: 5px 10px #888888; margin-top: 10%; border-radius: 3%"
		border="5" align='center' border=1">
		<tr>
			<td style="align: center; font-family: cursive">Lista Cidades</td>
		</tr>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Remover</th>
			<th>Update</th>
		</tr>
		
		<% business.sortByName();%>
		<% for (Object cidade1 : business.read()) {%>
		<td><%  + ((Cidade) cidade1).getCodigo() + %></td>
		<td><%  + ((Cidade) cidade1).getNome() + %></td>
		<td
			style="background-color: crimson; box-shadow: 3px 2px #5555; height: 25px; border-radius: 10%">
			<a style="text-decoration: none; color: black" href="<%remove?id="
			+ ((Cidade)
			cidade1).getCodigo() + nome= ((Cidade) cidade).getNome() %>>Remover</a></td>
		<td
			style="background-color: darkseagreen; box-shadow: 3px 2px #5555; height: 25px; border-radius: 10%">
			<a style="text-decoration: none; color: black" href="<%update?id="
			+ ((Cidade)
			cidade1).getCodigo() + nome= ((Cidade) cidade).getNome()  %>>Update</a></td>
		</tr>
        
		}

	</table>

</body>
</html>