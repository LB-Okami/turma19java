import java.util.Scanner;

public class TimesVetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String[] times = new String[4];
		int pontos[] = new int[4];
		int resultado;
		
		times[0] = "Corinthians";
		times[1] = "Santos";
		times[2] = "Flamengo";
		times[3] = "Vasco";
		
		for(int rodada = 1; rodada < 4; rodada++) {
			System.out.println("Rodada " + rodada);
			
			for(int y = 0; y < 4; y++) {
				System.out.println(times[y]);
				System.out.print("1-ganhou | 2-perdeu | 3-empatou");
				resultado = leia.nextInt();
				
				
				if(resultado == 1) {
					pontos[y] += 3;
				}
				else if(resultado == 2) {
					pontos[y] += 1;
				}
				else if(resultado == 3) {
					pontos[y] += 0;
				}
				else {
					System.out.println("Insira uma opção válida!");
				}
			}
			System.out.println("RESULTADOS \n");
			for(int x = 0; x < 4; x++) {
				System.out.println(times[x] + "pontos: " + pontos[x]);
			}
		}
	}

}
