
Atividades Práticas Supervisionadas (APS): Inteligência Artificial

Tema: Análise Comparativa de Algoritmos para o Problema do Caixeiro Viajante (TSP)

1. Introdução e Objetivo

O objetivo deste trabalho é explorar a resolução do Problema do Caixeiro Viajante (Traveling Salesman Problem - TSP), um problema clássico de otimização combinatória classificado como NP-difícil. 

O desafio consiste em encontrar a rota mais curta que visite um conjunto de cidades exatamente uma vez e retorne à cidade de origem. O grupo deve implementar e comparar três abordagens distintas, analisando o trade-off entre tempo de processamento e qualidade da solução

2. Bases de Dados (Datasets)

As instâncias para teste e validação dos algoritmos devem ser extraídas das seguintes fontes acadêmicas:
 - TSPLIB95: http://www.iwr.uni-heidelberg.de/groups/comopt/software/TSPLIB95/
 - World TSP (University of Waterloo): https://www.math.uwaterloo.ca/tsp/world/countries.html
 - Repositório do professor Vinicius de Novaes com alguns exemplos organizados das fontes anteriores: https://github.com/viniciusdenovaes/TSPLib-APS_IA

3. Desenvolvimento e Conceitos Computacionais

O trabalho será dividido em três etapas principais de implementação:

   - Passo 1: Busca em Espaço de Estados (Solução Ótima) Nesta etapa, o grupo deve implementar um algoritmo que faça uma busca exaustiva no Espaço de Estados (podendo ser uma busca em Profundidade ou Largura).
    Conceito: O espaço de estados representa todas as permutações possíveis de cidades. O algoritmo deve gerar sistematicamente essas permutações para garantir que o caminho de custo mínimo seja encontrado.
     Complexidade: Deve-se discutir a explosão combinatória de complexidade O(n!).Neste caso teremos n! possibilidades, sendo n o número de vértices no grafo, mostrando como o tempo de execução cresce exponencialmente com o aumento do número de cidades (n).
   - Passo 2: Branch and Bound (Solução Ótima Otimizada) A aplicação da técnica de Branch and Bound visa encontrar **a mesma** solução ótima do passo anterior, porém de forma mais eficiente.
    Conceito: A técnica utiliza a árvore de busca onde cada nó representa uma solução parcial. O "Branch" (ramificação) gera os filhos de cada vértice, enquanto o "Bound" (limite) calcula um limite inferior de custo para cada ramo.
    Poda (Pruning): Se o limite inferior de um ramo for maior que a melhor solução já encontrada (upper bound), o ramo é descartado ("podado"), evitando a exploração de caminhos inúteis e reduzindo o tempo de processamento em relação à busca exaustiva simples.
   - Passo 3: Heurística (Solução Aproximada) O grupo deve implementar uma técnica que não garante a otimalidade, mas entrega uma solução "boa o suficiente" em tempo polinomial. Para este item, sugere-se o uso de Soluções iniciais Greedy Algoritmos Genéticos, Colônia de Formiga ou Busca Local (ex: 2-opt). O grupo pode escolher qualquer um.
    Conceito: Diferente dos métodos exatos, as heurísticas focam na eficiência computacional. 
    Uma solução Greedy, por exemplo, pode escolher apenas as menores rotas disponíveis até que uma solução seja formada.
    No caso de Algoritmos Genéticos, utiliza-se conceitos de evolução biológica (população, cruzamento, mutação e seleção natural) para iterativamente melhorar as rotas. 
    Análise: O foco aqui é demonstrar que, para instâncias grandes (onde os passos 1 e 2 falham por tempo/memória), a heurística consegue fornecer resultados viáveis rapidamente.

4. Estrutura do Relatório Final
Conforme as normas da instituição, o trabalho deve conter

Capa e Sumário: Identificação do grupo e organização do documento.
Referencial Teórico: Explicação da estrutura de Grafos, a implementação escolhida e as lógicas de Busca e Heurísticas

Metodologia: Descrição do hardware utilizado, linguagem de programação e como as instâncias do TSPLIB foram tratadas e lidas pelo programa.

Resultados e Discussão:
Tabela Comparativa: Colunas para "Instância", "Algoritmo", "Tempo de Execução", "Distância Total" e "% de Erro" (em relação ao ótimo conhecido, se houver).
Gráficos demonstrando o crescimento do tempo de execução em relação ao tamanho da instância.

Conclusão: Reflexão sobre a viabilidade de cada método conforme a escala do problema

Código-Fonte: Apêndice com uma parte principal da implementação documentada.

Ficha de Atividades: Registro cronológico das tarefas de cada integrante com assinaturas manuais

5. Formatação e Entrega
Texto: Fonte Arial 12, espaçamento 1,5, margens de 2,5 cm

Grupo: Recomendado 5 alunos

Apresentação: O grupo deve realizar uma demonstração do software executando os testes em tempo real


