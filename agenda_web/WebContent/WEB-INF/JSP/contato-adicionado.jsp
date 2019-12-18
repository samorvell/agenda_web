<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contato adicionado</title>
</head>
<body>
<c:import url="Cabecalho.jsp" />

<a href="lista-contatos.jsp">Lista contatos</a>

<h2>Contato ${param.nome} adicionado com sucesso</h2>

<c:import url="Rodape.jsp" />
</body>
</html>