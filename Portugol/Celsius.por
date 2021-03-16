programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		cadeia nome
		real celsius

		escreva("Escreva seu nome: ")
		leia(nome)

		escreva("Insira a temperatura em Celsius: ")
		leia(celsius)

		real fahreheint = (celsius * 1.8) + 32
		
		escreva("Olá, ", nome, " a temperatura hoje é de: ", Matematica.arredondar(fahreheint, 2), "°F")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */