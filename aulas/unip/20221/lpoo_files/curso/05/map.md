# `Map` em Java (`dict` em Python)

Uma estrutura de dados **importante** são os conjuntos.
Suas propriedades são:
- Não existem elementos repetidos em conjuntos
- Eles não são indexados
- É muito mais rápido encontrar um elemento em um conjunto (o programa não precisa olhar todos os elementos em um conjunto para saber se um elemento específico está nele)
- (Bônus) No tipo de conjuntos que vamos usar (o `TreeSet`), o conjunto estará sempre ordenado!

As operações que podemos fazer em conjuntos são:
- Inserir elementos
- Verificar se o conjunto contém um dado elemento
- Retirar elementos
- Iterar
- Ver o tamanho

As operações que **não** podemos fazer em conjuntos são:
- Acessar ou colocar elementos em um índice (**conjuntos não são indexados**)
- Modificar um elemento do conjunto: os elementos de um conjunto são estruturados de acordo com o valor seus parâmetros, se você modificar o valor de um parâmetro sem reorganizar a estrutura o conjunto ficará em estado de inconsistência (**e essa é a última coisa que você quer que aconteça!**), podendo ter um comportamento *estranho*. Para modificar um elemento você deve retirar este elemento, modificar, e recolocar de volta no conjunto.

Estes conceitos de conjuntos são comuns em qualquer linguagem com suporte para estruturas de dados[^p.v2].
Em Java vamos ver uma implementação, o `TreeSet` onde os elementos estarão ordenados em uma iteração.

[^p.v2]: A versão 2 de Python não existia suporte para conjuntos. A versão 3 foi atualizada para ter conjuntos. Na sua implementação padrão os elementos não estarão ordenados.


Para criar um `TreeSet` é bem simples, basta usar o `contructor` `TreeSet()`, ele começa vazio e nós podemos usar:
- `add(Object)`: Inserir elementos
- `remove(Object)`: Retirar elementos
- `for(Object o: conjunto)`: Iterar
- `seize()`: Ver o tamanho

#### Exemplo com inteiros:
``` java
import java.util.Set;
import java.util.TreeSet;

class SetIntTeste{
    static public void main(String[] args){
        Set<Integer> numeros = new TreeSet<>();

        numeros.add(5);
        numeros.add(3);
        numeros.add(7);
        numeros.add(1);
        numeros.add(9);

        System.out.println("tamanho: " + numeros.size());
        System.out.println("conjunto: " + numeros);

        System.out.println("conjunto contem o 5? " + numeros.contains(5));
        System.out.println("conjunto contem o 0? " + numeros.contains(0));

        numeros.add(5);
        numeros.add(5);
        numeros.add(5);

        System.out.println("tamanho: " + numeros.size());
        System.out.println("conjunto: " + numeros);

        numeros.remove(5);

        System.out.println("conjunto depois de remover o 5: " + numeros);
        System.out.println("conjunto contem o 5? " + numeros.contains(5));

        for(int n: numeros){
            System.out.println(n);
        }
    }
}
```

#### Saída:
```
tamanho: 5
conjunto: [1, 3, 5, 7, 9]
conjunto contem o 5? true
conjunto contem o 0? false
tamanho: 5
conjunto: [1, 3, 5, 7, 9]
conjunto depois de remover o 5: [1, 3, 7, 9]
conjunto contem o 5? false
1
3
7
9
```

#### Exemplo com `String`
``` java
import java.util.Set;
import java.util.TreeSet;

class SetStringTeste{
    static public void main(String[] args){
        Set<String> palavras = new TreeSet<>();

        palavras.add("Ana");
        palavras.add("ana");
        palavras.add("Beto");
        palavras.add("beto");
        palavras.add("Carlos");
        palavras.add("carlos");

        System.out.println("tamanho: " + palavras.size());
        System.out.println("conjunto: " + palavras);

        System.out.println("conjunto contem o Ana? " + palavras.contains("Ana"));
        System.out.println("conjunto contem o Outra? " + palavras.contains("Outra"));

        palavras.add("Ana");
        palavras.add("Ana");
        palavras.add("Ana");
        palavras.add("Ana");

        System.out.println("tamanho: " + palavras.size());
        System.out.println("conjunto: " + palavras);
        System.out.println("conjunto contem o Ana? " + palavras.contains("Ana"));

        palavras.remove("Ana");

        System.out.println("conjunto depois de remover Ana: " + palavras);
        System.out.println("conjunto contem o Ana? " + palavras.contains("Ana"));

        for(String p: palavras){
            System.out.println(p);
        }
    }
}
```
#### Saída
```
tamanho: 6
conjunto: [Ana, Beto, Carlos, ana, beto, carlos]
conjunto contem o Ana? true
conjunto contem o Outra? false
tamanho: 6
conjunto: [Ana, Beto, Carlos, ana, beto, carlos]
conjunto contem o Ana? true
conjunto depois de remover Ana: [Beto, Carlos, ana, beto, carlos]
conjunto contem o Ana? false
Beto
Carlos
ana
beto
carlos
```

