import java.util.Scanner;

public class Prefeitura {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double salario = 0;
		double mediaSalario = 0;
		double filhos = 0;
		double mediaFilhos = 0;
		double maiorSalario = 0;
		double salario100 = 0;
		
		for(int x = 0; x < 20; x++) {
			System.out.printf("Insira o salário do %d° habitante R$", x+1);
			salario = leia.nextDouble();
			
			System.out.printf("Quantos filhos o %d° habitante tem?: ", x+1);
			filhos = leia.nextInt();
			
			if(salario > maiorSalario) {
				maiorSalario = salario;
			}
			
			if(salario <= 100) {
				salario100++;
			}
			
			mediaSalario += salario;
			mediaFilhos += filhos;
		}
		mediaSalario = mediaSalario / 20;
		mediaFilhos = mediaFilhos / 20;
		salario100 = (salario100 * 100) / 20;
		
		System.out.printf("A média salarial dos habitantes é R$%.2f \n", mediaSalario);
		
		System.out.printf("O maior salário é R$%.1f \n", maiorSalario);
		
		System.out.printf("A média de filhos dos habitantes é %.1f \n", mediaFilhos);
		
		System.out.printf("A porcentagem de quem ganha até R$100 é %.1f", salario100);
		System.out.print("%");
		
	}

}
