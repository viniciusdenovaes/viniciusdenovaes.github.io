# Programação Orientada a Eventos (Event-driven Program)

Programação Orientada a Evento (em inglês [Event-Driven Program ou Architeture](https://en.wikipedia.org/wiki/Event-driven_architecture)) é um paradigma de arquitetura software que trata de **ações** disparadas por **eventos**.

Por **eventos**, podemos entender por exemplo:
 - um botão sendo pressionado em um programa;
 - uma mensagem sendo enviada em um aplicativo;
 - uma compra sendo finalizada em um site.

Neste curso vamos tratar de [Interface de Usuário](https://pt.wikipedia.org/wiki/Interface_gr%C3%A1fica_do_utilizador) (em inglês [Graphical User Interface ou GUI](https://en.wikipedia.org/wiki/Graphical_user_interface)), que é fazer uma interface para que o usuário possa usar o seu programa. Tipicamente faremos uma **janela** com alguns **botões**, **caixa de texto de entrada**, **tabelas**, etc...

Em java, usaremos as bibliotecas `awt` e `swing`. Para definir o funcionamento de qualquer elemento, estas bibliotecas (assim como a maioria das bibliotecas de GUI) usam o padrão orientado a eventos. Por isso devemos aprende-lo.

A primeira coisa que devemos aprender é que este padrão separa a lógica de desenhar a interface, da lógica de interação da interface,
ou seja: vamos desenhar uma interface em uma parte do código e definir funcionamento desta interface em outra parte.

Mais explicitamente:
 1. Vamos criar um botão
 1. Vamos criar uma ação
 1. Vamos adicionar esta ação no botão criado.

Mas primeiro... vamos **treinar** como separar a **definição de uma ação** da **criação da classe** que faz esta ação, definindo a ação depois da criada do objeto

## Separando Implementação de Método da Definição da Classe

### Primeiro vamos relembrar

Primeiro vamos relembrar como fizemos em LPOO, definindo um comportamento em uma classe e testando:

Definição da classe com o comportamento `voar`:
``` java
public class Pato {

	public void voar() {
		System.out.println("Definido dentro da classe: O pato voa");
	}

}
```

Testando a classe:
``` java
public class TestePato {

	public static void main(String[] args) {
		Pato pato = new Pato();
		pato.voar();
	}

}
```

### Agora vamos fazer de um jeito novo

Ok, agora vamos treinar como definir o comportamento `voar` **depois** da criação do objeto `pato`:
 1. criar um objeto e
 1. **depois** de criado, vamos definir (ou adicionar) um comportamento a ele.

Primeiro vamos definir a interface da ação de voar (lembrando que aqui `interface` quer dizer classe abstrata)

``` java
public interface AcaoVoar {
	public void fazVoar();
}
```

Agora podemos criar uma função `void fazVoar()`, inclusive ter essa função como parâmetro ou passar essa função como argumento para outra função.

```java
public class Pato {
  // podemos ter a acao de voar como atributo
	AcaoVoar acaoVoar;

	// podemos passar qualquer acao de voar como parametro
	// para definir (ou redefinir) a acao de voar do pato
	public void setAcaoVoar(AcaoVoar aAcaoVoar){
		this.acaoVoar = aAcaoVoar;
	}

	// finalmente pode usar a acao de voar
	public void voar() {
		this.acaoVoar.fazVoar();
	}

}
```

Agora vamos criar uma ação possivel, entre outras
```java
public class AcaoVoarConcreta implements AcaoVoar {
	@Override
	public void fazVoar() {
		System.out.println("Classe concreta que definine acao: faz voar");
	}
}
```

Agora vamos testar: vamos criar o objeto e depois definir a sua ação
```java
public class TestaPato {
	public void testaPato() {

		Pato pato = new Pato();

		// setando como objeto anonimo de classe externa
		pato.setAcaoVoar(new AcaoVoarConcreta());
		pato.voar();

	}

  public static void main(String[] args) {
		new TestaPato().testaPato();
	}

}
```

O resultado:
```
Classe concreta que definine acao: faz voar
```

### Existe várias outras maneiras de definir uma ação

Podemos reescrever o teste da seguinte forma:
ATENÇÃO: Você não precisa saber todas, apenas uma delas
```java
public class TestaPato {
	public void testaPato() {

		Pato pato = new Pato();


		// setando como objeto anonimo de classe externa
		pato.setAcaoVoar(new AcaoVoarConcreta());
		System.out.println("\n1) Pato voando");
		pato.voar();
		System.out.println("\n");


		// setando como inner class
		pato.setAcaoVoar(new AcaoVoarInnerClass());
		System.out.println("\n2) Pato voando");
		pato.voar();
		System.out.println("\n");


		// setando como classe anonima
		pato.setAcaoVoar(new AcaoVoar() {
			@Override
			public void fazVoar() {
				System.out.println("Acao de classe anonima: faz voar");
			}
		});
		System.out.println("\n3) Pato voando");
		pato.voar();
		System.out.println("\n");


		// setando como expressao lambda (VOCE NAO PRECISA SABER EXPRESSOES lambda)
		pato.setAcaoVoar(() -> System.out.println("Acao como expressao lambda: faz voar"));
		System.out.println("\n4) Pato voando");
		pato.voar();
		System.out.println("\n");


	}

	// Definicao de inner class (uma classe dentro de outra classe)
	class AcaoVoarInnerClass implements AcaoVoar{
		@Override
		public void fazVoar() {
			System.out.println("Acao definida em classe interna: faz voar");
		}
	}



	public static void main(String[] args) {
		new TestaPato().testaPato();
	}

}
```

E se eu quiser que a ação voar seja uma lista de várias ações que eu queira adicionar ao objeto?


### Adicionando ações ao objeto

Agora podemos também fazer com que `Pato` tenha uma lista de ações de voar, e adicionar ações de voar no `pato` para que ele faça todas adicionadas quando voar.

Reescreveremos a classe `Pato` como a seguir
``` java
import java.util.ArrayList;
import java.util.List;

public class Pato {


  List<AcaoVoar> acaoVoarList = new ArrayList<>();
	public void addAcaoVoar(AcaoVoar aAcaoVoar){
		this.acaoVoarList.add(aAcaoVoar);
	}

	public void voar() {
		for(AcaoVoar acaoVoar : this.acaoVoarList) {
			acaoVoar.fazVoar();
		}
	}

}
```

Reescreveremos o teste como a seguir (mudando apenas `setAcaoVoar` para `addAcaoVoar`)
``` java
public class TestaPato {
	public void testaPato() {

		Pato pato = new Pato();


		pato.addAcaoVoar(new AcaoVoarConcreta());
		System.out.println("\n1) Pato voando");
		pato.voar();
		System.out.println("\n");


		pato.addAcaoVoar(new AcaoVoarInnerClass());
		System.out.println("\n2) Pato voando");
		pato.voar();
		System.out.println("\n");


		pato.addAcaoVoar(new AcaoVoar() {
			@Override
			public void fazVoar() {
				System.out.println("Acao de classe anonima: faz voar");
			}
		});
		System.out.println("\n3) Pato voando");
		pato.voar();
		System.out.println("\n");


		pato.addAcaoVoar(() -> System.out.println("Acao como expressao lambda: faz voar"));
		System.out.println("\n4) Pato voando");
		pato.voar();
		System.out.println("\n");


	}

	// Definicao de inner class (uma classe dentro de outra classe)
	class AcaoVoarInnerClass implements AcaoVoar{
		@Override
		public void fazVoar() {
			System.out.println("Acao definida em classe interna: faz voar");
		}
	}



	public static void main(String[] args) {
		new TestaPato().testaPato();
	}

}
```
















.
