# Trabalho 01 Jogo do Desliga as Luzes (Grupo de 5 pessoas, para o dia 07/05)

Faça um modelo de Espaço de Estados para resolver o Jogo do Desliga as Luzes.

Use o seu modelo para fazer um programa que recebe uma instância do problema e exibe uma solução para a instância.

## Regras do Jogo

#### Entrada
A entrada do jogo é um tabuleiro quadrado de tamanho `NxN` onde cada célula `(i,j)`, com `i`, `j` entre `0` e `N-1`, está em um de dois estado: `ligado` ou `desligado`.

#### Jogada
Em cada turno o jogador deve escolher uma célula `(i,j)`, esta célula `(i,j)` e cada uma das suas vizinhas `(i-1,j)`, `(i+1,j)`, `(i,j-1)` e `(i,j+1)`, **se ela existir no tabuleiro** deve trocar de estado: se está `ligado` se torna `desligado`; se está `desligado` se torna `ligado`.

#### Objetivo
O objetivo do jogador é deixar todas as células desligadas.

#### A Solução
A solução para o a instância é a lista de jogadas que o jogador deve fazer para chegar ao objetivo.


## O programa

O seu programa deve receber uma instância e exibir na saída padrão uma solução legível para o usuário, a lista de jogadas que deverão ser feitas para chegar da instância até o objetivo.

#### Entrada
A entrada será fornecida em um arquivo `instxx.in` que estará estruturado da seguinte maneira:
* na primeira linha terá o tamanho do tabuleiro, podendo varia de `3` a `4` (lembrando que o tabuleiro é quadrado)
* nas `N` linhas seguintes cada linha do tabuleiro.
* o número `0` significa que a célula está desligada, enquanto que o número `1` significa que a célula está ligada.

#### Exemplo
* A instância
```
3
0 1 0
0 1 0
0 0 0
```
representa um tabuleiro `3x3` com apenas as células `(0,1)` e `(1,1)` ligadas

* a instância
```
4
0 0 0 1
0 0 1 0
0 0 0 0
1 0 0 0
```
representa um tabuleiro `4x4` com apenas as células `(0,3)`, `(1,2)` e `(3,0)` ligadas.

[Exemplos de instâncias podem ser pegos aqui](insts.zip)
[Respostas para todas as instâncias de tamanho 4 (as que tem solução)](res.zip)

Pontuação:
* A escrita do espaço de estados: 5pt
* A solução do problema: 2.5pt
* A solução do problema usando espaço de estados: 2.5pt



#### Respostas

Para soluções sem usar A* (gerando todas soluções):

```
Não rodou à partir da instância g08
```

Para a solução usando A*:

```

00 0
01 -20
02 -20
03 0
04 -70
05 -440
06 -630

g06 -20
g07 0
g08 0
g10 0
g12 0
g14 0
g16 -10
g18 out of memory
g20 out of memory
g28 out of memory
g30 out of memory
g32 out of memory
g99 0
```


Para a solução usando Programação dinâmica:

```

00 0
01 -20
02 -20
03 0
04 -70
05 -440
06 -630

g06 -20
g07 0
g08 0
g10 0
g12 0
g14 0
g16 -10
g18 -470
g20 -250
g28 -30
g30 0
g32 -180
g99 0
```









.
