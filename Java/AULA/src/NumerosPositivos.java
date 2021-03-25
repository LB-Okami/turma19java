import java.util.Scanner;

public class NumerosPositivos {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, r, s, total;
		
		System.out.println("Digite o primeiro número: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		b = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		c = leia.nextInt();
		
		if(a < 0 || b < 0 || c < 0) {
			System.out.println("ERRO, APENAS NÚMEROS POSITIVOS!");
		}
		else if(a > 0 && b > 0 && c > 0) {
			r = (a + b) * (a + b);
			s = (b + c) * (b + c);
		
			total = (r + s) / 2;
		
			System.out.println("O valor de D é: " + total);
			}
		
		
	
	}
}