## Conjuntos de Objetos (Patos)

Se um `TreeSet` está sempre ordenado, como que poderíamos colocar um Objeto de uma Classe criada em um conjunto?
- Como que o programa vai comparar dois Patos para ver se eles são iguais?
- Como que o programa vai conseguir ordenar os Patos? (Comparar dois Patos e ver qual é *menor*?)

Vamos ter que definir (*ensinar* para programa) o que são dois Patos iguais, e qual será a ordem dos Patos.

Primeiro vamos implementar igualdade entre Patos e depois Comparação:

### Implementando `equals` (Definindo igualdade entre objetos)

`equals` é um método de `Object`, isto quer dizer que **toda** classe terá um método `equals`. Porém nesta implmentação, o programa verifica se os dois objetos têm o mesmo endereço. Eles só terão o mesmo endereço se for o mesmo objeto.

Aqui vamos aprender a redefinir este comportamento para a nossa classe, vamos definir que dois patos são iguais se eles tiverem o mesmo `nome` e a mesma `idade`:
- Para fazer Override de `equals` devemos copiar a mesma assinatura do pai: `public boolean equals(Object o)`, ou seja é uma função que recebe outro `Objeto` e não outro `Pato`
- No primeiro passo verificamos se os dois objetos são o mesmo, ou seja, se têm o mesmo endereço `if(this==o){return true;}`. Se são o mesmo, pode retorna que são iguais
- Em segundo lugar verificamos se o outro objeto é `null`: `if(o==null){return false;}`. Caso seja `null` podemos retornar `false` eles não são iguais.
- Em terceiro lugar verificamos se os dois objetos são da mesma classe `if(this.getClass() != o.getClass()){return false;}`. Se não forem, pode retornar `false`.
- Em quarto lugar, agora sabemos que o outro objeto é da mesma classe, então podemos tratar o outro objeto como um `Pato`: `Pato oPato = (Pato)o;`
- Em quinto lugar, finalmente, podemos fazer a comparação como quisermos definir: Somente serão iguais se tiverem o nome e a idade iguais.
- Neste exemplo delegamos esta comparação para um método estático de `Objects.equals`, este método vai ter o cuidado de fazer tudo o que foi descrito aqui com cada objeto que for passado para ele (verificar se um deles é nulo, se são da mesma classe, etc...), e depois vai usar o equals de cada um para verificar igualdade.


``` java
// Implementacao de equals
@Override
public boolean equals(Object o){

    // 1 - Verifica se eh o mesmo objeto
    if(this==o){return true;}

    // 2 - Verifica se o outro objeto eh nulo
    if(o==null){return false;}

    // 3 - Verifica se eh a mesma classe
    if(this.getClass() != o.getClass()){return false;}

    // 4 - Como eh o mesmo objeto, vamos tratar o como outro Pato
    Pato oPato = (Pato)o;

    // Delega a verificacao de igualdade a classe Objects
    return Objects.equals(this.nome, oPato.nome) &&
           Objects.equals(this.idade, oPato.idade);
}
```


### Implementando `Comparable<T>` (Definindo ordem de comparação entre objetos)

Os objetos de `TreeSet` estão sempre ordenados seguindo alguma ordenação, você pode passar uma regra de ordenação no constructor, ou deixar a classe usar a *ordenação natural* da classe que será inserida no conjunto.

Como fazer uma *ordenação natural*?

**OBS: Ao definir uma ordenação devemos manter uma consistência com as regras de `equals`**

