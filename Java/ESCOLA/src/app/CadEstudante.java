package app;
import java.util.Scanner;

import entities.Basico;
import entities.Estudante;

public class CadEstudante {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int mat;
		
		System.out.println("nome");
		nome = leia.next();
		
		System.out.println("mat");
		mat = leia.nextInt();
		
		Basico Lucas = new Basico(nome, mat, 5);
		
		Lucas.setDiaAniversario(28);
		
		Lucas.bonusAniversario(28);
		
		System.out.printf("O aluno %s, portador da matrícula %d, está com nota %.1f", nome, mat, Lucas.getPontos());
	}

}
