# Trabalho 02 de CN: Regressão (Pelo Método dos Quadrados Mínimos)

Para este trabalho você deve receber uma lista de duplas $(x_1, f(x_1)), (x_2, f(x_2)), ..., (x_n, f(x_n))$, com, no mínimo 4 pontos e encontrar uma função $\phi(x) = \alpha_2x^2 + \alpha_1x + \alpha_0$ que minimiza o somatório dos erros
<center><img src="equation.png" width="190"></center>

### Entradas

A entrada estará em formato `csv` e será dado na forma
```
x1,f(x1)
x2,f(x2)
.
.
.
xn,f(xn)
```

Por exemplo, os pontos dados pela tabela
_        |  x1 |   x2  |   x3 |   x4 |   x5 | x6 | x7  | x8  |  x9   | x10 | x11  
---------|-------|------|------|------|----|-----|-----|-------|-----|-----|----
**x**    |-1.0 | -0.75 | -0.6 | -0.5 | -0.3 |  0 | 0.2 | 0.4 | 0.5   | 0.7 | 1
**f(x)** |2.05 | 1.153 | 0.45 |  0.4 |  0.5 |  0 | 0.2 | 0.6 | 0.512 | 1.2 | 2.05

Serão dados pelo csv:
```
-1.0,2.05
-0.75,1.153
-0.6,0.45
-0.5,0.4
-0.3,0.5
0,0
0.2,0.2
0.4,0.6
0.5,0.512
0.7,1.2
1,2.05
```

### Passos

O seu programa deve **obrigatoriamente** e **explicitamente** seguir os seguintes passos, ter as seguintes funções/métodos, e usar as seguintes funções:

 - Ler uma entrada em csv no formato especificado pelo trabalho.

 - imprimir a solução (os valores de $\alpha$) na tela **nesta ordem:** $\alpha_2$ $\alpha_1$ $\alpha_0$


### Regras

 - Você pode fazer em qualquer uma das seguintes linguagens: python, java, C++, C ou C#.

 - Você pode usar **qualquer biblioteca** interna ou externa à linguagem que você utilizará. Porem, deve **obrigatoriamente** seguir os passos listados anteriormente.
