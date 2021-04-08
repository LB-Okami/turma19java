package app;

import entities.Estudante;

public class CadEstudante {

	public static void main(String[] args) {
		Estudante pedro = new Estudante("994.999.999-92", 185);
		
		System.out.println(pedro.getCpf());

	}

}
