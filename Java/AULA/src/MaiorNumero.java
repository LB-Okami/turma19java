import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		int maior = 0;
		
		System.out.print("Escreva o primeiro n�mero: ");
		num1 = leia.nextInt();
		
		System.out.print("Escreva o segundo n�mero: ");
		num2 = leia.nextInt();
		
		System.out.print("Escreva o terceiro n�mero: ");
		num3 = leia.nextInt();
		
		if(num1 >= num2 && num1 == num3) {
			maior = num1;
		}
		
		else if(num2 >= num1 && num2 >= num3) {
			maior = num2;
		}
		
		else if(num3 >= num1 && num3 > num2) {
			maior = num3;
		}
		System.out.println("Os n�meros s�o:\n " + num1 + "\n " + num2 + "\n " + num3 + "\nO maior deles �: " + maior);
	}

}
