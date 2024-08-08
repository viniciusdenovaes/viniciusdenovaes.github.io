# Trabalho 03 de CN: Otimização Por Equações Lineares

Para este trabalho você deve fazer um programa que encontre a **melhor** solução para o *problema da dieta*.

Neste problema é dado
- uma coleção de restrições representando o mínimo que o corpo precisa diariamente de cada componente;
- uma coleção de alimentos com cada um dos atributos incluindo:
   - quantidade
   - preço
   - cada um dos componentes incluído no alimento

Você deve encontrar uma combinação de alimentos, atrubuindo uma quantidade que cada alimento deve ser comprado, para satisfazer o mínimo dos componentes necessários (deve ter uma quantidade maior ou igual para cada componente) e **minimizar** o gasto total pago pelos alimentos.

### Ferramentas

Existem várias ferramentas de **Otimização por Programação Por Restrições**, como
- [google or-tools](https://developers.google.com/optimization)
- [GLPK da GNU](https://www.gnu.org/software/glpk/)
- [CPLEX da IMB](https://www.ibm.com/analytics/cplex-optimizer)
- [Gurobi](https://www.gurobi.com/)

A sugestão para esta aula é usar o google or-tools, exemplos podem ser encontrados na [aula de programação por restrição](https://github.com/viniciusdenovaes/Unip222CN/tree/master/aulaORTools) ou no [site oficial da ferramenta](https://developers.google.com/optimization)


### Entradas

A entrada estará em formato `csv` e será dado na forma

- [nutrientes](https://raw.githubusercontent.com/viniciusdenovaes/Unip222CN/master/aulaORTools/trabalho/nutrientes.csv): o mínimo que o corpo precisa diariamente, com colunas
   - `nome`: com o nome e a unidade de medida
   - `minimo`: com o valor mínimo
- [data](https://raw.githubusercontent.com/viniciusdenovaes/Unip222CN/master/aulaORTools/trabalho/data.csv): uma tabela com uma coleção de produtos contendo as colunas
   - `ingrediente`: o nome do ingrediente
   - `quantidade`: a quantidade
   - `preco`: o preço por esta quantidade
   - uma coluna para cada composto visto na tabela de nutrientes representando o quanto deste composto tem nesta quantidade deste ingrediente

### Solução

Uma solução é uma lista com a quantidade de cada ingrediente que satisfaz o mínimo para cada nutriente.

A melhor solução é a que minimiza o preço total do custo da solução.

### Regras

 - Você pode fazer em qualquer uma das seguintes linguagens: python, java, C++, C ou C#.

 - Você pode usar **qualquer biblioteca** interna ou externa à linguagem que você utilizará. Porem, deve **obrigatoriamente** exibir a solução.

### Links
- [google or-tools](https://developers.google.com/optimization)
- [aula de programação por restrição](https://github.com/viniciusdenovaes/Unip222CN/tree/master/aulaORTools)
- [nutrientes.csv](https://raw.githubusercontent.com/viniciusdenovaes/Unip222CN/master/aulaORTools/trabalho/nutrientes.csv)
- [data.csv](https://raw.githubusercontent.com/viniciusdenovaes/Unip222CN/master/aulaORTools/trabalho/data.csv)





.
