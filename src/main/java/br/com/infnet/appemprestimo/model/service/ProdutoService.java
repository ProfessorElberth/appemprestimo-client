package br.com.infnet.appemprestimo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.appemprestimo.model.clients.IProdutoClient;
import br.com.infnet.appemprestimo.model.negocio.Produto;

@Service
public class ProdutoService {

	@Autowired private IProdutoClient produtoClient;
	
	public List<Produto> obterLista(){		
		return produtoClient.obterLista();
	}
	
	public void excluir(Integer id) {
		produtoClient.excluir(id);
	}
	
	public Produto obterPorId(Integer id) {
		return produtoClient.obterPorId(id);
	}

	public void incluir(Produto produto) {
		produtoClient.incluir(produto);
	}
}
