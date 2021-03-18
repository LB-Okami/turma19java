programa
{
	
	funcao inicio()
	{
		cadeia nome 
		cadeia preferencia
		real salario
		real acima1200 = 0.12
		real acima2500 = 0.25

		escreva("Olá, por favor insira seu nome: ")
		leia(nome)

		escreva("Como você gostaria de ser chamado? (Senhor, Senhora, Senhore): ")
		leia(preferencia)

		escreva("Por último, insira quanto é o seu sálario bruto: ")
		leia(salario)

		se(salario < 1200) {
			escreva(preferencia, ",", " seu salário está isento do imposto de renda!")
			}
		senao se(salario > 1200 e salario <= 2500) {
			real salarioImposto1 = salario * acima1200
			real salarioProcessado = salario - salarioImposto1
			
			escreva(preferencia, ",", " o valor bruto do seu sálario é: R$", salario, " o total de imposto a ser pago é: R$", salarioImposto1, " e o total salarial é R$", salarioProcessado)
			}
		senao {
			real salarioImposto2 = salario * 0.25
			real salarioProcessado2 = salario - salarioImposto2

			escreva(preferencia, ",", " o valor bruto do seu sálario é: R$", salario, " o total de imposto a ser pago é: R$", salarioImposto2, " e o total salarial é R$", salarioProcessado2)
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1116; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */