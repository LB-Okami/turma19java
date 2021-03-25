import java.util.Scanner;

public class Imposto {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double impostoEstado = 0.45;
		double impostoFabrica = 0.28;
		double valorInicial = 0;
		
		System.out.print("Digite o valor inicial R$");
		valorInicial = leia.nextDouble();
		
		double total = valorInicial + (valorInicial * impostoEstado) + (valorInicial * impostoFabrica); 
		
		System.out.printf("O valor total a ser pago é R$ %.1f", total );
	}
}
