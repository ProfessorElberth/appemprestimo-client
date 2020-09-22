package br.com.infnet.appemprestimo.model.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.infnet.appemprestimo.model.negocio.Solicitante;

@FeignClient(url = "http://localhost:8081/api/emprestimo", name = "solicitanteClient")
public interface ISolicitanteClient {

	@GetMapping(value = "/solicitantes")
	public List<Solicitante> obterLista();
	
	@GetMapping(value = "/solicitante/{id}")
	public Solicitante obterPorId(@PathVariable Integer id);

	@PostMapping(value = "/solicitante/incluir")
	public void incluir(Solicitante solicitante);
	
	@GetMapping(value = "/solicitante/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/solicitante/{id}/alterar")
	public void alterar(@PathVariable Integer id);
}