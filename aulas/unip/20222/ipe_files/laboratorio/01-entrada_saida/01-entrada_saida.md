# Entrada e Saída

No contexto da computação, os termos **Entrada** e **Saída** são os equivalentes a **pergunta** e **resposta**.

Tipicamente um programa recebe uma entrada (pergunta), faz uma operação matemática (ou equivalente) em cima da pergunta, depois exibe uma resposta.

Neste laboratório usaremos entrada e saída à partir do terminal. Você dificilmente usará este processo na vida real, mas te ajudará a aprender as operações básicas até chegar o momento de aprender a receber entradas de arquivos ou banco de dados.

## Saída (Como escrever na tela?)

Para escrever na tela vamos usar a função `print`. Esta função recebe um ou mais objetos que possam ser transformados em `string` e escreve na tela.

```python
print('Ola')
```
saída
```
Ola
```

### Como escrever variáveis na tela?

Programas trabalham com variáveis. São termos que têm um nome e um **valor**, e este **valor** pode mudar durante o programa. Na hora de imprimir uma variável na tela, não estamos preocupados com o nome dela, e sim com o **valor**. **Queremos imprimir o valor de uma variável na tela**.

#### Exemplo 01

```python
var = 5
print(var)
var = 6
print(var)
```
saída
```
5
6
```

Neste exemplo passamos o valor da variável `var`.

#### Exemplo 02

```python
var = 5
print('variavel = ', var)
var = 6
print('variavel = ', var)
```
saída
```
variavel =  5
variavel =  6
```

Neste exemplo passamos dois termos para o `print`: a string `'variavel = '` e a variavel `var`.

#### Exemplo 03

```python
var = 5
print(f'o valor da variavel eh {var} nesta linha')
var = 6
print(f'o valor da variavel eh {var} nesta linha')
```
saída
```
o valor da variavel eh 5 nesta linha
o valor da variavel eh 6 nesta linha
```

Neste exemplo começamos a string com `f` e usamos as chaves `{}` para indicar que queremos imprimir o valor da variavel na tela.

## Entrada

Para recebermos uma entrada usaremos a função `input()`:

```python
var = input()
print(f'O valor da entrada foi {var} nesta linha')
```
entrada
```
coisa
```

saida
```
O valor da entrada foi {coisa} nesta linha
```

### Como receber um número como entrada?

Quando você recebe uma entrada o tipo desta entrada é uma `string`, mesmo que esta entrada seja um número:

```python
var = input('Entre com um número:')
print(f'O valor da entrada foi {var}')
print(f'O tipo da entrada eh {type(var)}')
```
entrada
```
123
```

saida
```
O valor da entrada foi 123
O tipo da entrada eh <class 'str'>
```

O problema é que não podemos fazer operações matemáticas com `string`, então temos que converter esta string `'123'` para um número inteiro `123`


```python
var = input('Entre com um número:')
print(f'O valor da entrada foi {var} nesta linha')
print(f'O tipo da entrada eh {type(var)} nesta linha')

print('\n')
print('Fazendo a conversao agora')
var = int(var)
print(f'O valor da entrada eh {var} nesta linha')
print(f'O tipo da entrada eh {type(var)} nesta linha')
result = var/2
print(f'O valor da metade da entrada eh {result}')
print(f'O tipo do resultado eh {type(result)} nesta linha')
```
entrada
```
123
```

saida
```
O valor da entrada foi 123 nesta linha
O tipo da entrada eh <class 'str'> nesta linha


Fazendo a conversao agora
O valor da entrada eh 123 nesta linha
O tipo da entrada eh <class 'int'> nesta linha
O valor da metade da entrada eh 61.5
O tipo do resultado eh <class 'float'> nesta linha
```

Neste exemplo temos três tipos:
- `<class 'str'>`: representa uma string, é uma cadeia de caracteres, exemplos: `'123'`, `'coisa'`, `'uma quebra de linha: \n'`
- `<class 'int'>`: representa um número inteiro, que não tem casas decimais, exemplos: `123`, `2`, `1`, `23`
- `<class 'float'>`: representa um número com casas decimais, exemplos: `1.23`, `0.2`, `1.0`, `2.3`


## Laboratório:

### Exercício 01:

Faça um progama que receba dois termos separados: o nome e sobrenome e escreva o nome completo.

#### Exemplo
Entrada
```
Entre com o nome: fulano
Entre com o sobrenome: da silva
```

Saída
```
Nome completo: fulano da silva
```



### Exercício 02:

Faça um progama que receba o raio de um círculo e imprima a área deste círculo com **pelo menos** 3 casas decimais.
**OBS**: a fórmula da área de um círculo é $\pi*r^2$

#### Exemplo
Entrada
```
Entre com o raio de um circulo: 2
```

Saída
```
Area de um circulo de raio 2 eh: 12.56636
```





### Exercício 03:

Faça um progama que receba o raio de uma esfera e imprima o volume desta esfera com **pelo menos** 3 casas decimais.
**OBS**: a fórmula do volume de uma esfera é $\frac{4}{3}\pi*r^3$

#### Exemplo
Entrada
```
Entre com o raio da esfera: 2
```

Saída
```
O volume da esfera de 2.0 eh: 33.510321638291124
```

[Respostas](https://github.com/viniciusdenovaes/Unip222IPE/tree/master/lab01)









### Exercício 04:

Faça um progama que receba a base e altura de um triângulo e calcule a sua área.
**OBS**: a fórmula da área de um triângulo é $base*altura/2$

#### Exemplo
Entrada
```
Entre com a base: 3
Entre com a altura: 5
```

Saída
```
A area de um triangulo de base 3.0 e altura 5.0 eh: 7.5
```

[Respostas](https://github.com/viniciusdenovaes/Unip222IPE/tree/master/lab01)







.
