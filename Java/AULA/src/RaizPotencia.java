import java.util.Scanner;

public class RaizPotencia {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;

		System.out.print("Insira o número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			int raiz = 0;
			raiz = (int) Math.sqrt(numero);
			
			System.out.printf("O número %d é par e sua raiz é %d", numero, raiz);
		}
		else if(numero % 2 == 1) {
			int potencia = 0;
			potencia = (int) Math.pow(numero, 2);
			
			System.out.printf("O número %d é ímpar e sua potência é %d", numero, potencia);
		}
	}

}
