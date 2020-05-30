<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import= "java.util.ArrayList" %>
<%@ page import= "model.Produto" %>
<%@ page import= "service.ProdutoService" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Produto</title>
</head>
<body>
      
      <h1>Lista dos Produtos</h1>
      
      <%
       ArrayList<Produto> listarProdutos;
       ProdutoService ps = new ProdutoService();
       listarProdutos = ps.listarProdutos();
       
       for (Produto p : listarProdutos) {
    	   
      %>
           
      <br>
      <br>
     
      <table border="1">
            
          <tr>
              <td>Nome</td>
              <td>Valor</td>
              <td>Estoque</td>
              <td>Descrição</td>
              <td>Código</td>

          </tr>
         
         <tr>
           
           <td><input type="text" name="nome" value= '<%=p.getNome() %>'><br></td>
           <td><input type="number" name="valor" value= '<%=p.getValor() %>'><br></td>
           <td><input type="number" name="estoque" value= '<%=p.getEstoque() %>'><br></td>
           <td><input type="text" name="descricao" value= '<%=p.getDescricao() %>'><br></td>
           <td><input type="number" name="codigo" value=<%=p.getCodigo() %>><br></td>
          
         </tr>
         
       </table>
      
       <a href="alterar.jsp?codigo=<%=p.getCodigo()%>">Alterar</a>
       <a href="controller.do?command=ExcluirProduto&codigo=<%=p.getCodigo() %>">Excluir</a>
       <a href="cadastro.jsp">Adicionar um novo</a>
            
       <%}%>
</body>
</html>