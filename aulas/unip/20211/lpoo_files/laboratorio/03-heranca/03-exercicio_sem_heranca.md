# Exercício Funcionário

##### Funcionario

Faça uma classe que represente um funcionário que tenha os seguintes atributos.
* `id`: uma `String`
* `nome`: uma `String`
* `salario`: um `double`

Um método público
* `getPagamento()`: retorna o pagamento a este funcionário, um `double`

Também faça uma classe `Financeiro` com
* um método `static public void fazPagamento(Funcionario)` que imprime o pagamento sendo feito ao funcionario.

##### Gerente

Faça uma classe que seja igual ao `funcionario`, mas

O que tem de adicionais:
* o atributo `bonus`, que seja um `double`

O que muda:
* o método `getPagamento()` soma o `salario` e o `bonus`

Também faça na classe `Financeiro`
* o método `static public void fazPagamentoGerente(Gerente)` que imprime o pagamento sendo feito ao gerente.


##### Horista

Faça uma classe que seja igual ao `funcionario`, mas

O que tem de adicionais:
* o atributo `horas`, que seja um `double`

O que muda:
* o método `getPagamento()` soma o `salario` multiplicado pelas `horas`

Também faça na classe `Financeiro`
* o método `static public void fazPagamentoHorista(Horista)` que imprime o pagamento sendo feito ao horista.










.
