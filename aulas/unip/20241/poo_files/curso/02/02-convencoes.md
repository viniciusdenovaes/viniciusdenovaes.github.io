# Convenções Para Classes e Objetos

As regras aqui listadas **não** vão fazer o seu programa funcionar melhor.

Mas estas convenções são importantes para que seu programa seja melhor entendido pelos seus colegas e pela comunidade.
E **isto** sim, vai evitar que seu programa tenha erros no futuro, seja fácil de manter e corrigir erros, e seja fácil para inserir novas funcionalidades.

Você precisa saber: estas regras serão avaliadas nas provas e nos trabalhos (e na sua carreira profissional).

## Tipos Primitivos
Os tipos primitivos que usaremos serão:
* `int` para representar um número inteiro,
* `double` e `float` para representar um número real,
* `boolean` para representar um booleano e
* `char` para representar um character.

Em nenhuma parte do curso você precisará usar `long` ou `unsigned`.


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
* Nomes de variáveis `private` começam com letra minúscula
* Nomes de variáveis `public` começam com letra maiúscula
* Nomes de métodos começam com letra maiúscula
* Os nomes devem usar o estilo [camelCase](https://pt.wikipedia.org/wiki/CamelCase) (ou [PascalCase](https://pt.wikipedia.org/wiki/PascalCase)): que consiste em separar palavras começando a próxima palavra por letra maiúscula (este é o padrão em C#). (e **não** o [snake_case](https://en.wikipedia.org/wiki/Snake_case))
* Atributos constantes (`const`) devem ser escritos em caixa alta, separando palavras por `_`

## Ordem de Campos, Constructors e Métodos
* As definições de campos (variáveis), constructors e métodos **de uma classe** devem seguir a ordem
    * Campos
    * Constructors
    * Métodos

## Convenção de Encapsulamento

**Todo** atributo da sua classe deve ser inicializado no contructor. Mesmo que seja por um valor padrão não recebido nos argumentos.

**Todo** atributo da sua classe deve ser `private`. As variáveis que você quer que o usuário da sua classe tenha acesso deve ter métodos públicos `get` e/ou um `set`.
Por exemplo, se você acha que faz sentido que o usuário **mude** alguma variável do tipo `string` chamada `variavelDoExemplo`, esta classe **deve** ter o método
``` cs
public void SetVariavelDoExemplo(String aVariavelDoExemplo){
  this.variavelDoExemplo = aVariavelDoExemplo;
}
```
Se você acha que faz sentido que o usuário **tenha acesso ao valor** de alguma variável do tipo `string` chamada `variavelDoExemplo`, esta classe **deve** ter o método
``` cs
public String GetVariavelDoExemplo(){
  return this.variavelDoExemplo;
}
```


## Exemplo

``` cs
// Nome da classe começa com letra maiúscula e têm o estilo CamelCase
class ExemploDeConvencoes {

    // Atributos que são constantes devem ser escritos com letra maiúscula
    public static const double ATRIBUTO_CONSTANTE = 3.14159;

    // Campos de variáveis começam com letra minúscula e têm o estilo CamelCase
    private string variavelDoExemplo;
    private int numeroDoExemplo;
    private double pesoDoExemplo;

    public ExemploDeConvencoes(string aVariavelDoExemplo, int aNumeroDoExemplo){
      this.variavelDoExemplo = aVariavelDoExemplo;
      this.numeroDoExemplo = aNumeroDoExemplo;
      this.pesoDoExemplo = 0;
    }

    public string GetVariavelDoExemplo(){
        return this.variavelDoExemplo;
    }

    public void SetVariavelDoExemplo(string aVariavelDoExemplo){
        this.variavelDoExemplo = aVariavelDoExemplo;
    }

    public int GetNumeroDoExemplo(){
        return this.numeroDoExemplo;
    }

    public void SetPesoDoExemplo(double aPesoDoExemplo){
        this.pesoDoExemplo = aPesoDoExemplo;
    }

    // Métodos começam com letra minúscula e têm o estilo CamelCase
    public void MetodoDoExemplo(){
    }

}
```
