# `Map` em Java (`dict` em Python)

Uma estrutura de dados **muito importante** são os mapeamentos. Os correspondentes a `dict` em Python.

Mapeamentos são coleções que são indexados por elementos de um conjunto.

Os índices são chamados de chaves *keys* e os valores correspondentes são os valores; *values*.

Por exemplo:

#### Um mapeamento de String para inteiros

``` java
import java.util.Map;
import java.util.TreeMap;

class MapStringIntTeste{
    static public void main(String[] args){
        Map<String, Integer> palavrasToInt = new TreeMap<>();

        palavrasToInt.put("Ana", 1);
        palavrasToInt.put("Ana", 3);
        palavrasToInt.put("Beto", 5);
        palavrasToInt.put("Carlos", 7);
        palavrasToInt.put("Carlos", 9);

        System.out.println("tamanho: " + palavrasToInt.size());
        System.out.println("mapa: " + palavrasToInt);

        System.out.println("mapa contem o Ana? " + palavrasToInt.containsKey("Ana"));
        System.out.println("mapa contem o Outra? " + palavrasToInt.containsKey("Outra"));
        System.out.println("qual o valor de Ana? " + palavrasToInt.get("Ana"));

        palavrasToInt.put("Ana", 30);
        palavrasToInt.put("Ana", 90);

        System.out.println("tamanho: " + palavrasToInt.size());
        System.out.println("mapa: " + palavrasToInt);
        System.out.println("conjunto contem o Ana? " + palavrasToInt.containsKey("Ana"));

        palavrasToInt.remove("Ana");

        System.out.println("mapa depois de remover Ana: " + palavrasToInt);
        System.out.println("mapa contem o Ana? " + palavrasToInt.containsKey("Ana"));

        // Iterando pelas chaves
        for(String key: palavrasToInt.keySet()){
            String chave = key;
            int valor = palavrasToInt.get(key);
            System.out.println("chave: " + key + "; valor: " + valor);
        }

        // Iterando por chaves e valores
        for(Map.Entry<String, Integer> entry: palavrasToInt.entrySet()){
            System.out.println("chave: " + entry.getKey() + "; valor: " + entry.getValue());
        }
    }
}
```
#### Saída
```
tamanho: 3
mapa: {Ana=3, Beto=5, Carlos=9}
mapa contem o Ana? true
mapa contem o Outra? false
qual o valor de Ana? 3
tamanho: 3
mapa: {Ana=90, Beto=5, Carlos=9}
conjunto contem o Ana? true
mapa depois de remover Ana: {Beto=5, Carlos=9}
mapa contem o Ana? false
chave: Beto; valor: 5
chave: Carlos; valor: 9
chave: Beto; valor: 5
chave: Carlos; valor: 9
```

O conjunto de chaves têm a mesma propriedade de um `TreeSet`, ou seja, estará sempre ordenado seguindo a ordem natural da classe que compõe o conjunto.

As operações que podemos fazer em mapas são:
- Inserir um par de chave e valor
- Verificar se o conjunto de chaves contém um dado elemento
- Retirar entradas
- Iterar sovre as entradas
- Ver o tamanho do mapa (que é o tamanho do conjunto de chaves)

As operações que **não** podemos fazer em mapas são:
- Modificar um elemento do conjunto de chaves: **Mesma regra de conjuntos**

Para criar um `TreeMap` é bem simples, basta usar o `contructor` `TreeMap()`, ele começa vazio e nós podemos usar:
- `put(Chave, Valor)`: Inserir entradas
- `remove(Chave)`: Retirar entradas pela chave
- `for(Cahve k: mapa.keySet())`: Iterar pelas chaves
- `size()`: Ver o tamanho

## Usando objetos como chaves

Para usar objetos criados como chave em um `TreeMap` devemos usar objetos que poderíamos colocar em um `TreeSet`


#### Exemplo com Patos como Chave


``` java
import java.util.Map;
import java.util.TreeMap;

class MapPatoStringTeste{
    static public void main(String[] args){
        Map<Pato, String> patosToString = new TreeMap<>();

        patosToString.put(new Pato("Donaldo", 5), "Disney");
        patosToString.put(new Pato("SuperPato", 15), "Marvel");
        patosToString.put(new Pato("BatPato", 20), "DC");

        System.out.println("tamanho: " + patosToString.size());
        System.out.println("mapa: " + patosToString);

        System.out.println("mapa contem o Donaldo, 5? " + patosToString.containsKey(new Pato("Donaldo", 5)));
        System.out.println("mapa contem o Outro Donaldo, 5? " + patosToString.containsKey(new Pato("Outro Donaldo", 5)));
        System.out.println("qual o valor de Donaldo, 5? " + patosToString.get(new Pato("Donaldo", 5)));

        patosToString.put(new Pato("Donaldo", 5), "Dreamswork");
        patosToString.put(new Pato("Donaldo", 5), "Pixar");

        System.out.println("tamanho: " + patosToString.size());
        System.out.println("mapa: " + patosToString);
        System.out.println("conjunto contem o Donaldo, 5? " + patosToString.containsKey(new Pato("Donaldo", 5)));
        System.out.println("qual o valor de Donaldo, 5? " + patosToString.get(new Pato("Donaldo", 5)));

        patosToString.remove(new Pato("Donaldo", 5));

        System.out.println("mapa depois de remover Donaldo, 5: " + patosToString);
        System.out.println("mapa contem o Donaldo, 5? " + patosToString.containsKey(new Pato("Donaldo", 5)));

        // Iterando pelas chaves
        for(Pato pato: patosToString.keySet()){
            Pato chave = pato;
            String valor = patosToString.get(pato);
            System.out.println("chave: " + chave + "; valor: " + valor);
        }

        // Iterando por chaves e valores
        for(Map.Entry<Pato, String> entry: patosToString.entrySet()){
            System.out.println("chave: " + entry.getKey() + "; valor: " + entry.getValue());
        }
    }
}
```
#### Saída
```
tamanho: 3
mapa: {Pato(Nome=BatPato, idade=20)=DC, Pato(Nome=Donaldo, idade=5)=Disney, Pato(Nome=SuperPato, idade=15)=Marvel}
mapa contem o Donaldo, 5? true
mapa contem o Outro Donaldo, 5? false
qual o valor de Donaldo, 5? Disney
tamanho: 3
mapa: {Pato(Nome=BatPato, idade=20)=DC, Pato(Nome=Donaldo, idade=5)=Pixar, Pato(Nome=SuperPato, idade=15)=Marvel}
conjunto contem o Donaldo, 5? true
qual o valor de Donaldo, 5? Pixar
mapa depois de remover Donaldo, 5: {Pato(Nome=BatPato, idade=20)=DC, Pato(Nome=SuperPato, idade=15)=Marvel}
mapa contem o Donaldo, 5? false
chave: Pato(Nome=BatPato, idade=20); valor: DC
chave: Pato(Nome=SuperPato, idade=15); valor: Marvel
chave: Pato(Nome=BatPato, idade=20); valor: DC
chave: Pato(Nome=SuperPato, idade=15); valor: Marvel
```








.
