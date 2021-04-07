package app;

import entities.Conta;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta contaLucas = new Conta(157,"591.731.268-85", 5800.5, true) ;
		
		System.out.println(contaLucas.getSaldo());
		contaLucas.debito(4000);
		System.out.println(contaLucas.getCpf());
		System.out.println(contaLucas.getSaldo());
		
		contaLucas.setSaldo(2000);
		
	}

}
