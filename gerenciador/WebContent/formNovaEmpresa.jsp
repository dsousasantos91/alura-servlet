<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<c:url value="/novaEmpresa" var="linkNovaEmpresa" />    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkNovaEmpresa }" method="post">
		Nome: <input type="text" name="nome" />
		Data abertura: <input type="text" name="data" />
		<input type="submit" />
	</form>
</body>
</html>