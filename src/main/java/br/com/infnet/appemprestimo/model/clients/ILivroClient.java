package br.com.infnet.appemprestimo.model.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.infnet.appemprestimo.model.negocio.Livro;

@FeignClient(url = "http://localhost:8081/api/emprestimo", name = "livroClient")
public interface ILivroClient {

	@GetMapping(value = "/livros")
	public List<Livro> obterLista();
	
	@GetMapping(value = "/livro/{id}")
	public Livro obterPorId(@PathVariable Integer id);
}