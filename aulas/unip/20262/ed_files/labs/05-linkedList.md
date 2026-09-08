# Lista Usando Lista Ligada (Node)

Neste lab vamos implementar interface `Lista` usando o conceito de lista ligada.


## Node

Uma lista ligada é formada por `Nodes`, que são estruturas formadas por
- uma informação, aqui será um `int`
- um ponteiro para o próximo `Node`

```java
public class Node {
	public int elemento;
	public Node next = null;
	
	public Node(int aElemento) {
		this.elemento = aElemento;
	}
	
}
``` 

## A Lista Ligada

Na lista ligada teremos `Nodes` em que cada `Node` sabe qual é o **próximo** `Node`.

Como atributo da lista ligada precisamos, no mínimo, sabe qual é o **primeiro** `Node`, para saber onde estão todos os outros.

Para facilitar a nossa vida também anotaremos a localização do **ultimo**.

Teremos então uma estrutura que tem os atributos

###### Mínimo de Atributos
```java
public class ListaLigada implements Lista{
	
	private int tamanho = 0;
	private Node head = null;
	private Node tail = null;
}
```


## A Interface

A interface `Lista` é a mesma da aula de `ListaArray`

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


#### Teste

O teste e a resposta esperada pode ser o mesmo da [aula passada](04-listaArray.html) trocando o objeto criado de `ListaArray` para `ListaLigada`


#### [Respostas](https://github.com/viniciusdenovaes/AulaUnipEstruturasDeDados/tree/dc57b76a0426c3c6914c224d2b1aa9785bbb9b3d/Estudo03Listas)


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


#### [Respostas](https://github.com/viniciusdenovaes/AulaUnipEstruturasDeDados/tree/dc57b76a0426c3c6914c224d2b1aa9785bbb9b3d/Estudo03ListasIterable)

