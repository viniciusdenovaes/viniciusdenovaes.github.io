# Algoritmo A*

Considere uma função de avaliação heurística
`f(n) = g(n) + h(n)`
onde:
`n` é um estado
`g(n)` é o custo do caminho a partir do estado inicial até `n`
`h(n)` é (uma estimativa) o custo do estado `n` até um estado objetivo.

Usando esta heurística de avaliação com a busca da melhor escolha teremos um algoritmo chamado "Algoritmo A"

Definição: Se a primeira solução que o algoritmo encontrar for a melhor, este algoritmo é admissível.

Suponha que exista um `h*(n)` com o custo real de ir do estado `n` até o objetivo. Se a sua heurística de avaliação `h(n)` é `h(n) <= h*(n)` então teremos um algoritmo A*.

O algoritmo A* é admissível.

Por exemplo podemos ver que o problema de encontrar o caminho mínimo no seguinte mapa

![mapa](mapa.png)

pode ser resolvido pela seguinte busca, usando `h(n) = 0`

![arvore de busca](exemplo_hn_0.png)

Porém podemos ter uma busca mais informada usando `h(n) = valor da reta de n até o` dado pela seguinte tabela:

![tabela de valor das retas](tabela_reta.png)

Ou usando uma estimativa da coordenada de cada cidade à partir da imagem:

No texto abaixo, primeiro temos a estimativa da coordenada de cada cidade, e depois temos os pesos de cada aresta do mapa dado
```
20
A 44 114
B 413 310
C 236 359
D 132 344
E 607 354
F 300 165
G 380 380
H 570 280
I 505 100
L 130 250
M 135 300
N 420 60
O 90 20
P 320 265
R 215 215
S 180 150
T 45 210
U 480 285
V 545 170
Z 60 65
23
A S 140
A T 118
A Z 75
B F 211
B G 90
B P 101
B U 85
C D 120
C P 138
C R 146
D M 75
E H 86
F S 99
H U 98
I N 87
I V 92
L M 70
L T 111
O S 151
O Z 71
P R 97
R S 80
U V 142
A
B
```

Podemos ver que a busca com maior informação é mais direcionada, abrindo menos estados

![arvore de busca mais informada](exemplo_hn_reta.png)









.
