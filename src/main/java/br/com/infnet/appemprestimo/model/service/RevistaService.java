package br.com.infnet.appemprestimo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.appemprestimo.model.clients.IRevistaClient;
import br.com.infnet.appemprestimo.model.negocio.Revista;
import br.com.infnet.appemprestimo.model.repository.IRevistaRepository;

@Service
public class RevistaService {

	@Autowired private IRevistaRepository revistaRepository;
	@Autowired private IRevistaClient revistaClient;
	
	public List<Revista> obterLista(){
		return revistaClient.obterLista();
	}

	public Revista obterPorId(Integer id) {
		return revistaClient.obterPorId(id);
	}
	
	public void incluir(Revista revista) {
		revistaRepository.save(revista);
	}

	public void excluir(Integer id) {
		revistaRepository.deleteById(id);		
	}
}