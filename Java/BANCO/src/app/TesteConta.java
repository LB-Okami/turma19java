package app;

import entities.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta contaLucas = new Conta();
		Conta contaPedro = new Conta();
		
		contaPedro.cpf = "5000";
		contaPedro.saldo = 2300.50;
		
		contaLucas.cpf = "4040";
		contaLucas.ativa = true;
		contaLucas.saldo = 5000.4;
		
		System.out.println(contaLucas.saldo);
		System.out.println(contaPedro.saldo);
		
		contaLucas.debito(6000);
		System.out.println(contaLucas.saldo);

	}

}
