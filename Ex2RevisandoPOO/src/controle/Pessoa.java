package controle;

public class Pessoa {

	private String nome;   //atributo
	private int idade;     //atributo
	private double peso;   //atributo
	
	public Pessoa(String nome, int idade, double peso){
		this.nome= nome;
		this.idade= idade;
		this.peso= peso;
	}
	
	
	public void correr(){ //metodo correr
	System.out.println(this.nome+" correndo");	//chamando o nome da pessoa seleconada na classe InformacoesPessoa e concatenando com correndo
	System.out.println(this.nome+", "+ idade+ " anos"+", "+ peso+ " KG"+  " esta correndo!!!");	//chamando todos os dados da pessoa seleconada na classe InformacoesPessoa e concatenando com esta correndo

	}
}
