package br.com.yago;

import java.util.Scanner;

public class Main {

	private static Scanner parcelas;

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.codigo = 12345678;
		produto.item = "Carrinho de rolimã";
		produto.marca = "T6I";

		Crediario crediario = new Crediario();
		crediario.valorProduto = 100;
		parcelas = new Scanner(System.in);
		System.out.println("Digite a quantidade de vezes que deseja parcelar o carrinho de rolimã(T6I): ");
		crediario.quatidadeParcela = parcelas.nextInt();

		if (crediario.quatidadeParcela > 10 && crediario.quatidadeParcela < 1) {

			System.out.println("O produto só pode ser parcelado de 1 até 10 vezes");

		} else {
			double Valorparcela = crediario.valorProduto / crediario.quatidadeParcela;
			System.out.println("O produto: " + produto.codigo + "\n" + produto.item + "\n da marca: " + produto.marca +  "o valor de:"+ crediario.valorProduto + "" );
		}

	}

}

