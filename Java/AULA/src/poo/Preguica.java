package poo;

public class Preguica extends Animal {

	public Preguica(String nome, int idade, String som, String movimento) {
		super(nome, idade, som, movimento);

	}
	
	//Métodos
	@Override
	public void movimentacao() {
		System.out.println("Este animal sobe em árvores");
	}
		
	@Override
	public void fazerSom() {
		System.out.println("*Som de preguiça.*");
	}

}
