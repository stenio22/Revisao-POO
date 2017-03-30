package br.yago;

import java.util.Scanner;

public class Main {
	
	private static Scanner entrada;

	public static void main(String[] args) {
		Produto produto = new Produto(87654321, "mouse", "dell");
		
		Crediario crediario = new Crediario();
		
		crediario.valorProduto = 70.00;
		
		entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de vezes que deseja parcelar: ");
		crediario.quantidadeParcelas = entrada.nextInt();
		
		crediario.parcelar();

		System.out.println("O codigo do produto é: " + produto.intemCodigo +
				"\nO nome é: "+ produto.itemNome+ "\nA marca é: "+produto.itemMarca);
		
	}

}
