Problema:

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Solução:

Utilizei a seguinte estratégia para resolver o problema:

- Oque é pedido: Retornar os índices de dois números em um array que somados resultam em um valor alvo (target).
- Qual a saída: array com os índices dos dois números.
- Qual a entrada: um array de inteiros onde vamos procurar os resultados e um inteiro alvo (target).
- Exemplos:
  - Exemplo 1:
    - Entrada: nums = [2,7,11,15], target = 9
    - Saída: [0,1]
  - Exemplo 2:
    - Entrada: nums = [3,2,4], target = 6
    - Saída: [1,2]
  - Exemplo 3:
    - Entrada: nums = [3,3], target = 6
    - Saída: [0,1]
- Quais restrições existem:
  - Entradas tem tamanho de até 100.000 no array nums.
  - Cada número no array pode variar entre -1 bilhão até 1 bilhão.
  - target também pode variar entre -1 bilhão até 1 bilhão.
  - Sempre existe uma solução válida.


Qual o passo a passo que defini:
1. Criei um objeto (hash map) para armazenar os números já vistos e seus respectivos índices.
2. Percorri o array nums com um loop for.
3. Para cada número atual, calculei o complemento necessário para atingir o target (complemento = target - número atual).
4. Verifiquei se o complemento já está presente no objeto (hash map).
   - Se estiver presente, retornei os índices do complemento e do número atual.
   - Se não estiver presente, adicionei o número atual e seu índice ao objeto (hash map) e continuei a iteração.
5. Continuei esse processo até encontrar a solução, que é garantida pela restrição do problema.

Por que utiliar um hash map, e como ele funciona?
Usei um hash map porque ele permite armazenar e acessar os números já vistos em tempo constante O(1). Isso torna a busca pelo complemento muito eficiente, evitando a necessidade de um loop aninhado que resultaria em complexidade O(n^2). alem disso, o hash map facilita a associação entre os números e seus índices, permitindo retornar rapidamente os índices quando o complemento é encontrado.