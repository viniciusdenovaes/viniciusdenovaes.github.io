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

### Criando dicionários

Para criar um dicionário em Python podemos usar as seguintes funções:
- `{}`: cria um **novo** dicionário vazio
- `{1: 'um', 2: 'dois', 3: 'tres'}`: cria um **novo** conjunto contendo as relacões chave, valor
- `1` -> `'um'`
- `2` -> `'dois'`
- `3` -> `'tres'`
- ATENÇÃO: `{}` cria um dicionário e **não** um conjunto vazio.

### Operações e Funções

- `d[k] = v`: adiciona a relação chave `k` e valor `v`
- `k in d.keys()`: verifica se a chave `k` pertence ao conjunto de chaves do dicionário `d`
- `v in d.values()`: verifica se o valor `v` está na coleção de valores do dicionário `d`
- `(k, v) in d.items()`: verifica se a relação chave `k`, valor `v` está no dicionário `d`
- `len(d)`: retorna o tamanho do dicionário `d`


### Iterar

Você pode iterar nas chaves, valores ou em ambos.

#### iterando nas chaves

``` python
for k in d.keys():
  print('chave', k)
  v = d[k]
  print('valor', v)
```

#### iterando nos valores

``` python
for v in d.values():
  print('valor', v)
```

#### iterando nas chaves e valores

``` python
for k, v in d.items():
  print('chave', k)
  print('valor', v)
```


## Exercícios

### Exercício 01:

Faça uma função que receba uma lista de strings e retorne um dicionário que mapeie cada palavra da lista para tamanho desta palavra


### Exercício 01:

Faça uma função que receba uma lista de strings e retorne um dicionário que mapeie cada palavra da lista para tamanho desta palavra



### Exercício 02:

Faça uma função que receba um dicionário e uma chave e retorne se o dicionário contém esta chave.


### Exercício 03:

Faça uma função que receba um dicionário e um valor e retorne se o dicionário contém este valor.


### Exercício 04:

Faça uma função que receba um dicionário e uma chave e retorne o valor desta chave se o dicionário contém esta chave, e o valor `None` caso não contenha a chave.

OBS: Para referenciar o valor `None` em Python basta escrever a palavra `None`
OBS2: `None` é o valor nulo. Toda linguagem tem uma palavra para o valor nulo. Que quer dizer que a variável não tem nenhum valor, ou tem valor "vazio".


### Exercício 05:

Faça uma função que receba uma lista de elementos e retorne um dicionário mapeando cada elemento da lista na quantidade de vezes que este elemento aparece na lista.



### Exercício 06:

Faça uma função que receba um dicionário de precos de produtos: para cada produto (`string`) tem um valor numérico (`double`) associado. A sua função deve retorna um mapeamento de preços para uma **lista** de elementos que tem aquele preço.

Por exemplo, se a função receber o dicionário `{'banana': 2, 'maca': 3, 'pera': 2})` deve retornar o dicionário `{2: ['banana', 'pera'], 3: ['maca']}`



### Exercício 07:

OBS: Mesmo exercício anterior, mas com conjuntos.

Faça uma função que receba um dicionário de precos de produtos: para cada produto (`string`) tem um valor numérico (`double`) associado. A sua função deve retorna um mapeamento de preços para um **conjunto** de elementos que tem aquele preço.

Por exemplo, se a função receber o dicionário `{'banana': 2, 'maca': 3, 'pera': 2})` deve retornar o dicionário `{2: {'banana', 'pera'}, 3: {'maca'}}`





### Exercício 08:

Faça uma função que receba uma lista de produtos comprados e dicionário de precos de produtos: para cada produto (`string`) tem um valor numérico (`double`) associado. A sua função deve retorna um dicionário que mapeie cada produto da lista de produtos comprados no valor total gasto naquele produto (o preço do produto multiplicado por quantas vezes ele foi aparece na lista de compras).

Por exemplo, se a função receber a lista de compras
```
['banana', 'maca', 'pera', 'banana']
```
e o dicionário de preços
```
{'banana': 2, 'maca': 4, 'pera': 2, 'uva': 6})
```
deve retornar o dicionário
```
{'banana': 4, 'maca': 4, 'pera': 2}
```








[Respostas](https://github.com/viniciusdenovaes/Unip222IPE/tree/master/lab08)







.
