package testePOO;

import java.util.Scanner;
import poo.Aviao;

public class testeAviao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Aviao novoModelo = new Aviao();
		
		novoModelo.modeloAviao = "A350";
		novoModelo.numeroSerie = 49540;
		novoModelo.velocidadeMaxima = 945;
		
		System.out.printf("Olá, o modelo do avião que chegou hoje foi o : %s \n", novoModelo.modeloAviao);
		System.out.printf("O número de série é: %s \n", novoModelo.numeroSerie);
		System.out.printf("Este modelo consegue chegar até a %dKm/h \n", novoModelo.velocidadeMaxima);
		
		System.out.println("Quanto deseja acelerar?");
		novoModelo.aceleracao = leia.nextInt();
		
		novoModelo.acelera(novoModelo.aceleracao);
		
		System.out.printf("A velocida atual é %dKm/h \n",novoModelo.velocidadeAtual);
		
		System.out.println("Quanto deseja desacelerar?");
		novoModelo.aceleracao = leia.nextInt();
		
		novoModelo.desacelera(novoModelo.aceleracao);
		
		System.out.printf("A velocida atual é %dKm/h",novoModelo.velocidadeAtual);
	}
}
