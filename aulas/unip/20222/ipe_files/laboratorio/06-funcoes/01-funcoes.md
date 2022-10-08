# Funções

Uma função é uma estrutura que recebe uma coleção de parâmetros de **entrada** e retorna um resultado na **saída**.

A sintaxe para uma função em Python é

``` python
def nome_da_funcao(parametro1, parametro2, parametro3):
  faz coisas
    .
    .
    .
  faz coisas
  return resultado
```

Para usar a função definida acima deve-se usar o nome da função, passar os valores dos parâmetros e guardar o resultado retornado

``` python
resultado = nome_da_funcao(p1, p2, p3)
```

## Exemplos

### Exemplo 1

Definição de uma função que calcula a multiplicação de dois números:
``` python
def multiplica(a, b)
  resultado = a*b
  return resultado
```
O uso da função pode ser
``` python
a = 2
b = 3
resultado = multiplica(a, b)
print(f'O resultado de {a} multiplicado por {b} eh {resultado}')
```


### Exemplo 2

Uma função não necessariamente precisa retornar um valor

Definição de uma função que imprime se um número é positivo ou não
``` python
def imprime_positivo(a)
  if a > 0:
    print(f'O numero {a} eh positivo')
  else:
    print(f'O numero {a} nao eh positivo')
```
O uso da função pode ser
``` python
imprime_positivo(2)
```


## Exercícios

### Exercício 01:

Faça uma função que receba dois números e retorne a soma destes dois números.

### Exercício 02:

Faça uma função que receba uma lista de números e retorne o somatório destes números.

### Exercício 03:

Faça uma função que receba um número inteiro positivo e retorne o fatorial deste número.

### Exercício 04:

Faça uma função que receba um número inteiro positivo `n` retorne e retorne o `n`-ésimo termo da sequência de Fibonacci.

OBS: A sequência de Fibonacci é construída de forma que cada termo seja a soma dos dois termos anteriores, sendo que o primeiro e o segundo termo são iguais a 1:
```
a_1 = 1
a_2 = 1
a_n = a_{n-1} + a_{n-2}
```


### Exercício 05:

Faça uma função que receba uma lista e retorne esta lista invertida (onde o termo na posição `i` da lista de entrada está na posição `n-i-1` da lista de saída, sendo `n` o tamanho da lista)


### Exercício 06:

Faça uma função que receba uma lista de palavras e retorne uma lista contendo a primeira letra de cada palavra da lista de entrada


### Exercício 07:

Faça uma função que receba uma lista de palavras e retorne uma lista contendo a última letra de cada palavra da lista de entrada


### Exercício 08:

Faça uma função que receba uma lista de palavras e retorne uma lista contendo o tamanho de cada palavra

### Exercício 09:

Faça uma função que receba uma lista de números inteiros e retorne uma lista contendo somente os números pares sem repetição da lista de entrada, os números da lista retornada não precisam estar na mesma ordem dos números da lista de entrada.


### Exercício 10:

Faça uma função que receba uma lista de números inteiros positivos e retorne a quantidade de números primos que têm na lista de entrada.


[Respostas](https://github.com/viniciusdenovaes/Unip222IPE/tree/master/lab06)







.
