package br.com.infnet.appemprestimo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.appemprestimo.model.clients.IUsuarioClient;
import br.com.infnet.appemprestimo.model.negocio.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioClient usuarioClient;

	public boolean isValid(String login, String senha) {		
		return usuarioClient.isValid(login, senha);
	}
	
	public Usuario userExist(String login) {
		return usuarioClient.obterPorLogin(login);
	}
	
	public void incluir(Usuario usuario) {
		usuarioClient.incluir(usuario);
	}
}