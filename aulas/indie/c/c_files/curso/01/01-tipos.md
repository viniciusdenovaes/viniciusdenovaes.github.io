# Tipos de Variáveis

A linguagem **C** é estaticamente tipada, isso quer dizer que toda variável declarada deve ter um tipo declarado.


Neste curso vamos trabalhar com 3 tipos de variáveis: 
- `int` para representar números inteiros de -2.147.483.648 a 2.147.483.647, com 4 bytes, ou 32 bits
- `float` para representar números reais com 6 casas de precisão, de 1.2E-38 a 3.4E+38, com 4 bytes, 
- `char` para representar letras

Em C temos também outros tipos como os
- `double` para números reais com mais precisão, 16 bytes, com 15 casas de precisão, de 2.3E-308 a 1.7E+308.
- `long` `double` ou `int`, se precisar de números maiores
Não precisaremos destes neste curso.

## Operações

Usaremos as operações matemáticas básica:
 - `+` para soma entre dois `int` ou `float`,
 - `-` para subtração entre dois dois `int` ou `float`,
 - `*` para multiplicação entre dois dois `int` ou `float`,
 - `/` para divisão entre dois dois `int` ou `float`,
 - `%` operação entre dois números inteiros que calcula o resto da divisão do primeiro pelo segundo
 
Porém fique atento! Em C quando você divide dois números inteiros, o resultado será um número inteiro: `5/2 = 2`.

## Mudança entre tipos

Diferente de Python, uma variável em C **nunca** pode mudar o tipo dela, porém um valor do tipo `float` pode ser transformado para um valor do tipo `int`e vice versa.

O código a seguir

``` c
int a = 2;
printf("como int: %d\n", a);
printf("como float: %f\n", (float)a);
```

Irá imprimir 

```
como int: 2
como float: 2.000000
``` 

Também podemos atribuir um valor do tipo para uma variável do tipo float para ter o mesmo resultado.

``` c
int a = 2;
printf("como int: %d\n", a);
float b = a;
printf("como float: %f\n", b);
```

### Truncamento

Caso um valor do tipo float seja transformado em um do tipo int, haverá um truncamento, onde a parte decimal do número original será perdida no novo valor do inteiro.

``` c
float a = 2.3;
printf("como float: %f\n", a);
printf("como int: %d\n", (int)a);
```

Irá imprimir 

```
como float: 2.300000
como int: 2
``` 
Chamamos isto de truncamento.

### `char` e `int`

Um `char` pode ser tratado como `int` e vice versa, o número inteiro correspondente ao `char` será seu código na table [ascii](https://en.wikipedia.org/wiki/ASCII)


``` c
printf("como char: %c\n", 97);
printf("como int: %d\n", 'a');
```

```
como char: a
como int: 97
```

## Como imprimir

Como vimos, devemos usar palavras chaves para imprimir valores na função `printf`.


- `%c` escrita de um caractere (`char`)
- `%d` ou `%i` escrita de números inteiros (`int` ou `char`)
- `%u` escrita de números inteiros sem sinal (`unsigned`)
- `%f` escrita de número reais (`float` ou `double`)
- `%s` escrita de vários caracteres
- `%p` escrita de um endereço de memória
- `%e` ou `%E` escrita em notação científica

### Como formatar

Tanto números inteiros como reais podem ser formatados na hora de ser impressos, veja o exemplo abaixo:

``` c
float pi = M_PI;

// formatacao normal
printf("numero %f\n", pi);

// numero ocupa 10 espacos
printf("numero %10f\n", pi); 

// numero tera apenas 2 casas decimais
printf("numero %.2f\n", pi); 

/* 
numero todo ocupa 7 espacos, 
tem apenas 2 casas decimais, 
espacos a esquerda sao completados por 0
*/
printf("numero %07.2f\n", pi); 
```


```
numero 3.141593
numero   3.141593
numero 3.14
numero 0003.14
```

.
