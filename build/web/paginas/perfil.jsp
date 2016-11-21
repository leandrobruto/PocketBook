<%-- 
    Document   : perfil
    Created on : Nov 20, 2016, 9:38:29 PM
    Author     : nexti
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link type="text/css" rel="stylesheet" href="perfil.css"/>
        <title>PocketBook</title>
        <script>
            function funcao1()
            {
                alert("Cadastrado com sucesso");
            }
        </script>
    </head>
    <body>
        <c:if test="${not empty resposta}">
            <script>funcao1();</script>  
        </c:if>

        <div id="cabeca">
            <center>
                <div class="c"><img src="pocketbook-logo.png"></img></div>
            </center>
            <div class="c"><p>PocketBook</p></div>
            <div class="c"><p>perfil</p></div>
        </div>
        <br/>
        <ul id="nav" >
            <li><a href="#">Home</a></li>
            <li><a href="#">Sobre Nós</a></li>
            <li><a href="#">Portfólio</a>
                <ul>
                    <li><a href="#">sub - 1</a></li>
                    <li><a href="#">sub - 2</a></li>
                    <li><a href="#">sub - 3</a></li>
                </ul>
            </li>
            <li><a href="#">Serviços</a>
                <ul>
                    <li><a href="#">sub - 1</a></li>
                    <li><a href="#">sub - 2</a></li>
                    <li><a href="#">sub - 3</a></li>
                </ul>
            </li>
            <li><a href="#">Blog</a></li>
            <li><a href="#">Contato</a></li>
        </ul>
        <br/>

        <div id="left"> 
            <div style="border-bottom: solid #575757">
                <div><h2>Bem vindo!</h2></div>
                <!--<div><img src="perfil.jpg" width="60%" height="60%" ></div>-->
                <div><h2><%= request.getSession().getAttribute("usuario")%> !</h2></div>
                <br/>
                <div><a href="<%= request.getContextPath()%>/ControlerServlet?acao=perfil">Editar Perfil</a></div>
            </div>
            <br/>
            <div>
                <p>Casdatre seu Estabelecimento:</p>
                <form method="post" action="<%= request.getContextPath()%>/ControlerServlet?acao=cadastrarE">
                    <input id="nEstabelecimento" type="text" name="nomeEstabelecimento" placeholder="Empresa">
                    <input id="cnpj" type="tex" name="cnpj" placeholder="CNPJ">
                    <input id="emailE" type="tex" name="emailE" placeholder="Email estabelecimento">
                    <input id="cEmailE" type="tex" name="cEmailE" placeholder="Confirme Email">
                    <button type="submit" value="login"> Cadastrar</button> 
                </form>
                    <br/>
                <a href="<%= request.getContextPath()%>/LogoutServlet" title="Fazer logout">Sair</a>
            </div>
        </div>
        <div id="right">

        </div>
        <div id="rodape">

        </div>
    </body>
</html>
