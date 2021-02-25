# Convenções Para Classes e Objetos

As regras aqui listadas **não** vão fazer o seu programa funcionar melhor.

Mas estas convenções são importantes para que seu programa seja melhor entendido pelos seus colegas e pela comunidade.
E **isto** sim, vai evitar que seu programa tenha erros no futuro, seja fácil de manter e corrigir erros, e seja fácil para inserir novas funcionalidades.

Você precisa saber: estas regras serão avaliadas nas provas e nos trabalhos.

## Tipos Primitivos
Os tipos primitivos que usaremos serão:
* `int` para representar um número inteiro,
* `double` para representar um número real,
* `boolean` para representar um booleano e
* `char` para representar um character.

Em nenhuma parte do curso você precisará usar `long`, `unsigned` ou `float`.

Quando falarmos de `collections` vamos precisar usar `Wrappers` dos tipos primitivos: `Integer`, `Double`, `Boolean` e `Character`. Usaremos `Wrappers` apenas quando precisarmos usar.



## Nomes de Classes e Variáveis

Nomes devem ser **mnemônicos**. Os nomes devem nos ajudar a lembrar do que está guardado naquela variável, ou o significado daquela classe.
Por exemplo,
* uma classe que representa o cadastro de um aluno, pode se chamar `CadastroAluno`.
* Uma classe para estrutura o nome do aluno em nome e sobre nome pode se chamar `Nome`, ou `NomeCompleto`.
* Uma classe para guardar o endereço do aluno pode se chamar `Endereco`, e terá os atributos `nomeDaRua`, `numeroDaRua`, `cep`, `cidade`, `estado`, etc...
* Uma classe feita para fazer o teste da classe `CadastroAluno` pode se chamar `TesteCadastroAluno`.
* Uma classe feita para calcular as médias de um aluno pode se chamar `CadastroAlunoCalculator`, ou `CadastroAlunoSolver` (Solver == Resolvedor, aquele que resolve um problema)

### Regras para Nomes

* Nomes de classes começam com letra maiúscula
* Nomes de variáveis começam com letra minúscula
* Nomes de métodos começam com letra minúscula
* Os nomes devem usar o estilo [CamelCase](https://pt.wikipedia.org/wiki/CamelCase): que consiste em separar palavras começando a próxima palavra por letra maiúscula (este é o padrão em Java). (e **não** o [snake_case](https://en.wikipedia.org/wiki/Snake_case))
* Atributos constantes (`final`) devem ser escritos em caixa alta, separando palavras por `_`

## Ordem de Campos, Constructors e Métodos
* As definições de campos (variáveis), constructors e métodos **de uma classe** devem seguir a ordem
    * Campos
    * Constructors
    * Métodos

## Convenção de Encapsulamento

**Todo** atributo da sua classe deve ser inicializado no contructor. Mesmo que seja por um valor padrão não recebido nos argumentos.

**Todo** atributo da sua classe deve ser `private`. As variáveis que você quer que o usuário da sua classe tenha acesso deve ter métodos públicos `get` e/ou um `set`.
Então se você tem uma classe


## Exemplo

``` java
// Nome da classe começa com letra maiúscula e têm o estilo CamelCase
class ExemploDeConvencoes {

    // Atributos que são constantes devem ser escritos com letra maiúscula
    public static final double ATRIBUTO_CONSTANTE = 3.14159;

    // Campos de variáveis começam com letra minúscula e têm o estilo CamelCase
    private String variavelDoExemplo;
    private int numeroDoExemplo;
    private double pesoDoExemplo;

    // Métodos começam com letra minúscula e têm o estilo CamelCase
    public void metodoDoExemplo(){
    }

}
```
