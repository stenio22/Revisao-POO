package controle;

public class Pessoa {

	public String nome;   //atributo
	public int idade;     //atributo
	public double peso;   //atributo
	
	public void correr(){ //metodo correr
	System.out.println(this.nome+" correndo");	//chamando o nome da pessoa seleconada na classe InformacoesPessoa e concatenando com correndo
	System.out.println(this.nome+", "+ idade+ " anos"+", "+ peso+ " KG"+  " esta correndo!!!");	//chamando todos os dados da pessoa seleconada na classe InformacoesPessoa e concatenando com esta correndo

	}
}
