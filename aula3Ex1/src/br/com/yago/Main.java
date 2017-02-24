package br.com.yago;

public class Main {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.nome = "yago";
		funcionario.funcao= "developer";
		funcionario.salarioAtual = 5000;
		
		funcionario.calcularSalario();

		
		System.out.println("nome:"+ funcionario.nome + "Função: " + funcionario.funcao + "\nsalarioAtual: " 
		+ funcionario.salarioAtual + "salarioComReajuste: " + funcionario.salarioComReajuste );
	}

}
