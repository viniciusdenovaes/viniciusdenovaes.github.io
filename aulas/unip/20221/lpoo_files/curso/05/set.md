# Conjuntos

Uma estrutura de dados importante são os conjuntos, as suas propriedades são:
- Não existem elementos repetidos em conjuntos
- Eles não são indexados
- É muito mais rápido encontrar um elemento em um conjunto (o programa não precisa olhar todos os elementos em um conjunto para saber se um elemento específico está nele)
- (Bônus) No tipo de conjuntos que vamos usar (o `TreeSet`), o conjunto estará sempre ordenado!

Existem outras implementações de conjuntos, nesta aula vamos usar o `TreeSet`.

Para criar um conjunto de tipos primitivos ou Strings em java é bem simples, basta criar um `TreeSet`, ele começa vazio e nós podemos
- Inserir elementos
- Retirar elementos
- Iterar
- Ver o tamanho







Herança é a relação entre duas classes, uma superclasse e uma subclasse, que faz com que
- a subclasse tenha exatamente todos os atributos e métodos da superclasse.
- Tendo ainda a possibilidade de adicionar atributos e métodos
- e também de redefinir os métodos.

Por exemplo, vamos fazer uma classe `Pato` que tem os atributos: nome e ano de nascimento; e os métodos voa e nada.
Depois vamos definir uma subclasse `PatoSubmarino` que tem também uma valocidade para nadar e redefine o método nadar.

``` java
class Pato{
    private String nome;
    private int ano;
    public Pato(String aNome, int aAno){
        this.nome = aNome;
        this.ano = aAno;
    }

    public String getNome(){
        return nome;
    }
    public int getAno(){
        return ano;
    }
    public void voa(){
        System.out.println("O Pato voa");
    }
    public void nada(){
        System.out.println("O Pato nada");
    }
    @Override
    public String toString(){
        String res = "classe " + this.getClass() + "\n";
        res += "nome: " + this.nome + "\n";
        res += "nascimento: " + this.ano + "\n";
        return res;
    }
}
```

``` java
class PatoSubmarino extends Pato{
    private double velocidade;
    public PatoSubmarino(String aNome, int aAno, double aVelocidade){
        super(aNome, aAno);
        this.velocidade = aVelocidade;
    }
    @Override
    public void nada(){
        System.out.println("Nada com uma velocidade de " + this.velocidade);
    }

    @Override
    public String toString(){
        String res = super.toString();
        res += "Velocidade: " + this.velocidade + "\n";
        return res;
    }

}

```

``` java

class TestePato{
    public static void main(String[] args){
        Pato pato = new Pato("joao", 1999);
        System.out.println(pato);
        pato.voa();
        pato.nada();


        PatoSubmarino patoSubmarino = new PatoSubmarino("atomico", 2000, 555);
        System.out.println(patoSubmarino);
        patoSubmarino.voa();
        patoSubmarino.nada();
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

``` java
import java.util.ArrayList;

