Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105

Solução:

Oque é e oque faz?
  - A função verifica se existem dois índices distintos i e j em um array de inteiros tal que os valores nesses índices são iguais e a diferença absoluta entre os índices é menor ou igual a um valor k fornecido.

Qual a saída:
  - Retorna true se existir um par de indices que a diferença seja menor ou igual a k e os valores sejam iguais, caso contrário retorna false.

Qual a entrada:
  - Um array de inteiros nums e um inteiro k.

Exemplos:
  - Exemplo 1:
    - Entrada: nums = [1,2,3,1], k = 3
    - Saída: true
  - Exemplo 2:
    - Entrada: nums = [1,0,1,1], k = 1
    - Saída: true
  - Exemplo 3:
    - Entrada: nums = [1,2,3,1,2,3], k = 2
    - Saída: false

Quais restrições existem:
  - O array nums pode ter até 100.000 elementos.
  - Os valores em nums podem variar entre -1 bilhão até 1 bilhão.
  - k pode variar entre 0 até 100.000.

Observações:
  - A função deve ser eficiente para lidar com o tamanho máximo do array.

Estratégia para resolver o problema:
  - Estrategia 1: Hash Map para atrelar valores aos seus índices e depois verificar as distancias (Utilizada essa)
  - Estrategia 2: Janela Deslizante com Set para manter os últimos k elementos vistos

Passo a passo que defini:
1. Criei um objeto (hash map) para armazenar os números já vistos e seus respectivos índices.
2. Percorri o array nums com um loop for.
3. Para cada número, verifiquei se ele já existe no hash map.
4. Se existir, calculei a diferença entre o índice atual e o índice armazenado no hash map.
   - Se a diferença for menor ou igual a k, retornei true.
5. Se não existir ou a diferença for maior que k, atualizei o hash map com o índice atual do número.
6. Continuei esse processo até o final do array.
7. Se o loop terminar sem encontrar pares válidos, retornei false.


Erros que cometi

1️⃣ Uso incorreto de containsValue
Erro: Utilizar containsValue(nums[i])
Motivo: O HashMap armazena valor -> índice, então os values são índices, não os valores do array.

  - Correção: Utilizar containsKey(nums[i]) para verificar se o número já apareceu antes.

2️⃣ Atualizar o índice antes de comparar
Erro: Inserir o valor no HashMap antes de calcular a distância entre índices.
Motivo: Isso sobrescreve o índice anterior, fazendo a diferença sempre resultar em 0.

  - Correção: Primeiro verificar se a chave existe e calcular a distância usando o índice antigo; só depois atualizar o índice no mapa.

3️⃣ Limite incorreto do laço for
Erro: Iterar até nums.length - 1 sem necessidade.
Motivo: O último elemento do array não é processado, podendo ignorar duplicatas válidas.

  - Correção: Usar i < nums.length sempre que não houver acesso a i + 1.