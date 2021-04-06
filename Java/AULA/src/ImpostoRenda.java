import java.util.Scanner;

public class ImpostoRenda {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		String preferencia;
		double salario;
		double acima1200 = 0.12;
		double acima2500 = 0.25;
		
		System.out.print("Insira seu nome: ");
		nome = leia.next();
		
		System.out.print("Como voc�s gostaria de ser chamado? (senhor, senhora, senhore): ");
		preferencia = leia.next();
		
		System.out.print("Por �ltimo, digite seu sal�rio: ");
		salario = leia.nextDouble();
		
		if(salario <= 1500) {
			System.out.printf("%s %s, seu sal�rio � isento do imposto de renda!", preferencia, nome);
		}
		else if(salario > 1500 && salario <= 2500) {
			salario = salario - (salario * 0.12);
			
			System.out.printf("%s %s, seu sal�rio atualizado � R$ %.2f", preferencia, nome, salario);	
		}
		else if(salario > 2500) {
			salario = salario - (salario * 0.25);
			
			System.out.printf("%s %s, seu sal�rio atualizado � R$ %.2f", preferencia, nome, salario);	
		}
	}

}
