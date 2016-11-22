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
        <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<style>
.mySlides {display:none}
</style>
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
                <div><a href="<%= request.getContextPath()%>/ControllerServlet?acao=perfil">Editar Perfil</a></div>
            </div>
            <br/>
            
            <div class="w3-content" style="max-width:800px">
 <label class="mySlides" src="img_fjords.jpg" style="width:100%">dasddasdasdasdasdasdasdasdasdasd</label>
  <label class="mySlides" src="img_fjords.jpg" style="width:100%">dasddasdasdasdasdasdasda</label>
  <label class="mySlides" src="img_fjords.jpg" style="width:100%">dasddasdasdasdasdasdasdasdasdasd</label>
  <label class="mySlides" src="img_fjords.jpg" style="width:100%">dasddasdasdasdasdasdsd</label>
</div>

<div class="w3-center">
  <div class="w3-section">
    <button class="w3-btn" onclick="plusDivs(-1)">❮ Prev</button>
    <button class="w3-btn" onclick="plusDivs(1)">Next ❯</button>
  </div>
  <button class="w3-btn demo" onclick="currentDiv(1)">1</button> 
  <button class="w3-btn demo" onclick="currentDiv(2)">2</button> 
  <button class="w3-btn demo" onclick="currentDiv(3)">3</button>
</div>

<script>
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function currentDiv(n) {
  showDivs(slideIndex = n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("demo");
  if (n > x.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
     dots[i].className = dots[i].className.replace(" w3-red", "");
  }
  x[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " w3-red";
}
</script>
            
            <div>
                <p>Casdatre seu Estabelecimento:</p>
                <div id="div1">
                    <div class="text"><h2>Seja nosso parceiro. Cadastre seu estabelecimento!</h2></div><br>
                    <div class="text"><a href= " <%= request.getContextPath()%>/ControllerServlet?acao=cadastroEstabelecimento"></div>
                </div>
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
