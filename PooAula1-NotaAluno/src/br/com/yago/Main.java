package br.com.yago;

import java.util.Scanner;

public class Main {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		aluno alu = new aluno();
		
		entrada = new Scanner(System.in);
        String nome;
        
        System.out.println("Digite seu nome: ");
        nome = entrada.toString();
        alu.nome = nome;
		
		//alu.nome = "jao";
		alu.diciplina = "matematica";
		alu.nota1 = 8.2;
		alu.nota2 = 6.0;
		alu.nota3 = 8.4;
		alu.nota4 = 7.0;
		
		double media = (alu.nota1 + alu.nota2 + alu.nota3 + alu.nota4) / 4;
		
		System.out.println("A media do aluno é:"+ media);
		
		if (media >= 7.0){
			System.out.println("Aluno aprovado");
		}else{
			System.out.println("Aluno Reprovado");
		}
		
		
		
		
	

	}

}
