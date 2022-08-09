# Roteiro para a APS

Trabalho em grupo de, no máximo, 5 pessoas.

Neste trabalho o grupo deve fazer um programa de acesso aos dados de uma faculdade, com informações sobre cadastro de alunos e cursos; e alunos cadastrados no curso.

## Entidade

O seu programa deve processar dados relativos a alunos, cursos e a relação entre alunos e cursos.

- Um `Aluno` tem:
	- um `id`, do tipo `String`;
	- um `nome` do tipo `String`
	- Cada aluno tem um `id` único e pode ser identificado exclusivamente por seu `id`; dois alunos podem ter o mesmo nome, mas nunca o mesmo `id`
- Um `Curso` tem:
	- um `nome`, do tipo `String`;
	- um `nivel` de dois possíveis, podendo ser de "graduacao", ou "pos_graduacao";
	- um `ano`, do tipo inteiro, representando o ano que o curso foi dado;
	- Cada curso deve ser identificado pela combinação de seus três campos; dois cursos são iguais se, e somente se, seus três campos forem iguais.
- Um `Aluno` pode estar cadastrado em 0  ou mais cursos
- Um `Curso` pode estar ter 0  ou mais alunos cadastrados



## Interface

 o programa deve ter uma interface com o usuário através do terminal, deve ser possível para o usuário

- Listar todos os cursos dados: para cada curso deve ser impresso seu nome, nível e ano, somente
- Listar todos os alunos inscritos: para cada aluno deve ser impresso seu nome e id, somente
- Listar os alunos que estão cadastrados em um determinado curso:
	- o seu programa deve ter meios para o usuário escolher o curso
- Listar os cursos que um determinado aluno está cadastrado:
	- o seu programa deve ter meios para o usuário escolher o aluno
- Incluir um novo aluno: deve ser pedido para o usuário informar o id e o nome do aluno.
- Incluir um novo curso: deve ser pedido para o usuário informar o nome, escolher o tipo, e informar o ano.
- Incluir uma nova relação entre um aluno já cadastrado e um curso já cadastrado.




## Dados

### Entrada

Os dados iniciais do programa devem ser lidos de **arquivos externos no formato CSV**.

O local dos arquivos será preconfigurado em algum local da escolha do grupo. Os arquivos podem ser carregados no momento que o programa iniciar.

A estrutura dos arquivos ficará à cargo do grupo decidir.

### Saída

Após terminar o programa, os arquivos listados devem estar atualizados com quaisquer modificações feitas pelo usuário, mas mantendo o formato especificado pelo grupo.
De modo que deva ser possível terminar e reiniciar o programa mantendo o mesmo estado dos dados.



## Controle de Erros

 O seu programa deve ter um controle *para entradas do usuário* e conseguir voltar para um estado estável caso o usuário coloque alguma entrada não aceitável.

## Avaliação

O seu programa será avaliado nos seguintes requisitos:
- De acordo com cada item feito da descrição do trabalho
- De acordo com a estruturação do programa, se cada classe está fazendo o que deveria fazer (tente manter a regra de que cada classe deve ter apenas um trabalho)
- Os nomes das classes, métodos e variáveis serão avaliados
- Controle de erros em relação à entrada do usuário usando ou não o ambiente `try-catch`
- Uso de recursos dados em aula:
	- se o seu programa usa o paradigma de orientação a objetos (Classes e Objetos)
	- se suas classes implementam interfaces dadas em aula (Comparable por exemplo)
	- se usa conceitos dados em aula (encapsulamento e composição)
	- se usa estruturas dadas em aula (ArrayList, Set, Map)
- Você é convidado a usar outros conceitos não vistos, como "enumerate", "factory pattern", MVC, "programação genérica", etc...

## Relatório

O formato do relatório e o arquivo oficial da APS será fornecido no dia 22/04









.
