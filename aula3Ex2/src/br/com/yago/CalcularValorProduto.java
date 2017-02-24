package br.com.yago;

public class CalcularValorProduto {
	double frete, valorTotalaPagar;
	
	CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
	
	public void CalcularValorTotal() {
		
		valorTotalaPagar = carrinho1.totalCompra + frete;
		
	}

}
