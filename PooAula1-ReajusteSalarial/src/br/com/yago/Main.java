package br.com.yago;


public class Main {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.nome = "jao";
		funcionario.cargo = "motorista";
		funcionario.salarioAtual = 850.0 + 850.0 * 0.1;
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.nome = "bamabam";
		funcionario2.cargo = "mecanico";
		funcionario2.salarioAtual = 850.0 + 850.0 * 0.1;
		 
		
		System.out.println("Os dados do funcionario 1 são:\n" + funcionario.nome+ "\n" + funcionario.cargo + "\n" + funcionario.salarioAtual);
		System.out.println("");
		System.out.println("Os dados do funcionario 2 são:\n" + funcionario2.nome+ "\n" + funcionario2.cargo + "\n" + funcionario2.salarioAtual);

		

	}

}
