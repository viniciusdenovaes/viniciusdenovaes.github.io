# ArrayList

Uma coleção (`Colection`) representa qualquer estrutura usada para **guardar** e **iterar** uma quantidade de objetos do mesmo tipo..

O tipo mais simples de coleção é a lista `List`, e o tipo mais simples de lista é o `ArrayList`.

## Comportamento de um ArrayList

Ao criar uma lista você deve escolher qual tipo de objeto será armazenado, e só poderá ser armazenado objetos deste tipo.

Assim como Python, a lista é inicializada vazia. Para popular a lista você deve fornecer um objeto de cada vez.

Em uma lista, diferente de outras coleções, cada item tem uma posição. Em Python, por exemplo, você pode acessar um item na posição `i` na lista `my_list` usando a sintaxe `my_list[i]`. Em Java, para pegar um item na posição `i` da lista `myList` você deve usar a sintaxe `myList.get(i)`

## Comandos Mais Usados

Suponha que você tem uma classe `Gato`

- Para inicializar um `ArrayList` use
  - `ArrayList<Gato> gatos = new ArrayList<Gato>();`
- Para adicionar um objeto `gato` na sua lista use o comando
  - `gatos.add(gato);`
- Para saber o tamanho de um `ArrayList` use o método `size`
  - `gatos.size()`

## Iterando

Existem algumas maneiras de iterar por um `ArrayList`.

- `for` (estilo **C**):
``` java
for(int i=0; i<gatos.size(); i++){
  sysout(gatos.get(i));
}
```
- `for-each` (estilo **Python**)
``` java
for(Gato gato: gatos){
  sysout(gato);
}
```

## Exemplo


``` java
import java.util.ArrayList;

class Gato{
    private String nome;
    public Gato(String aNome){
        this.nome = aNome;
    }
    @Override
    public String toString(){
        String res = "";
        res += "Gato de Nome " + this.nome + "\n";
        return res;
    }
    public static void main(String[] args){
        ArrayList<Gato> gatos = new ArrayList<Gato>();

        Gato gato01 = new Gato("Brutos");
        gatos.add(gato01);

        Gato gato02 = new Gato("Chitara");
        gatos.add(gato01);

        gatos.add(new Gato("Chirriro"));

        System.out.println("Primeiro: for");
        for(int i=0; i<gatos.size(); i++){
            System.out.println(gatos.get(i));
        }

        System.out.println("Segundo: for-each");
        for(Gato gato: gatos){
            System.out.println(gato);
        }
    }
}
```
Saída
```
Primeiro: for
Gato de Nome Brutos

Gato de Nome Brutos

Gato de Nome Chirriro

Segundo: for-each
Gato de Nome Brutos

Gato de Nome Brutos

Gato de Nome Chirriro

```

## Outros Métodos

Outros métodos menos usados mas que você pode precisar

- `gatos.set(i, outroGato)` para colocar um outro gato na posição `i` (a posição `i` já deve existir)

- `gatos.remove(i)` remove o objeto da posição `i`.

- `gatos.clear()` limpa a lista (ela fica vazia)

- `ArrayList<Gato> outrosGatos = new ArrayList<Gato>(gatos)` inicializa uma lista de objetos com os objetos de uma outra coleção qualquer.








.
