# Lista

Neste lab vamos ver a interface `Lista`.

Uma lista é uma coleção de elementos indexados, com índices variando de 0 até o tamanho da lista menos 1.

Uma lista com 3 elementos tem os índices 0, 1 e 2.

Em `Java` temos a interface [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html) com uma infinidade de métodos a serem implementados.

Neste laboratório vamos implementar apenas alguns:


## Interface

Fornecida a seguinte interface:

```java
public interface Lista{
	
	boolean isEmpty();
	int size();
	
	int get(int i);
	void set(int index, int element);
	
	void pushUltimo(int e);
	void pushPrimeiro(int e);
	int popUltimo();
	int popPrimeiro();
	
	void insert(int index, int element);
	void removeAt(int index);
	boolean removeElement(int element);
	boolean contains(int element);
}
``` 

Você deve fazer a implementação desta coleção, que deve ter as seguintes funcionalidade:
- `boolean isEmpty()` se ela está vazia
- `int size()` qual é o tamanho dela
- `int get(int i)` retorna o elemento na posição `i`
- `void set(int index, int element)`: coloca o elemento `element` na posição `index`
- `void pushUltimo(int e)` insere o elemento `e` na **última** posição
- `void pushPrimeiro(int e)` insere o elemento `e` na **primeira** posição
- `int popUltimo()`: retorna e retira o elemento da **última** posição
- `int popPrimeiro()` retorna e retira o elemento da **primeira** posição
- `void insert(int index, int element)` insere o elemento `element` no indice `index` **sem apagar nenhum elemento da lista**, ou seja, todos elementos da posição `index` e à direita, serão passados uma posição para a direita.
- `void removeAt(int index)` remove o elemento da posição `index` passando todos elementos à direita de `index` uma posição para a esquerda.
- `boolean removeElement(int element)` encontra e remove **a primeira aparição** do elemento `element`, retorna `true` caso o elemento tenha sido encontrado e removido.
- `boolean contains(int element)` responde se a lista contem o elemento `element`

**Dica** Lembre de reutilizar métodos redundates. Como `popPrimeiro()` pode apenas utilizar o `removeAt(0)`
**Dica2** Você pode criar métodos para auxiliar outros métodos, por exemplo, um método `int indexOf(int element)` que retorna o índice de certo elemento, e -1 caso o elemento não esteja presente, pode ajudar nos métodos `contains` e `removeElement`.

#### Teste

Use o [seguinte teste](https://github.com/viniciusdenovaes/AulaUnipEstruturasDeDados/blob/3d5cb8d34ef3e9ad19ec0c06662c4d2fe0ba468c/Estudo03Listas/src/teste/TesteListas.java) e compare com a saída:

###### Saída
```


Testando Lista Array:
size: 0
isEmpty? true
ListaArray[] 
push ultimo 1 2 3
size: 3
isEmpty? false
ListaArray[1, 2, 3, ] 
push primeiro 4 5 6
ListaArray[6, 5, 4, 1, 2, 3, ] 
pop ultimo: 3
pop primeiro: 6
ListaArray[5, 4, 1, 2, ] 
qual elemento esta na posicao 1? 4
Colocando o 10 naposicao 1
ListaArray[5, 10, 1, 2, ] 
inserindo o 20 na posicao 1
ListaArray[5, 20, 10, 1, 2, ] 
lista contem o 30? false
lista contem o 20? true
removendo o 20: true
lista contem o 20? false
removendo o 20: false
lista contem o 20? false
ListaArray[5, 10, 1, 2, ] 
removendo o elemento na posicao 1
ListaArray[5, 1, 2, ] 
``` 


#### [Respostas](https://github.com/viniciusdenovaes/AulaUnipEstruturasDeDados/tree/3d5cb8d34ef3e9ad19ec0c06662c4d2fe0ba468c/Estudo03Listas)


### [Desafio Opcional] Implementando `Iterable`

Ampliando o desafio, você pode implementar a interface `Iterable`, é a interface que possibilita usar o `for-each` para iterar na sua coleção.

```java
for(var e: lista)
	sout(e);
```

**Observe** que certas coleções, como conjuntos, maps e árvores, não iteram de outra maneira a não ser pelo iterador.

#### [Bônus] Interface com `Iterable`

Adicione o `extends Iterable<Integer>` para dizer que a sua `Lista` é iterável

```java
public interface Lista extends Iterable<Integer>{
	
	boolean isEmpty();
	int size();
	
	int get(int i);
	void set(int index, int element);
	
	void pushUltimo(int e);
	void pushPrimeiro(int e);
	int popUltimo();
	int popPrimeiro();
	
	void insert(int index, int element);
	void removeAt(int index);
	boolean removeElement(int element);
	boolean contains(int element);
}
```


#### [Respostas](https://github.com/viniciusdenovaes/AulaUnipEstruturasDeDados/tree/3d5cb8d34ef3e9ad19ec0c06662c4d2fe0ba468c/Estudo03ListasIterable/src)

