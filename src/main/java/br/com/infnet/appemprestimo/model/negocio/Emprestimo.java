package br.com.infnet.appemprestimo.model.negocio;

import java.util.List;

public class Emprestimo {

	private Integer id;
	private String descricao;
	private List<Produto> produtos;
	private Solicitante solicitante;
	
	@Override
	public String toString() {
		return String.format("%d - %s - %s", 
					this.getId(),
					this.getDescricao(),
					this.getProdutos()
				);
	}

	public Emprestimo() {
	}
	public Emprestimo(Integer id, String descricao) {
		this();
		this.setId(id);
		this.setDescricao(descricao);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public Solicitante getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}
}
