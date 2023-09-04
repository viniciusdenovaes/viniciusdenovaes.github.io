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
