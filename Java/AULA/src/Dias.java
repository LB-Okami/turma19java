import java.util.Scanner;

public class Dias {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int ano,mes,dia,dias;

        System.out.println("digite quantos dias voc� viveu: ");
        dia = leia.nextInt();
        ano = dia / 365;
        mes = dia % 365 / 30;
        dias= dia % 365 % 30;
        
        System.out.println("Voc� viveu por: " + ano + " anos " + mes + " meses " + "e " + dias + " dias");

	}

}
