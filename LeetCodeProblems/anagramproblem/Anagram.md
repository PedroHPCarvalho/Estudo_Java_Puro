Problema:

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s e consistem em letras minúsculas em inglês.t

Solução:

Oque é um anagrama?
- Um anagrama é uma palavra ou frase formada pela reorganização das letras de outra palavra ou frase, geralmente usando todas as letras originais exatamente uma vez. Por exemplo, a palavra "anagrama" pode ser rearranjada para formar "nagaram".

Utilizei a seguinte estratégia para resolver o problema:

- Oque é pedido: Verificar se uma stinrg é anagrama de outra.
- Qual a saída: Booleano indicando se é ou não anagrama.
- Qual a entrada: Duas strings (uma como referencia, outra para comparação).
- Exemplos:
  - Exemplo 1:
    - Entrada: s = "anagram", t = "nagaram"
    - Saída: true
  - Exemplo 2:
    - Entrada: s = "rat", t = "car"
    - Saída: false
- Quais restrições existem:
  - Ambas as strings terão no máximo 50.000 caracteres.
  - Apenas letras minúsculas de a-z.
- Observações relevantes:
  - A ordem é irrelevante para um anagrama.
- Estrategia de resolução:
  - esse tipo de problema usa uma solução a partrir de contagem de frequencia, ja que a composição importa.
  - A tabela ASCII relaciona um caractere com um valor numérico único. As letras minúsculas de 'a' a 'z' estão associadas aos valores de 97 a 122.
  - Com isso podemos descobrir o index de cada letra subtraindo o valor ASCII do caractere 'a' (97) do valor ASCII do caractere atual. Por exemplo, para a letra 'c', o cálculo seria 99 - 97 = 2, então 'c' estaria no índice 2 do array de contagem.
  - Criei um array de contagem de tamanho 26 (para cada letra do alfabeto).
  - Percorri a primeira string incrementando a contagem para cada caractere.
  - Percorri a segunda string decrementando a contagem para cada caractere.
  - No final, verifiquei se todas as contagens são zero. Se forem, as strings são anagramas; caso contrário, não são.
