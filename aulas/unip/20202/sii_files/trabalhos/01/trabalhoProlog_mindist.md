# Trabalho 01 Prologo Distância Mínima

Para este trabalho você deve fazer um programa em Prolog que calcula a distância mínima de dois dados pontos em um dado mapa.

## Instâncias


```dot {engine="neato"}
digraph Ancestralidade {
  a -> b [label="1"]
  b -> c [label="1"]
  b -> d [label="1"]
  c -> d [label="1"]
  d -> e [label="1"]
  e -> f [label="1"]
  e -> h [label="1"]
  f -> g [label="1"]
  g -> h [label="1"]
}
```

``` Prolog
arco(a, b, 1).
arco(b, c, 1).
arco(b, d, 1).
arco(c, d, 1).
arco(d, e, 1).
arco(e, f, 1).
arco(e, h, 1).
arco(f, g, 1).
arco(g, h, 1).
```


```dot {engine="dot"}
digraph Ancestralidade {
  a -> d [label="3"]
  a -> b [label="1"]
  d -> c [label="1"]
  b -> c [label="2"]
}
```

``` Prolog
arco(a, b, 1).
arco(b, c, 1).
arco(b, d, 1).
arco(c, d, 1).
arco(d, e, 1).
arco(e, f, 1).
arco(e, h, 1).
arco(f, g, 1).
arco(g, h, 1).
```
