package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import service.ProdutoService;

public class ExcluirProduto implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
        int codigo = Integer.parseInt(request.getParameter("codigo"));
		
		Produto produto = new Produto();
		produto.setCodigo(codigo);
		
		ProdutoService produtoService = new ProdutoService();
		produtoService.excluir(produto);
		
		request.setAttribute("mensagem", "Excluído com sucesso");
		
		RequestDispatcher view = request.getRequestDispatcher("cadastro.jsp");
		view.forward(request, response);
		
	}

}
