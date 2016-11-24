<%-- 
    Document   : perfilEstabelecimento
    Created on : Nov 22, 2016, 4:27:18 PM
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
    <br/>   
    <div style="border-bottom: solid #575757"></div>
                <div><h2>Bem vindo, <font style="text-transform: capitalize"><%= request.getSession().getAttribute("empresa")%> !</font></h2></div>
               
                <div style="border-bottom: solid #575757"></div>
                <!--<div><a href="<%= request.getContextPath()%>/ControllerServlet?acao=perfil">Editar Perfil</a></div>-->
            
    <p>Cadastrar produto:</p>
    
    <form method="post" action="<%= request.getContextPath()%>/ControllerServlet?acao=cadastraProduto"> 
        <div>
            <input name="cod" type="text" id="cod" placeholder="Cod" align="right"/>
        </div>		
        <br/>
        <div>
            <input name="descricao" type="text" id="descricao" placeholder="Descrição" align="right" />				
        </div>
        <br/>
        <div>
            <input name="valor" type="text" id="valor" placeholder="valor" align="right"/>
        </div>
        <br/>
        <div class="button">
            <button type="submit">Cadastrar</button>
        </div>
    </form>
        
    <br/>
    <p>Nota:</p>
    
    <form method="post" action="<%= request.getContextPath()%>/ControllerServlet?acao=gerarNota">
        <div>
            <input name="cpfNota" type="text" id="cpfNota" placeholder="Cpf" align="right"/>
        </div>		
        <br/>
        <div>
            <input name="codNota" type="text" id="codNota" placeholder="Numero da nota" align="right"/>
        </div>
        <br/>
        <div>
            <input name="codProduto" type="text" id="codProduto" placeholder="Cod do produto" align="right"/>
        </div>
        <br/> 
        <div>
            <input name="quantidade" type="text" id="quantidade" placeholder="Quantidade" align="right"/>
        </div>
        <br/> 
        <div class="button">
            <button type="submit">Adicionar</button>
        </div>
    </form>

</body>
</html>
