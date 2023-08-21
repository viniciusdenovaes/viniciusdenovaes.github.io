# Variáveis e Operações Matemáticas

Neste curso vamos trabalhar com 4 tipos de variáveis, e **você precisa saber qual é o tipo de informação que uma variável está guardando**.

Vamos trabalhar com 2 tipos de números `int` e `float`, o tipo `booleano` que só pode ter os valores `True` e `False`; e o tipo `string` que guarda palavras



## Operações Matemáticas

Linguagens de programação têm operações matemáticas básicas, vamos ver como escrever algumas destas operações em Python.

- Temos as 4 operações básicas: `+`, `-`, `*` e `/`.
- Temos a potência: `**`, por exemplo 3² = `3**2`,  4³ = `4**3`,
- Resto da divisão **entre inteiros**:
  - `5%2` = `1`,
  - `4%2` = `0`,
  - `5%5` = `0`,
  - `5%3` = `2`,
  - `25%5` = `0`,
  - `26%5` = `1` e
  - `29%5` = `4`.
- Valor inteiro da divisão **entre inteiros**:
  - `5//2` = `2`,
    - `5//3` = `1`,
    - `5//4` = `1`,
    - `5//5` = `1`,
    - `5//6` = `0`,
  - `25//5` = `5`,
    - `26//5` = `5`,
    - `29//5` = `5`,
  - `1289//10` = `128`,
    - `128//10` = `12`,
    - `12//10` = `1`,
    - `1//10` = `0`.
- `abs`: a função `abs(x)` retorna o módulo de `x`, ou seja, retorna `x` se `x` é maior que 0 e `-x` se `x` é menor que 0.


Para outras operações precisamos da biblioteca `math`:
- `math.sqrt`: raíz quadrada, por exemplo:
   - `math.sqrt(2)` = `1.4142135623730951`,
   `math.sqrt(4)` = `2.0`,
   - `math.sqrt(5)` = `2.23606797749979`,
   -  `math.sqrt(25)` = `5.0`.
- `floor(x)`: o *piso* de `x`, o maior inteiro menor ou igual a `x`
- `ceil(x)`: o *teto* de `x`, o menor inteiro maior ou igual a `x`
