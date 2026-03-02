# Classes

Aqui nós vamos aprender o que uma classe pode ter e como escrever uma classe.

## O que uma classe pode ter?

Uma classe pode ter
* **atributos** (também conhecido como **campos**), são as **variáveis** da nossa classe.
* **_constructors_**, são métodos usados para inicializar um objeto da classe
* **métodos**, são as funções da classe

## Como escrevemos uma classe?

Por enquanto usaremos somente classes públicas, porém os campos devem ser todos `private`, então toda classe será feita como abaixo

~~~ java
public class NomeDaClasse{
    // nossos atributos
    private Tipo01 variavel01;
    private Tipo02 variavel02;
    private Tipo03 variavel03;

    // nossos constructors
    public NomeDaClasse(){
        this.variavel01 = new Tipo01();
        this.variavel02 = new Tipo02();
        this.variavel03 = new Tipo03();
    }
    public NomeDaClasse(Tipo01 aVariavel01){
        this(); // Aqui eu estou chamando o constructor desta mesma classe
        this.variavel01 = aVariavel01;
    }
    public NomeDaClasse(Tipo01 aVariavel01, Tipo02 aVariavel02){
        this(aVariavel01); // Aqui eu estou chamando o constructor desta mesma classe
        this.variavel02= aVariavel02;
    }

    // nossos métodos
    public void SetVariavel01(Tipo01 aVariavel01){
        this.variavel01 = aVariavel01;
    }
    public Tipo1 GetVariavel01(){
        return this.variavel01;
    }

    // Podemos definir métodos que tenham o mesmo nome, isto de chama overloading
    public void Metodo01(){
        // O que o método 01 faz
    }
    public void Metodo01(Tipo aVariavel){
        // O que o método 01 faz quando recebe uma variável do tipo "Tipo"
    }
    public void Metodo01(Tipo aVariavel, OutroTipo aOutraVariavel){
        // O que o método 01 faz quando recebe uma variável do tipo "Tipo", e uma outra variável do tipo "OutroTipo"
    }
    public Tipo04 Metodo02(){
        // outro método que retorna um objeto do tipo "Tipo04"
    }
}
~~~


## Regras para Overloading

Fazer "overload" em um método quer dizer definir um outro método com o mesmo nome, mas com argumentos diferentes.

As regras para fazer "overload" são as seguintes:
* Ambos métodos devem ter o mesmo nome
* A lista de argumentos que os dois recebe deve ser diferente

Se dois métodos seguem as regras acima, eles podem, ou não, ter:
* Tipos de retorno diferentes
* Ter diferentes modificadores de acesso

## Modificadores de Acesso

O modificadores que você precisa saber para esta matéria são o `public` e o `private`.

Tanto para campos de uma classe, quanto para métodos, as regras são as mesmas:
* `public`: o campo, ou método, pode ser acessado por qualquer classe
* `private`: o campo, ou método, pode ser acessado **apenas** pelos campos e métodos da **mesma classe**


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


<!-- ## Modificador `final`
(TODO) -->
