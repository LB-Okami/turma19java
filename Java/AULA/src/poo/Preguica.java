package poo;

public class Preguica extends Animal {

	public Preguica(String nome, int idade, String som, String movimento) {
		super(nome, idade, som, movimento);

	}
	
	//Métodos
	public void subirArvore() {
		System.out.println("Este animal sobe em árvores.");
	}
	
	public void somPreguica() {
		System.out.println("*Som de uma preguiça*");
	}

}
