# Intersection of Two Arrays

## Problema

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

### Exemplos

- **Exemplo 1:**
  - Entrada: nums1 = [1,2,2,1], nums2 = [2,2]
  - Saída: [2]

- **Exemplo 2:**
  - Entrada: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
  - Saída: [9,4] ou [4,9]

### Restrições

- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 1000

## Solução

### O que é interseção de arrays?
- A interseção de dois arrays é o conjunto de elementos que aparecem em ambos os arrays.
- Elementos duplicados devem aparecer apenas uma vez no resultado.
- A ordem do resultado é irrelevante.

### Estratégia de Resolução

**Estrutura de dados utilizada: HashSet**

- Um HashSet é ideal para este problema porque:
  - Armazena elementos únicos (sem duplicatas)
  - Oferece busca em tempo O(1)
  - Cresce dinamicamente conforme necessário

### Passo a Passo

1. **Criar um HashSet com todos os elementos do primeiro array (nums1)**
   - Iterar sobre nums1 e adicionar cada elemento ao set

2. **Iterar sobre o segundo array (nums2)**
   - Para cada elemento, verificar se existe no set de nums1
   - Se existir, adicionar ao resultado

3. **Converter o HashSet resultado para um array int[]**
   - Usar um loop para transformar o set em array
   - Ordenar o array em ordem crescente (opcional, mas recomendado)

### Complexidade

- **Tempo:** O(n + m + k log k)
  - n = tamanho de nums1
  - m = tamanho de nums2
  - k = tamanho da interseção (para ordenação)
  
- **Espaço:** O(min(n, m))
  - Espaço para armazenar o HashSet com os elementos únicos

### Observações Importantes

- ✅ Use `if(set.contains(num))` para verificar se elemento existe
- ✅ Use um segundo HashSet para armazenar o resultado (evita lógica confusa)
- ✅ Converta para `int[]` primitivo, não `Integer[]` wrapper
- ❌ Não tente usar `remove()` em elementos que não existem