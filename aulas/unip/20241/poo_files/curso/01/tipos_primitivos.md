# Tipos Primitivos

Assim como **C**, a linguagem C# é estaticamente tipada, isso quer dizer que toda variável declarada deve ter um tipo declarado.

Ou ela pode ser declarada como um **objeto**, ou ela pode ser de um dos tipos primitivos.

Temos 8 tipos primitivos:
* São 4 tipos de inteiros:
    * o mais usado é o `int` representando números de -2,147,483,648 a 2,147,483,647, ocupa espaço de 4 bytes
    * `short`, com espaço de 2 bytes
    * `long`, que ocupa espaço de 8 bytes
    * e o `byte`, que ocupa espaço de 1 byte.
* São 2 tipos com pontos flutuantes (representações de números reais):
    * o mais usado é o `double`, que tem precisão de 15 casas decimais significantes, e ocupa 8 bytes
    * temos o `float`, com precisão de 6 casas decimais significativas, ocupando 4 bytes
* Temos 1 tipo de character: `char` representando um símbolo/letra
* E um tipo booleano: `boolean`, que pode somente ter os valores `true` (verdadeiro) ou `false` (falso)


Os tipos mais usados são `int`, `double`, `char` e `boolean`, e neste curso você precisa saber usar somentes estes.

## Operações

Usaremos as operações que você já conhece:
 - `+` para soma entre dois `int` ou `double`,
 - `-` para subtração entre dois dois `int` ou `double`,
 - `*` para multiplicação entre dois dois `int` ou `double`,
 - `/` para divisão entre dois dois `int` ou `double`,
 - `&&` para a operação `AND` lógico "short-circuit" entre dois `boolean`,
 - `||` para a operação `OR` lógico "short-circuit" entre dois `boolean`,
 - `&` para a operação `AND` lógico não-"short-circuit" entre dois `boolean`,
 - `|` para a operação `OR` lógico não-"short-circuit" entre dois `boolean`,
 - `^` para a operação `XOR` lógico entre dois `boolean`.

## Continuação

Existe muito mais material sobre estes assuntos, alguns serão colocados nesta página, outros serão dados em aula, e outros estão nos livros da ementa.

Alguns assuntos não tratados aqui são:
 - Truncamento
 - Casting
 - Operador `+` para concatenar `string`
 - O que é um operador lógico "short-circuit"?
 - Como funciona operações entre `int` e `double`?

.
