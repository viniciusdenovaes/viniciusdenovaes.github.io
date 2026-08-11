# Bag

Para este lab vamos criar uma estrutura de dados bem simples: uma coleção de tamanho fixo, onde você **adicionar até 5** números **inteiros**.

#### Interface

Fornecida a seguinte interface:

```java
public interface Bag{
	
	static final int TAMANHO_MAX = 5;
	boolean isEmpty();
	boolean isFull();
	int size();
	void add(int e);
}
``` 

Você deve fazer a implementação desta coleção, que deve ter as seguintes funcionalidade:
- `boolean isEmpty()` se ela está vazia
- `boolean isFull()` se ela está cheia
- `int size()` qual é o tamanho dela
- `void add(int e)` adicionar um número inteiro

Além disso sua estrutura deve fazer `@Override` do método `toString` para imprimir todo seu conteúdo.

#### Teste

Use o seguinte teste e compare com a saída:

```java
public class TestBag {
	
	public static void main(String[] args) {
		
		Bag bag = new MyBag();
		
		System.out.println("\nImprimindo bag: " + bag);
		System.out.println("\ttamanho: " + bag.size());
		System.out.println("\tEsta vazia? " + bag.isEmpty());
		System.out.println("\tEsta cheia? " + bag.isFull());
		System.out.println("-----------------------");
		
		System.out.println("\nAdicionando elemento: 1, 2");
		bag.add(1);
		bag.add(2);
		
		System.out.println("\nImprimindo bag: " + bag);
		System.out.println("\ttamanho: " + bag.size());
		System.out.println("\tEsta vazia? " + bag.isEmpty());
		System.out.println("\tEsta cheia? " + bag.isFull());
		System.out.println("-----------------------");
		
		System.out.println("\nAdicionando elemento: 3, 4, 5");
		bag.add(3);
		bag.add(4);
		bag.add(5);
		
		System.out.println("\nImprimindo bag: " + bag);
		System.out.println("\ttamanho: " + bag.size());
		System.out.println("\tEsta vazia? " + bag.isEmpty());
		System.out.println("\tEsta cheia? " + bag.isFull());
		System.out.println("-----------------------");
		
		System.out.println("\nAdicionando elemento: 6, 7");
		bag.add(6);
		bag.add(7);
		
		System.out.println("\nImprimindo bag: " + bag);
		System.out.println("\ttamanho: " + bag.size());
		System.out.println("\tEsta vazia? " + bag.isEmpty());
		System.out.println("\tEsta cheia? " + bag.isFull());
		System.out.println("-----------------------");
	}
}
```

###### Saída
```
Imprimindo bag: []
	tamanho: 0
	Esta vazia? true
	Esta cheia? false
-----------------------

Adicionando elemento: 1, 2

Imprimindo bag: [1, 2, ]
	tamanho: 2
	Esta vazia? false
	Esta cheia? false
-----------------------

Adicionando elemento: 3, 4, 5

Imprimindo bag: [1, 2, 3, 4, 5, ]
	tamanho: 5
	Esta vazia? false
	Esta cheia? true
-----------------------

Adicionando elemento: 6, 7

Imprimindo bag: [1, 2, 3, 4, 5, ]
	tamanho: 5
	Esta vazia? false
	Esta cheia? true
-----------------------
``` 


#### [Respostas](https://github.com/viniciusdenovaes/AulaUnipEstruturasDeDados/tree/main/Estudo00BagSemIterator/src/bag)

