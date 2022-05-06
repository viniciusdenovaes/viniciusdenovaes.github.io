# Conjuntos

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






.
