programa
{
	
	funcao inicio()
	{
		real base 
		real altura

		escreva("Por favor, insira a base: ")
		leia(base)

		escreva("Por favor, insira a altura: ")
		leia(altura)

		se(base > 0 e altura > 0) {
			real resultado = (base * altura) / 2 
			escreva("A área do triangulo é: ", resultado)
			}
		senao {
			escreva("Não é possível calcular 0 e números negativos.")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */