package br.com.infnet.appemprestimo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.appemprestimo.model.clients.IGameClient;
import br.com.infnet.appemprestimo.model.negocio.Game;

@Service
public class GameService extends ProdutoService {

	@Autowired private IGameClient gameClient;
	
	public List<Game> obterGames(){
		return gameClient.obterLista();
	}
	
	public Game obterPorId(Integer id) {
		return gameClient.obterPorId(id);
	}
}