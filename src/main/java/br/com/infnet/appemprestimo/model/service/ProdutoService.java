package br.com.infnet.appemprestimo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.appemprestimo.model.clients.IProdutoClient;
import br.com.infnet.appemprestimo.model.negocio.Produto;
import br.com.infnet.appemprestimo.model.repository.IProdutoRepository;

@Service
public class ProdutoService {

	@Autowired private IProdutoRepository produtoRepository;
	@Autowired private IProdutoClient produtoClient;
	
	public List<Produto> obterLista(){
		
		return produtoClient.obterLista();
	}
	
	public void excluir(Integer id) {
		produtoRepository.deleteById(id);
	}
}
