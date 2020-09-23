package br.com.infnet.appemprestimo.model.negocio;

public class Livro extends Produto {

	private String autor;

	public Livro() {
		this.setTipoProduto("L");
	}

	@Override
	public String toString() {
		return String.format("%s - %s", super.toString(), this.getAutor());
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
