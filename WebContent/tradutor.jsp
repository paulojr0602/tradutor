<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tradutor de palavras</title>
</head>
<body>
	<h3>
		Modo de Tradução:
		<%=session.getAttribute("modo")%></h3>
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">Palavra</th>
		      <th scope="col">Tradução</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr>
		      <td><%=(String)session.getAttribute("palavra")%></td>
		      <td><%=session.getAttribute("traducao")%></td>
		    </tr>
		  </tbody>
		</table>
</body>
</html>