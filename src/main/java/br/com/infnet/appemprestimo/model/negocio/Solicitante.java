package br.com.infnet.appemprestimo.model.negocio;

public class Solicitante {

	private Integer id;
	private String nome;
	
	public Solicitante() {
		// TODO Auto-generated constructor stub
	}
	public Solicitante(Integer id, String nome) {
		this();
		this.setId(id);
		this.setNome(nome);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}