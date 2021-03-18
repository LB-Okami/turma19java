programa
{ 
	
	funcao inicio()
	{
		real auxilio = 600
		real auxilioChefe = 1200
		cadeia nome 
		cadeia S
		
		escreva("Por favor insira seu nome: ")
		leia(nome)
		
		escreva("Olá, ", nome, " você é uma mulher e provedora de renda da sua família? [S/N]: ")
		leia(S)

		se(S == "s" ou  S == "S") {
			escreva("Por ser uma mulher e provedora de renda familiar você receberá RS", auxilioChefe)
			}
		senao se (S == "n" ou S == "N") {
			escreva("Você receberá R$ ", auxilio)
			}
		senao {
			escreva("Valor errado, tente novamente...")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 482; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */