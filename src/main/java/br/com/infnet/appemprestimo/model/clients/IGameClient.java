package br.com.infnet.appemprestimo.model.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.infnet.appemprestimo.model.negocio.Game;

@FeignClient(url = "http://localhost:8081/api/emprestimo", name = "gameClient")
public interface IGameClient {

	@GetMapping(value = "/games")
	public List<Game> obterLista();
	
	@GetMapping(value = "/game/{id}")
	public Game obterPorId(@PathVariable Integer id);
}