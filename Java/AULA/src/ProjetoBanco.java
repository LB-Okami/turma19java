import java.util.Scanner;

public class ProjetoBanco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double saldo = 1000;
		
		ContaEstudantil(saldo);
	}

	public static void ContaEstudantil(double saldo) {
		double limiteMax = 5000;
		double pedidoEmprestimo;
		double pedidoCredito;
		double debitoPoupanca;
		String opcaoPoupanca;
		String opcaoCred;
		String opcaoEmprestimo;
		
		for(int x = 0; x < 10; x++) {
			System.out.println("•CONTA EMPRESA | [Digite (sair) para voltar ao menu]\n");
		}
		
		
		System.out.println();
	}
}
