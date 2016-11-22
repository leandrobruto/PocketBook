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
    </body>
</html>
