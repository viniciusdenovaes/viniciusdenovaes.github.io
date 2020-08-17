# Revisão

Nesta revisão você deve fazer um projeto que representa um programa para uma locadora de filmes

Você deve fazer um projeto que tenha os seguintes pacotes:

* **entidade:** o pacote onde estão modeladas os dados que serão trabalhados
* **dao:** o pacote que fará o serviço de guardar e recuperar dados no disco
* **view:** o pacote que fará o serviço de exibir dados e interagir com o usuário final
* **controller:** o pacote que controla o fluxo de informação entre o view, e a lógica do programa
* **teste:** o pacote para testar cada parte do programa separadamente


## Exercício 1 (Entidade)

No pacote **entidades**, faça uma classe chamada **Filme** que represente o objeto filme, com os seguintes elementos:
* **nome:** uma *String* que represente o nome do filme
* **ano:** um *int* positivo que representa o ano de lançamento do filme

No pacote **testes** faça uma classe chamada **TesteFilme** com um método **main** que
* cria e imprime alguns filmes
* cria e imprime uma lista de filmes


## Exercício 2 (Dao)

Faça uma classe **DaoCsv** no pacote **dao** que *implements* a interface:

```java
interface DAO{
  // Este método retorna uma lista de filmes guardada no disco
  public Collection<Filme> loadFilmes();
  // Este método salva uma lista de filmes no disco
  public void saveFilmes(Collection<Filme> filmes);

}
```

A sua classe **DaoCsv** deve ler e salvar a coleção de filmes em um arquivo no formato *csv*

Para um teste inicial você pode usar o seguinte arquivo:

```csv
E.T., 1982
Amistad, 1997
Indiana Jones, 1984
Jaws, 1975
```

Faça uma classe chamada **TesteDao** com um método **main** que leia os files na memória, adicione um outro filme, e guarde a nova coleção de filmes na memória.


## Exercício 3 (View)

Insira o seguinte *enum* no pacote **controller**

```java
enum Acao{LISTAR, ADICIONAR, SAIR}
```

Faça uma classe **ViewTerminal** no pacote **view** que **implements** a seguinte interface:

```java
interface View{
  /*
  * Este método deve perguntar para o usuário qual próxima ação deve tomar
  * e deve retornar um dentre os seguintes elementos de Acao
  * LISTAR: para listar todos os filmes existentes
  * ADICIONAR: para adicionar um filme
  * SAIR: para terminar o programa
  */
  public Acao perguntaAcao();

  // Este método deve mostrar toda a coleção de filmes para o usuário
  public void mostrarFilmes(Collection<Filme> filmes);
  // Este método deve pedir um nome de filme para o usuário e retornar
  // o nome do filme entrado
  public String pedirNome();
  // Este método deve pedir um ano de filme para o usuário e retornar um
  // inteiro com o ano entrado
  public int pedirAno();

}
```


## Exercício 4 (Controller)

Para finalizar, faça uma classe **Controller** no pacote **controller**

O constructor deve ter a seguinte assinatura `public Controller(Dao dao, View view)`

Esta classe deve usar a sua implementação do **Dao** e a sua implementação do **View** para
interagir com o usuário usando o arquivo csv para guardar a coleção de filmes
