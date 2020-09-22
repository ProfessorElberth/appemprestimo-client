package br.com.infnet.appemprestimo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.appemprestimo.model.clients.IGameClient;
import br.com.infnet.appemprestimo.model.negocio.Game;
import br.com.infnet.appemprestimo.model.repository.IGameRepository;

@Service
public class GameService {

	@Autowired private IGameRepository gameRepository;
	@Autowired private IGameClient gameClient;
	
	public List<Game> obterLista(){
		return gameClient.obterLista();
	}
	
	public Game obterPorId(Integer id) {
		return gameClient.obterPorId(id);
	}

	public void incluir(Game game) {
		gameRepository.save(game);
	}

	public void excluir(Integer id) {
		gameRepository.deleteById(id);
	}
}