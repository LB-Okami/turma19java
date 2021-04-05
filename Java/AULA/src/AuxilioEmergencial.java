import java.util.Scanner;

public class AuxilioEmergencial {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int quantidadeFilhos = 0;
		int filho = 50;
		double valorBase = 300;
		int resposta;
		
		System.out.println("Olá, você já recebeu o auxílio antes? (1-Sim/2-Não)");
		resposta = leia.nextInt();
		
		if(resposta == 1) {
			System.out.println("Você já recebeu ou recebe o bolsa família? (1-Sim/2-Não)");
			resposta = leia.nextInt();
			
			if(resposta == 1) {
				System.out.println("Desculpe, você não pode receber o auxílio...");
			}
			
			else if(resposta == 2) {
				System.out.println("Parabéns, você está apto a receber o auxílio emergencial, valor base: " + valorBase);
				System.out.println("Quantos filhos você tem? "); 
				quantidadeFilhos = leia.nextInt();
				
				valorBase = valorBase + (quantidadeFilhos * 50);	
				
				
				System.out.println("Por último, você é uma mulher chefe de família? (1-Sim/2-Não)");
				resposta = leia.nextInt();
				if(resposta == 1) {
					valorBase = valorBase + 300;
					System.out.println("O valor do auxílio foi aumentado para: R$" + valorBase);
				}
				System.out.println("O valor do auxílio total será de R$" + valorBase);
			}
		}
		else if(resposta == 2) {
			System.out.println("Desculpe, você não pode receber o auxílio...");
		}
	}

}
