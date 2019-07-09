<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url>value="/novaEmpresa" var="linkServletNovaEmpresa"</>

<!DOCTYPE html>
	<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--<form action="/gerenciador/novaEmpresa" method="post"> 
	Poderia ser usado desse jeito, porém "gerenciador" é o contexto do projeto e pode ser alterado. Dessa forma não é legal fixar o contexto aqui.
	 -->

	<form action=${linkServletNovaEmpresa } method="post">
		Nome: <input type="text" name="nome"> <input type="submit">
	</form>
</body>
	</html>