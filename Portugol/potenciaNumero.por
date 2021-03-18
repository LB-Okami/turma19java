programa
{
	
	funcao inicio()
	{
		inteiro num1
		inteiro num2
		inteiro num3
		inteiro num4

		escreva("Digite o primeiro número: ")
		leia(num1)

		escreva("Digite o segundo número: ")
		leia(num2)

		escreva("Digite o terceiro número: ")
		leia(num3)

		escreva("Digite o quarto número: ")
		leia(num4)
		
		inteiro quadradonum1 = num1 * num1
		inteiro quadradonum2 = num2 * num2
		inteiro quadradonum3 = num3 * num3
		inteiro quadradonum4 = num4 * num4

		se(quadradonum3 >= 1000) {
			escreva(quadradonum3)
			}
		senao {
			escreva(quadradonum1, "\n", quadradonum2, "\n", quadradonum3, "\n", quadradonum4)
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 628; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */