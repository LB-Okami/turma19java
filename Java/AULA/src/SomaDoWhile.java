import java.util.Scanner;

public class SomaDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int contador = 0;
		double numeros = 0;
		double soma = 0;
		
		do {
			contador++;
			System.out.printf("Digite 0 para sair \n");
			System.out.printf("Digite o %d� n�mero: ", contador);
			numeros = leia.nextDouble();
			
			soma += numeros; 
			
		} while(numeros != 0);
		System.out.printf("A soma dos n�meros � %.2f", soma);
	}

}
