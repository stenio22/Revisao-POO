package br.com.yago;

public class Main {

	public static void main(String[] args) {
		
		Equacao equacao = new Equacao();
		Equacao.a = 4;
		Equacao.b = 6;
		Equacao.c = 8;
		
		
			System.out.println("Delta: "+equacao.delta+ " x1 = "+ Equacao.x1+" x2 = "+ Equacao.x2);
		
	}

}
