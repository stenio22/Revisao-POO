package controle;

public class Pessoa {

	private String nome;   //atributo
	private int idade;     //atributo
	private double peso;   //atributo
	
	public Pessoa(String nome, int idade, double peso){
		
		if(idade < 18){
			System.out.println("Essa Pessoa é menor de idade");
		}else{
			System.out.println("Esta pessoa é maior de idade");
			}
		
		this.nome= nome;
		this.idade= idade;
		this.peso= peso;
	}
	
	
	public void correr(){ //metodo correr
	System.out.println(this.nome+" correndo");	//chamando o nome da pessoa seleconada na classe InformacoesPessoa e concatenando com correndo
	System.out.println(this.nome+", "+ idade+ " anos"+", "+ peso+ " KG"+  " esta correndo!!!");	//chamando todos os dados da pessoa seleconada na classe InformacoesPessoa e concatenando com esta correndo

	}
}
