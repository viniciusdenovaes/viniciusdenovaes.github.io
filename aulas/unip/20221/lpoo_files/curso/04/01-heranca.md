# Herança

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

Depois da primeira prova











.
