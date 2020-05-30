package service;

import java.util.ArrayList;

import dao.ProdutoDAO;
import model.Produto;

public class ProdutoService {

	ProdutoDAO pDAO = new ProdutoDAO();
	
	public void cadastrar (Produto produto) {
		this.pDAO.cadastrar(produto);
	}
	
	public void alterar (Produto produto) {
		this.pDAO.alterar(produto);
	}
	
	public void excluir (Produto produto) {
		this.pDAO.excluir(produto);
	}
	
	public Produto consultar(int codigo) {
		return this.pDAO.consultar(codigo);
	}
	
	public ArrayList<Produto> listarProdutos() {
		return this.pDAO.listarProdutos();
	}
}
