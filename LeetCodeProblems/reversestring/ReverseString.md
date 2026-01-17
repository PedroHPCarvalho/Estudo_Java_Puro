Problema:

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.


Solução:

Utilizei a seguinte estratégia para resolver o problema:

- Oque é pedido: Inverter uma string representada como um array de caracteres.
- Qual a saída: O array de caracteres invertido.
- Qual a entrada: Um array de caracteres.
- Exemplos:
  - Exemplo 1:
    - Entrada: ["h","e","l","l","o"]
    - Saída: ["o","l","l","e","h"]
  - Exemplo 2:
    - Entrada: ["H","a","n","n","a","h"]
    - Saída: ["h","a","n","n","a","H"]
- Quais restrições existem: 
  - Modificar o array in-place.
  - Máximo de 100.000 caracteres.
  - Sem array nulo.


Qual o passo a passo que defini:
1. Iria inicia o ponteiro direito como contadorReverso por vir do final em direção ao começo.
2. fiz um for que inicia o ponteiro esquerdo do inicio do array e vai em direção ao final.
2. para trocar somente o necessário, o for iria até a metade do array.
3. a cada iteração, o valor do index do ponteiro esquerdo seria trocado com o valor do index do ponteiro direito.
4. iria incrementar o ponteiro esquerdo e decrementar o ponteiro direito a cada iteração.
5. quando eles se encontraram a condição de parada foi atingida e a esse ponto o array já estaria invertido.

Por que utiliar dois ponteiros (two pointers), e como ele funciona?
Usei ela pois precisava movimentar dentro do array de direções diferentes, assim cada um olhava para um extremo e fornecendo os valores do index que estavam.
Assim foi possivel realiar trocas, com ajuda da variavel temporaria, sem perder os valores originais do ponteiro esquerdo para passa-lo para o direito depois de trocas.

usei dois ponteiros porque precisava trocar elementos simétricos (início ↔ fim) sem criar outro array e em O(n).

como funciona os dois ponteiros em geral?
Dois ponteiros são variáveis que apontam para posições dentro de uma estrutura de dados, como um array ou uma lista vinculada. Eles são usados para percorrer a estrutura de dados de maneiras diferentes, geralmente para comparar, modificar ou analisar os elementos.

Quando utilizar dois ponteiros?
Os dois ponteiros são úteis em várias situações, como:
- Pesquisa de pares em arrays ordenados.
- Remoção de duplicatas.
- Reversão de arrays ou listas.
- Verificação de palíndromos.