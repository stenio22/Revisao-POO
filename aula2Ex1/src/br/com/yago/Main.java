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
        aluno.nota1 = entrada.nextDouble();
        
        System.out.println("Digite a nota 2: ");
        aluno.nota2 = entrada.nextDouble();
        
        System.out.println("Digite a nota 3: ");
        aluno.nota3 = entrada.nextDouble();
        
        System.out.println("Digite a nota 4: ");
        aluno.nota4 = entrada.nextDouble();
		
        
		aluno.medias();
		
		System.out.println("O aluno "+ alu.nome + " na diciplina de "+ alu.diciplina + " tem a média de:"+ aluno.media + "\nSeu status na diciplina é:");
		
		if (aluno.media >= 7.0){
			System.out.println("Aluno aprovado");
		}else{
			System.out.println("Aluno Reprovado");
		}

	}

}
