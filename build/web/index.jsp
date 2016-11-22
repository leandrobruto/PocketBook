<%-- 
    Document   : index
    Created on : 25/10/2016, 15:45:00
    Author     : fap1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>body {background-color: powderblue;}
			h1{color: black;}
			p{color: black;}
		</style>

		<center>
			<img src="pocketbook-logo.png">
		</center>

        <title>Pocket Book</title>
    </head>
    <body>
        <center>
	<p>
	</p>
        <form method="post" action="<%= request.getContextPath()%>/ControllerServlet?acao=login">
		<div>
                    <label for="email">E-mail:</label>
                    <input name="email" type="email" id="email" align="right"/>
		</div>		
		<p>
		</p>
	<div>
            <label for="senha">Senha:</label>
            <input name="senha" type="password" id="senha" align="right" />				
		</div>
                <br/>
		<div class="button">
                    <button type="submit">Login</button>
		</div>
            </form>
		<p>Cadastre-se agora!</p>
                    <div>
			<a href="cadastro.jsp" target="_blank">Cadastrar</a>
                    </div>
		</center>
    </body>
</html>
