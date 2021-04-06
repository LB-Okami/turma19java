import java.util.Scanner;

public class Multiplo3DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int contador = 0;
		double numeros = 0;
		double media = 0;
		double soma = 0;
		
		do {
			contador++;
			System.out.printf("Digite 0 para sair \n");
			System.out.printf("Digite o %d° número: ", contador);
			numeros = leia.nextDouble();
			
			if(numeros % 3 == 0) {
				soma += numeros; 
			}
			
		} while(numeros != 0);
		
		media = soma / (contador - 1);
		
		System.out.printf("A soma dos números é %.1f e a média é %.1f", soma, media);
	}

}
