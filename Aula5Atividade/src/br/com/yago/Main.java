package br.com.yago;

public class Main {

	public static void main(String[] args) {
		Notebook.NomeMarca("N43s", "Asus");
		
		Notebook note = new Notebook(2500, 2300, 300);
		
		System.out.println("O valor a prazo é: "+ note.valorAprazo+ " O valor a vista é: "+ note.aVista);

	}

}
