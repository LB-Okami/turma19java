import java.util.Scanner;

public class ContadorParImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int par = 0;
		int impar = 0;
		
		for(int x = 0; x < 10; x++) {
			System.out.printf("Insira o %d° número: ", x+1);
			numero = leia.nextInt();
			
			if(numero % 2 == 0 ) {
				par++;
			}
			if(numero % 2 == 1) {
				impar++;
			}	
		}
		System.out.printf("O total de números pares foi: %d \n", par);
		System.out.printf("O total de números ímpares foi: %d", impar);
	}

}
