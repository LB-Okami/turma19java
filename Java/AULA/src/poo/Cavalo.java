package poo;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade, String som, String movimento) {
		super(nome, idade, som, movimento);

	}
	
	//Métodos
	public void correr() {
		System.out.println("Este cavalo trota muito rapidamente.");
	}
	
	public void somCavalo() {
		System.out.println("*Som de uma cavalo*");
	}

}
