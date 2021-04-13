# Equações Analíticas e Paramétricas


### Equação analítica

Serve principalmente para verificar **onde** pontos estão em relação à curva.

Equação analítica do círculo é

c: x^2 + y^2 = 1


Por exemplo, pontos em que x^2 + y^2 < 1 estão **dentro** da curva.

### Equação Paramétrica

A equação paramétrica serve para **pegar** pontos que estão na curva

##### Círculo

A equação paramétrica do círculo com raio r e centro em (a, b) é

```
x = a + r*cos(t)
y = b + r*sin(t)
```

para t variando em `[0, 2*PI]`


Para (a, b) = (0, 0), e r = 1
Um ponto com t = 0:
```
x = 1*cos(0) = 1
y = 1*sin(0) = 0
(1, 0)
```

Um ponto com t = PI/4:
```
x = 1*cos(PI/4) = sqrt(2)/2
y = 1*sin(PI/4) = sqrt(2)/2
(sqrt(2)/2, sqrt(2)/2)
```

Um ponto com t = PI/2:
```
x = 1*cos(PI/2) = 0
y = 1*sin(PI/2) = 1
(0, 1)
```

Um ponto com t = 2*PI:
```
x = 1*cos(2*PI) = 0
y = 1*sin(2*PI) = 1
(0, 1)
```

Exemplo do Leonardo para fazer iterativamente variando em i, para i de 0 a `detailLevel-1`, onde `detailLevel` é a quantidade de retas que formam o círculo:

```
v[i][0] = a + radius * Math.sin((2 * Math.PI * i) / detailLevel);

v[i][1] = b + radius * Math.cos((2 * Math.PI * i) / detailLevel);
```


##### Elípse

A equação paramétrica da elípse com largura `2*r_1` e altura `2*r_2` e centro em (a, b) é

```
x = a + r_1*cos(t)
y = b + r_2*sin(t)
```


.
