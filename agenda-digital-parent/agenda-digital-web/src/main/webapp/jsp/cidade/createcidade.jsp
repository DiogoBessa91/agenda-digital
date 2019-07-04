<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/CidadeReadView">

		<table style= "background-color: skyblue; box-shadow: 5px 10px #888888;" margin-top= 50% ; border-radius= 3% ; border= 5 ; align='center'>
			<tr>
				<td style='padding: 8px;' colspan=2 align='center'>Adicionar Cidade</td>
			</tr>
			<tr>
				<td>Nome da Cidade:</td>
				<td><input type="text" name= "nome"/></td>
			</tr>
			<tr>
				<td style= 'padding: 8px;' colspan= 2 ; align= center>
				<input style= "background-color: gold; box-shadow: 3px 2px #5555; height: 25px; border-radius: 10%" type="submit" ; value="Enviar"/>
				<input style= "background-color: gold; box-shadow: 3px 2px #5555; height: 25px;border-radius: 10%" type="reset" ; value= " Limpar"/>
		</table>
	</form>
</body>
</html>