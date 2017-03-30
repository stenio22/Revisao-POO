package br.com.yago;

import java.util.Scanner;

public class Cerveja {

	private String tipo, marca;
	double valorChop400;
	double valorChop800;
	static double valorTotal;
	static int numeroChop;
	static int tipoMl;
	private static Scanner entrada;

	public Cerveja(String tipo, String marca) {
		this.tipo = tipo;
		this.marca = marca;
	}

	public static void quantidadeChop(double valorChop400, double valorChop800) {

		entrada = new Scanner(System.in);

		System.out.println("Digite o numero de chop que vc tomou: ");
		numeroChop = entrada.nextInt();

		System.out.println("Digite qual chop vc tomou sendo 400 para o de 400ml e 800 para o de 800ml: ");
		tipoMl = entrada.nextInt();

		if (tipoMl == 400) {
			valorTotal = numeroChop * valorChop400;

			System.out.println("O valor total dos chop(s) é de: " + valorTotal);

		} else if (tipoMl == 800) {
			valorTotal = numeroChop * valorChop800;

			System.out.println("O valor total dos chop(s) é de: " + valorTotal);

		} else {
			System.out.println("O valor que vc digitou para os mls do chop foi um valor errado!!");
		}

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
