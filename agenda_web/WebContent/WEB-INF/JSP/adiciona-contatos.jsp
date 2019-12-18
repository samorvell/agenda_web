<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="agenda"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<!DOCTYPE html>

<html lang="pt">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<meta http-equiv="content-language" content="pt-br" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="author" content="Samuel Amaro Silva" />
<meta name="robots" content="index, follow" />
<meta name="revisit-after" content="3 days" />
<meta name="keywords" content="Ivan Oliveira" />
<meta name="description" content="Ivan Oliveira" />
<meta name="format-detection" content="telephone=no">
<meta name="MobileOptimized" content="320">
<meta name="HandheldFriendly" content="True">
<meta http-equiv="cleartype" content="on">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<title>Adiciona Contatos</title>

<link href="imagens/favicon.ico" type="imagens/ico" rel="shortcut icon" />
<link rel="stylesheet" href="CSS/lojavirtual.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Tangerine">
<script type='text/javascript'
	src='http://code.jquery.com/jquery-latest.js'></script>
<script src="jquery-ui/jquery-ui.js"></script>
<script src="jquery-ui/external/jquery/jquery.js"></script>
<link rel="stylesheet" href="jquery-ui/jquery-ui.css">


</head>
<body>
	<c:import url="Cabecalho.jsp" />
	<div class="squad" id="area" id="formulario">


		<form name="Cadastro" action="adicionaContato" method="post">
			<h2>Cadastro</h2>

			<p class="nome">
				<input type="text" name="nome" placeholder="Informe seu nome"
					required="required">
			</p>
			<p class="endereco">
				<input type="text" name="endereco"
					placeholder="Informe seu endereço" required="required">
			</p>
			<p class="email">
				<input type="email" name="email" placeholder="Informe seu email">
			</p>

			<p>
				<agenda:campoData id="dataNascimento" place="Data Nascimento" />
			</p>

			<p class="enviar">
				<input type="submit" name="enviar" id="send" value="Gravar">
			</p>

		</form>

	</div>



	<c:import url="Rodape.jsp" />
</body>
</html>