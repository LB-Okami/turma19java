package poo;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade, String som, String movimento) {
		super(nome, idade, som, movimento);

	}
	
	//Métodos
	@Override
	public void movimentacao() {
		System.out.println("Este cavalo cavalga muito rapidamente");
	}
	
	@Override
	public void fazerSom() {
		System.out.println("*Som de cavalo.*");
	}

}
