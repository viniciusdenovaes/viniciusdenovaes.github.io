# Trabalho 01 de PI: Estudo de Manipulação de Imagens (Filtros)


Para este trabalho o grupo deverá fazer um programa que transforma uma imagem da entrada utilizando filtros pré-definidos e conhecidos da literatura. 

O programa deverá ter, pelo menos, 5 transformações disponíveis. 

O programa deve ser capaz de receber qualquer imagem coloridas de qualquer tamanho, no formato JPG, e o resultado deve ser uma imagem, não precisa ser do mesmo tamanho.

Para simplificar, os filtros podem ser passados na imagem já em tons de cinza.

<!-- Para cada filtro, o grupo deverá fazer uma redação sobre a importância da transformação para a área de Processamento de Imagem e/ou Visão Computacional. -->

Exemplos de filtros: 

* transformar a imagem em cinza


 * *blur*: a transformação *blur* pode ser feita passando a máscara
 ```
|1 1 1|
|1 1 1| * 1/9
|1 1 1|
 ```
na imagem.

* Reconhecimento das bordas (filtro de Sobel): o filtro de clareamento das bordas da imagem pode ser feito somando o resultado de passagem das seguintes máscaras:
```
 1  2  1
 0  0  0
-1 -2 -1
```
```
-1 -2 -1
 0  0  0
 1  2  1
```
e
```
1 0 -1
2 0 -2
1 0 -1
```
```
-1 0 1
-2 0 2
-1 0 1
```
lembrando de limitar o valor de cada pixel a, no mínimo, 0 e, no máximo, 255

* *unsharp*: A imagem original menos a imagem resultante do filtro *blur*

* *sharpening*: pode ser feito somando o resultado da imagem *unsharp* com a imagem original
