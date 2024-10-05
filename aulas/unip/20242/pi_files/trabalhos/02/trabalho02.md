# Trabalho 02 de PI: Visão Computacional

Para este trabalho você deve fazer um programa que leia uma imagem de um **letra** de uma **vogal** escrito a mão e reconheça se este caracter é a letra `i` ou não.

Um dataset (conjunto de dados) estará disponível nesta página. Este dataset deverá ser usado para treinar e avaliar o seu método.

Você deve avaliar o(s) seu(s) método(s) de reconhecimento segundo as métricas de _**acurácia média**_, _**precision**_, _**recall**_ e _**f1**_.


## DataSet[^s]

[^s]: O dataset foi coletado no site https://www.nist.gov/srd/nist-special-database-19 


O conjunto de dados serão imagens de letras escritas a mão. Todas as letras são vogais maiúsculas ou minúsculas.

O conjunto de imagens por ser baixado em [dataset_v20220930.zip](https://github.com/viniciusdenovaes/Unip222PI/blob/master/dataset/v20220930/dataset_v20220930.zip)

Exemplos de imagens:

<style type="text/css" rel="stylesheet">
.container {
  display: flex;
  flex-wrap: wrap;
}

.container .image {
  width: 20%;
}

.container img {
  width: calc(100% - (2px * 2));
  margin: 2px;
}
</style>

### a
<div class="container">
<div class="image"> <img src="../../dataset/v20220930/a_l/train_61/train_61_00000.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/a_l/train_61/train_61_00001.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/a_l/train_61/train_61_00002.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/a_l/train_61/train_61_00003.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/a_l/train_61/train_61_00004.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/a_l/train_61/train_61_00005.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/a_l/train_61/train_61_00006.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/a_l/train_61/train_61_00007.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/a_l/train_61/train_61_00008.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/a_l/train_61/train_61_00009.png" /> </div>
</div>


### e
<div class="container">
<div class="image"> <img src="../../dataset/v20220930/e_l/train_65/train_65_00000.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/e_l/train_65/train_65_00001.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/e_l/train_65/train_65_00002.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/e_l/train_65/train_65_00003.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/e_l/train_65/train_65_00004.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/e_l/train_65/train_65_00005.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/e_l/train_65/train_65_00006.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/e_l/train_65/train_65_00007.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/e_l/train_65/train_65_00008.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/e_l/train_65/train_65_00009.png" /> </div>
</div>


### i
<div class="container">
<div class="image"> <img src="../../dataset/v20220930/i_l/train_69/train_69_00000.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/i_l/train_69/train_69_00001.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/i_l/train_69/train_69_00002.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/i_l/train_69/train_69_00003.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/i_l/train_69/train_69_00004.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/i_l/train_69/train_69_00005.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/i_l/train_69/train_69_00006.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/i_l/train_69/train_69_00007.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/i_l/train_69/train_69_00008.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/i_l/train_69/train_69_00009.png" /> </div>
</div>


### o
<div class="container">
<div class="image"> <img src="../../dataset/v20220930/o_l/train_6f/train_6f_00000.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/o_l/train_6f/train_6f_00001.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/o_l/train_6f/train_6f_00002.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/o_l/train_6f/train_6f_00003.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/o_l/train_6f/train_6f_00004.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/o_l/train_6f/train_6f_00005.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/o_l/train_6f/train_6f_00006.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/o_l/train_6f/train_6f_00007.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/o_l/train_6f/train_6f_00008.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/o_l/train_6f/train_6f_00009.png" /> </div>
</div>


### u
<div class="container">
<div class="image"> <img src="../../dataset/v20220930/u_l/train_75/train_75_00000.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/u_l/train_75/train_75_00001.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/u_l/train_75/train_75_00002.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/u_l/train_75/train_75_00003.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/u_l/train_75/train_75_00004.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/u_l/train_75/train_75_00005.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/u_l/train_75/train_75_00006.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/u_l/train_75/train_75_00007.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/u_l/train_75/train_75_00008.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/u_l/train_75/train_75_00009.png" /> </div>
</div>


### A
<div class="container">
<div class="image"> <img src="../../dataset/v20220930/A_u/train_41/train_41_00000.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/A_u/train_41/train_41_00001.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/A_u/train_41/train_41_00002.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/A_u/train_41/train_41_00003.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/A_u/train_41/train_41_00004.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/A_u/train_41/train_41_00005.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/A_u/train_41/train_41_00006.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/A_u/train_41/train_41_00007.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/A_u/train_41/train_41_00008.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/A_u/train_41/train_41_00009.png" /> </div>
</div>


### E
<div class="container">
<div class="image"> <img src="../../dataset/v20220930/E_u/train_45/train_45_00000.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/E_u/train_45/train_45_00001.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/E_u/train_45/train_45_00002.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/E_u/train_45/train_45_00003.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/E_u/train_45/train_45_00004.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/E_u/train_45/train_45_00005.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/E_u/train_45/train_45_00006.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/E_u/train_45/train_45_00007.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/E_u/train_45/train_45_00008.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/E_u/train_45/train_45_00009.png" /> </div>
</div>


### I
<div class="container">
<div class="image"> <img src="../../dataset/v20220930/I_u/train_49/train_49_00000.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/I_u/train_49/train_49_00001.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/I_u/train_49/train_49_00002.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/I_u/train_49/train_49_00003.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/I_u/train_49/train_49_00004.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/I_u/train_49/train_49_00005.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/I_u/train_49/train_49_00006.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/I_u/train_49/train_49_00007.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/I_u/train_49/train_49_00008.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/I_u/train_49/train_49_00009.png" /> </div>
</div>


### O
<div class="container">
<div class="image"> <img src="../../dataset/v20220930/O_u/train_4f/train_4f_00000.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/O_u/train_4f/train_4f_00001.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/O_u/train_4f/train_4f_00002.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/O_u/train_4f/train_4f_00003.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/O_u/train_4f/train_4f_00004.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/O_u/train_4f/train_4f_00005.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/O_u/train_4f/train_4f_00006.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/O_u/train_4f/train_4f_00007.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/O_u/train_4f/train_4f_00008.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/O_u/train_4f/train_4f_00009.png" /> </div>
</div>


### U
<div class="container">
<div class="image"> <img src="../../dataset/v20220930/U_u/train_55/train_55_00000.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/U_u/train_55/train_55_00001.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/U_u/train_55/train_55_00002.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/U_u/train_55/train_55_00003.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/U_u/train_55/train_55_00004.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/U_u/train_55/train_55_00005.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/U_u/train_55/train_55_00006.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/U_u/train_55/train_55_00007.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/U_u/train_55/train_55_00008.png" /> </div>
<div class="image"> <img src="../../dataset/v20220930/U_u/train_55/train_55_00009.png" /> </div>
</div>


## Objetivo

Fazer um estudo de um ou mais métodos de reconhecimento de imagens, para reconhecer a letra `i`, em um conjunto de imagens.

O seu método deve responder se a imagem entrada é ou não é a letra `i`.

As possibilidades de imagens se limitam a letras vogais, assim as únicas letras possíveis de entrada serão `a`, `e`, `i`, `o` ou `u`.

Você pode avaliar mais de um método para resolver o problema.

Você deve fazer uma avaliação de cada método estudado usando uma validação cruzada e exibir as pontuações de **acurácia média**_, _**precision**_, _**recall**_ e _**f1**_.

Como **Bônus**, valendo acima da nota máxima, o objetivo é fazer um programa que receba qualquer imagem de letra escrita a mão e responda se esta letra é um `i` ou não.

## Pontuação

A primeira parte avaliada será o _protótipo_: um relatório mostrando o resultado do(s) método(s) funcionando(s). Depois será avaliado o estudo do(s) método(s). E, por fim, caso o grupo decida fazer, o programa que recebe uma imagem de uma vogal e responda se é um `i` ou não.

- 4pts: Um protótipo com um método funcionando.
- 2pts: Mais de um método funcionando.
- 3pts: Um estudo com as pontuações de **acurácia média**_, _**precision**_, _**recall**_ e _**f1**_ de cada método.
- 1pts: Uma justificativa de qual método é melhor.
- 4pts (**Bônus**): Um programa que receba uma imagem qualquer com uma vogal escrita à mão e responda se é um `i` ou não.










.
