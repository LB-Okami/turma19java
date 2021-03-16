programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		cadeia nome
		real fahrenheint

		escreva("Escreva seu nome: ")
		leia(nome)

		escreva("Insira a temperatura em Fahreinheint: ")
		leia(fahrenheint)

		real celsius = (fahrenheint - 32) * 5/9
		
		escreva("Olá, ", nome, " a temperatura hoje é de: ", Matematica.arredondar(celsius, 1), "°C")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */