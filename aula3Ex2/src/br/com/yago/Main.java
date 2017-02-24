package br.com.yago;

public class Main {

	public static void main(String[] args) {
		
		CalcularValorProduto valorProduto = new CalcularValorProduto();
		valorProduto.frete = 9;
		valorProduto.CalcularValorTotal();
		
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.itemcodigo = 12345678;
		carrinho.itemMarca = "t6i";
		carrinho.itemNome = "bolacha";
		carrinho.itemQuatidade = 5;
		carrinho.valorProduto = 35;
		carrinho.CalcularCompra();
		
		double totalGeral = carrinho.totalCompra + valorProduto.valorTotalaPagar;
		 
	System.out.println("o total da compra é:" + carrinho.totalCompra 
			+ " e o valor do produto mais o frete é de:" + totalGeral);

	}

}
