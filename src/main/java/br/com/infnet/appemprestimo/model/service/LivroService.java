package br.com.infnet.appemprestimo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.appemprestimo.model.clients.ILivroClient;
import br.com.infnet.appemprestimo.model.negocio.Livro;
import br.com.infnet.appemprestimo.model.repository.ILivroRepository;

@Service
public class LivroService {

	@Autowired private ILivroRepository livroRepository;
	@Autowired private ILivroClient clientRepository;
	
	public List<Livro> obterLista(){
		return clientRepository.obterLista();
	}

	public Livro obterPorId(Integer id) {
		return clientRepository.obterPorId(id);
	}
	
	public void incluir(Livro livro) {
		livroRepository.save(livro);
	}

	public void excluir(Integer id) {
		livroRepository.deleteById(id);		
	}
}