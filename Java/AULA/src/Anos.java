import java.util.Scanner;

public class Anos {
	

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int ano, mes, dia;
		String nome;
       	
       	System.out.println("Olá, por favor, digite seu nome: ");
       	nome = leia.next();

       	System.out.println("Agora por favor digite quantos anos você tem: ");
       	ano = leia.nextInt();

       	System.out.println("Agora escreva quantos meses desde seu último aniversário se passaram: ");
       	mes = leia.nextInt();

       	System.out.println("Por último, escreva quantos dias desse mês que este teste está sendo feito passaram-se, exemplo (16/03 seria 16 dias): ");
       	dia = leia.nextInt();

       	int total = (ano * 365) + (mes * 30) + dia;

       	System.out.println("Parabéns " + "nome" + "você está na terra há " + total + " dias");
	}

}
