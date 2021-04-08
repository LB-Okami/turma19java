package entities;

public class Revista extends Produto {
	

	public Revista(String descricao, String iD, double valorUnitario, String editora) {
		super(descricao, iD, valorUnitario);
		this.editora = editora;
	}

	private String editora;

	//Encapsulamento - Getters and setters
	
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}
