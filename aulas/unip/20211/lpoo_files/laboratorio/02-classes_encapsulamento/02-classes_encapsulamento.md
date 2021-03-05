# Lab 02 - Classes e Encapsulamento

Para cada exercício, todas as classes devem ser feitas e **testadas** no mesmo projeto. Para cada classe, crie uma classe separada para testar a sua classe.

Vamos usar encapsulamento, então todo atributo deve ser `private` e, se precisar, ter um `get` e/ou `set`.

### Exercício 01

Neste exercício você irá fazer o cadastro de um aluno, e seu histórico escolar.

Cada aluno tem os seguintes dados:
* `id` que pode ter números e letras
* `nome` que é composto por nome e sobrenome.
* `historico` que é composto por uma lista de `materias`
* Um aluno não pode ser criado sem que tenha `id` e `nome`

Por sua vez, uma `materia` tem
* o `nome` da matéria
* o `ano` que ela foi lecionada
* uma `materia` nao pode ser criada sem que tenha `nome` e `ano`

Cada aluno deverá ter um método chamado `fazRelatorio` que imprime na tela os dados de um aluno. E as matérias que ele cursou.

### Exercício 02

Neste exercício você irá fazer o cadastro de um aluno, e seu histórico escolar com notas em cada matéria.

Cada aluno tem os seguintes dados:
* `id` que pode ter números e letras
* `nome` que é composto por nome e sobrenome.
* `historico` que é composto por uma lista de `rendimentos`
* um aluno não pode ser criado sem que tenha `id` e `nome`

Um `rendimento` é composto por uma `materia` e suas `notas`

Uma `materia` tem
* o `nome` da matéria
* o `ano` que ela foi lecionada

E as `notas` são compostos por três valores:
* `np1`
* `np2`
* `exame`

Cada rendimento deverá ter o método `public boolean getAprovacao` que responde se o aluno passou naquela matéria. A regra para um aluno ser aprovado é
* se a média da `np1` com a `np2` for maior que 7, o aluno será aprovado
* caso contrário,
  * vamos chamar a média da `np1` com a `np2` de `m`, se a média de `m` com `exame` for maior que 5, o aluno será aprovado
  * caso contrário, o aluno será reprovado.


Cada aluno deverá ter um método chamado `fazRelatorio` que imprime na tela os dados de um aluno, as matérias que ele cursou e a nota e situação de cada matéria.


### Exercício 03

Neste exercício você irá fazer um programa que simula uma uma clínica veterinária.

![Diagrama de Classes](veterinaria.svg)
