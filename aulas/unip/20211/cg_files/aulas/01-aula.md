
### Transformações Afins

* Translação
* Escala
* Rotação
* Cisalhamento

## Matriz do Ponto

Representação do ponto em duas dimensões como uma matriz.

```
p = [ x  y ]
```

## Translação
Transladar no eixo x com um valor de T_x e no eixo y com um valor de T_y

```
M_T = [T_x  T_y]
```

```
p' = p + M_T
```

Exemplo: Se tivermos o ponto (1 ,2) e quisermos transladar para a direita em 5 unidades, e para cima em 3 unidades.
Somamos este ponto pela matriz
```
M_T = [5 3]
```
O ponto resultante pode ser dado pela equação
```
[1 2] + [5 3] = [6 5]
```

## Escala
Aumentar o desenho em S_x em relação ao eixo x e S_y em relação ao eixo y

```
M_E =
[S_x  0  ]
[  0  S_y]
```

```
p' = p * M_E
```

Exemplo: Se tivermos o ponto (1 ,2) e quisermos escalar em 3 unidades em relação à `x`, e 5 unidades em relação à y.
Multiplicamos este ponto pela matriz
```
M_E =
[ 3  0 ]
[ 0  5 ]
```
O ponto resultante pode ser dado pela equação
```
[1 2] * [ 3  0 ] = [ 3 10 ]
        [ 0  5 ]   
```

## Rotação

Rotacionar o desenho em um ângulo de `t` radiano:

```
M_R = [  cos(t) sen(t) ]
      [ -sen(t) cos(t) ]
```
```
p' = p * M_R
```
Exemplo: Se tivermos o ponto (1 ,2) e quisermos rotacionar `pi/2` (`45º`).
Multiplicamos este ponto pela matriz
```
[  cos(pi/2) sen(pi/2) ] = [  0 1 ]
[ -sen(pi/2) cos(pi/2) ]   [ -1 0 ]
```
O ponto resultante pode ser dado pela equação
```
[1 2] * [  0 1 ] = [ -2 ]
        [ -1 0 ]   [  1 ]
```












.
