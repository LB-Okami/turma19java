import java.util.Scanner;

public class RaizPotencia {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;

		System.out.print("Insira o n�mero: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			int raiz = 0;
			raiz = (int) Math.sqrt(numero);
			
			System.out.printf("O n�mero %d � par e sua raiz � %d", numero, raiz);
		}
		else if(numero % 2 == 1) {
			int potencia = 0;
			potencia = (int) Math.pow(numero, 2);
			
			System.out.printf("O n�mero %d � �mpar e sua pot�ncia � %d", numero, potencia);
		}
	}

}
