package entities;

public class Terceiro extends Funcionario {
	private double adicional;
	
	//Construtores
	public Terceiro(String nome, String ID) {
		super(nome, ID);
	}
	
	public Terceiro(String nome, String iD, int horaTrabalhada, double valorHora, double adicional) {
		super(nome, iD, horaTrabalhada, valorHora);
		this.adicional = adicional;
	}

	//Encapsulamento - Getters & setters
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(int adicional) {
		this.adicional = adicional;
	}
	
	//Métodos
	@Override
	public double salario() {
		return (horaTrabalhada * valorHora) + adicional;
	}
	
	
	
}
