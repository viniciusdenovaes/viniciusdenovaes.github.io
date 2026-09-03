# Tema e Objetivos

## Tema

Desenvolvimento de Sistema Com Interface Gráfica Para Manipulação de Banco de Dados

## Objetivo Geral

(NOVO) Desenvolver um sistema em Java, utilizando orientação a objetos e arquitetura MVC/DAO, com interface gráfica para manipulação de dados armazenados em um banco de dados relacional MySQL, possibilitando ao usuário final realizar um *CRUD* completo, ou seja, deve ser possível que o usuário final consiga **C**riar dados para alguma tabela, consultar (**R**ead) dados da tabela, atualizar (**U**pdate) dados da tabela, e **D**eletar dados.

(NOVO) O grupo deve escolher o tema do trabalho e fazer uma modelagem do problema usando, pelo menos, 2 tabelas entidade e uma tabela de relação entre as entidades.

## Objetivos Específicos
- Definir o tema do sistema e modelar as classes de dados, garantindo relacionamento entre elas.
- Implementar a persistência dos dados em um banco de dados relacional MySQL, assegurando unicidade por meio de chaves primárias.
- Criar funcionalidades de listagem de dados, incluindo ordenação por múltiplos critérios e filtragem por buscas específicas.
- Desenvolver mecanismos para inserção e atualização de registros no banco de dados por meio da interface gráfica.
- (NOVO) Desenvolver mecanismos para modificação de dados, por exemplo, endereço de pessoas, preço de produtos, quantidade em estoque.
- (NOVO) Desenvolver mecanismos para exclusão de dados mantendo a integridade dos dados de chave estrangeira.
- Estruturar o sistema aplicando os padrões de arquitetura MVC e DAO, promovendo organização e manutenção do código.
- Implementar uma interface gráfica intuitiva que permita interação eficiente com o usuário final.
- Aplicar tratamento de erros para entradas incorretas ou inconsistentes, assegurando maior robustez e confiabilidade do sistema.

## Conteúdo do Trabalho
O grupo deve planejar, projetar e implementar um sistema em Java, com interface gráfica,
para manipulação e gerenciamento de dados armazenados em um banco de dados relacional MySQL. A aplicação deverá permitir que o usuário final cadastre, consulte, organize e filtre informações de diferentes classes de dados, garantindo a persistência e integridade por meio de chaves primárias. Além da implementação da aplicação, o trabalho deverá contemplar a aplicação dos conceitos de orientação a objetos, bem como o uso dos padrões de arquitetura MVC e DAO, promovendo boas práticas de organização e manutenção do código.

O desenvolvimento do projeto deve envolver pesquisa, planejamento, modelagem das classes e do banco de dados, prototipagem da interface gráfica, codificação, testes, controle de erros e documentação do processo.

O trabalho deve conter, no mínimo, as seguintes funcionalidades:
- O grupo deve escolher o tema do projeto
- (NOVO) O grupo deverá desenvolver um sistema para gerenciamento de dados que deverão ser estruturados em, pelo menos, duas classes de dados com uma tabela de relação entre elas, resultando em, pelo menos, 3 tabelas do banco de dados.
- (NOVO) Cada classe entidade do banco de dados deve ter o seu equivalente a uma classe no Java.
- Todas as classes no sistema devem ter alguma relação com alguma outra classe.
- Os dados persistentes, que deverão servir de entrada e saída para o programa deverão estar representados em um banco de dados relacional.
- É obrigatório que os dados de cada classe estejam indexados por uma chave (ou conjunto de chaves) que faça com que cada um seja único.
- O sistema desenvolvido deve ter uma interface com o usuário final capaz de fazer todas as seguintes ações:
1. Listar todos os dados de uma certa classe
2. Listar os dados ordenados por mais de um critério
3. Listar dados filtrados por alguma busca
4. Adicionar dados de, pelo menos, uma das classes.
5. (NOVO) Modificar dados de, pelo menos, uma das classes.
6. (NOVO) Excluir dados de, pelo menos, uma das classes mantendo a integridade das chaves estrangeiras.
- O grupo deverá usar a linguagem Java com o paradigma de orientação a objetos, onde deve existir uma relação direta entre pelo menos uma tabela e uma classe.
- O programa deverá aplicar ao projeto o padrão de arquitetura MVC e DAO, como ensinado em sala de aula.
- Para o banco de dados deverá ser usado MySQL.
- O programa deverá ter uma interface gráfica com o usuário final.
- É esperado que o sistema tenha um controle de erros para as entradas do usuário final.