package br.com.yago;

public class Funcionario {
	
	String nome, funcao;
	double salarioAtual, salarioComReajuste;
	
	public void calcularSalario() {
		
		salarioComReajuste = salarioAtual;
		salarioComReajuste = salarioAtual * 0.2;
		
	}

}
