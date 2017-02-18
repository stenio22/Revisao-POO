package br.com.yago;

import java.util.Scanner;

public class Main {

	private static Scanner parcelas;

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.codigo = 12345678;
		produto.item = "Carrinho de rolimã";
		produto.marca = "T6I";
		

		Crediario.valorProduto = 100;
		
		Crediario.calcular();
		
		parcelas = new Scanner(System.in);
		System.out.println("Digite a quantidade de vezes que deseja parcelar o carrinho de rolimã(T6I): ");
		Crediario.quatidadeParcela = parcelas.nextInt();
		

		if (Crediario.quatidadeParcela <= 10 && Crediario.quatidadeParcela >= 1) {

			System.out.println("O produto: " + produto.codigo + "\n" + produto.item + "\nDa marca: " 
					+ produto.marca +  "\nDo valor de: R$"+ Crediario.valorProduto 
					+ "\nFoi parcelado em: " + Crediario.quatidadeParcela 
					+ " vez(es), e cada parcela com o valor de: R$"+ Crediario.Valorparcela);

		} else {
			
			System.out.println("O produto só pode ser parcelado de 1 até 10 vezes");
			
		}

	}

}

