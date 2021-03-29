import java.util.Random;

public class DadoVetor {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		int maior = 0;
		int valor;
		int total = 0;
		double media;
		int maximo = 6;
		
		for(int x = 0; x < 10; x++) {
			Random rand = new Random();
			
			valor = rand.nextInt(maximo);
			int valorArrumado = valor + 1;
			
			vetor[x] = valorArrumado;
			
			total = total + vetor[x];
			
			if(maior < vetor[x]) {
				maior = vetor[x];
			}
			System.out.println(vetor[x]);
		}
		media = total / 10;
		System.out.printf("O total dos dados foi: " + total + "\nO maior número foi: " + maior + "\nA média das jogadas foi: %.1f", media);
	}

}
