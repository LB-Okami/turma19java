programa
{
	
	funcao inicio()
	{
		contaEstudantil()
	}
	funcao contaEstudantil() {
	 	real saldo = 1000.0
		real limiteMax = 5000.0
		real pedidoEmprestimo
		real limiteEmprestimo = 5000
		real pedidoCredito = 0
		cadeia opcaoPoupanca
		real debitoPoupanca
		cadeia opcaoCred
		cadeia opcaoEmprestimo
			
			para (inteiro x = 0; x < 10; x++) {
				escreva("\nPor favor, insira a operação desejada:\n[Débito] / [Crédito] ")
				leia(opcaoPoupanca)

				se (opcaoPoupanca == "Débito" ou opcaoPoupanca == "débito" ou opcaoPoupanca == "debito" 
				ou opcaoPoupanca == "deb") {
					
					escreva("\nQuanto deseja retirar? R$")
					leia(debitoPoupanca)

					se (debitoPoupanca <= saldo) {
						saldo = saldo - debitoPoupanca
						escreva("\nO novo saldo é: R$" + saldo + ".\n")
					} senao {
						escreva("\nSaldo insuficiente.\n")
					}
				}
				senao se(opcaoPoupanca == "Credito" ou opcaoPoupanca == "crédito" ou opcaoPoupanca == "credito" 
				ou opcaoPoupanca == "cred") {
					escreva("\nQuanto você deseja de crédito?? R$:")
					leia(pedidoCredito)

					saldo = saldo + pedidoCredito

					escreva("Seu saldo agora é: ", saldo)
					}

				escreva("\nDeseja fazer um empréstimo? Seu saldo atual é R$", saldo, "   [S/N]: ")
				leia(opcaoEmprestimo)

				se(opcaoEmprestimo == "S" ou opcaoEmprestimo == "s" ou opcaoEmprestimo == "sim") {
					escreva("Quanto você deseja de empréstimo? R$")
					leia(pedidoEmprestimo)

					limiteEmprestimo = limiteEmprestimo - pedidoEmprestimo
					saldo = saldo + pedidoEmprestimo

					escreva("Parabéns, seu novo saldo é R$", saldo, " e o novo limite de empréstimo é R$", limiteEmprestimo)
					}
			}
		}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1171; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */