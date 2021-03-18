programa
{
    
    funcao inicio()
    {
        cadeia infatilA = "Você está na série infatil A (5 - 7 anos)"
        cadeia infantilB = "Você está na série infatil B (8 - 11 anos)"
        cadeia juvenilA = "Você está na série juvenil A (12 - 13 anos)"
        cadeia juvenilB = "Você está na série juvenil B (14 - 17 anos)"
        cadeia adulto = "Você está na série adulta (acima de 18 anos)"
        inteiro idade

        escreva("Olá, por favor insira sua idade: ")
        leia(idade)

         se(idade >= 5 e idade < 8 ) {
             escreva(infatilA)
             }
         senao se(idade >= 8 e idade <= 11) {
             escreva(infantilB)
             }
         senao se(idade >= 12 e idade <= 13) {
             escreva(juvenilA)
             }
         senao se(idade >= 14 e idade <= 17) {
             escreva(juvenilB)
             }
         senao se(idade >= 18) {
             escreva(adulto)
             }
         senao {
             escreva("Atenção! Nós aceitamos apenas pessoas na com mais de 5 anos, por favor, tente novamente (verifique se colocou um número!)")
             }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 534; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */