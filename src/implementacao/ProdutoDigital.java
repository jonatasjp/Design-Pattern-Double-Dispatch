package implementacao;

public class ProdutoDigital extends Produto{
	
	private double tamanhoDownload;

	@Override
	public void adicionaPropriedades(CarrinhoCompras carrinho) {
		carrinho.adicionaPropriedade("PRECO", getPreco());
		carrinho.adicionaPropriedade("DOWNLOAD", getTamanhoDownload());
	}
	
	public double getTamanhoDownload() {
		return tamanhoDownload;
	}

	public void setTamanhoDownload(double tamanhoDownload) {
		this.tamanhoDownload = tamanhoDownload;
	}

}
