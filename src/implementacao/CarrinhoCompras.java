package implementacao;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	
	private List<Produto> produtos = new ArrayList<>();

	public void adicionarProduto(Produto p) {
		produtos.add(p);
		p.adicionaPropriedades(this);
	}

}
