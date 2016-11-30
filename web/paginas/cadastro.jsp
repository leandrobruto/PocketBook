<%-- 
    Document   : Cadastro
    Created on : 08/11/2016, 15:36:54
    Author     : fap1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>body {background-color: #cccccc;}
            h1{color: black;}
            p{color: black;}
        </style>

    <center>
        <img src="pocketbook-logo.png">
    </center>

</head>
<title>Pocket Book</title>
<body>

    <center><p><h1>Cadastro</h1></p></center>
<form method="post" action="<%= request.getContextPath()%>/ControllerServlet?acao=cadastroUsuario">
    <center>
	   <table>
		    <tr><td><input name="name" type="nome" id="nome" placeholder="Nome"/></td></tr>  
            <tr></tr> <tr></tr> <tr></tr>
            <tr><td><input name="sobrenome" type="text" id="sobrenome" placeholder="Sobrenome"/></td></tr>  
            <tr></tr> <tr></tr> <tr></tr>
            <tr><td><input name="email" type="email" id="email" placeholder="E-mail"/></td></tr>  
            <tr></tr> <tr></tr> <tr></tr>        
            <tr><td><input name="cpf" type="text" id="cpf" placeholder="CPF"/></td></tr>  
            <tr></tr> <tr></tr> <tr></tr>            
            <tr><td><input name="telefone" type="tel" id="telafone" placeholder="Telefone"/></td></tr>  
            <tr></tr> <tr></tr> <tr></tr>            
            <tr><td><input name="senha" type="password" id="senha" placeholder="Senha"/></td></tr>  
            <tr></tr> <tr></tr> <tr></tr>            
            <tr><td><input name="confSenha" type="password" id="senha" placeholder="Confirme a senha"/></td></tr>  
            <tr></tr> <tr></tr> <tr></tr>
	   </table>
    </center>
    
    <div class="button">
        <center><button type="submit">Cadastrar</button></center>
    </div>
</form>

<div>

    <div id="publicidades">

    </div>
</div>
</body>
</html>
