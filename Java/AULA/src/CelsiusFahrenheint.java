import java.util.Scanner;

public class CelsiusFahrenheint {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double celsius = 0;
		double fahrenheit = 0;
		int escolha;
		
		System.out.print("Você quer que converta para Celsius ou Fahrenheit? [1-Celsius | 2-Fahrenheit]: ");
		escolha = leia.nextInt();
		
		if(escolha == 1) {
			System.out.println("Você escolheu converter para Celsius!");
			System.out.print("Agora, digite a temperatura em Fahrenheit: ");
			fahrenheit = leia.nextDouble();
			
			celsius = (fahrenheit - 32) * 5/9;
			System.out.printf("A temperatura é: %.1f°C", celsius);
			
		}
		else if(escolha == 2) {
			System.out.println("Você escolheu converter para Fahrenheit!");
			System.out.print("Agora, difite a temperatura em Celsius: ");
			celsius = leia.nextDouble();
			
			fahrenheit = (celsius * 9/5) + 32;
			System.out.printf("A temperatura é: %.1f°F", fahrenheit);
			
		}
		else {
			System.out.println("Digite uma opção válida! Tente novamente...");
		}
		
	}
}
