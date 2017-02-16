package br.com.yago;

import java.util.Scanner;

public class Main {

	private static Scanner entrada;
	

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Pista pista = new Pista();

		entrada = new Scanner(System.in);

		System.out.println("Digite o nome do piloto: ");
		carro.piloto = entrada.next();

		System.out.println("Digite o tipo de pneu:\n1 p/ macio\n2 p/ médio\n3 p/ Duro.");
		carro.tipoPneu = entrada.nextInt();
		
		if (carro.tipoPneu == 1){
			
			System.out.println("Pneu macio");
			
		}else if (carro.tipoPneu == 2) {
			
			System.out.println("Pneu médio");
			
		}else if (carro.tipoPneu == 3){
			
			System.out.println("Pneu Duro");
		
		}else{
			System.out.println("Selecione um valor valido!!");
		}
		
		System.out.println("Digite o Tamanhano da pista em metros: ");
		pista.tamanhoPista = entrada.nextDouble();
		
		System.out.println("Digite o numero de voltas da corrida: ");
		pista.numeroDeVoltas = entrada.nextInt();
		
		System.out.println("Digite o tempo estimando para cada volta na pista: ");
		pista.tempoVolta = entrada.nextDouble();
		
		double tempoCorrida = pista.tempoVolta * pista.numeroDeVoltas;
		
		System.out.println("O piloto é: " + carro.piloto + " que correra no carro da: " + carro.equipe 
				+ "\nTerá o pneu" + carro.tipoPneu + "\nEm uma pista de: " + pista.tamanhoPista
				+" metros, e a corrida terá: "+ pista.numeroDeVoltas + " voltas\nE estimace que a corrida dure: "
				+ tempoCorrida+ " minutos.");

	}

}
