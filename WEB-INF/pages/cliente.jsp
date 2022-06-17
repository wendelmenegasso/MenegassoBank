<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Cadastro de Cliente</title>
</head>
<body>
<h2>Formulário de Cadastro de Cliente</h2>
<forms:form method="POST" path="/home" action="/home/cadastrado/">
   <table>
    <tr>
        <td><forms:label path="account">Nome></forms:label></td>
        <td><forms:input path="account" /></td>
    </tr>
    <tr>
        <td><forms:label path="extract">CPF:</forms:label></td>
        <td><forms:input path="extract" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>
</forms:form>
<%out.println("OLA");%>
<a href="/listaClientes">Lista</a>
</body>
</html>