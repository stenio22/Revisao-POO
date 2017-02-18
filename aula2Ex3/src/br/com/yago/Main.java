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

		entrada = new Scanner(System.in);

		System.out.println("Digite seu salario Atual do funcionario 1: ");
		Funcionario.salarioAtual = entrada.nextDouble();
		
		Funcionario.reajuste();

																							
		System.out.println("Os dados do funcionario 1 são: \n" + funcionario.nome + "\n" + funcionario.cargo + "\n"
				+ "Salario atual de: " + Funcionario.salarioAtual + " e seu salario com o reajuste de 10% é de: "
				+ Funcionario.salarioComReajuste);
		
		Funcionario funcionario2 = new Funcionario();

		funcionario2.nome = "Zé";
		funcionario2.cargo = "mecanico";

		System.out.println("Digite seu salario Atual do funcionario 2: ");
		Funcionario.salarioAtual = entrada.nextDouble();


		System.out.println("Os dados do funcionario 2 são: \n" + funcionario2.nome + "\n" + funcionario2.cargo + "\n"
				+ "Salario atual de: " + Funcionario.salarioAtual + " e seu salario com o reajuste de 10% é de: "
				+ Funcionario.salarioComReajusteFunc2);

	}

}
