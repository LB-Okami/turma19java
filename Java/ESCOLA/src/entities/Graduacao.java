package entities;

public class Graduacao extends Estudante {
	
	private double bonus = 2;
	
	// Construtor
	public Graduacao(String cpf, int matricula) {
		super(cpf, matricula);
		
	}

	
	
	//Encapsulamento - Getters and setters
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//Métodos 
	
	public void usarBonus(double bonus) {
		
		if(super.getPontos() < 0) {
			this.bonus -= bonus;
			super.adicionarNota(bonus);
		}
		
	}

}
