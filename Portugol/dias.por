programa
{


    funcao inicio()
    {
        inteiro ano,mes,dia,dias

        escreva("digite quantos dias você viveu: ")
        leia(dia)
        ano = dia / 365
        mes = dia % 365 /30
        dias= dia % 365 % 30

        escreva("Você viveu por: ", ano, " anos ", mes, " meses ", "e ",dias, " dias")

    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */