<%-- 
    Document   : Cadastro
    Created on : 08/11/2016, 15:36:54
    Author     : fap1
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
		<center>
		<p><h1>Cadastro</h1></p>
                <br/>
                <form method="post" action="<%= request.getContextPath()%>/ControllerServlet?acao=cadastro">
		<div>
                <label for="nome">Nome:</label>		
                <center><input name="name" type="nome" id="nome" /></center>
		</div>	
                <br/>
                <div>
                    <label for="sobrenome">Sobrenome:</label>
                    <center><input name="sobrenome" type="text" id="sobrenome" /></center>				
		</div>
                <br/>
		<div>
                    <label for="email">E-mail:</label>
                    <center><input name="email" type="email" id="email" /></center>				
		</div>
                <br/>
                <div>
                    <label for="cpf">CPF:</label>
                    <center><input name="cpf" type="text" id="cpf"/></center>				
		</div>
                <br/>
                <div>
                    <label for="telefone">Telefone:</label>
                    <center><input name="telefone" type="tel" id="telafone"/></center>				
		</div>
                <br/>
		<div>
                    <label for="senha">Senha:</label>
                    <center><input name="senha" type="password" id="senha"/></center>				
		</div>
                <br/>
		<div>
                <label for="senha">Confirme a senha:</label>
                <center><input name="confSenha" type="password" id="senha"/></center>
		</div>
                <br/>
		<div class="button">
                    <button type="submit">Cadastrar</button>
		</div>
            </form>
                
                <div>
                
                <div id="publicidades">
                    
                </div>
            </div>
	</center>
    </body>
</html>

