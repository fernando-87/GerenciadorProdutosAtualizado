package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import service.ProdutoService;

public class CadastrarProduto implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nomeProduto = request.getParameter("nome");
		String descProduto = request.getParameter("descricao");
		int codigoProduto = Integer.parseInt(request.getParameter("codigo"));
		double valorProduto = Double.parseDouble(request.getParameter("valor"));
		int estoqueProduto = Integer.parseInt(request.getParameter("estoque"));

		Produto produto = new Produto();
		produto.setCodigo(codigoProduto);
		produto.setNome(nomeProduto);
		produto.setDescricao(descProduto);
		produto.setValor(valorProduto);
		produto.setEstoque(estoqueProduto);

		ProdutoService produtoService = new ProdutoService();
		produtoService.cadastrar(produto);

		request.setAttribute("mensagem", "O produto foi cadastrado com sucesso");

		RequestDispatcher view = request.getRequestDispatcher("cadastro.jsp");
		view.forward(request, response);
	}
}
