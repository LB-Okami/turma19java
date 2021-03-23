programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro matriz[10]
		inteiro maior = 0
		inteiro valor = 0
		inteiro total = 0
		inteiro media = 0
		
		para(inteiro x = 0; x < 10; x++) {
			valor = Util.sorteia(1, 6)
			matriz[x] = valor 
			escreva(matriz[x], " ")
			total = total + matriz[x]

			se(maior < matriz[x]) {
				maior = matriz[x]
				}
			}
		media = total / 10
		escreva(" \n\nO total é: ", total, "\nA média é: ", media, "\nO maior número foi: ", maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */