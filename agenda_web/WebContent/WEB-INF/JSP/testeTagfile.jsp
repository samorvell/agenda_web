<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<link href="imagens/favicon.ico" type="imagens/ico" rel="shortcut icon" />
<!--<link rel="stylesheet" href="CSS/lojavirtual.css">-->
<meta charset="ISO-8859-1">
<title>Lista Contatos</title>

</head>
<body>
	<c:import url="Cabecalho.jsp" />
	<jsp:useBean id="dao" class="br.com.agenda_web.dao.ContatoDao" />

	<display:table name="listcontato">
		<display:column property="id" title="ID" />
	
	</display:table>
	






	<c:import url="Rodape.jsp" />
</body>
</html>