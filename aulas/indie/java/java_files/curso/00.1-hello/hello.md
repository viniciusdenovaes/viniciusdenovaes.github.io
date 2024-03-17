# Hello World - Imprimindo Informação na Tela Para Quem Sabe `Python`

Vamos fazer o código mais simples possível para imprimir algo na tela.

## O Programa Mais Simples do Mundo em Java

Em um arquivo chamado `Aula00HeloWorld.java`
```java

package aula00_hello_world;

public class Aula00HeloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

}

```

Bastante coisa comparando com o simples `print('Hello World')` do `Python`.


Não vamos explicar tudo nesta aula, com o tempo todas as palavras neste código serão entendidas. As regras que você precisa entender agora é:
- Todo comando deve terminar com ponto-e-vírgula `;`
- Todo escopo é delimitado por chaves `{}` Para delimitar o que está dentro de uma classe ou uma função não basta apenas identar, você deve delimitar usando as chaves `{}`
- O nome do arquivo `Aula00HeloWorld.java` precisa ser o mesmo nome da classe `public class Aula00HeloWorld`
- A função da classe com assinatura `public static void main(String[] args)` é o ponto de partida de onde o código começa quando o arquivo é executado.
- Lembrar que todo comando deve terminar com ponto-e-vírgula `;`
- `System.out.println()` é a função usada para imprimir alguma coisa na saída padrão (terminal)
- Uma `String` em java é delimitada por aspas duplas (`"Hello World"`) e **não** por aspas simples.
- Eu já falei que todo comando deve terminar com ponto-e-vírgula `;`? Não esqueça do ponto-e-vírgula `;`

## Hello Variável

Para criar uma variável em `Java` precisamos dizer qual será o tipo de objeto que aquela variável irá guardar.

```java
package aula00_hello_world;

public class HelloVariavel {

	public static void main(String[] args) {

		String a = "Hello World";

		System.out.println(a);
	}

}
```

Neste caso a variável `a` é uma `String`. Precisamos dizer o tipo de `a` ao criar a variável.

Lembre que uma variável pode mudar o valor que ela guarda mas não pode mudar o tipo.

## Hello Numeros

Aqui vamos aprender a criar e imprimir alguns números. Mas saiba que em `Java` existe diferença entre criar um número inteiro (`int`) e um número real (`double`)

### Números Inteiros

```java
package aula00_hello_world;

public class HelloInteiro {

	public static void main(String[] args) {

		int a = 2;

		System.out.println(a);
	}

}

```

A variável `a` é um número inteiro. Para escrever um número inteiro basta escrever o número. Mas **nunca** escreva `2.0` e sim `2`

### Números Reais

```java
package aula00_hello_world;

public class HelloDouble {

	public static void main(String[] args) {

		double a = 4.0/3.0;

		System.out.println(a);
	}

}

```
A variável `a` é um número real, que chamamos de `double`. Para escrever um `double` você precisa escrever o `.` no meio do número.

**Importante**: Em `Java` o resultado de `5/3` é `1`, enquanto que o resultado de `5.0/3.0` é `1.6666666666666667`. O motivo disso é que uma divisão entre inteiros vai ter como resultado um número inteiro (que será o resultado sem a parte à direita do ponto)

### Misturando `String` e `double` e escrevendo uma função

```java
package aula00_hello_world;

public class HelloStringAndDouble {

	public static void main(String[] args) {

		double a = 4.0;
		double b = 3.0;
		double c = divisao(a, b);

		System.out.println("A divisao de " + a + " por " + b + " eh igual a " + c);
	}


	public static double divisao(double numero1, double numero2) {
		return numero1/numero2;
	}

}
```

Um exemplo concatenando `String` com números usando o operador `+`.

Aqui temos também um exemplo de função, perceba que precisamos dizer qual será o tipo que uma função retornará. No caso da `main` nada é retornado, então o tipo é `void`. No caso da `divisao` o tipo é `double`

.
