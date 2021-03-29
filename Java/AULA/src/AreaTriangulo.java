import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double base;
		double altura;
		double area;
		
		System.out.print("Digite a base do triângulo: ");
		base = leia.nextDouble();
		
		System.out.print("Digite a altura do triângulo: ");
		altura = leia.nextDouble();
		
		area = (base * altura) / 2;
		
		System.out.printf("A area do triângulo é %.1f", area);

	}

}
