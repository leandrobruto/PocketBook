<%-- 
    Document   : cadastroEstabelecimento
    Created on : Nov 21, 2016, 5:21:44 PM
    Author     : nexti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>body {background-color: powderblue;}
            h1{color: black;}
            p{color: black;}
        </style>

    <center>
        <img src="pocketbook-logo.png">
    </center>

</head>
<title>Pocket Book</title>
<body>
    <form method="post" action="<%= request.getContextPath()%>/ControllerServlet?acao=cadastroEstabelecimento">
        <p>Empresa:</p>
        <input id="nEstabelecimento" type="text" name="nomeEstabelecimento" placeholder="Empresa">
        <input id="cnpj" type="text" name="cnpj" placeholder="CNPJ">
        <input id="emailE" type="text" name="emailE" placeholder="Email estabelecimento">
        <input id="cEmailE" type="text" name="cEmailE" placeholder="Confirme Email">
        <input id="telefone" type="tel" name="telefone" placeholder="Telefone">
        <input id="password" type="senha" name="senhaEmpresa" placeholder="Senha">

        <p>Endereço:</p>
        <input id="logradouro" type="text" name="logradouro" placeholder="Logradouro">
        <input id="numero" type="number" name="numero" placeholder="Numero">
        <input id="bairro" type="text" name="bairro" placeholder="Bairro">
        <input id="cep" type="number" name="cep" placeholder="Cep">
        <input id="cidade" type="text" name="cidade" placeholder="Cidade">
        <input id="uf" type="text" name="uf" placeholder="UF">
        <button type="submit" value="login"> Cadastrar</button> 
    </form>
</body>
</html>
