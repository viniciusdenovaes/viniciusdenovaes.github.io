# Pilha Limitada

Neste lab vamos ver um conceito importante que é o conceito de `Pilha`.

Para simplificar, primeiro veremos o conceito de `Pilha` limitada, onde o tamanho da pilha só pode crescer até um certo limite definido no constructor.

No conceito de `Pilha` temos duas funções principais: uma que adiciona elementos na coleção, e outra que retira (e retorna) o **último elemento** que foi adicionado.

A `Pilha` segue a regra **LIFO** (*Last In First Out*), que é diferente do conceito de `Fila` que veremos mais tarde, que segue **FIFO** (*First In First Out*).

Então pense em como você vai resolver o problema de **retornar e apagar** da coleção o **último elemento adicionado**.

Para fazer a implementação da `Pilha` basta usar a mesma ideia da aula anterior de `Bag`, mas com duas adições:
- Um método `int pop()` que **retorna e apaga o último inteiro adicionado**.
- Agora a capacidade da coleção é limitada no constructor, e não no código.


#### Interface

Fornecida a seguinte interface:

```java
import java.util.EmptyStackException;

public interface Pilha{
	boolean isEmpty();
	boolean isFull();
	int size();
	void push(int e);
	int pop() throws EmptyStackException;
}
``` 

Você deve fazer a implementação desta coleção, que deve ter as seguintes funcionalidade:
- `boolean isEmpty()` se ela está vazia
- `boolean isFull()` se ela está cheia
- `int size()` qual é o tamanho dela
- `void add(int e)` adicionar um número inteiro
Que são iguais à anterior, com adição de 
- `int pop()` que retorna e apaga o último inteiro adicionado.
- **OBS:** Se a pilha estiver vazia você pode lançar uma *exception* usando o comando `throw new EmptyStackException();`, mas é **opcional**
- O limite (capacidade) é recebido pelo construtor.

Além disso sua estrutura deve fazer `@Override` do método `toString` para imprimir todo seu conteúdo.

#### Teste

Use o seguinte teste e compare com a saída:

```java
package pilha;

public class TestPilhaLimitada {
	
	public static void main(String[] args) {
		
		Pilha pilha = new MyPilhaLimitada(5);
		
		relatorioPilha(pilha);
		
		
		System.out.println("\nAdicionando elemento: 1, 2");
		pilha.push(1);
		pilha.push(2);
		
		relatorioPilha(pilha);
		
		System.out.println("pilha pop: " + pilha.pop());
		System.out.println("pilha pop: " + pilha.pop());
		
		
		System.out.println("\nAdicionando elemento: 3, 4, 5");
		pilha.push(3);
		pilha.push(4);
		pilha.push(5);
		
		
		relatorioPilha(pilha);
		
		System.out.println("\nAdicionando elemento: 6, 7, 8 (o 8 deve ser ignorado)");
		pilha.push(6);
		pilha.push(7);
		pilha.push(8);
		
		relatorioPilha(pilha);
		
		System.out.println("pilha pop: " + pilha.pop());
		System.out.println("pilha pop: " + pilha.pop());
		System.out.println("pilha pop: " + pilha.pop());
		System.out.println("pilha pop: " + pilha.pop());
		System.out.println("pilha pop: " + pilha.pop());
		relatorioPilha(pilha);
		System.out.println("o proximo pop, deve dar um erro e terminar o programa");
		System.out.println("pilha pop: " + pilha.pop());
		
	}
	
	static void relatorioPilha(Pilha p) {
		System.out.println("-----------------------");
		System.out.println("\nImprimindo pilha: " + p);
		System.out.println("\ttamanho: " + p.size());
		System.out.println("\tEsta vazia? " + p.isEmpty());
		System.out.println("\tEsta cheia? " + p.isFull());
		System.out.println("-----------------------");
	}

}
```

###### Saída
```
-----------------------

Imprimindo pilha: []
	tamanho: 0
	Esta vazia? true
	Esta cheia? false
-----------------------

Adicionando elemento: 1, 2
-----------------------

Imprimindo pilha: [1, 2, ]
	tamanho: 2
	Esta vazia? false
	Esta cheia? false
-----------------------
pilha pop: 2
pilha pop: 1

Adicionando elemento: 3, 4, 5
-----------------------

Imprimindo pilha: [3, 4, 5, ]
	tamanho: 3
	Esta vazia? false
	Esta cheia? false
-----------------------

Adicionando elemento: 6, 7, 8 (o 8 deve ser ignorado)
-----------------------

Imprimindo pilha: [3, 4, 5, 6, 7, ]
	tamanho: 5
	Esta vazia? false
	Esta cheia? true
-----------------------
pilha pop: 7
pilha pop: 6
pilha pop: 5
pilha pop: 4
pilha pop: 3
-----------------------

Imprimindo pilha: []
	tamanho: 0
	Esta vazia? true
	Esta cheia? false
-----------------------
o proximo pop, deve dar um erro e terminar o programa
Tentando fazer pop em uma pilha vazia
Exception in thread "main" java.util.EmptyStackException
	at pilha.MyPilhaLimitada.pop(MyPilhaLimitada.java:42)
	at pilha.TestPilhaLimitada.main(TestPilhaLimitada.java:44)
``` 


#### [Respostas](https://github.com/viniciusdenovaes/AulaUnipEstruturasDeDados/tree/main/Estudo02.00PilhaLimitada/src/pilha)

