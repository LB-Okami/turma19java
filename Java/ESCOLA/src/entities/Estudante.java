package entities;

public class Estudante {
	private int matricula;
	private String cpf;
	private double pontos;
	private boolean status;
	
	
	
	//Contrutores
	public Estudante(String cpf, int matricula) {
		super();
		this.cpf = cpf;
		this.matricula = matricula;
	}
	
	//M�todos
	
	public void adicionarNota(int nota) {
		this.pontos +=  nota;
		
	}
	
	public void tirarNota(int nota) {
		
		if(pontos >= nota) {
			this.pontos -=  nota;
		}
		
		else if(pontos < nota) {
			System.out.println("Imposs�vel retirar nota...");
		}
		
	}
	
	//Encapsulamento - getters and setters
	public int getMatricula() {
		return matricula;
	}
	
	/*
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	*/

	public String getCpf() {
		return cpf;
	}

	/*
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	*/
	
	public double getPontos() {
		return pontos;
	}
	
	/*
	public void setPontos(double pontos) {
		this.pontos = pontos;
	}
	*/
}
