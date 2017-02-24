package br.com.yago;

public class CarrinhoDeCompras {

	int itemcodigo, itemQuatidade;
	double valorProduto, totalCompra;
	String itemNome, itemMarca;
	
	public void CalcularCompra() {

		totalCompra = valorProduto * itemQuatidade;
		
	}
	
}
