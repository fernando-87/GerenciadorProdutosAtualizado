<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Produto</title>
</head>
<body>

     ${ requestScope.mensagem }
     
   <form action="controller.do" method="post">
     <input type="hidden" name="command" value="CadastrarProduto">
     
     Código: <input type="number" name="codigo"> <br>
     Nome: <input type="text" name="nome"> <br>
     Descrição: <input type="text" name="descricao"> <br>
     Valor: <input type="number" step= "0.1" name="valor"> <br>
     Estoque: <input type="number" name="estoque"> <br>
     <input type="submit">
     </form>

</body>
</html>