<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*,br.com.agenda_web.dao.*,
br.com.agenda_web.modelo.*,
java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Contatos</title>
</head>
<body>
	<table>
		<%
			ContatoDao dao = new ContatoDao();
			List<Contato> contatos = dao.getLista();
			for (Contato contato : contatos) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
				
		%>
		<tr>
				<tr>
					<th>Nome</th>
					<th>E-mail</th>
					<th>Endereço</th>
					<th>Data Nascimento</th>
				</tr>
			<td><%=contato.getNome()%></td>
			<td><%=contato.getEmail()%></td>
			<td><%=contato.getEndereco()%></td>
			<td><%=sdf.format(contato.getDataNascimento().getTime())%></td>
			
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>