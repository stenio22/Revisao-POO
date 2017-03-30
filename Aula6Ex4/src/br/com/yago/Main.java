package br.com.yago;

public class Main {

	public static void main(String[] args) {
		Cerveja cerveja = new Cerveja("Artezanal", "Stella Artois");
		
		Cerveja.quantidadeChop(8.00, 13.00);
		
		System.out.println("\nA marca da breja é: "+ cerveja.getMarca()+
				"\nO tipo é: "+ cerveja.getTipo());

	}

}
