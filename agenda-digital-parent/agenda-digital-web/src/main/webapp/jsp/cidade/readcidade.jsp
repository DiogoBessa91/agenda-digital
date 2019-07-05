<%@page import="com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness"%>
<%@page import="com.everis.academia.java.agenda.digital.business.ICidadeBusiness"%>
<%@page import="com.everis.academia.java.agenda.digital.entity.Cidade"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%! ICidadeBusiness business = new CidadeBusiness(); %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table
		style=" margin-top: 10% ; background-color: skyblue; box-shadow: 5px 10px #888888; border-radius: 3%"
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
		<% for (Cidade cidade1 : business.read()) {%>
		<tr>
		<td><%=cidade1.getCodigo()%></td>
		<td><%=cidade1.getNome()%></td>
		<td style="background-color: crimson; box-shadow: 3px 2px #5555; height: 25px; border-radius: 10%">
			<a style="text-decoration: none; color: black" href="remove?id="<%=cidade1.getCodigo()%><%=cidade1.getNome()%>>Remover</a></td>
		
		<td	style="background-color: darkseagreen; box-shadow: 3px 2px #5555; height: 25px; border-radius: 10%">
			<a style="text-decoration: none; color: black" href="update?id="<%=cidade1.getCodigo()%><%=cidade1.getNome()%>>Update</a></td>
		</tr>
        
		<% }%>

	</table>

</body>
</html>