Ordenação por Seleção (Selection Sort)
===========================

A ordenação por seleção é um algoritmo simples de ordenação que funciona dividindo o array em duas partes: a parte ordenada e a parte não ordenada. O algoritmo repetidamente seleciona o menor (ou maior, dependendo da ordem desejada) elemento da parte não ordenada e o move para o final da parte ordenada.

Como Funciona a Ordenação por Seleção?
1. Comece com o primeiro elemento do array como a parte ordenada e o restante como a parte não ordenada.
2. Encontre o menor elemento na parte não ordenada do array.
3. Troque esse menor elemento com o primeiro elemento da parte não ordenada.
4. Agora, o primeiro elemento faz parte da parte ordenada.
5. Repita os passos 2 a 4 para o restante do array, movendo o limite da parte ordenada um elemento para a direita a cada iteração.

Exemplo de Ordenação por Seleção
Considere o array [64, 25, 12, 22, 11].
1. Na primeira iteração, o menor elemento é 11. Troque 11 com 64. O array agora é [11, 25, 12, 22, 64].
2. Na segunda iteração, o menor elemento na parte não ordenada [25, 12, 22, 64] é 12. Troque 12 com 25. O array agora é [11, 12, 25, 22, 64].
3. Na terceira iteração, o menor elemento na parte não ordenada [25, 22, 64] é 22. Troque 22 com 25. O array agora é [11, 12, 22, 25, 64].
4. Na quarta iteração, o menor elemento na parte não ordenada [25, 64] é 25. Troque 25 com 25 (nenhuma mudança). O array agora é [11, 12, 22, 25, 64].
5. O array está agora completamente ordenado: [11, 12, 22, 25, 64]. 

Complexidade de Tempo
A complexidade de tempo da ordenação por seleção é O(n^2), onde n é o número de elementos no array. Isso ocorre porque, para cada elemento, o algoritmo precisa percorrer o restante do array para encontrar o menor elemento.

Vantagens e Desvantagens
Vantagens:
- Simplicidade: Fácil de entender e implementar.
- Não requer memória adicional significativa: A ordenação por seleção é um algoritmo in-place, o que significa que não requer espaço extra para outro array.

Desvantagens:
- Ineficiência: A complexidade de tempo O(n^2) torna-o impraticável para grandes conjuntos de dados em comparação com algoritmos mais eficientes, como quicksort ou mergesort.

Aplicações
A ordenação por seleção é útil para pequenos conjuntos de dados ou quando a simplicidade do código é mais importante do que a eficiência. Também pode ser usada em situações onde a memória é limitada, já que é um algoritmo in-place.

Conclusão
A ordenação por seleção é um algoritmo básico de ordenação que ilustra conceitos fundamentais de algoritmos e estruturas de dados. Embora não seja o mais eficiente para grandes conjuntos de dados, sua simplicidade o torna uma escolha popular para ensinar os princípios da ordenação.