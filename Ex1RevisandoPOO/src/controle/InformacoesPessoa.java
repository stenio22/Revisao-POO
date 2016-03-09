package controle;

public class InformacoesPessoa {
public static void main(String[]args) {
	
	Pessoa p1 = new Pessoa();//criando objeto pessoa (p1)
	p1.nome = "yago";        //colocando valor para atributo nome 
	p1.idade = 19;           //colocando valor para atributo idade
	p1.peso = 75;            //colocando valor para atributo peso
	
	Pessoa p2 = new Pessoa();
	p2.nome = "Felipe";
	p2.idade = 18;
	p2.peso = 70;
	
	p1.correr();//selecionando objeto pessoa(p1);
	p2.correr();//selecionando objeto pessoa(p2);
}
}
