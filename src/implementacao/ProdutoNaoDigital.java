package implementacao;

public class ProdutoNaoDigital extends Produto{
	
	private double peso;

	@Override
	public void adicionaPropriedades(CarrinhoCompras carrinho) {
		carrinho.adicionaPropriedade("PRECO", getPreco());
		carrinho.adicionaPropriedade("PESO", getPeso());
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
