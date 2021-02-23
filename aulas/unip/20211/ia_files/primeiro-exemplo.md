# Espaço de Estados - Primeiro Exemplo - Pontes de Konisberg


Lembrando Aresta é a ponte Vétice é Ilha e Margem

N = Conjunto de **caminhos** que não repetem arestas, onde **caminho** é uma lista de vértice e aresta alternados, que começa e termina com um vértice

A = Uma função que recebe um estado,
 * seja `c` o caminho deste estado,
 * seja `v` o último vértice deste caminho.
para cada aresta `a`,
que não está no caminho `c`,
e é adjacente à `v`,
**crie** um estado concatenando o caminho `c`
com a aresta `a` e o vértice adjacente à `a` que não é o `v`

I = O conjunto de todos os estados que só tem um vértice

DO = O conjunto de todos os caminhos que contém todas as arestas, e elas não se repetem