class TestePolimorfismo{
    public static void main(String[] args){
        Pato pato01 = new Pato("joao", 1999);
        System.out.println(pato01);
        pato01.voa();
        pato01.nada();


        Pato patoSubmarino = new PatoSubmarino("atomico", 2000, 555);
        System.out.println(patoSubmarino);
        patoSubmarino.voa();
        patoSubmarino.nada();


        System.out.println();
        System.out.println("\n----------------------------------------");
        System.out.println("Fazendo uma lista de patos do tipo Pato");
        System.out.println("----------------------------------------\n");
        ArrayList<Pato> patos = new ArrayList<Pato>();
        patos.add(pato01);
        patos.add(patoSubmarino);

        for(Pato pato: patos){
            System.out.println(pato);
            pato.voa();
            pato.nada();
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

``` java
class Cachorro{
    private String nome;
    private int idade;

    public Cachorro(String aNome){
        this.nome = aNome;
        this.idade = 0;
    }

    public String getNome(){return this.nome;}
    public int getIdade(){return this.idade;}

    public void aumentaIdade(){this.idade++;}

    public String fazBarulho(){
        return "au au";
    }

    @Override
    public String toString(){
        String res = "";
        res += "Classe: Cachorro\n";
        res += "Nome: " + this.nome + "\n";
        res += "Idade: " + this.idade + "\n";
        res += "Barulho: " + this.fazBarulho() + "\n";
        return res;
    }
}
```


``` java
class Gato{
    private String nome;
    private int idade;

    public Gato(String aNome){
        this.nome = aNome;
        this.idade = 0;
    }

    public String getNome(){return this.nome;}
    public int getIdade(){return this.idade;}

    public void aumentaIdade(){this.idade++;}

    public String fazBarulho(){
        return "Miau";
    }

    @Override
    public String toString(){
        String res = "";
        res += "Classe: Gato\n";
        res += "Nome: " + this.nome + "\n";
        res += "Idade: " + this.idade + "\n";
        res += "Barulho: " + this.fazBarulho() + "\n";
        return res;
    }
}
```


``` java
class Pato{
    private String nome;
    private int idade;

    public Pato(String aNome){
        this.nome = aNome;
        this.idade = 0;
    }

    public String getNome(){return this.nome;}
    public int getIdade(){return this.idade;}

    public void aumentaIdade(){this.idade++;}

    public String fazBarulho(){
        return "Quaaack";
    }

    @Override
    public String toString(){
        String res = "";
        res += "Classe: Pato\n";
        res += "Nome: " + this.nome + "\n";
        res += "Idade: " + this.idade + "\n";
        res += "Barulho: " + this.fazBarulho() + "\n";
        return res;
    }
}
```


``` java
class Teste{
    static public void main(String[] args){
        Cachorro cachorro = new Cachorro("Brutus");
        Gato gato = new Gato("Chirriro");
        Pato pato = new Pato("Donaldo");

        System.out.println(cachorro);
        System.out.println(gato);
        System.out.println(pato);

        cachorro.aumentaIdade();
        gato.aumentaIdade();
        pato.aumentaIdade();

        System.out.println(cachorro);
        System.out.println(gato);
        System.out.println(pato);
    }
}
```
#### Exemplos Usando Classes Abstratas


Poderemos fazer uma superclasse abstrata `Animal` implementando os métodos que são comuns e definindo como abstrato o método que difere:

``` java
abstract class Animal{
    private String nome;
    private int idade;

    public Animal(String aNome){
        this.nome = aNome;
        this.idade = 0;
    }

    public String getNome(){return this.nome;}
    public int getIdade(){return this.idade;}

    public void aumentaIdade(){this.idade++;}

    abstract public String fazBarulho();

    @Override
    public String toString(){
        String res = "";
        res += "Classe: " + this.getClass().getSimpleName() + "\n";
        res += "Nome: " + this.nome + "\n";
        res += "Idade: " + this.idade + "\n";
        res += "Barulho: " + this.fazBarulho() + "\n";
        return res;
    }
}
```


``` java
class Cachorro extends Animal{

    public Cachorro(String aNome){
        super(aNome);
    }

    @Override
    public String fazBarulho(){
        return "au au";
    }
}
```


``` java
class Gato extends Animal{

    public Gato(String aNome){
        super(aNome);
    }

    @Override
    public String fazBarulho(){
        return "Miau";
    }

}
```


``` java
class Pato extends Animal{

    public Pato(String aNome){
        super(aNome);
    }

    @Override
    public String fazBarulho(){
        return "Quaaack";
    }

}
```


``` java
import java.util.List;
import java.util.ArrayList;

class Teste{
    static public void main(String[] args){

        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Brutus"));
        animais.add(new Gato("Chirriro"));
        animais.add(new Pato("Donaldo"));

        for(Animal a: animais){
            System.out.println(a);
        }

        for(Animal a: animais){
            a.aumentaIdade();
        }

        for(Animal a: animais){
            System.out.println(a);
        }

    }
}
```

## Interfaces

Diferente de Python, **na linguagem Java as classes podem ter apenas uma superclasse**. Porém as classes podem ter multiplas `interfaces`.

Interfaces são classes completamente abstratas (todos os métodos são abstratos) e sem nenhum atributo.

Nestes casos se diz que uma classe **implementa** a `interface`.

Veja o exemplo de três classes completamente diferentes, mas que compartilham de um método: `public void voa()`

#### Exemplos Sem Usar Interfaces

```java
class Pato extends Animal{
    public Pato(String aNome){
        super(aNome);
    }

    @Override
    public String fazBarulho(){return "Qauaack";}

    public void voa(){
        System.out.println("O Pato voa para o norte");
    }
}
```

```java
class Aviao{
    private String modelo;
    public Aviao(String aModelo){
        this.modelo = aModelo;
    }

    public String getModelo(){return modelo;}

    public void voa(){
        System.out.println("O Aviao voa levando pessoas");
    }

    @Override
    public String toString(){
        String res = "";
        res += "Classe Aviao\n";
        res += "Modelo: "+modelo+"\n";
        return res;
    }
}
```

```java
class SuperMan{

    public void voa(){
        System.out.println("O SuperMan voa para salvar alguem");
    }

    @Override
    public String toString(){
        String res = "";
        res += "Classe SuperMan\n";
        return res;
    }
}
```

```java
class Teste{
    static public void main(String[] args){
        Pato pato = new Pato("Donaldo");
        Aviao aviao = new Aviao("Jato");
        SuperMan superMan = new SuperMan();

        System.out.println(pato);
        System.out.println(aviao);
        System.out.println(superMan);

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
    public Pato(String aNome){
        super(aNome);
    }

    @Override
    public String fazBarulho(){return "Qauaack";}

    @Override
    public void voa(){
        System.out.println("O Pato voa para o norte");
    }
}
```

```java
class Aviao implements Voavel{
    private String modelo;
    public Aviao(String aModelo){
        this.modelo = aModelo;
    }

    public String getModelo(){return modelo;}

    @Override
    public void voa(){
        System.out.println("O Aviao voa levando pessoas");
    }

    @Override
    public String toString(){
        String res = "";
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
        System.out.println("O SuperMan voa para salvar alguem");
    }

    @Override
    public String toString(){
        String res = "";
        res += "Classe SuperMan\n";
        return res;
    }
}
```

```java
import java.util.List;
import java.util.ArrayList;

class Teste{
    static public void main(String[] args){
        List<Voavel> voavels = new ArrayList<>();

        voavels.add(new Pato("Donaldo"));
        voavels.add(new Aviao("Jato"));
        voavels.add(new SuperMan());

        for(Voavel v: voavels){
            System.out.println(v);
        }

        for(Voavel v: voavels){
            v.voa();
        }

    }
}
```






.
