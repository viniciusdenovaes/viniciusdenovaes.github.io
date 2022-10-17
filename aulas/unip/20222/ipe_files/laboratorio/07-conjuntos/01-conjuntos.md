# Conjuntos

## Conceito Matemático

Um conjunto é uma coleção de elementos únicos, ou seja, todos elementos são diferentes dois a dois.

## Linguagem de Programação

Linguagens de programação de alto nível, como Python (versão 3), Java, e C++ têm suporte para o uso de conjuntos.

Como toda coleção você pode criar um conjunto, adicionar elementos, ver a quantidade de elementos, iterar na coleção, entre outras funções.

Mas com a garantia que todos os elementos desta coleção são diferentes entre si, ou seja, se dois elementos iguais forem adicionados, um deles será ignorado.

## Python

Python tem suporte a conjuntos à partir da versão 3. Assim como o tipo de lista é `list`, o tipo de conjunto é `set`.

### Criando conjuntos

Para criar um conjunto em Python podemos usar as seguintes funções:
- `set()`: cria um **novo** conjunto vazio
- `set(l)`: cria um **novo** conjunto contendo os elementos da lista `l`

### Funções

Para usar as funcionalidades de um conjunto em Python podemos usar as seguintes funções:

- `s.add(e)`: adiciona o elemento `e` ao conjunto `s`
- `len(s)`: retorna o tamanho do conjunto `s`

### Iterar

Para iterar em um conjunto `s` basta iterar como em qualquer coleção:

``` python
for e in s:
  print(e)
```

### Operações Entre Conjuntos e Elementos

Você também pode fazer operações entre conjuntos e elementos:
- `e in s`: retorna se o elemento `e` pertence ao conjunto `s`
- `s1.issubset(s2)`: se o conjunto `s1` é subconjunto (está contido) do conjunto `s2`
- `s1.union(s2)`: retorna a união entre `s1` e `s2`
- `s1.intersection(s2)`: retorna a intersecção entre `s1` e `s2`
- `s1.difference(s2)`: retorna a diferença entre `s1` e `s2` (todos os elementos que estão em `s1` mas não estão em `s2`)

## Exercícios

### Exercício 01:

Faça uma função que receba uma lista de elementos e retorne um conjunto com os elementos únicos da lista de entrada

### Exercício 02:

Faça uma função que receba uma lista de números e retorne o somatório de todos os números únicos da lista.

### Exercício 03:

Faça uma função que receba uma lista de números e retorne um conjunto com todos os números únicos que são pares.


### Exercício 04:

Faça uma função que receba duas listas de inteiros separados por espaço, e retorne um conjuntos com todos os números que estão **nas duas listas**, sem repetições.


### Exercício 05:

Faça uma função que receba duas listas de inteiros separados por espaço, e retorne um conjuntos com todos os números que estão em **pelo menos uma das duas listas**, sem repetições.


### Exercício 06:

Faça uma função que receba duas listas de inteiros separados por espaço, e retorne um conjuntos com todos os números que estão na primeira lista mas não está na segunda, sem repetições.




[Respostas](https://github.com/viniciusdenovaes/Unip222IPE/tree/master/lab07)







.
