package poo;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade, String som, String movimento) {
		super(nome, idade, som, movimento);

	}
	
	//M�todos
	public void correr() {
		System.out.println("Este corre muito rapidamente.");
	}
	
	public void somCavalo() {
		System.out.println("Au au");
	}

}
