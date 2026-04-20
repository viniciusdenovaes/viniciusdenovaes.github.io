# List

Já vimos o `ArrayList`, uma das implementações de `List`. 
E esta é a implementação **mais recomendada** para usar.
Porém, caso você esteja fazendo um programa com mais um processo, 
e cada processo esteja acessando a mesma `Lista`, 
então você deve usar o `Vector`.

OBS: Se você não sabe o que está fazendo, se mantenha usando `ArrayList`

#### Comparações Entre Implementações:

Outras implementações que você pode usar são o `Vector` e `LinkedList`.

As principais diferenças são:

- `ArrayList` usa array para implementar uma lista.
- `LinkedList` usa lista ligada para implementar uma lista.
- `Vector` é a versão de lista menos eficiente, porém é thread-safe, enquanto as outras não são.

### Comportamento em Multi-Thread:

Retirado da [documentação oficial do Java sobre Vector](https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html):

> As of the Java 2 platform v1.2, this class (Vector) was retrofitted to implement the List interface, making it a member of the Java Collections Framework. Unlike the new collection implementations, Vector is synchronized. If a thread-safe implementation is not needed, it is recommended to use ArrayList in place of Vector.

`Vector` é uma implementação de `List`, e funciona bem em programas que trabalham com multi-thread, se cada processo tiver acesso ao mesmo `Vector`, diferente das mais novas implementações de `List`.

Se você **não** estiver usando multi-thread, o recomendado é que use `ArrayList`.

#### Testes de Multi-Thread:

Neste [link](https://github.com/viniciusdenovaes/UnipLpoo/tree/main/Aula05_list/src/testes/thread) você pode ver dois testes, um usando `Vector` e outro usando `ArrayList` em um programa multi-thread.

Em diferentes usos do programa que usa `ArrayLit` você pode observar uma séria inconsistência do `ArrayList` usado ao mesmo tempo por diferentes processos. Enquanto que o `Vector` mantem a consistência.



### Alguns Testes de Tempo

Aqui estão alguns testes de performance de arrays e implementações de listas. Porém:

**Aviso**: Você não deve sacrificar legibilidade e funcionamento do código pensando prematuramente em eficiência. Primeiro faça funcionar, depois você pode refatorar com o objetivo de

1. Deixar a estrutura e o código mais [limpo](https://www.oreilly.com/library/view/clean-code-a/9780136083238/)
1. Evitar bug
1. Verificar gargalos (onde demora mais) para melhorar eficiência.

Nesta ordem.

Os testes para mostrar a diferença estão em [testes](https://github.com/viniciusdenovaes/UnipLpoo/blob/main/Aula05_list/src/testes/time/TestRunningTimes.java).

Com o código

```java
package testes.time;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class TestRunningTimes {
	
	static final int MAX_POW2 = 29; // max pow of 2 to fit a int
	
	// test colecao, if null test array 
	public static int test(Collection<Integer> colecao, int pow2) {
		if(pow2>MAX_POW2) throw new IllegalArgumentException("limit of pow for int is " + MAX_POW2);
		int expoent = 2 << pow2; // 2^pow2
		
		long startTime = System.nanoTime();
		
		if(colecao==null)
			runArray(expoent);
		else
			runCollection(colecao, expoent);
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		long durationInMs = TimeUnit.NANOSECONDS.toMillis(totalTime);
		if(durationInMs > (2<<MAX_POW2)) 
			throw new RuntimeException(
					"Total time in Ms greater than int: totalTime(" + totalTime + 
					"), totalTimeMs(" + durationInMs + ")");
		return (int)durationInMs;

	}
	
	public static void runCollection(Collection<Integer> colecao, int expoent) {
		for(int i=0; i<expoent; i++)
			colecao.add(i);
	}
	
	public static void runArray(int expoent) {
		int[] array = new int[expoent];
		for(int i=0; i<array.length; i++)
			array[i] = i;
	}
	
	public static void main(String[] args) {
		int pow2 = 21;
		System.out.println(String.format("Running time array:      %5d Ms", test(null, pow2)));
		System.out.println(String.format("Running time ArrayList:  %5d Ms", test(new ArrayList<>(), pow2)));
		System.out.println(String.format("Running time LinkedList: %5d Ms", test(new LinkedList<>(), pow2)));
		System.out.println(String.format("Running time Vector:     %5d Ms", test(new Vector<>(), pow2)));
	}

}

```

Um dos resultados dos testes foi este:

```
Running time array:         13 Ms
Running time ArrayList:    163 Ms
Running time LinkedList:  1332 Ms
Running time Vector:       267 Ms
```

Porém **não** se preocupe tanto com a eficiência do seu código prematuramente: um código legível e que funciona é melhor do que um código eficiente!

"Otimização prematura é a raíz de todo mal" -- Donald Knuth

Para otimizar o seu código é importante a identificação de gargalos, verificar onde seu código está demorando mais. Normalmente não é na implementação escolhida de lista.
