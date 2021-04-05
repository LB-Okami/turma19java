import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numeros[] = new int[3];
		int maior = 0;
		int intermediario = 0;
		int menor = 0;
		
		for(int x =0; x < 3; x++) {
			System.out.printf("Escreva o %d° número: \n", x+1);
			numeros[x] = leia.nextInt();
			
		}
		Arrays.sort(numeros);
		for(int y = 0; y < numeros.length; y++) {
			System.out.print(Arrays.asList(numeros[y]));
		}
	}

}
