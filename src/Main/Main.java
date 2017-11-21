package Main;

import java.util.Arrays;

import implementacao.CarrinhoCompras;
import implementacao.ProdutoDigital;
import implementacao.ProdutoNaoDigital;

public class Main {
	
	public static void main(String[] args) {
		
		ProdutoDigital p1 = new ProdutoDigital();
		p1.setPreco(50);
		p1.setTamanhoDownload(25);

		ProdutoDigital p2 = new ProdutoDigital();
		p2.setPreco(50);
		p2.setTamanhoDownload(25);
		
		ProdutoDigital p3 = new ProdutoDigital();
		p3.setPreco(50);
		p3.setTamanhoDownload(25);
		
		ProdutoNaoDigital p4 = new ProdutoNaoDigital();
		p4.setPeso(10);
		p4.setPreco(50);
		
		ProdutoNaoDigital p5 = new ProdutoNaoDigital();
		p5.setPeso(20);
		p5.setPreco(50);

		CarrinhoCompras carrinho = new CarrinhoCompras();
		
		carrinho.adicionarProduto(p1);
		carrinho.adicionarProduto(p2);
		carrinho.adicionarProduto(p3);
		carrinho.adicionarProduto(p4);
		carrinho.adicionarProduto(p5);
		
		System.out.println(carrinho.getTotalDaPropriedade("PRECO"));
		System.out.println(carrinho.getTotalDaPropriedade("PESO"));
		System.out.println(carrinho.getTotalDaPropriedade("DOWNLOAD"));
		
	}
	
}
