package entities;

public class Conta {
	//ATRIBUTOS
	private int numeroConta;
	private String cpf;
	private double saldo = 0;
	public boolean ativa;
	
	//CONSTRUTORES
	public Conta(int numeroConta, String cpf, double saldo, boolean ativa) {
		this.saldo = saldo;
		this.cpf = cpf;
		this.ativa = ativa;
		this.numeroConta = numeroConta;
	}
	
	//ENCAPSULAMENTO
	public String getCpf() {
		
		return this.cpf;
	}
	
	public String setCpf(String cpfAlterado) {
		this.cpf = cpfAlterado;
		
		return cpfAlterado;
	}
	
	public double getSaldo() {
		
		return this.saldo;
	}
	
	public double setSaldo(int saldoAlterado) {
		this.saldo = saldoAlterado;
		
		return saldoAlterado;
	}
	
	//MÉTODO
	public void debito(double valor) {
		if(valor < saldo) {
			saldo = saldo - valor;
		}
		else if(valor > saldo) {
			System.out.println("Desculpe, saldo insuficiente.");
		}
	}
	
	public void credito(double valor) {
		saldo = saldo + valor;
		
	}
}
