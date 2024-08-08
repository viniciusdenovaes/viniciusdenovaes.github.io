# Listas

## Conceito

Uma lista é uma coleção de elementos em qua cada elemento tem uma posição única entre `0` e o `tamanho_da_lista`.

Diferente de conjuntos, podemos ter mais de um elemento igual.

Podemos ter quantos elementos quisermos e mudar o elemento de uma posição específica.
Estes elementos podem ser de qualquer tipo: um número, uma string, uma lista, um conjunto e até um outro dicionário.

## Python

Python tem suporte a listas e seu tipo é `list`.

### Criando listas

Para criar uma lista em Python podemos usar as seguintes funções:
- `[]`: cria uma **nova** lista vazio
- `[1, 2, 3, 3, 3]`: cria uma **nova** lista contendo os elementos
- `1`, na posição 0;
- `2`, na posição 1;
- `3`, na posição 2;
- `3`, na posição 3;
- `3`, na posição 4.

### Operações e Funções

Seja `l` uma lista

- `len(l)`: retorna o tamanho da lista `l`
- `l.append(v)`: adiciona o elemento `v` **ao final** da lista `l`
- `l[p] = v`: a lista `l` recebe o valor `v` na posição `p`. **Se a posição `p` existir** na lista.
- `v in l`: verifica se o valor `v` existe na lista `l`


### Iterar

Você pode (**e deve**) iterar nos elementos da lista.

#### iterando nos elementos

``` python
for e in l:
  print('elemento: ', e)
```

#### iterando nos elementos, e contando os elementos
Em python existe uma função para contar o i-ésimo elemento de uma iteração

``` python
for i, e in enumerate(l):
  print('i-esimo: ', i)
  print('elemento: ', e)
```

#### iterando nas posições (**Não é o recomendável**)
Em último caso, se precisar, você pode acessar os elementos da lista pela posição.
Neste caso, você deve fazer um gerador de números de 0 até o tamanho da lista -1, usando a função `range` e passando o tamanho `len(l)` da lista como parâmetro.
**Não é o recomendável**.
``` python
for i in range(len(l)):
  print('posicao', i)
  print('elemento', l[i])
```














.
