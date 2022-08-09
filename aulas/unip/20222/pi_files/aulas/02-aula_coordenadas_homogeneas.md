
### Coordenadas Homogêneas

p' = p\*M_T\*M_R\*M_T\*M_S
p' = p\*M_R

## Matriz do Ponto Em Coordenadas Homogêneas

Representação do ponto em duas dimensões, em coordenadas homogêneas como uma matriz.

```
p = [ x  y  1 ]
```

## Translação
Transladar no eixo x com um valor de T_x e no eixo y com um valor de T_y

```
M_T = [  1    0   0 ]
      [  0    1   0 ]
      [ T_x  T_y  1 ]
```

```
p' = p * M_T
```

Exemplo: Se tivermos o ponto (1 ,2) e quisermos transladar para a direita em 5 unidades, e para cima em 3 unidades.
Multiplicamos este ponto pela matriz
```
M_T = [  1    0   0 ]
      [  0    1   0 ]
      [  5    3   1 ]
```
O ponto resultante pode ser dado pela equação
```
[1 2 1] * [  1    0   0 ] = [ 6 5 1 ]
          [  0    1   0 ]
          [  5    3   1 ]
```

## Escala
Aumentar o desenho em S_x em relação ao eixo x e S_y em relação ao eixo y

```
M_E =
[ S_x  0    0 ]
[   0  S_y  0 ]
[   0    0  1 ]
```

```
p' = p * M_E
```

Exemplo: Se tivermos o ponto (1 ,2) e quisermos escalar em 3 unidades em relação à `x`, e 5 unidades em relação à y.
Multiplicamos este ponto pela matriz
```
M_E =
[ 3  0  0 ]
[ 0  5  0 ]
[ 0  0  1 ]
```
O ponto resultante pode ser dado pela equação
```
[1 2 1] * [ 3  0  0] = [ 3  10  1]
          [ 0  5  0]   
          [ 0  0  1]   
```

## Rotação

Rotacionar o desenho em um ângulo de `t` radiano:

```
M_R = [  cos(t) sen(t) 0 ]
      [ -sen(t) cos(t) 0 ]
      [      0      0  1 ]
```
```
p' = p * M_R
```
Exemplo: Se tivermos o ponto (1 ,2) e quisermos rotacionar `pi/2` (`45º`).
Multiplicamos este ponto pela matriz
```
[  cos(pi/2) sen(pi/2) 0 ] = [  0 1 0 ]
[ -sen(pi/2) cos(pi/2) 0 ]   [ -1 0 0 ]
[         0         0  1 ]   [  0 0 1 ]
```
O ponto resultante pode ser dado pela equação
```
[1 2 1] * [  0 1 0 ] = [ -2  1  1]
          [ -1 0 0 ]   
          [  0 0 1 ]
```

## Cisalhamento

Para aplicar o cisalhamento em um ponto basta multiplicar pela seguinte matriz, onde o valor S_h é quanto você irá inclinar em relação ao eixo horizontal

```
M_Ch = [   1 0 0 ]
       [ S_h 1 0 ]
       [   0 0 1 ]
```

Exemplo: Se tivermos o ponto (1 ,2) e quisermos cisalhar em 2, com relação ao eixo horizontal.
Multiplicamos este ponto pela matriz
```
[ 1 0 0 ]
[ 2 1 0 ]
[ 0 0 1 ]
```
O ponto resultante pode ser dado pela equação
```
[1 2 1] * [ 1  0  0 ] = [ 5  2  1 ]
          [ 2  1  0 ]   
          [ 0  0  1 ]
```

Semelhante, para aplicar o cisalhamento vertical em um ponto basta multiplicar pela seguinte matriz, onde o valor S_v é quanto você irá inclinar em relação ao eixo vertical

```
M_Ch = [ 1  S_v  0 ]
       [ 0    1  0 ]
       [ 0    0  1 ]
```







.
