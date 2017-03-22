package br.com.yago;

public class Funcionario {
	
double salarioAtual, salarioReajuste;
String nome, função;


public static double reajuste(double salarioAtual, double salarioReajuste){
	
	salarioReajuste = salarioAtual + (salarioAtual * 0.1);
	
	return salarioReajuste;
	}

public static void imprime(double salarioAtual, double salarioReajuste, String nome, String função){
	System.out.println("O salario atual é: "+ salarioAtual+ "\nO salario com reajuste de 10% é: "
			+ salarioReajuste + "\nO nome é: "+ nome+ "\ne sua função é: " + função  );
	}

}
