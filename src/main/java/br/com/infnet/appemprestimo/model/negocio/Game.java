package br.com.infnet.appemprestimo.model.negocio;

public class Game extends Produto {

	private Float valor;
	
	public Game() {
		this.setTipoProduto("G");
	}
	
	@Override
	public String toString() {
		return String.format("%s - %.2f", super.toString(), this.getValor());
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}
}