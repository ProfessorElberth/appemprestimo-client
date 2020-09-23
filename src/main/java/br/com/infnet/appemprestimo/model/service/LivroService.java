package br.com.infnet.appemprestimo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.appemprestimo.model.clients.ILivroClient;
import br.com.infnet.appemprestimo.model.negocio.Livro;

@Service
public class LivroService extends ProdutoService {

	@Autowired private ILivroClient livroClient;
	
	public List<Livro> obterLivros(){
		return livroClient.obterLista();
	}

	public Livro obterPorId(Integer id) {
		return livroClient.obterPorId(id);
	}
}