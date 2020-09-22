package br.com.infnet.appemprestimo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.appemprestimo.model.clients.IEmprestimoClient;
import br.com.infnet.appemprestimo.model.negocio.Emprestimo;
import br.com.infnet.appemprestimo.model.repository.IEmprestimoRepository;

@Service
public class EmprestimoService {

	@Autowired private IEmprestimoRepository repository;
	@Autowired private IEmprestimoClient client;
	
	public void incluir(Emprestimo emprestimo) {
		repository.save(emprestimo);
	}
	
	public List<Emprestimo> obterLista(){
		return client.obterLista();
	}

	public Emprestimo consultar(Integer id) {
		return client.consultar(id);
	}

	public void excluir(Integer id) {
		client.excluir(id);
	}
}