<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP java server pages</title>
</head>
<body>
	<%-- coment�rio em JSP aqui: nossa primeira p�gina JSP --%>
	<%
		String mensagem = "Bem vindo ao sistema de web_agenda!";
	%>
	<%
		out.println(mensagem);
	%>
	<br />
	<%
		String desenvolvido = "Desenvolvido por (Samuel Silva)";
	%>
	<h2>
	<%=desenvolvido%>
	</h2>
	<br />
	<%
		System.out.println("Tudo foi executado!");
	%>
	

</body>
</html>