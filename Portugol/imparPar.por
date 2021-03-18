programa
{
	
	funcao inicio()
	{
		inteiro valor = 0


		escreva("Insira seu número: ")
		leia(valor)
		
		se (valor % 2 == 0) {
			escreva("Seu número é par")
			se(valor < 0) {
				escreva(" e negativo")
				}
			}
		senao se (valor % 2 <= 1) {
			escreva("Seu número é ímpar")
			se(valor < 0) {
				escreva(" e negativo")
				}
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */