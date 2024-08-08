# Model-View-Controller (MVC)

Model-View-Controller é um padrão de arquitetura de software usado para implementa uma Interface de Usuário Final.

O objetivo do MVC é separar a lógica em três elementos:

- Model: O estado do programa (por exemplo: banco de dados, resolvedores de problemas matemáticos, etc...)
- View: A tela de interação com o usuário, com janelas, botões, comandos
- Controller: Faz a interação entre o Model e o View:
   - recebe uma requisição do View,
   - traduz esta requisição para o Model,
   - recebe uma resposta do Model,
   - traduz essa resposta para o View

O MVC é usado em várias áreas, em vários tipos de projetos, aqui veremos exemplos de MVC para um projeto em Java.

## MVC para Java

Neste curso faremos projetos usando o padrão MVC. Todos os projetos seguirão o seguinte padrão:

- Uma `interface` `View`, com
   - todas as requisições que o `Controller` poderá fazer para o `View`
   - um `addActionListener` para cada interação que o usuário, indiretamente, poderá fazer com o `Model`
- Uma `interface` `Model`, com todas as requisições que o `Controller` poderá fazer para o `Model`.
- Uma classe concreta `Controller` que
   - receberá uma implementação de `View` e de `Model` em seu `constructor` e
   - definirá um `ActionListener` para cada interação que o usuário poderá fazer com o `Model`
   - fará a interação do `View` com o `Model`

Os exemplos vistos nas aulas seguirão o seguinte fluxo

 ```dot {engine="dot"}
 digraph MVCExemplo01 {
   Controller -> Model
   View -> Controller
   Controller -> View
 }
 ```
 - O Controller faz requisições para o Model
 - O Controller faz requisições para o View
    - Requisições de dados de entrada do usuário e
    - Requisições para o View mostrar dados para o usuário
 - O View inicia ações definidas pelo Controller (ActionListener)


### Exemplos de Modelos de Projetos

#### Exemplo1: Interação de um usuário com um banco de dados de nomes

Vamos considerar um projeto que guarda nomes de pessoas em um banco de dados, e uma interface de usuário que permite ao usuário fazer uma busca de uma parte do nome, e inserir um nome

Teremos uma `interface View`

```java
interface View {
  // configurações de gatilhos de ações
  public void addAcaoInserirNome(ActionListener acaoInserirNome);
  public void addAcaoBuscarNome(ActionListener acaoBuscarNome);

  // mostrar dados do programa
  public void mostrarNomes(List<String> nomes);

  // requisições de entrada de usuários
  public String getNomeBusca();
  public String getNomeInserir();
}
```


Teremos uma `interface Model`

```java
interface Model {
  // ações para fazer em um banco de dados
  public List<String> buscarNome(String nome);
  public void inserirNome(String nome);
}
```

Teremos uma classe concreta `Controller` programado para as interface `View` e `Model`

```java
class Controller {
  Model model;
  View view;

  public Controller(Model aModel, View aView){
    this.model = aModel;
    this.view = aView;
  }

  public void init(){
    view.addAcaoInserirNome(new AcaoInserirNome());
    view.addAcaoBuscarNome(new AcaoBuscarNome());
  }

  class AcaoBuscarNome implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){

      // resuisita as entradas para o view
      String nome = view.getNomeBusca();

      // pede para o model fazer a busca
      List<String> nomes = model.buscarNome(nome);

      // pede para o view mostrar o resultado
      view.mostrarNomes(nomes);
    }
  }


  class AcaoInserirNome implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){

      // resuisita as entradas para o view
      String nome = view.getNomeInserir();

      // pede para o model fazer a inserção
      model.inserirNome(nome);
    }
  }

}
```



#### Exemplo02: Interação de um usuário com um resolvedor matemático

Vamos considerar um projeto recebe dois números do usuário e faz algum tipo de conta.

```java
interface View {
  // configurações de gatilhos de ações
  public void addAcaoCalcular(ActionListener acaoCalcular);

  // mostrar dados do programa
  public void mostrarResultado(int resultado);

  // requisições de entrada de usuários
  public int getNumeroA();
  public int getNumeroB();
}
```


```java
interface Model {
  // ações para fazer em um banco de dados ou resolvedores matemáticos
  public int calcularNumeros(int a, int b);
}
```

```java
class Controller {
  Model model;
  View view;

  public Controller(Model aModel, View aView){
    this.model = aModel;
    this.view = aView;
  }

  public void init(){
    view.addAcaoCalcular(new AcaoCalcular());
  }

  class AcaoCalcular implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){

      // resuisita as entradas para o view
      int numeroA = view.getNumeroA();
      int numeroB = view.getNumeroB();

      // pede para o model fazer as contas
      int result = model.calcularNumeros(numeroA, numeroB);

      // mostra o resultado para o view
      view.mostrarResultado(result);
    }
  }

}
```

### Mas onde estão as classes concretas de Model e View?

O modelo MVC permite que o programa seja flexível e que funcione com **qualquer** implementação das interfaces `View` e `Model`. Nos laboratórios vamos ver exemplos de implementações destas interfaces, e como testar as implementações.












.
