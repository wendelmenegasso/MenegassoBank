<html xmlns="http://www.w3.org/1999/xhtml"
xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Cadastro de Cliente</title>
</head>
<body>
<h2>Formulário de Cadastro de Cliente</h2>
<form method="POST" path="/home" action="/addCliente" method="POST">
   <table>
    <tr>
        <td><label path="account">Nome><label></td>
        <td><input path="account" /></td>
    </tr>
    <tr>
        <td><label path="extract">CPF:</forms:label></td>
        <td><input path="extract" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>
<form>
<%out.println("OLA");%>
<a href="/listaClientes">Lista</a>
</body>
</html>