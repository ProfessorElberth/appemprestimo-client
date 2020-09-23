package br.com.infnet.appemprestimo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.appemprestimo.model.clients.IRevistaClient;
import br.com.infnet.appemprestimo.model.negocio.Revista;

@Service
public class RevistaService extends ProdutoService {

	@Autowired private IRevistaClient revistaClient;
	
	public List<Revista> obterRevistas(){
		return revistaClient.obterLista();
	}

	public Revista obterPorId(Integer id) {
		return revistaClient.obterPorId(id);
	}
}