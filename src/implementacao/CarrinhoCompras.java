package implementacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarrinhoCompras {
	
	private Map<String, Double> propriedades = new HashMap<>();
	
	private List<Produto> produtos = new ArrayList<>();

	public void adicionarProduto(Produto p) {
		produtos.add(p);
		p.adicionaPropriedades(this);
	}

	public void adicionaPropriedade(String propriedade, double valor) {
		
		if(propriedades.containsKey(propriedade)) {
			Double valueProp = propriedades.get(propriedade);
			propriedades.put(propriedade, valueProp + valor);  
			return;
		}
		
		propriedades.put(propriedade, valor);
		
	}
	
	public double getTotalDaPropriedade(String prop) {
		double total = 0;
		
		for (String propriedade: propriedades.keySet()) {
			if(propriedade.equals(prop)) {
				total += propriedades.get(propriedade);
			}
		}
		
		return total;
	}
	
}
