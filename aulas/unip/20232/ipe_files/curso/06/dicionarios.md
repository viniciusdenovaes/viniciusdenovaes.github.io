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
