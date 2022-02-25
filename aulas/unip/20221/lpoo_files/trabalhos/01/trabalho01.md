# Trabalho de LPOO (grupo de 5 pessoas, para o dia 16/04)

Para este trabalho você deve fazer o sistema de cadastro de um histórico.

Neste sistema deve ser possível que um usuário final:
* Cadastre as matérias e as notas destas matéria (1pt).
* Listar todas as matérias cadastradas (1pt).
* Listar matérias de um ano específico (1pt).
* Listar apenas as matérias aprovadas/reprovadas (1pt).
* Exibir um relatório que exibe
  * todas as matérias (em qualquer ordem),
  * a média de cada matéria (1pt),
  * o status (se foi aprovado ou não) (1pt),
  * a matéria com a maior **e** menor média (1pt),
  * e o "coeficiente de rendimento" (a média de todas as médias) (1pt)

OBS: a função de listar pode ser a mesma do relatório.

As funções podem ser demonstradas dentro de uma classe `Teste` com um `main` (Veja um exemplo de classe `Teste` no final da página). Caso você não faça a interface com o usuário final você ganhará os pontos referentes à cada função mas não ganhará os pontos referentes à interface com o usuário final.

Você pode fazer uma interface com o usuário final através do terminal e/ou usando a biblioteca "Swing" (2pt).

**OBS: É altamente recomendável que você faça o trabalho nesta ordem e garanta os pontos das partes que você fez.** Para cada item feito atualize o `Teste` para coontemplar este item.

### Entidades

#### `Materia`
A `Materia` é uma entidade que tem
* um `nome`, o nome da matéria;
* e um `ano`, o ano em que foi ministrada.

#### `Notas`
Cada `Materia` possui 4 notas:
* `np1`, representa a nota da primeira prova;
* `np2`, representa a nota da segunda prova;
* `sub`, representa a nota da prova substitutiva;
* `exame`, representa a nota do exame final;

### Regras de aprovação e média

#### Aprovação
Para que um aluno seja aprova ele deve ter média final maior ou igual a `5.0`.

#### Média Final

Para calcular a "média final" devemos calcular duas médias:
* Devesse pegar as **duas maiores** notas entre a `np1`, `np2`, e `sub` e calcular esta média. Se esta média for maior, ou igual, a `7.0` então está será a "média final".
* Caso a média anterior seja menor que `7.0`, deve-se calcular a média entre a "média anterior" e o exame, o resultado será a "média final".

**OBS**: este cálculo da média não representa a mesma regra que a Unip usa.


### Exemplo de classe `Teste`

``` java

public class Teste {

	public static void main(String[] args) {

		CadastroAbstract cadastro = new Cadastro();

		cadastro.addRendimento(new Rendimento(new Materia("APOO", 2020),  new Notas(7, 8, 0, 0)));
		cadastro.addRendimento(new Rendimento(new Materia("BPOO", 2020),  new Notas(2, 2, 6, 10)));
		cadastro.addRendimento(new Rendimento(new Materia("CPOO", 2021),  new Notas(2, 8, 8, 0)));
		cadastro.addRendimento(new Rendimento(new Materia("DPOO", 2021),  new Notas(0, 1, 2, 3)));

		cadastro.fazRelatorio();

		cadastro.imprimeMateriasDoAno(2019);
		cadastro.imprimeMateriasDoAno(2020);
		cadastro.imprimeMateriasDoAno(2021);

		cadastro.imprimeMateriasStatus(true);
		cadastro.imprimeMateriasStatus(false);

	}

}
```

Esta classe abstrata serve apenas para servir de suporte ao exemplo de `Teste`, **você não precisa usar**.
``` java
public abstract class CadastroAbstract {

	public abstract void addRendimento(Rendimento rendimento);

	public abstract void fazRelatorio();

	public abstract void imprimeMateriasDoAno(int ano);

	public abstract void imprimeMateriasStatus(boolean isAprovado);

}
```
