package br.com.yago;

public class Notebook {
	
	String nome, marca;
	double valor, aVista, aPrazo, valorAvista, valorAprazo;
	
	
	public static void NomeMarca(String nome, String marca){
	System.out.println("O nome do prouto é: "+nome +" Da marca: "+ marca);
	}
	
	
	public Notebook(double valor, double aVista, double aPrazo) {

		this.valor = valor;
		this.aVista = aVista;
		this.aPrazo = aPrazo;
		
		valorAvista = (valor + aVista);
		valorAprazo = (valor + aPrazo);		
		
	}
	
}
