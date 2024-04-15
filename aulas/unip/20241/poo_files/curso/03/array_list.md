# ArrayList

Uma coleção (`Colection`) representa qualquer estrutura usada para **guardar** e **iterar** uma quantidade de objetos do mesmo tipo..

O tipo mais simples de coleção é a lista `List`.

## Comportamento de uma `List`

Ao criar uma lista você deve escolher qual tipo de objeto será armazenado, e só poderá ser armazenado objetos deste tipo.

Assim como Python, a lista é inicializada vazia. Para popular a lista você deve fornecer um objeto de cada vez.

Em uma lista, diferente de outras coleções, cada item tem uma posição. Assim como em `C`, por exemplo, você pode acessar um item na posição `i` na lista `my_array` usando a sintaxe `my_array[i]`. Em `C#` também, para pegar um item na posição `i` da lista `myList` você deve usar a sintaxe `myList[i]`

## Comandos Mais Usados

Suponha que você tem uma classe `Gato`

- Para inicializar um `List` use
  - `List<Gato> gatos = new List<Gato>();`
- Para adicionar um objeto `gato` na sua lista use o comando
  - `gatos.Add(gato);`
- Para saber o tamanho de um `ArrayList` use o método `size`
  - `gatos.size()`

## Iterando

Existem algumas maneiras de iterar por um `ArrayList`.

- `for` (estilo **C**):
``` cs
for(int i=0; i<gatos.Count; i++){
  cw(gatos[i]);
}
```
- `for-each` (estilo **Python**) (**RECOMENDADO**)
``` cs
foreach(Gato gato in gatos){
  cw(gato);
}
```

## Exemplo


``` cs
class Gato {
    private String nome;
    public Gato(String aNome) {
        this.nome = aNome;
    }
    public override string ToString() {
        String res = "";
        res += "Gato de Nome " + this.nome + "\n";
        return res;
    }
    public static void Main(String[] args) {
        List<Gato> gatos = new List<Gato>();

        Gato gato01 = new Gato("Brutos");
        gatos.Add(gato01);

        Gato gato02 = new Gato("Chitara");
        gatos.Add(gato01);

        gatos.Add(new Gato("Chirriro"));

        Console.WriteLine("Primeiro: for");
        for (int i = 0; i < gatos.Count; i++) {
            Console.WriteLine(gatos[i]);
        }

        gatos[1] = new Gato("Segundos");

        Console.WriteLine("Segundo: for-each");
        foreach (Gato gato in gatos) {
            Console.WriteLine(gato);
        }

        Console.WriteLine("Outra lista de gatos");
        List<Gato> outrosGatos = new List<Gato>(gatos);
        foreach (Gato gato in outrosGatos) {
            Console.WriteLine(gato);
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

Gato de Nome Segundos

Gato de Nome Chirriro

Outra lista de gatos
Gato de Nome Brutos

Gato de Nome Segundos

Gato de Nome Chirriro
```

## Outros Métodos

Outros métodos menos usados mas que você pode precisar

- `gatos[i] = outroGato` para colocar um outro gato na posição `i` (a posição `i` já deve existir)

- `gatos.RemoveAt(i)` remove o objeto da posição `i`.

- `gatos.Clear()` limpa a lista (ela fica vazia)

- `List<Gato> outrosGatos = new List<Gato>(gatos)` inicializa uma lista de objetos com os objetos de uma outra coleção qualquer.








.
