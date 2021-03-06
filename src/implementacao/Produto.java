package implementacao;

public abstract class Produto {

	private String nome;
	private double preco;
	
	public abstract void adicionaPropriedades(CarrinhoCompras carrinho);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