- Primeiro, para *avisar* que uma classe **tem** uma *ordenação natural* você deve colocar na assinatura da classe que ela implementa `interface Comparable<T>` (este `T` é a classe com a qual ela pode ser comparada). No caso de `Pato` ficaremos com a assinatura
``` java
class Pato implements Comparable<Pato>{
.
.
.
}  
```
- Agora devemos implementar o método da interface:
``` java
@Override
public int compareTo(Pato o){
.
.
.
}
```
- Agora devemos decidir como que ela será ordenada, **lembrando de manter a consistência de como ela será comparada com o `equals`**
- Vamos comparar com o `nome` primeiro: `this.nome.compareTo(o.nome);`, para isto eu uso o método `compare` da classe nome (é uma `String`, mas poderia ser qualquer outra classe que implmenta Compare)
- Porém, se o nome é igual, eu quero  comparar pela idade.
- Idade é um inteiro (um tipo primitivo) e tipos primitivos **não têm** métodos, então vamos usar o compare da classe `Integer`: `Integer.compare(this.idade, o.idade);`


``` java
@Override
public int compareTo(Pato o){
    // Compara primeiro pelo nome
    if(!this.nome.equals(o.nome)){
        return this.nome.compareTo(o.nome);
    }
    // se o nome eh igual, compara pela idade
    return Integer.compare(this.idade, o.idade);
}
```



#### Definição da classe Pato
``` java
import java.util.Objects;

class Pato implements Comparable<Pato>{

    String nome;
    int idade;

    public Pato(String aNome, int aIdade){
        this.nome = aNome;
        this.idade = aIdade;
    }

    // Implementacao de equals
    @Override
    public boolean equals(Object o){

        // Verifica se eh o mesmo objeto
        if(this==o){return true;}

        // Verifica se o outro objeto eh nulo
        if(o==null){return false;}

        // Verifica se eh a mesma classe
        if(this.getClass() != o.getClass()){return false;}

        // Como eh o mesmo objeto, vamos tratar o como outro Pato
        Pato oPato = (Pato)o;

        // Delega a verificacao de igualdade a classe Objects
        return Objects.equals(this.nome, oPato.nome) &&
               Objects.equals(this.idade, oPato.idade);
    }

    // Implementacao de Compare<Pato>:
    // primeiro pelo nome
    // depois pela idade
    @Override
    public int compareTo(Pato o){
        // Compara primeiro pelo nome
        if(!this.nome.equals(o.nome)){
            return this.nome.compareTo(o.nome);
        }
        // se o nome eh igual, compara pela idade
        return Integer.compare(this.idade, o.idade);
    }



    @Override
    public String toString(){
        return "Pato(Nome="+nome+", idade="+idade+")";
    }

}
```

#### Exemplo com Patos
``` java
import java.util.Set;
import java.util.TreeSet;

class SetPatoTeste{
    static public void main(String[] args){
        Set<Pato> patos = new TreeSet<>();

        patos.add(new Pato("Donado", 10));
        patos.add(new Pato("Margarida", 10));
        patos.add(new Pato("Donado", 15));
        patos.add(new Pato("Margarida", 15));
        patos.add(new Pato("Donado", 15));
        patos.add(new Pato("Margarida", 15));

        System.out.println("tamanho: " + patos.size());
        System.out.println("conjunto: " + patos);

        System.out.println("conjunto contem o Donaldo, 10? " + patos.contains(new Pato("Donaldo", 10)));
        System.out.println("conjunto contem o Donaldo, 5? " + patos.contains(new Pato("Donaldo", 5)));

        patos.add(new Pato("Donaldo", 10));

        System.out.println("tamanho: " + patos.size());
        System.out.println("conjunto: " + patos);

        patos.remove(new Pato("Donaldo", 10));

        System.out.println("conjunto: " + patos);
        System.out.println("conjunto contem o Donaldo, 10? " + patos.contains(new Pato("Donaldo", 10)));

        for(Pato p: patos){
            System.out.println(p);
        }
    }
}
```


#### Saída
```
tamanho: 4
conjunto: [Pato(Nome=Donado, idade=10), Pato(Nome=Donado, idade=15), Pato(Nome=Margarida, idade=10), Pato(Nome=Margarida, idade=15)]
conjunto contem o Donaldo, 10? false
conjunto contem o Donaldo, 5? false
tamanho: 5
conjunto: [Pato(Nome=Donado, idade=10), Pato(Nome=Donado, idade=15), Pato(Nome=Donaldo, idade=10), Pato(Nome=Margarida, idade=10), Pato(Nome=Margarida, idade=15)]
conjunto: [Pato(Nome=Donado, idade=10), Pato(Nome=Donado, idade=15), Pato(Nome=Margarida, idade=10), Pato(Nome=Margarida, idade=15)]
conjunto contem o Donaldo, 10? false
Pato(Nome=Donado, idade=10)
Pato(Nome=Donado, idade=15)
Pato(Nome=Margarida, idade=10)
Pato(Nome=Margarida, idade=15)
```

.
