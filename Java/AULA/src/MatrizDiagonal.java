import java.util.Random;

public class MatrizDiagonal {
	
	public static void main(String[] args) {
		int matriz[][] = new int[3][3]; 
		int totalDiagonal = 0;
		int numero = 0;
		int valor = 0;
		int maximo = 10;
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				Random rand = new Random();
				numero = rand.nextInt(maximo);
				matriz[linha][coluna] = numero;
				
				if(linha == coluna) {
					totalDiagonal = totalDiagonal + matriz[linha][coluna];
					
				}
				
			}
		}
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.println(matriz[linha][coluna] + " ");
			}
			System.out.println("\n");
		}
		System.out.println("O total das diagonais é:" + totalDiagonal);
	}
}
