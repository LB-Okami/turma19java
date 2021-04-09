package app;
import java.util.Scanner;

import entities.Graduacao;
import entities.Medio;

public class CadEstudante {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int matricula;
		
		Graduacao Lucas = new Graduacao("Lucas", 2224);
		Medio Leandro = new Medio("539392", 6, 9);
		
		System.out.println(Lucas.getPontos());
		
		Lucas.adicionarNota(-1);
		
		System.out.println(Lucas.getPontos());
		
		if(Lucas.getPontos() < 0) {
			Lucas.usarBonus(2);
		}
		System.out.println(Lucas.getPontos());
		
		System.out.println(Lucas.getBonus());
		
	}

}
