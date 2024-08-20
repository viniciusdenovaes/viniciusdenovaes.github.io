# Lab 03 Pilha *Collections*

### *Generic*

Repita o exercício anterior para `Pilha`. 
Mas implemente a funcionalidade *generic*, 
onde o tipo do elemento da pilha é escolhido dentro do operador diamante <>.

Lembre-se que para criar um array de tipo genérico você deve usar o seguinte comando:

``` java
a = (Item[]) new Object[N];
```
onde `Item` é o seu tipo genérico e `N` é o tamanho do array desejado.



### Tamanho flexível

Continue o exercício anterior, mas implemente a funcionalidade para que o tamanho não tenha um limite fixo.



### `Iterable`

Continue o exercício anterior, mas implemente a interface `Iterable` para que o cliente possa iterar na sua coleção usando o *for each* do java.


### Resultado

A sua coleção deve ser uma Pilha genérica, sem tamanho fixo, que seja possível iterar, e que implementa as seguintes funcionalidades:

#### `Pilha<T> implements Iterable<T>`
Uma coleção do tipo LIFO.

##### funcionalidades

- `bool empty()`: retorna se a coleção está vazia.
- `int size()`: retorna o tamanho.
- `void push(Item)`: coloca um elemento na coleção.
- `int pop()`: retorna o **mais novo** elemento colocado na pilha, e retira este elemento da pilha.
- `int peek()`: retorna o **mais novo** elemento colocado na pilha, e retira este elemento da pilha.
