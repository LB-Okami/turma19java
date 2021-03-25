import java.util.Scanner;

public class CalculoIdade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Digite o valor 1: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor 2: ");
		b = leia.nextInt();
		
		soma = a + b;
		System.out.println("A soma de " + a + " + " + b + " é: " + soma);
	}

}
