package LeetCodeProblems.reversestring;
class Solution {
    public void reverseString(char[] s) {
    // Vou utilizar dois ponteiros para percorrerem o array, enquanto um vai ate o final e le o index, o outro vai descobrir a posição dele inversa
    // for percorrendo todo o array, a cada indice vou ter um contador contando em direção ao zero, ele olha para o     tamanho da string e vai subtraindo para indicar a posição correspondente do indice na reversão
    // exemplo ["o","i"] = 0,1 -> ["i","o"] = 1,0
        int contadorReverso = s.length -1;
        for(int i = 0; i < contadorReverso; i++){
            // agora vou fazer a inversão de posições
            char temp = s[i];
            s[i] = s[contadorReverso];
            s[contadorReverso] = temp;
            contadorReverso--;
        };
        // System.out.println(s);
    }
}
// OQUE É
// - Função que tem como objetivo reverter um array do tipo char[] vindo na entrada
// QUAL A SAÍDA
// - A saída deve ser o mesmo array do tipo char com os dados invertidos
// QUAL A ENTRADA
// - A entrada é um array do tipo char com os dados na ordem inicial
// EXEMPLOS
// - Por exemplo se eu inserir um char[] teste = ["o","i"] ele será testeSaida = ["i","o"]
// RESTRIÇÃO
// - Sem String Vazia
// - Até 100.000 caracteres
// - Somente caracteres simples, que caibam em 1 byte (8bits) (espaço de memória)

