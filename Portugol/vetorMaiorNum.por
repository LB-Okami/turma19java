programa
{
	
	funcao inicio()
	{
		inteiro pontuacao[5]
		inteiro maior = 0
		
		para(inteiro x = 0; x <5; x++) { 
			escreva("Quantos pontos?: ")
			leia(pontuacao[x])
			
			}
		para(inteiro x = 0; x < 5; x++) {
			se(maior < pontuacao[x]) {
				maior = pontuacao[x]
				}
			}
			escreva("O maior número foi: ", maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */