import java.util.Scanner;

public class PessoaIdade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Sua idade faz parte do grupo infatil.");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Sua idade faz parte do grupo juvenil.");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Sua idade faz parte do grupo adulto.");
		}
		else {
			System.out.println("Infelizmente não temos vagas disponíveis para essa idade...");
		}
	}

}
