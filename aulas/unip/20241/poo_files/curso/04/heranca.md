# Herança

Herança é a relação entre duas classes, uma superclasse e uma subclasse, que faz com que
- a subclasse tenha exatamente todos os atributos e métodos da superclasse.
- Tendo ainda a possibilidade de adicionar atributos e métodos
- e também de redefinir os métodos.

Por exemplo, vamos fazer uma classe `Pato` que tem os atributos: nome e ano de nascimento; e os métodos voa e nada.
Depois vamos definir uma subclasse `PatoSubmarino` que tem também uma valocidade para nadar e redefine o método nadar.

``` cs
class Pato{
    private string nome;
    private int ano;
    public Pato(string aNome, int aAno){
        this.nome = aNome;
        this.ano = aAno;
    }

    public string GetNome(){
        return nome;
    }
    public int GetAno(){
        return ano;
    }
    public void Voa(){
        Console.WriteLine("O Pato voa");
    }
    public void Nada(){
        Console.WriteLine("O Pato nada");
    }
    public override string ToString(){
        string res = "classe " + this.GetType().Name + "\n";
        res += "nome: " + this.nome + "\n";
        res += "nascimento: " + this.ano + "\n";
        return res;
    }
}
```

``` cs
class PatoSubmarino: Pato {
    private double velocidade;
    public PatoSubmarino(string aNome, int aAno, double aVelocidade): base(aNome, aAno){
        this.velocidade = aVelocidade;
    }
    public override void Nada()
    {
        Console.WriteLine("Nada com uma velocidade de " + this.velocidade);
    }

    public override string ToString()
    {
        string res = base.ToString();
        res += "Velocidade: " + this.velocidade + "\n";
        return res;
    }

}

```

``` cs

class TestePato {
    public static void Main(string[] args) {
        Pato pato = new Pato("joao", 1999);
        Console.WriteLine(pato);
        pato.Voa();
        pato.Nada();


        PatoSubmarino patoSubmarino = new PatoSubmarino("atomico", 2000, 555);
        Console.WriteLine(patoSubmarino);
        patoSubmarino.Voa();
        patoSubmarino.Nada();
    }
}

```

Saída

```
classe class Pato
nome: joao
nascimento: 1999

O Pato voa
O Pato nada
classe class PatoSubmarino
nome: atomico
nascimento: 2000
Velocidade: 555.0

O Pato voa
Nada com uma velocidade de 555.0
```

## Polimorfismo

Polimorfismo é a capacidade que uma variável  de um tipo poder representar qualquer objeto filho deste tipo.
No exemplo anterior podemos ter uma variável do tipo `Pato` com objetos do tipo `PatoSubmarino`
Podemos ter uma Lista de `Pato` com objetos do tipo `PatoSubmarino`

``` cs
class TestePolimorfismo {
    public static void Main(string[] args) {
        Pato pato01 = new Pato("joao", 1999);
        Console.WriteLine(pato01);
        pato01.Voa();
        pato01.Nada();


        Pato patoSubmarino = new PatoSubmarino("atomico", 2000, 555);
        Console.WriteLine(patoSubmarino);
        patoSubmarino.Voa();
        patoSubmarino.Nada();


        Console.WriteLine();
        Console.WriteLine("\n----------------------------------------");
        Console.WriteLine("Fazendo uma lista de patos do tipo Pato");
        Console.WriteLine("----------------------------------------\n");
        List<Pato> patos = new List<Pato>();
        patos.Add(pato01);
        patos.Add(patoSubmarino);

        foreach (Pato pato in patos) {
            Console.WriteLine(pato);
            pato.Voa();
            pato.Nada();
        }

    }
}
```
Saída

```
classe class Pato
nome: joao
nascimento: 1999

O Pato voa
O Pato nada
classe class PatoSubmarino
nome: atomico
nascimento: 2000
Velocidade: 555.0

O Pato voa
Nada com uma velocidade de 555.0


----------------------------------------
Fazendo uma lista de patos do tipo Pato
----------------------------------------

classe class Pato
nome: joao
nascimento: 1999

O Pato voa
O Pato nada
classe class PatoSubmarino
nome: atomico
nascimento: 2000
Velocidade: 555.0

O Pato voa
Nada com uma velocidade de 555.0

```

## Classe Abstrata

