package br.com.yago;

import java.util.Scanner;

public class Main {

	private static Scanner entrada;
	//private static Scanner entrada2;

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();// declarando o objeto
													// funcionario
		funcionario.nome = "Jão";
		funcionario.cargo = "motorista";

		entrada = new Scanner(System.in);// criando um objeto scanner com nome
											// entrada para ler valores de
											// entradas fornecidos pelo user

		System.out.println("Digite seu salario Atual do funcionario 1: ");
		funcionario.salarioAtual = entrada.nextDouble();// atribuindo o valor de
														// entrada a
														// salarioAtual

		double salarioComReajuste = funcionario.salarioAtual + funcionario.salarioAtual * 0.1;// calculando
																								// reajuste
																								// de
																								// 10%
		System.out.println("Os dados do funcionario 1 são: \n" + funcionario.nome + "\n" + funcionario.cargo + "\n"
				+ "Salario atual de: " + funcionario.salarioAtual + " e seu salario com o reajuste de 10% é de: "
				+ salarioComReajuste);
		
		System.out.println("");

		Funcionario funcionario2 = new Funcionario();
		//entrada2 = new Scanner(System.in);
		funcionario2.nome = "Zé";
		funcionario2.cargo = "mecanico";

		System.out.println("Digite seu salario Atual do funcionario 2: ");
		funcionario2.salarioAtual = entrada.nextDouble();

		double salarioComReajusteFunc2 = funcionario2.salarioAtual + funcionario2.salarioAtual * 0.1;

		System.out.println("Os dados do funcionario 2 são: \n" + funcionario2.nome + "\n" + funcionario2.cargo + "\n"
				+ "Salario atual de: " + funcionario2.salarioAtual + " e seu salario com o reajuste de 10% é de: "
				+ salarioComReajusteFunc2);

	}

}
