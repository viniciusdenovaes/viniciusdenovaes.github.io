# Trabalho 01 de PI: Limiarização

Limiarização é o procedimento de transformar uma imagem com tons de cinza, em uma outra imagem com **menos** tons de cinza, agrupando tons de cinza semelhantes e transformando-os para o mesmo tom de cinza.

Neste trabalho você deve fazer um programa para **Binarizar** (fazer uma limiarização resultando em apenas dois tons de cinza: branco e preto) uma imagem.

Você deve fazer a [binarização por equilíbrio do histograma](https://pt.wikipedia.org/wiki/Limiariza%C3%A7%C3%A3o_por_equil%C3%ADbrio_do_histograma). O seu programa deve receber uma imagem qualquer e salvar (ou exibir) uma imagem binarizada.

O seu programa deve **obrigatoriamente** e **explicitamente** seguir os seguintes passos, ter as seguintes funções/métodos, e usar as seguintes funções:

 - Ser possível de receber uma imagem com extensões jpg, png ou tiff, com canais rgb.

 - Transformar uma imagem entrada em uma **matrix** de tons de cinza.

 - calcular o histograma da matriz em tons de cinza

 - Escolher **automaticamente** um número como limitante (os valores da matriz que estão acima do número irão se transformar em uma cor, e valores abaixo vão se transformar em outra)

 - Transformar a matriz cinza para uma matriz binária

 - Salva ou exibir a imagem resultante da matriz binária

### Regras

 - Você pode fazer em qualquer uma das seguintes linguagens: python, java, C++, C ou C#.

 - Você pode usar **qualquer biblioteca** interna ou externa à linguagem que você utilizará. Porem, deve **obrigatoriamente** seguir os passos listados anteriormente.
 
