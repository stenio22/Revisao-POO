package br.yago;

public class Crediario {
	
	double valorProduto;
	int quantidadeParcelas;
	public String parcelar;
	
	
	public void parcelar() {
		
		if(quantidadeParcelas >= 1 && quantidadeParcelas <= 12){
			double parcela = valorProduto / quantidadeParcelas;
			System.out.println("O total de parcelas é: "+ quantidadeParcelas+ " e cada uma delas ficou no valor de: " + parcela);
		}else{
			System.out.println("Só parcelamos entre 1 a 12 vezes!!");
		}
		
	}
	
	

}
