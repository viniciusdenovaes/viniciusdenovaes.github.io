# Revisão

Nesta revisão você deve fazer um projeto que representa um programa para uma locadora de filmes

Você deve fazer um projeto que tenha os seguintes pacotes:

* **entidade:** o pacote onde estão modeladas os dados que serão trabalhados
* **dao:** o pacote que fará o serviço de guardar e recuperar dados no disco
* **view:** o pacote que fará o serviço de exibir dados e interagir com o usuário final
* **controller:** o pacote que controla o fluxo de informação entre o view, e a lógica do programa
* **teste:** o pacote para testar cada parte do programa separadamente


## Exercício 1 (Entidade)

No pacote **entidades**, faça uma classe que represente o objeto filme, com os seguintes elementos:
* **nome:** uma *String* que represente o nome do filme
* **ano:** um *int* positivo que representa o ano de lançamento do filme

No pacote **testes** faça uma classe chamada **TesteFilme** com um método **main** que
* cria e imprime alguns filmes
* cria e imprime uma lista de filmes


## Exercício 2 (Dao)

Faça uma classe que extende a seguinte interface:
