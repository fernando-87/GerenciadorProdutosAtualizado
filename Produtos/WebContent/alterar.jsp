<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import= "model.Produto" %>
<%@ page import= "service.ProdutoService" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alterar</title>
</head>
<body>

      <%
      Produto produto = new Produto();
      ProdutoService produtoService = new ProdutoService();
      int codigo = Integer.parseInt(request.getParameter("codigo"));
      produto = produtoService.consultar(codigo);
      %>
      
      <form action="controller.do" method="post">
        <input type="hidden" name="command" value="AlterarProduto">
       
             Nome: <input type="text" name="nome" value= <%=produto.getNome() %>><br><br>
             Valor: <input type="number" name="valor" step="0.1" value= <%=produto.getValor() %>><br><br>
             Estoque: <input type="number" name="estoque" value= <%=produto.getEstoque() %>><br><br>
             Descricao: <input type="text" name="descricao" value= <%=produto.getDescricao() %>><br><br>
             Codigo: <input type="number" name="codigo" value= <%=produto.getCodigo() %>><br><br>
             <input type="submit" value="Alterar">
 
      </form>
</body>
</html>