<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="java.util.List,br.com.alura.gerenciador.model.Empresa" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	Usuario Logado: ${usuarioLogado.login }

	<br>
	<br>
	<br>

	<c:if test="${not empty empresa }">
		Empresa ${ empresa } cadastrada com sucesso!
	</c:if>
	
	<br />
	<br />

	Lista de empresas: <br />
	
	<ul>
		<c:forEach items="${empresas }" var="empresa">
			<li>
				${empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy" />
				<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id }">editar</a>
				<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id }">remover</a>
			</li>		
		</c:forEach>
	</ul>
	
	<!-- <ul>
	<% 
		List<Empresa> lista = (List<Empresa>) request.getAttribute("empresas");
		for (Empresa empresa : lista) { 
	%>
		
		<li> <%= empresa.getNome() %> </li>
	<% 
		} 
	%>
	</ul> -->		
</body>
</html>