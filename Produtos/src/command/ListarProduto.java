package command;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import service.ProdutoService;

public class ListarProduto implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        ProdutoService produtoService = new ProdutoService();
        
        ArrayList<Produto>listarProdutos = null;
        
        listarProdutos = produtoService.listarProdutos();
        
        response.setContentType("text/html");
		
		PrintWriter saida = response.getWriter();
		
		saida.println("<html>");
		saida.println("<body>");
		saida.println("<table>");
		
		listarProdutos.forEach(
				p -> {
					saida.println("<tr>");
					saida.println("<td>");
					saida.println("Nome do produto:");
					saida.println("</td>");
					saida.println("<td>");
					saida.println(p.getNome());
					saida.println("</td>");
					saida.println("<td>");
					saida.println("Descricao:");
					saida.println("</td>");
					saida.println("<td>");
					saida.println(p.getDescricao());
					saida.println("</td>");
					saida.println("<td>");
					saida.println("Estoque:");
					saida.println("</td>");
					saida.println("<td>");
					saida.println(p.getEstoque());
					saida.println("</td>");
					saida.println("<td>");
					saida.println("Valor:");
					saida.println("</td>");
					saida.println("<td>");
					saida.println(p.getValor());
					saida.println("</td>");
					saida.println("<td>");
					saida.println("Codigo:");
					saida.println("</td>");
					saida.println("<td>");
					saida.println(p.getCodigo());
					saida.println("</td>");
				}
			);
          
		    saida.println("</table>");
		    RequestDispatcher view = request.getRequestDispatcher("listarProduto.jsp");
			view.forward(request, response);
	}
}
