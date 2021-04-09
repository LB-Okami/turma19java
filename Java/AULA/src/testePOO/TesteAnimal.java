package testePOO;

import java.util.ArrayList;
import java.util.List;

import poo.Animal;
import poo.Cachorro;
import poo.Cavalo;
import poo.Preguica;

public class TesteAnimal {
	public static void main(String[] args) {
		
		List<Animal> animais = new ArrayList<>();
		
		
		animais.add(new Cachorro("princesa", 10, "auau", "corre")); 
		Animal cavalo = new Cavalo("revista", 7, "*som de cavalo*", "trota");
		Animal preguica = new Preguica("pedro", 5, "*som de preguiça*", "sobe em árvores");
		Animal tartaruga = new Animal();
		
		for(Animal animal : animais) {
			System.out.printf("tem %d anos, o seu som é %s e o seu movimento é %s\n", animal.idade, animal.som, animal.movimento);
		}
		
	}
}
