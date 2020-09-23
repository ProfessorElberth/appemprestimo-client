package br.com.infnet.appemprestimo.model.negocio;

public class Revista extends Produto {

	private String editora;

	public Revista() {
		this.setTipoProduto("R");
	}

	@Override
	public String toString() {
		return String.format("%s - %s", super.toString(), this.getEditora());
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
}