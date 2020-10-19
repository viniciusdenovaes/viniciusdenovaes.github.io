# Trabalho 02 de PI: Filtros

Para este trabalho você deve fazer um programa que receba qualquer imagem com três canais de cores (RGB) e forneça três imagens resultantes do processo de *blur*, coloração de bordas *unsharp mask* e *sharpening*.

Você pode dar ao usuário a possibilidade de escolher qual das três ações usar, ou fazer as três ações e mostrar o resultado ao usuário (ou somente guardar a imagem no disco)

 * *blur*: a transformação *blur* pode ser feita passando a máscara
 ```
 1 1 1
 1 1 1
 1 1 1
 ```
na imagem e dividindo o resultado por 9.

* *unsharp*: o filtro de clareamento das bordas da imagem pode ser feito somando o resultado de passagem das seguintes máscaras:
```
 1  2  1
 0  0  0
-1 -2 -1
```
e
```
1 0 -1
2 0 -2
1 0 -1
```
lembrando de limitar o valor de cada pixel a, no mínimo, 0 e, no máximo, 255

* *sharpening*: pode ser feito somando o resultado da imagem *unsharp* com a imagem original