Classes abstratas servem como classe base para fazer subclasses. Por exemplo, se você tem as classes `Cachorro`, `Gato` e `Pato`, que compartilham atributos e métodos, você pode fazer uma classe abstrata para servir de super classe para as três classes.

A **vantagem da classe abstrata** é que ela pode ter métodos abstratos, que são métodos que não precisam ser implementados, forçando que a subclasse **concreta** implemente.

As características de uma clase abstrata são:
- Uma classe abstrata **não** pode ser instanciada (não pode ser criado um objeto de uma classe abstrata)
- Uma classe abstrata pode ter métodos abstratos, são métodos que não são implementados.

#### Exemplos Sem Usar Classes Abstratas


Por exemplo, considere as seguintes classes:

``` cs
namespace sem_classe_abstrata;

class Cachorro {
    private string nome;
    private int idade;

    public Cachorro(string aNome) {
        this.nome = aNome;
        this.idade = 0;
    }

    public string GetNome() { return this.nome; }
    public int GetIdade() { return this.idade; }

    public void AumentaIdade() { this.idade++; }

    public string FazBarulho() {
        return "au au";
    }

    public override string ToString() {
        string res = "";
        res += "Classe: Cachorro\n";
        res += "Nome: " + this.nome + "\n";
        res += "Idade: " + this.idade + "\n";
        res += "Barulho: " + this.FazBarulho() + "\n";
        return res;
    }
}
```


``` cs
namespace sem_classe_abstrata;

class Gato {
    private string nome;
    private int idade;

    public Gato(string aNome) {
        this.nome = aNome;
        this.idade = 0;
    }

    public string GetNome() { return this.nome; }
    public int GetIdade() { return this.idade; }

    public void AumentaIdade() { this.idade++; }

    public string FazBarulho() {
        return "Miau";
    }

    public override string ToString() {
        string res = "";
        res += "Classe: Gato\n";
        res += "Nome: " + this.nome + "\n";
        res += "Idade: " + this.idade + "\n";
        res += "Barulho: " + this.FazBarulho() + "\n";
        return res;
    }
}
```


``` cs
namespace sem_classe_abstrata;

class Pato {
    private string nome;
    private int idade;

    public Pato(string aNome) {
        this.nome = aNome;
        this.idade = 0;
    }

    public string GetNome() { return this.nome; }
    public int GetIdade() { return this.idade; }

    public void AumentaIdade() { this.idade++; }

    public string FazBarulho() {
        return "Quaaak";
    }

    public override string ToString() {
        string res = "";
        res += "Classe: Pato\n";
        res += "Nome: " + this.nome + "\n";
        res += "Idade: " + this.idade + "\n";
        res += "Barulho: " + this.FazBarulho() + "\n";
        return res;
    }
}
```


``` cs
namespace sem_classe_abstrata;

class TesteSemClasseAbstrata {
    static public void Main(string[] args) {
        Cachorro cachorro = new Cachorro("Brutus");
        Gato gato = new Gato("Chirriro");
        Pato pato = new Pato("Donaldo");

        Console.WriteLine(cachorro);
        Console.WriteLine(gato);
        Console.WriteLine(pato);

        cachorro.AumentaIdade();
        gato.AumentaIdade();
        pato.AumentaIdade();

        Console.WriteLine(cachorro);
        Console.WriteLine(gato);
        Console.WriteLine(pato);
    }
}
```
#### Exemplos Usando Classes Abstratas


Poderemos fazer uma superclasse abstrata `Animal` implementando os métodos que são comuns e definindo como abstrato o método que difere:

``` cs
namespace classe_abstrata;

abstract class Animal {
    private string nome;
    private int idade;

    public Animal(string aNome) {
        this.nome = aNome;
        this.idade = 0;
    }

    public string GetNome() { return this.nome; }
    public int GetIdade() { return this.idade; }

    public virtual void AumentaIdade() { this.idade++; }

    abstract public string FazBarulho();

    public override string ToString() {
        string res = "";
        res += "Classe: " + this.GetType().Name + "\n";
        res += "Nome: " + this.nome + "\n";
        res += "Idade: " + this.idade + "\n";
        res += "Barulho: " + this.FazBarulho() + "\n";
        return res;
    }
}
```


``` cs
namespace classe_abstrata;

class Cachorro : Animal {

    public Cachorro(string aNome) : base(aNome){}

    public override string FazBarulho() {
    return "au au";
}
}
```


