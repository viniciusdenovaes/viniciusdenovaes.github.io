# Lab 04 *Collections*

### Bag

Faça a interface e implemente a coleção `Bag`.

#### `Bag<T> implements Iterable<T>`
Uma coleção.

##### funcionalidades

- `void add(Item)`: coloca um elemento na coleção.
- `bool empty()`: retorna se a coleção está vazia.
- `int size()`: retorna o tamanho.

### Fila


#### `Fila<T> implements Iterable<T>`
Uma coleção do tipo FIFO.

##### funcionalidades

- `bool empty()`: retorna se a coleção está vazia.
- `int size()`: retorna o tamanho.
- `void add(Item)`: coloca um elemento na coleção.
- `int pool()`: retorna o **mais antigo** elemento colocado na pilha, e retira este elemento da fila.
- `int peek()`: retorna o **mais antigo** elemento colocado na pilha, mas não retira este elemento da fila.
