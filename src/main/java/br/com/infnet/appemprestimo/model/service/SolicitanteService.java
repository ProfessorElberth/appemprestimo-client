package br.com.infnet.appemprestimo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.appemprestimo.model.clients.ISolicitanteClient;
import br.com.infnet.appemprestimo.model.negocio.Solicitante;

@Service
public class SolicitanteService {

	@Autowired
	private ISolicitanteClient solicitanteClient;
	
	public void incluir(Solicitante solicitante) {
		solicitanteClient.incluir(solicitante);
	}
	
	public List<Solicitante> obterLista() {
		return solicitanteClient.obterLista();
	}

	public void excluir(Integer id) {
		solicitanteClient.excluir(id);
	}

	public Solicitante obterPorId(Integer id) {
		return solicitanteClient.obterPorId(id);
	}
}