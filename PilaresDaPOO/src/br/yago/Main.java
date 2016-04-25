package br.yago;

public class Main {
	public static void main(String[] args) {
	    
		ControleDeBonificacoes controle = new ControleDeBonificacoes();

		Gerente funcionario1 = new Gerente("josue", "709.258.131.03", 5000, 1234, 10);
		funcionario1.setSalario(5000.0);
		controle.registra(funcionario1);

		Funcionario funcionario2 = new Funcionario("junior", "626.848.606.98",  4000);
		funcionario2.setSalario(1000.0);
		controle.registra(funcionario2);

		System.out.println(controle.getTotalDeBonificacoes());
	}
	
	}