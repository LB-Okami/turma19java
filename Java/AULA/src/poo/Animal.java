package poo;

public class Animal {
	public String nome;
	public String som;
	public String movimento;
	public int idade;
	
	// Construtor
	public Animal(String nome, int idade, String som, String movimento) {
		super(); 
		
		this.nome = nome;
		this.som = som;
		this.movimento = movimento;
		this.idade = idade;
	}
	
	
	
	public Animal() {
		super();
	}



	//Métodos
	public void movimentacao() {
		System.out.println("Este animal tem este modo de se movimentar...");
	}
	
	public void fazerSom() {
		System.out.println("Som básico");
	}
	
}
