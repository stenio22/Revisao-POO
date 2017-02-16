package br.com.yago;

public class Main {

	public static void main(String[] args) {
		
		Equacao equacao = new Equacao();
		equacao.a = 4;
		equacao.b = 6;
		equacao.c = 8;
		
		double delta, x1, x2;
		
		delta = Math.pow(equacao.a,2) - 4 * equacao.a * equacao.b;

		if (delta > 0){
			
			System.out.println("Não existe raiz");
			
		}else{
			x1 =(- equacao.b + Math.sqrt(delta)/(2* equacao.a));
			x2 =(- equacao.b - Math.sqrt(delta)/(2* equacao.a));
			System.out.println("Delta: "+delta+ " x1 = "+ x1+" x2 = "+ x2);
			
		}
		
	}

}
