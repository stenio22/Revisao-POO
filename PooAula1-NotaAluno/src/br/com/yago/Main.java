package br.com.yago;

import java.util.Scanner;

public class Main {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		aluno alu = new aluno();
		
		entrada = new Scanner(System.in);// lê a entrada do user
		
        System.out.println("Digite seu nome: ");
        alu.nome = entrada.nextLine(); //chama o metodo scanner para que o user digite algo e add a entrada fornecida pelo user no atributo "nome" do abjeto aluno
		
        System.out.println("Digite a diciplina: ");
        alu.diciplina = entrada.nextLine();
        
        System.out.println("Digite a nota 1: ");
        alu.nota1 = entrada.nextDouble();
        
        System.out.println("Digite a nota 2: ");
        alu.nota2 = entrada.nextDouble();
        
        System.out.println("Digite a nota 3: ");
        alu.nota3 = entrada.nextDouble();
        
        System.out.println("Digite a nota 4: ");
        alu.nota4 = entrada.nextDouble();
		
        
		double media = (alu.nota1 + alu.nota2 + alu.nota3 + alu.nota4) / 4;
		
		System.out.println("O aluno "+ alu.nome + " na diciplina de "+ alu.diciplina + " tem a média de:"+ media + "\nSeu status na diciplina é:");
		
		if (media >= 7.0){
			System.out.println("Aluno aprovado");
		}else{
			System.out.println("Aluno Reprovado");
		}

	}

}
