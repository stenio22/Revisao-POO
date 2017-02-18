package br.com.yago;

public class Funcionario {
	String nome;
	String cargo;
	static double salarioAtual;
	static double salarioComReajuste, salarioComReajusteFunc2;
	
	public static void reajuste() {
		
		salarioComReajuste = salarioAtual + salarioAtual * 0.1;
		salarioComReajusteFunc2 = Funcionario.salarioAtual + Funcionario.salarioAtual * 0.1;
	}
}
