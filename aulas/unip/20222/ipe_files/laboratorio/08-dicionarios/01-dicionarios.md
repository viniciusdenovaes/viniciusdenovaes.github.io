# Dicionários

## Conceito Matemático

Um dicionário é um mapeamento entre um conjunto de chaves e uma coleção de valores. O conjunto de chave é único (não podemos ter duas chaves iguais), e para cada chave definida teremos um valor. Este valor pode ser qualquer coisa: um número, uma string, uma lista, um conjunto e até um outro dicionário.

É equivalente à
- uma função matemática.
- relação "chaves e valores" de uma tabela em um banco de dados relacional.

## Linguagem de Programação

Linguagens de programação de alto nível, como Python, Java, e C++ têm suporte para o uso de dicionários.

Em Java e C++ são chamados de `Map`

Como toda coleção você pode criar um dicionário, adicionar uma chave com um valor, ver a quantidade de elementos, iterar nas chave, nos valores, **ou em ambos**, entre outras funções.

Você sempre terá a garantia de que as chaves serão únicas e terá um valor associado a ela, mesmo que este valor seja o `None` (o valor nulo em Python).

## Python

Python tem suporte a dicionários e seu tipo é `dict`.

### Criando conjuntos

Para criar um conjunto em Python podemos usar as seguintes funções:
- `set()`: cria um **novo** conjunto vazio
- `set(l)`: cria um **novo** conjunto contendo os elementos da lista `l`
- `{1, 2, 3}`: cria um **novo** conjunto contendo os elementos `1, 2, 3`
- ATENÇÃO: `{}` **não** cria um conjunto vazio, cria um dicionário.

#### Exemplos

##### Exemplo 1
```python
set()
```
saída
```
set()
```
##### Exemplo 2
```python
set([1, 2, 3])
```
saída
```
{1, 2, 3}
```
##### Exemplo 3
```python
set([1, 2, 3, 1, 2, 3])
```
saída
```
{1, 2, 3}
```
##### Exemplo 4
```python
set([1, 1, 2, 2, 3, 3])
```
saída
```
{1, 2, 3}
```

### Funções

Para usar as funcionalidades de um conjunto em Python podemos usar as seguintes funções:

- `s.add(e)`: adiciona o elemento `e` ao conjunto `s`
- `s.update(s2)`: adiciona os elementos do conjunto `s2` ao conjunto `s`
- `len(s)`: retorna o tamanho do conjunto `s`


#### Exemplos

##### Exemplo 1
```python
s = {1, 2, 3}
s.add(4)
s
```
saída
```
{1, 2, 3, 4}
```
##### Exemplo 2
```python
s.add(1)
s
```
saída
```
{1, 2, 3, 4}
```
##### Exemplo 3
```python
s2 = {2, 4, 60, 80}
s.update(s2)
s
```
saída
```
{1, 2, 3, 4, 60, 80}
```

### Iterar

Para iterar em um conjunto `s` basta iterar como em qualquer coleção:

``` python
for e in s:
  print(e)
```

#### Exemplo
```python
s = {1000, 2000, 10, 1, 0, 50, 5, 0, -5, 5, -5}
for e in s:
    print(e)
```
saída
```
0
1
5
1000
10
2000
50
-5
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
