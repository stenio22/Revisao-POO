package br.com.yago;

public class Equacao {
	
	static double a, b, c, x1, x2;
	

	public static void calcular(){
		
double delta;

		
		delta = Math.pow(a,2) - 4 * a * b;

		if (delta > 0){
			
			System.out.println("Não existe raiz");
			
		}else{
			x1 =(- b + Math.sqrt(delta)/(2* a));
			x2 =(- b - Math.sqrt(delta)/(2* a));
		}
		
	}


	public String delta;
}