``` cs
namespace classe_abstrata;

class Gato : Animal {

    public Gato(string aNome) : base(aNome){}

    public override string FazBarulho() {
        return "Miau";
    }

}
```


``` cs
namespace classe_abstrata;

class Pato : Animal {

    public Pato(string aNome) : base(aNome){}

    public override string FazBarulho() {
        return "Quaaack";
    }

}
```


``` cs
namespace classe_abstrata;

class TesteComClasseAbstrata {
    static public void Main(string[] args) {

        List<Animal> animais = new List<Animal>();

        animais.Add(new Cachorro("Brutus"));
        animais.Add(new Gato("Chirriro"));
        animais.Add(new Pato("Donaldo"));

        foreach (Animal a in animais) {
            Console.WriteLine(a);
        }

        foreach (Animal a in animais) {
            a.AumentaIdade();
        }

        foreach (Animal a in animais) {
            Console.WriteLine(a);
        }

    }
}
```


<!--
## Interfaces

Diferente de Python, **na linguagem Java as classes podem ter apenas uma superclasse**. Porém as classes podem ter multiplas `interfaces`.

Interfaces são classes completamente abstratas (todos os métodos são abstratos) e sem nenhum atributo.

Nestes casos se diz que uma classe **implementa** a `interface`.

Veja o exemplo de três classes completamente diferentes, mas que compartilham de um método: `public void voa()`

#### Exemplos Sem Usar Interfaces

```java
class Pato extends Animal{
    public Pato(string aNome){
        super(aNome);
    }

    @Override
    public string fazBarulho(){return "Qauaack";}

    public void voa(){
        Console.WriteLine("O Pato voa para o norte");
    }
}
```

```java
class Aviao{
    private string modelo;
    public Aviao(string aModelo){
        this.modelo = aModelo;
    }

    public string GetModelo(){return modelo;}

    public void voa(){
        Console.WriteLine("O Aviao voa levando pessoas");
    }

    public override string ToString(){
        string res = "";
        res += "Classe Aviao\n";
        res += "Modelo: "+modelo+"\n";
        return res;
    }
}
```

```java
class SuperMan{

    public void voa(){
        Console.WriteLine("O SuperMan voa para salvar alguem");
    }

    public override string ToString(){
        string res = "";
        res += "Classe SuperMan\n";
        return res;
    }
}
```

```java
class Teste{
    static public void main(string[] args){
        Pato pato = new Pato("Donaldo");
        Aviao aviao = new Aviao("Jato");
        SuperMan superMan = new SuperMan();

        Console.WriteLine(pato);
        Console.WriteLine(aviao);
        Console.WriteLine(superMan);

        pato.voa();
        aviao.voa();
        superMan.voa();

    }
}
```

#### Exemplos Usando Interfaces

Usando `interfaces` podemos tirar proveito do polimorfismo para colocar os objetos na mesma lista.


```java
interface Voavel{
    public void voa();
}
```

```java
class Pato extends Animal implements Voavel{
    public Pato(string aNome){
        super(aNome);
    }

    @Override
    public string fazBarulho(){return "Qauaack";}

    @Override
    public void voa(){
        Console.WriteLine("O Pato voa para o norte");
    }
}
```

```java
class Aviao implements Voavel{
    private string modelo;
    public Aviao(string aModelo){
        this.modelo = aModelo;
    }

    public string GetModelo(){return modelo;}

    @Override
    public void voa(){
        Console.WriteLine("O Aviao voa levando pessoas");
    }

    public override string ToString(){
        string res = "";
        res += "Classe Aviao\n";
        res += "Modelo: "+modelo+"\n";
        return res;
    }
}
```

```java
class SuperMan implements Voavel{

    @Override
    public void voa(){
        Console.WriteLine("O SuperMan voa para salvar alguem");
    }

    public override string ToString(){
        string res = "";
        res += "Classe SuperMan\n";
        return res;
    }
}
```

```java
import java.util.List;
import java.util.ArrayList;

class Teste{
    static public void main(string[] args){
        List<Voavel> voavels = new ArrayList<>();

        voavels.add(new Pato("Donaldo"));
        voavels.add(new Aviao("Jato"));
        voavels.add(new SuperMan());

        for(Voavel v: voavels){
            Console.WriteLine(v);
        }

        for(Voavel v: voavels){
            v.voa();
        }

    }
}
```


-->



.
