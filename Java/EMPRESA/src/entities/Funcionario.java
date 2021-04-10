package entities;

public class Funcionario {
	private String nome;
	private String ID;
	protected int idade;
	protected int horaTrabalhada;
	protected double valorHora = 40;
	
	//Construtor
	public Funcionario(String nome, String ID) {
		this.nome = nome;
		this.ID = ID;
	}
	
	public Funcionario(String nome, String iD, int horaTrabalhada, double valorHora) {
		super();
		this.nome = nome;
		ID = iD;
		this.horaTrabalhada = horaTrabalhada;
		this.valorHora = valorHora;
	}

	//Encapsulamento - Getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getHoraTrabalhada() {
		return horaTrabalhada;
	}

	public void setHoraTrabalhada(int horaTrabalhada) {
		this.horaTrabalhada = horaTrabalhada;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	//Métodos 
	public double salario() {
		return horaTrabalhada * valorHora;
	}

	
	
}
