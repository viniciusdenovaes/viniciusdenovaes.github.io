# Classes

Aqui nós vamos aprender o que uma classe pode ter e como escrever uma classe.

## O que uma classe pode ter?

Uma classe pode ter
 - **atributos** (também conhecido como **campos**), são as **variáveis** da nossa classe.
 - **_constructors_**, são métodos usados para inicializar um objeto da classe
 - **métodos**, são as funções da classe

## Como escrevemos uma classe?

Por enquanto usaremos somente classes públicas, porém os campos devem ser todos `private`, então toda classe será feita como abaixo

~~~ java
public class nomeDaClasse{
    // nossos atributos
    private Tipo01 variavel01;
    private Tipo02 variavel02;
    private Tipo03 variavel03;

    // nossos constructors
    public nomeDaClasse(){
        this.variavel01 = new Tipo01();
        this.variavel02 = new Tipo02();
        this.variavel03 = new Tipo03();
    }
    public nomeDaClasse(Tipo01 aVariavel01){
        this(); // Aqui eu estou chamando o constructor desta mesma classe
        this.variavel01 = aVariavel01;
    }
    public nomeDaClasse(Tipo01 aVariavel01, Tipo02 aVariavel02){
        this(aVariavel01); // Aqui eu estou chamando o constructor desta mesma classe
        this.variavel02= aVariavel02;
    }

    // nossos métodos
    public void setVariavel01(Tipo01 aVariavel01){
        this.variavel01 = aVariavel01;
    }
    public Tipo1 getVariavel01(){
        return this.variavel01;
    }

    // Podemos definir métodos que tenham o mesmo nome, isto de chama overloading
    public void metodo01(){
        // coisas que o método 01 faz
    }
    public void metodo01(Tipo aVariavel){
        // coisas que o método 01 faz quando recebe uma variável do tipo "Tipo"
    }
    public void metodo01(Tipo aVariavel, OutroTipo aOutraVariavel){
        // coisas que o método 01 faz quando recebe uma variável do tipo "Tipo", e uma outra variável do tipo "OutroTipo"
    }
    public Tipo04 metodo02(){
        // outro método que retorna um objeto do tipo "Tipo04"
    }
}
~~~


## Regras para Overloading

Fazer "overload" em um método quer dizer definir um outro método com o mesmo nome, mas com argumentos diferentes.

As regras para fazer "overload" são as seguintes:
 - Ambos métodos devem ter o mesmo nome
 - A lista de argumentos que os dois recebe deve ser diferente

Se dois métodos seguem as regras acima, eles podem, ou não, ter:
 - Tipos de retorno diferentes
 - Ter diferentes modificadores de acesso

## Modificadores de Acesso

O modificadores que você precisa saber para esta matéria são o `public` e o `private`.

Tanto para campos de uma classe, quanto para métodos, as regras são as mesmas:
 - `public`: o campo, ou método, pode ser acessado por qualquer classe
 - `private`: o campo, ou método, pode ser acessado **apenas** pelos campos e métodos da **mesma classe**

Além destes dois, temos mais dois modificadores:
 - `protected`: o campo, ou método, pode ser acessado **apenas** pelas classes que estão no mesmo pacote
 - Default (quando não tem nenhum modificador): o campo, ou método, pode ser acessado **apenas** pelas classes que estão no mesmo pacote.

| Class   | Package | Subclass (mesmo pacote) | Subclass (pacote diferente) | Mundo |
|:---     |:---:    |:---:                    |:---:                        |:---:  |
public    | + | + | + | + |
protected | + | + | + |   |
Default   | + | + |   |   |
private   | + |   |   |   |



## Modificador `static`

### Para variável

Uma variável com o modificador `static` é uma variável que pertence à classe, e não à um objeto da classe.

Isto quer dizer que o valor da variável é **sempre** o mesmo para todo objeto da mesma classe.
Se uma modificar o valor, este será modificado para todos os outros objetos.

Inclusive, por conveção, acesso à variável deve ser feito através do nome da classe, e não do objeto.

### Para métodos

Um método `static` **não** poderá ter acesso ao valor das variáveis do objeto, somente às veriáveis `static` da classe.

Um método `static` pode criar objetos e poderá ter acesso à qualquer objeto que criou.

Um exemplo de método `static` é o "main"


## Modificador `final`
(TODO)











# jemdoc: menu{../../../../../../MENU}{index.html}{../../../../../../}
= Convenções Para Classes e Objetos
[../../../../../../index.html Vinicius de Novaes Pereira]

As regras aqui listadas não vão fazer o seu programa funcionar melhor.

Mas estas convenções são importantes para que seu programa seja melhor entendido pelos seus colegas e pela comunidade.
E **isto** sim, vai evitar que seu programa tenha erros no futuro, seja fácil de manter e corrigir erros, e seja fácil para inserir novas funcionalidades.

Você precisa saber: estas regras serão avaliadas nas provas e nos trabalhos (se houver trabalho).

## Nomes de Classes

 - Nomes de classes começam com letra maiúscula
 - Nomes de variáveis começam com letra minúscula
 - Nomes de métodos começam com letra minúscula
 - Os nomes devem usar o estilo [CamelCase](https://pt.wikipedia.org/wiki/CamelCase)
 - Atributos constantes (`final`) devem ser escritos em caixa alta, separando palavras por `_`

## Ordem de Campos, Constructors e Métodos
 - As definições de campos (variáveis), constructors e métodos **de uma classe** devem seguir a ordem
 . Campos
 . Constructors
 . Métodos


## Exemplo

~~~ java
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
~~~
