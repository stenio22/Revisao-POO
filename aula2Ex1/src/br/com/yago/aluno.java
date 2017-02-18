package br.com.yago;

public class aluno {
	String nome;
	String diciplina;
	static double nota1;
	static double nota2;
	static double nota3;
	static double nota4;
	static double media;
	
	public static void medias() {
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
	}

}
