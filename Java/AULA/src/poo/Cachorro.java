package poo;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade, String som, String movimento) {
		super(nome, idade, som, movimento);

	}
	
	//Métodos
	@Override
	public void movimentacao() {
		System.out.println("Este cachorro corre muito rapidamente.");
	}
	
	@Override
	public void fazerSom() {
		System.out.println("Au Au");
	}

}
