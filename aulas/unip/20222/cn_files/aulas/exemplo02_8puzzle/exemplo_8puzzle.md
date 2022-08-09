# Exemplo do Espaço de Estados do 8-Puzzle


N = Um conjunto de matrizes 3x3, com 8 números inteiros, todos diferentes, do 1 ao 8, inclusive. E o número 0 para representar o espaço vazio.


A = Dado um estado `e`:
Gerar, se for possível, 4 estados:
* trocando a posição do 0 com o vizinho da cima
* trocando a posição do 0 com o vizinho da direita
* trocando a posição do 0 com o vizinho da baixo
* trocando a posição do 0 com o vizinho da esquerda

I = Qualquer estado em N.

DO = Um estado, com os números ordenados, de forma crescente, no sentido horário, à partir da posição (1,1).
```
1 2 3
8 0 4
7 6 5
```

![Exemplo do 8_puzzle](8_puzzle.png)
