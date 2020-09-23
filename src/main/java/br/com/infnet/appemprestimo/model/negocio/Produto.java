package br.com.infnet.appemprestimo.model.negocio;

import java.util.List;

public class Produto {

	private Integer id;
	private String descricao;
	private List<Emprestimo> emprestimos;
	private String tipoProduto;
	
	@Override
	public String toString() {
		return String.format("%s", this.getDescricao());
	}
	
	public Produto() {
	}
	public Produto(Integer id) {
		this();
		this.setId(id);
	}
	public Produto(Integer id, String descricao) {
		this(id);
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
	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}
	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
}