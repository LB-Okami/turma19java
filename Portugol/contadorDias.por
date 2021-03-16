programa
{
	
	funcao inicio()
	{
		inteiro ano
		inteiro mes
		inteiro dia
		cadeia nome
		
		escreva("Olá, por favor, digite seu nome: ")
		leia(nome)

		escreva("Agora por favor digite quantos anos você tem: ")
		leia(ano)

		escreva("Agora escreva quantos meses desde seu último aniversário se passaram: ")
		leia(mes)

		escreva("Por último, escreva quantos dias desse mês que este teste está sendo feito passaram-se, exemplo (16/03 seria 16 dias): ")
		leia(dia)

		inteiro total = (ano * 365) + (mes * 30) + dia

		escreva("Parabéns ", "nome", "você está na terra há ", total, " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 590; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */