package br.com.infnet.appemprestimo.model.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.infnet.appemprestimo.model.negocio.Revista;

@FeignClient(url = "http://localhost:8081/api/emprestimo", name = "revistaClient")
public interface IRevistaClient {

	@GetMapping(value = "/revistas")
	public List<Revista> obterLista();
	
	@GetMapping(value = "/revista/{id}")
	public Revista obterPorId(@PathVariable Integer id);
}