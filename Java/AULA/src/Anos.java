import java.util.Scanner;

public class Anos {
	

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int ano, mes, dia;
		String nome;
       	
       	System.out.println("Ol�, por favor, digite seu nome: ");
       	nome = leia.next();

       	System.out.println("Agora por favor digite quantos anos voc� tem: ");
       	ano = leia.nextInt();

       	System.out.println("Agora escreva quantos meses desde seu �ltimo anivers�rio se passaram: ");
       	mes = leia.nextInt();

       	System.out.println("Por �ltimo, escreva quantos dias desse m�s que este teste est� sendo feito passaram-se, exemplo (16/03 seria 16 dias): ");
       	dia = leia.nextInt();

       	int total = (ano * 365) + (mes * 30) + dia;

       	System.out.println("Parab�ns " + "nome" + "voc� est� na terra h� " + total + " dias");
	}

}
