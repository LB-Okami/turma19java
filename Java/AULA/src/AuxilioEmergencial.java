import java.util.Scanner;

public class AuxilioEmergencial {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int quantidadeFilhos = 0;
		int filho = 50;
		double valorBase = 300;
		int resposta;
		
		System.out.println("Ol�, voc� j� recebeu o aux�lio antes? (1-Sim/2-N�o)");
		resposta = leia.nextInt();
		
		if(resposta == 1) {
			System.out.println("Voc� j� recebeu ou recebe o bolsa fam�lia? (1-Sim/2-N�o)");
			resposta = leia.nextInt();
			
			if(resposta == 1) {
				System.out.println("Desculpe, voc� n�o pode receber o aux�lio...");
			}
			
			else if(resposta == 2) {
				System.out.println("Parab�ns, voc� est� apto a receber o aux�lio emergencial, valor base: " + valorBase);
				System.out.println("Quantos filhos voc� tem? "); 
				quantidadeFilhos = leia.nextInt();
				
				valorBase = valorBase + (quantidadeFilhos * 50);	
				
				
				System.out.println("Por �ltimo, voc� � uma mulher chefe de fam�lia? (1-Sim/2-N�o)");
				resposta = leia.nextInt();
				if(resposta == 1) {
					valorBase = valorBase + 300;
					System.out.println("O valor do aux�lio foi aumentado para: R$" + valorBase);
				}
				System.out.println("O valor do aux�lio total ser� de R$" + valorBase);
			}
		}
		else if(resposta == 2) {
			System.out.println("Desculpe, voc� n�o pode receber o aux�lio...");
		}
	}

}
