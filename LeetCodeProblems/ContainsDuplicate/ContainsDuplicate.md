Problema:

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true

Example 2:

Input: nums = [1,2,3,4]

Output: false

 

Constraints:

1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9

Solução:

O que é duplicidade?
- Duplicidade é caracterizada quando existe dois ou mais valores iguais em um array. O objetivo é detectar se há pelo menos uma repetição de qualquer elemento.

Utilizei a seguinte estratégia para resolver o problema:

- O que é pedido: Verificar se um array de inteiros contém valores duplicados.
- Qual a saída: Booleano indicando se contém ou não duplicatas (true = contém duplicatas, false = todos elementos são distintos).
- Qual a entrada: Um array de inteiros (nums).
- Exemplos:
  - Exemplo 1:
    - Entrada: nums = [1,2,3,1]
    - Saída: true
  - Exemplo 2:
    - Entrada: nums = [1,2,3,4]
    - Saída: false
- Quais restrições existem:
  - Array com no mínimo 1 elemento e no máximo 100.000 elementos.
  - Valores podem variar de -1 bilhão a 1 bilhão.
- Observações relevantes:
  - Basta encontrar uma única duplicata para retornar true.
  - A ordem dos elementos é irrelevante.
- Estratégia de resolução:
  - Utilizei a estrutura de dados **HashSet**, que armazena valores únicos e permite verificação em tempo constante O(1).
  - A tabela hash é ideal para este problema pois oferece operações de busca e inserção muito rápidas.
  - Percebi o array iterando sobre cada elemento.
  - Para cada elemento, verifico se ele já existe no HashSet usando o método `contains()`.
  - Se o elemento já existe, significa que é uma duplicata, então retorno true imediatamente.
  - Se o elemento não existe, adiciono-o ao HashSet usando o método `add()`.
  - Se completar a iteração sem encontrar duplicatas, retorno false.

Por que utilizar HashSet?
- HashSet oferece O(1) de complexidade média para inserção e busca.
- Não é necessário ordenar o array.
- A solução é simples, intuitiva e muito eficiente para esse tipo de problema.
- Alternativas como ordenação teriam complexidade O(n log n), que é mais lenta.