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
            <h1>Cadastrar produto:</h1>
            <br/>
		<form method="post" action="<%= request.getContextPath()%>/ControllerServlet?acao=cadastraProduto"> 
                <div>
                    <label for="cod">Cod:</label>
                    <input name="cod" type="text" id="cod" align="right"/>
		</div>		
		<br/>
            <div>
            <label for="nome">Nome:</label>
            <input name="nome" type="text" id="nome" align="right" />				
		</div>
                <br/>
                <div>
                    <label for="valor">Valor:</label>
                    <input name="valor" type="text" id="valor" align="right"/>
		</div>
		<div class="button">
                    <button type="submit">Cadastrar</button>
		</div>
            </form>
                <br/>
                <br/>
                <h1>Nota:</h1>
            <br/>
            <form method="post" action="<%= request.getContextPath()%>/ControllerServlet?acao=gerarNota">
                    <div>
                    <label for="cpfNota">Cliente (Cpf):</label>
                    <input name="cpfNota" type="text" id="cpfNota" align="right"/>
		</div>		
		<br/>
                <div>
                    <label for="codNota">Num Nota:</label>
                    <input name="codNota" type="text" id="codNota" align="right"/>
		</div>
                <br/>
                <div>
                    <label for="codProduto">Cod produto:</label>
                    <input name="codProduto" type="text" id="codProduto" align="right"/>
		</div>
		<br/> 
                <div>
                    <label for="quantidade">Quantidade:</label>
                    <input name="quantidade" type="text" id="quantidade" align="right"/>
		</div>
		<br/> 
                <div class="button">
                    <button type="submit">Adicionar</button>
		</div>
                </form>
                    
    </body>
</html>
