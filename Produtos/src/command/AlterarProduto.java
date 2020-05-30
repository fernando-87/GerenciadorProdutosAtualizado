package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import service.ProdutoService;


public class AlterarProduto implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    			
		    Produto produto = new Produto();
			produto.setCodigo(Integer.parseInt(request.getParameter("codigo")));
			produto.setDescricao(request.getParameter("descricao"));
			produto.setNome(request.getParameter("nome"));
			produto.setValor(Double.parseDouble(request.getParameter("valor")));
			produto.setEstoque(Integer.parseInt(request.getParameter("estoque")));
				
			ProdutoService produtoService = new ProdutoService();
			produtoService.alterar(produto);
				
			request.setAttribute("mensagem", "Alterado com sucesso");
				
			RequestDispatcher view = request.getRequestDispatcher("cadastro.jsp");
			view.forward(request, response);
			}

}
