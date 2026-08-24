# Fila

Neste lab vamos ver `Fila`.

A `Fila` segue a regra **FIFO** (*First In First Out*). Isto é, o próximo foi o primeiro a entrar.

Neste lab você deve fazer a implementação da Fila seguindo a mesma interface das aulas passadas.

Lembre que, na implementação de array passada em aula, o próximo a sair é o primeiro do array, na posição 0. Depois de retirar o elemento da posição 0 todos os outros elementos devem descer uma posição.

#### Interface

Fornecida a seguinte interface:

```java
import java.util.EmptyStackException;

public interface Fila{
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
- `int pop()` que retorna e apaga o mais antigo inteiro adicionado.
- `int peek()` que retorna o mais antigo inteiro **sem apagar**.
- **OBS:** Se a fila estiver vazia você pode lançar uma *exception* usando o comando `throw new EmptyStackException();`, mas é **opcional**

Além disso sua estrutura deve fazer `@Override` do método `toString` para imprimir todo seu conteúdo.

#### Teste

Use o seguinte teste e compare com a saída:

```java
public class TestFilaArray {
	
	public static void main(String[] args) {
		
		Fila fila = new FilaArray();
		
		relatorioFila(fila);
		
		
		System.out.println("\nAdicionando elemento: 1, 2");
		fila.push(1);
		fila.push(2);
		
		relatorioFila(fila);
		
		System.out.println("fila peek: " + fila.peek());
		System.out.println("fila pop: " + fila.pop());
		System.out.println("fila peek: " + fila.peek());
		System.out.println("fila pop: " + fila.pop());
		
		
		System.out.println("\nAdicionando elemento: 3, 4, 5");
		fila.push(3);
		fila.push(4);
		fila.push(5);
		
		
		relatorioFila(fila);
		
		System.out.println("\nAdicionando elemento: 6, 7, 8");
		fila.push(6);
		fila.push(7);
		fila.push(8);
		
		relatorioFila(fila);
		
		System.out.println("fila pop: " + fila.pop());
		System.out.println("fila pop: " + fila.pop());
		System.out.println("fila pop: " + fila.pop());
		System.out.println("fila pop: " + fila.pop());
		System.out.println("fila pop: " + fila.pop());
		System.out.println("fila pop: " + fila.pop());
		relatorioFila(fila);
		System.out.println("o proximo pop, deve dar um erro e terminar o programa");
		System.out.println("fila pop: " + fila.pop());
		
	}
	
	static void relatorioFila(Fila p) {
		System.out.println("-----------------------");
		System.out.println("\nImprimindo fila: " + p);
		System.out.println("\ttamanho: " + p.size());
		System.out.println("\tEsta vazia? " + p.isEmpty());
		System.out.println("-----------------------");
	}

}
```

###### Saída
```
-----------------------

Imprimindo fila: []
	tamanho: 0
	Esta vazia? true
-----------------------

Adicionando elemento: 1, 2
-----------------------

Imprimindo fila: [1, 2, ]
	tamanho: 2
	Esta vazia? false
-----------------------
fila peek: 1
fila pop: 1
fila peek: 2
fila pop: 2

Adicionando elemento: 3, 4, 5
-----------------------

Imprimindo fila: [3, 4, 5, ]
	tamanho: 3
	Esta vazia? false
-----------------------

Adicionando elemento: 6, 7, 8
-----------------------

Imprimindo fila: [3, 4, 5, 6, 7, 8, ]
	tamanho: 6
	Esta vazia? false
-----------------------
fila pop: 3
fila pop: 4
fila pop: 5
fila pop: 6
fila pop: 7
fila pop: 8
-----------------------

Imprimindo fila: []
	tamanho: 0
	Esta vazia? true
-----------------------
o proximo pop, deve dar um erro e terminar o programa
Exception in thread "main" java.util.EmptyStackException
	at implementacao.fila.array.FilaArray.pop(FilaArray.java:43)
	at testes.TestFilaArray.main(TestFilaArray.java:50)
``` 


#### [Respostas](https://github.com/viniciusdenovaes/AulaUnipEstruturasDeDados/tree/main/Estudo02PilhaFilas/src)

