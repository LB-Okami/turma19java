import java.util.Scanner;

public class Segundos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tempoSegundos, segundos, minutos, horas;

		System.out.println("Escreva o total de segundos no evento");
		tempoSegundos = leia.nextInt();
		
		 horas = tempoSegundos / (60 * 60);
		 minutos = tempoSegundos % (60 * 60) / 60;
		 segundos = tempoSegundos % (60 * 60) % 60;
		 
		 System.out.println("O tempo do evento é: " + horas + "h" + ":" + minutos + "m" + ":" + segundos + "s");  
	}

}
