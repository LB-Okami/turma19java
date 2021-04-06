import java.util.Scanner;

public class NotaVetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nomes[] = new String[4];
		double notas[] = new double[4];
		
		for(int x = 0; x < nomes.length; x++) {
			System.out.printf("Digite o nome do %d° aluno: ", x+1);
			nomes[x] = leia.next();
			
			System.out.printf("Digite a nota do %d° aluno: ", x+1);
			notas[x] = leia.nextDouble();
			
			if(notas[x] <= 5) {
				System.out.printf("Ainda não, %s, se esforce mais, sua nota foi %.1f \n", nomes[x], notas[x]);
			}
			else if(notas[x] > 5) {
				System.out.printf("Muito bem, %s, sua nota foi %.1f \n", nomes[x], notas[x]);
			}
		}
	}

}
