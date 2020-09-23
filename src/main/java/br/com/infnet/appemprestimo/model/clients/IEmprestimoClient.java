package br.com.infnet.appemprestimo.model.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.infnet.appemprestimo.model.negocio.Emprestimo;

@FeignClient(url = "http://localhost:8081/api/emprestimo", name = "emprestimoClient")
public interface IEmprestimoClient {

	@GetMapping(value = "/lista")
	public List<Emprestimo> obterLista();
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Emprestimo emprestimo);

	@GetMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);

	@GetMapping(value = "/{id}/consultar")
	public Emprestimo consultar(@PathVariable Integer id);
}