package testePOO;

import poo.Animal;
import poo.Cachorro;
import poo.Cavalo;
import poo.Preguica;

public class TesteAnimal {
	public static void main(String[] args) {
		Animal cachorro = new Cachorro("princesa", 10, "auau", "corre");
		Animal cavalo = new Cavalo("revista", 7, "*som de cavalo*", "trota");
		Animal preguica = new Preguica("pedro", 5, "*som de preguiça*", "sobe em árvores");
		
		System.out.printf("O som do cachorro é: %s \n", cachorro.som);
		System.out.printf("O som do cavalo é: %s \n", cavalo.som);
		System.out.printf("O som da preguiça é: %s", preguica.som);
	}
}
