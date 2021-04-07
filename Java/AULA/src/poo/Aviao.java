package poo;

public class Aviao {
	public int numeroSerie;
	public String modeloAviao;
	public int velocidadeAtual;
	public int velocidadeMaxima;
	public int aceleracao;
	
	
	public int acelera(int velocidade) {
		int velocidadeMaxima;
		
		this.velocidadeAtual = velocidadeAtual + velocidade;
		
		
		return velocidadeAtual;
	}
	
	public int desacelera(int velocidade) {
		int velocidadeMaxima;
		
		this.velocidadeAtual = velocidadeAtual - velocidade;
		
		
		return velocidadeAtual;
	}
}
