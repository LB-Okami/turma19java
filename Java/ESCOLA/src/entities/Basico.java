package entities;

public class Basico extends Estudante {
	private int diaAniversario;
	
	
	//Construtores
		public Basico(String cpf, int matricula, int nota) {
			super(cpf, matricula);
		
			super.adicionarNota(nota);
 			this.diaAniversario = diaAniversario;
		}
	
	//Encapsulamento - Getters and setters
		
	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	//Métodos
	public void bonusAniversario(int diaAtual) {
		if(this.diaAniversario == diaAtual) {
			super.adicionarNota(super.getPontos() * 0.1);
			
		}
	}
	
}
