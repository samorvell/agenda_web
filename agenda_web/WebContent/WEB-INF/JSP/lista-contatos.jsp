<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<table border="1">
		<!-- percorre contatos montando as linhas da tabela -->
		<tr>
			<th>Id list</th>
			<th>Nome</th>
			<th>E-mail</th>
			<th>Endereço</th>
			<th>Data de Nascimento</th>
			<c:forEach var="contato" items="${contatos}" varStatus="id">
		<tr bgcolor="#${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }">
			<td>${id.count}</td>
			<td>${contato.nome}</td>
			<td><c:choose>
					<c:when test="${not empty contato.email}">
						<a href="mailto:${contato.email}">${contato.email}</a>
					</c:when>
					<c:otherwise>
							E-mail não informado
						</c:otherwise>
				</c:choose></td>
			<td>${contato.endereco}</td>
			<td align="center"><strong><fmt:formatDate
						value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy" /></strong></td>
			<td><a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Remover</a>
			</td>
		</tr>
		</c:forEach>




	</table>
	<c:import url="Rodape.jsp" />
</body>
</html>