package br.com.infnet.appemprestimo.model.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.infnet.appemprestimo.model.negocio.Produto;

@FeignClient(url = "http://localhost:8081/api/emprestimo", name = "produtoClient")
public interface IProdutoClient {

	@GetMapping(value = "/produtos")
	public List<Produto> obterLista();
	
	@GetMapping(value = "/produto/{id}")
	public Produto obterPorId(@PathVariable Integer id);
}