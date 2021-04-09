package entities;
import java.util.Scanner;

public class Medio extends Estudante {
	Scanner leia = new Scanner(System.in);
	
	private int contadorBoletim;
	
	// Construtor
	public Medio(String cpf, int matricula, int nota) {
		super(cpf, matricula);
		
		super.adicionarNota(nota);
		
	}
	
	// Encapsulamento
	public int getContadorBoletim() {
		return contadorBoletim;
	}

	public void setContadorBoletim(int contadorBoletim) {
		this.contadorBoletim = contadorBoletim;
	}
	
	//Método
	public void imprimirBoletim(double nota) {
	
		int quantidadeBoletim = 0;
		int contadorBoletim = 3;
		
		
		
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Quantos boletins você deseja pedir? Lembrando que o limite é 3");
			quantidadeBoletim = leia.nextInt();
			
			if(quantidadeBoletim <= contadorBoletim) {
				contadorBoletim -= quantidadeBoletim;
				
				System.out.println("Boletim: " + super.getPontos());
			}
			else {
				System.out.println("Você excedeu o máximo de boletins...");
				break;
			}
				
		}
	}
} 
