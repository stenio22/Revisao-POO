package br.com.yago;

public class Main {

	public static void main(String[] args) {
		
		Ex1 q = new Ex1();
		q.lado = 4;

		//atributo é uma variavel que não pertence a classe local
		double area; 
		
		area = q.lado * q.lado;
		System.out.println("Area do quadrado é "+ area);
		
	}
	
}
