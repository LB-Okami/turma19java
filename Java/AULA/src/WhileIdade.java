import java.util.Scanner;

public class WhileIdade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		int menos21 = 0;
		int mais50 = 0;

		while(idade != -99) {
			System.out.print("Digite -99 para parar\n Insira a idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade > 0) {
				menos21++;
			}
			
			if(idade > 50) {
				mais50++;
			}
		}
		System.out.printf("O número de pessoas com menos de 21 anos é %d \n", menos21);
		System.out.printf("O número de pessoas com mais de 50 anos é %d", mais50);
	}

}
