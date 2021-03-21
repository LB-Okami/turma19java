programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro opcao

		escreva("Digite 1 para conversão de fahreheint em Celsius e 2 para fahreheint em Celsius:  \n")
		leia(opcao)
	

		se(opcao == 1) {
			real temperaturaF
			
			escreva("Agora, digite a temperatura em °F: ")
			leia(temperaturaF)
			
			escreva(calculoCelsius(temperaturaF), "°C")
			}
		se(opcao == 2) {
			real temperaturaC

			escreva("Agora, digite a temperatura em °C: ")
			leia(temperaturaC)
			
			escreva(calculoFahreheint(temperaturaC), "°F")
			}

	}
	
	funcao real calculoFahreheint(real celsius) {
 
			real fahreheint = (celsius * 1.8) + 32

			fahreheint = Matematica.arredondar(fahreheint, 2)

			retorne fahreheint
	}

	funcao real calculoCelsius(real fahreheint) {
		
		real celsius = (fahreheint - 32) * 5/9

		celsius = Matematica.arredondar(celsius, 2)

		retorne celsius
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 635; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */