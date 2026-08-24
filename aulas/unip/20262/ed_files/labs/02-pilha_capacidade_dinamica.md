# Pilha

Neste lab vamos ver `Pilha` sem o limite da capacidade.

Lembrando do lab anterior que a `Pilha` segue a regra **LIFO** (*Last In First Out*). 

Neste lab você deve fazer a implementação da Pilha sem o limitante da capacidade. A pilha deve poder crescer além de qualquer limite.

Lembre da aula e tente implementar a funcionalidade de fazer arrays conforme a demanda.

Neste lab também acrescente o método `int peek()`, que retorna o último elemento sem retirar.

#### Interface

Fornecida a seguinte interface:

```java
import java.util.EmptyStackException;

public interface Pilha{
	boolean isEmpty();
	int size();
	void push(int e);
	int pop() throws EmptyStackException;
	int peek();
}
``` 

Você deve fazer a implementação desta coleção, que deve ter as seguintes funcionalidade:
- `boolean isEmpty()` se ela está vazia
- `int size()` qual é o tamanho dela
- `void add(int e)` adicionar um número inteiro
Que são iguais à anterior, com adição de 
- `int pop()` que retorna e apaga o último inteiro adicionado.
- `int peek()` que retorna o último inteiro **sem apagar**.
- **OBS:** Se a pilha estiver vazia você pode lançar uma *exception* usando o comando `throw new EmptyStackException();`, mas é **opcional**
- Não tem mais limite da pilha.

Além disso sua estrutura deve fazer `@Override` do método `toString` para imprimir todo seu conteúdo.

#### Teste

Use o seguinte teste e compare com a saída:

```java
public class TestPilhaArray {
	
	public static void main(String[] args) {
		
		Pilha pilha = new PilhaArray();
		
		relatorioPilha(pilha);
		
		
		System.out.println("\nAdicionando elemento: 1, 2");
		pilha.push(1);
		pilha.push(2);
		
		relatorioPilha(pilha);
		
		System.out.println("pilha peek: " + pilha.peek());
		System.out.println("pilha pop: " + pilha.pop());
		System.out.println("pilha peek: " + pilha.peek());
		System.out.println("pilha pop: " + pilha.pop());
		
		
		System.out.println("\nAdicionando elemento: 3, 4, 5");
		pilha.push(3);
		pilha.push(4);
		pilha.push(5);
		
		
		relatorioPilha(pilha);
		
		System.out.println("\nAdicionando elemento: 6, 7, 8");
		pilha.push(6);
		pilha.push(7);
		pilha.push(8);
		
		relatorioPilha(pilha);
		
		System.out.println("pilha pop: " + pilha.pop());
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
-----------------------

Adicionando elemento: 1, 2
-----------------------

Imprimindo pilha: [1, 2, ]
	tamanho: 2
	Esta vazia? false
-----------------------
pilha peek: 2
pilha pop: 2
pilha peek: 1
pilha pop: 1

Adicionando elemento: 3, 4, 5
-----------------------

Imprimindo pilha: [3, 4, 5, ]
	tamanho: 3
	Esta vazia? false
-----------------------

Adicionando elemento: 6, 7, 8
-----------------------

Imprimindo pilha: [3, 4, 5, 6, 7, 8, ]
	tamanho: 6
	Esta vazia? false
-----------------------
pilha pop: 8
pilha pop: 7
pilha pop: 6
pilha pop: 5
pilha pop: 4
pilha pop: 3
-----------------------

Imprimindo pilha: []
	tamanho: 0
	Esta vazia? true
-----------------------
o proximo pop, deve dar um erro e terminar o programa
Exception in thread "main" java.util.EmptyStackException
	at implementacao.pilha.array.PilhaArray.pop(PilhaArray.java:43)
	at testes.TestPilhaArray.main(TestPilhaArray.java:50)
``` 


#### [Respostas](https://github.com/viniciusdenovaes/AulaUnipEstruturasDeDados/tree/main/Estudo02PilhaFilas/src)

