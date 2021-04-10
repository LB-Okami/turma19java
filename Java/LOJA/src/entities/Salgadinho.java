package entities;

public class Roupa extends Produto {
	
	private String marca;

	public Roupa(String descricao, String iD, double valorUnitario, String marca) {
		super(descricao, iD, valorUnitario);
		this.marca = marca;
	}

	//Encapsulamento - Getters and setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
