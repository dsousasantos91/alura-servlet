<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<c:url value="/entrada" var="linkEntradaServlet" />    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkEntradaServlet }" method="post">
		Nome: <input type="text" name="nome" value="${empresa.nome }" />
		Data abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy" />"/>
		<input type="hidden" name="id" value="${empresa.id }" />
		<input type="hidden" name="acao" value="AlteraEmpresa" />
		<input type="submit" />
	</form>
</body>
</html>