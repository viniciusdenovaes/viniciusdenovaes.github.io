# Dart Crash Course

Este curso de Dart é destinado a pessoas que sabem os conceitos de Programação Estruturada e de Programação Orientada a Objetos.

Aqui serão apresentados os Core Concepts de Dart e serão comparados com as linguagens mais conhecidas.

Os programas podem ser testados online em [dartpad.dev](dartpad.dev).

### Hello World

Um programa simples em Dart:

```dart
void main() {
  print('hello world');
}
```

Um programa sempre começa pela função `void main()` e cada **comando precisa de um ;** no final.


### A função `print`

A função `void print(Object? object)` em Dart pode receber qualquer objeto, mas o mais comum é receber uma `string`.

##### *string interpolation*:
Na forma a moderna de formatação da `string`, que em Python é conhecida como `f-string` e em C# e Dart chamada de *string interpolation* é usado o comando `${object}` dentro de uma `string` para imprimir o **valor** do `object`.

Por exemplo

###### Exemplo 1
```dart
void main() {
  
  String palavra = 'Casa';
  print(palavra);
  print('a palavra eh $palavra');
  print('o tamanho da palavra eh ${palavra.length}');
}
```

**OBS:** Perceba que você pode usar `$object` quando quiser o valor de **um** objeto, para qualquer operação além você deve usar `${object}`. Na dúvida sempre use `${object}`.

**Saída**
```
Casa
a palavra eh Casa
o tamanho da palavra eh 4
```

###### Exemplo 2
```dart
void main() {
  for (var i = 0; i < 4; i++) {
    print('hello ${i + 1}');
  }
}
```

**Saída**
```
hello 1
hello 2
hello 3
hello 4
```




###### Exemplo 3
```dart
int quadrado(int i){
  return i*i;
}
void main() {
  for (var i = 0; i < 4; i++) {
    print('o numero $i ao quadrado: ${quadrado(i)}');
  }
}
```

**Saída**
```
o numero 0 ao quadrado: 0
o numero 1 ao quadrado: 1
o numero 2 ao quadrado: 4
o numero 3 ao quadrado: 9
```




### Tipos Numéricos

Para inteiros usamos `int` e para números decimais (com ponto) usamos `double`. Também podemos usar o tipo `num` tanto para inteiro quanto para decimais.

##### Números são classes
Em C#, Java, C++ e C: `int` e `double` são **tipos primitivos**, ou seja, não têm métodos diretamente associados.

Em Python e **Dart** estes tipos são classes, ou seja, têm **métodos** e **relação de herança**.

Em Dart o `int` e `double` são filhos da classe `num`.

Abaixo podemos ver exemplos de métodos para tipos numéricos.



###### Exemplo 1
```dart
void main() {
  for (int i = 0; i < 4; i++) {
    print('o numero $i eh par? ${i.isEven}');
  }
}
```

**Saída**
```
o numero 0 eh par? true
o numero 1 eh par? false
o numero 2 eh par? true
o numero 3 eh par? false
```


###### Exemplo 2
```dart
void main() {
  for (int i = -2; i < 2; i++) {
    print('qual o sinal do numero $i? ${i.sign}');
  }
}
```

**Saída**
```
qual o sinal do numero -2? -1
qual o sinal do numero -1? -1
qual o sinal do numero 0? 0
qual o sinal do numero 1? 1
```


###### Exemplo 3
```dart
void main() {
  for (int i = 0; i < 4; i++) {
    num n = i/2;
    print('o numero $n eh inteiro? ${n.toInt()==n}');
  }
}
```

**Saída**
```
o numero 0 eh inteiro? true
o numero 0.5 eh inteiro? false
o numero 1 eh inteiro? true
o numero 1.5 eh inteiro? false
```

### Tipos `var` e `dynamic`

Se o tipo de uma variável pode ser inferido pelo valor, você pode usar o tipo `var`.

 - `var i = 0`: `i` é um `int`
 - `var palavra = 'casa'`: `palavra` é uma `string`

À partir do ponto onde o tipo de uma variável é definido, **este tipo não pode mudar**.

Porém, se uma variável for definida como `dynamic`, o tipo da variável pode mudar:


###### Exemplo 3
```dart
void main() {
  dynamic palavra = 'casa';
  print(palavra);
  print('tipo de palavra: ${palavra.runtimeType}');
  print(palavra.length);
  print('Mudando o tipo de palavra');
  palavra = 2;
  print(palavra);
  print('tipo de palavra: ${palavra.runtimeType}');
  //print(palavra.length); <-- ERRO: int nao tem o metodo length
  print(palavra.isEven);
}
```

**Saída**
```
casa
tipo de palavra: String
4
Mudando o tipo de palavra
2
tipo de palavra: int
true
```


### Keywords: `final` e `const`

Uma variável `final` não pode mudar o seu valor:
 - `final double pi = 3.14159;`: O valor de `pi` não pode mudar.

O mesmo acontece com `const`, a diferença é que o valor em `const` é definido no tempo da compilação:
 - `const double pi = 3.14159;`: O valor de `pi` não pode mudar.

##### Diferença entre: `final` e `const`

Vamos ver um exemplo de `final` aplicado a uma coleção.

###### Exemplo `final`
```dart
void main() {
  final List<int> numeros = [10, 20, 30];
  print(numeros);
  //numeros = [50, 40, 30]; <- ERRO: Nao posso mudar a variavel numeros
  numeros[0] = 40;
  numeros.add(50);
  print(numeros);
}
```

**Saída**
```
[10, 20, 30]
[40, 20, 30, 50]
```

Perceba que não podemos o valor de `numeros`, que é uma referência para uma lista. Mas podemos modificar o ojeto lista.



Agora vamos ver um exemplo de `const` aplicado a uma coleção.

###### Exemplo `const`
```dart
void main() {
  const List<int> numeros = [10, 20, 30];
  print(numeros);
  //numeros = [50, 40, 30]; <- ERRO: Nao posso mudar a variavel numeros
  //numeros[0] = 40; <- ERRO: Nao posso mudar o proprio objeto
  //numeros.add(50); <- ERRO: Nao posso mudar o proprio objeto
}
```

**Saída**
```
[10, 20, 30]
```

Perceba que não podemos o valor de `numeros`, que é uma referência para uma lista. E também não podemos modificar o próprio objeto.


### Operadores

Os operadores entre números e boleanos seguem a mesma lógica da linguagem C, com a diferença que um inteiro dividido por outro inteiro pode resultar em um decimal. Para se obter a divisão inteira entre dois números deve-se usar o operador `~/`.

 - `3/2 == 1.5`
 - `3~/2 == 1` **OBS:** Não é um arredondamento, é somente a parte inteira.

Operadores comuns entre números:
 - `+`: soma
 - `-`: subtração
 - `/`: divisão
 - `*`: multiplicação

Operadores entre números que resultam em booleanos:
 - `==`: multiplicação
 - `!=`: diferente
 - `<`: menor
 - `<=`: menor ou igual
 - `>`: maior
 - `>=`: maior ou igual

Operadores booleanos (entre booleanos que resultam em booleanos):
 - `&&`: E lógico
 - `||`: OU lógico


### Comandos Condicionais

##### Comando `if`
O comando condicional `if else` funciona como na linguagem C:

```dart
void main() {
  const temperatura = 20.5;
  if(temperatura<10){
    print('Esta congelando');
  }else if(temperatura>=10 && temperatura<30){
    print('Esta muito frio');
  }else if(temperatura>=30 && temperatura<35){
    print('Esta uma tempo bom');
  }else{
    print('Esta calor');
  }
}
```

```
Esta muito frio
```

##### Comando `switch`

Usando o comando `switch` podemos escrever o código acima de forma mais concisa:

```dart
void main() {
  const temperatura = 20.5;
  
  switch(temperatura){
    case <10: 
      print('Esta congelando');
    case >=10 && <30: 
      print('Esta muito frio');
    case >=30 && <35: 
      print('Esta uma tempo bom');
    default: 
      print('Esta calor');
  }
}
```

##### switch expression

Usando o `switch expression` você pode retornar um valor usando a estrutura do switch:

```dart
void main() {
  const temperatura = 20.5;
  
  String status = switch(temperatura){
    <10 => 'Esta congelando',
    >=10 && <30 => 'Esta muito frio',
    >=30 && <35 => 'Esta uma tempo bom',
    _ => 'Esta calor',
  };
  print(status);
}
```
Observe que:
 - Em cada caso você pode omitir o nome da variável
 - O separador de seta `=>` denota o que será retornado.
 - O caso default é denotado pelo undeline `_`
 - Cada caso é separado por uma vírgula
 - Existe um `;` depois do parênteses

Perceba que o switch só pode entrar em um dos casos. 
Podemos fazer um código mais limpo ainda.

```dart
void main() {
  const temperatura = 20.5;
  String status = switch(temperatura){
    <10 => 'Esta congelando',
    <30 => 'Esta muito frio',
    <35 => 'Esta uma tempo bom',
    _ => 'Esta calor',
  };
  print(status);
}
```

Poderíamos ter feito isso nos exemplos anteriores também.



##### Testando igualdade de `string`

Diferente de Java, Dart permite fazer redefinição de operadores. Para testar duas `string` você pode usar o operador `==`. 

```dart
void main() {
  const metal = 'ouro';
  const cor = 'ouro';
  if(metal==cor){
    print('sao iguais');
  }
}
```

**OBS:** Não é toda linguagem que permite testar a igualdade de duas `string` com `==`, sempre verifique!!


##### Usando `switch` com `string`

```dart
void main() {
  const cor = 'vermelho';
  
  switch(cor){
    case 'vermelho': 
      print('A cor escolhida foi a cor da aurora');
    case 'azul': 
      print('A cor escolhida foi a cor do ceu');
    case 'verde': 
      print('A cor escolhida foi a cor da planta');
    default: 
      print('Nao conheco a cor escolhida');
  }
}
``` 

##### Usando switch expression

```dart
void main() {
  const cor = 'vermelho';
  
  String comentario = switch(cor){
    'vermelho' => 'A cor escolhida foi a cor da aurora',
    'azul' => 'A cor escolhida foi a cor do ceu',
    'verde'  => 'A cor escolhida foi a cor da planta',
    _=>'Nao conheco a cor escolhida',
  };
  print(comentario);
}
```

## Estruturas de Dados (Listas, Conjuntos e Maps)

#### Listas

Podemos declarar uma lista de inteiros da seguinte maneira: `List<int> numeros = [];`

Principais métodos da lista:
 - `numeros[i]`: retorna o valor na posição `i`
 - `numeros[i] = valor`: coloca `valor` na posição `i`
 - `numeros.length` retorna o tamanho da lista
 - `numeros.add(valor)` adiciona o `valor` ao final da lista
 - `numeros.addAll(colecao)` adiciona todos os valores da `colecao` à `numeros`
 - `numeros.insert(pos, valor)` adiciona o `valor` na posicao `pos`, empurrando todos os valores à direita uma posição para direita
 - `numeros.insertAll(pos, colecao)` adiciona todos os valores de `colecao` na posicao `pos`, empurrando todos os valores à direita mais para direita
 - `numeros = [10, 20, 30]` literal para criar a lista `[10, 20, 30]`
 - `numeros.remove(valor)` remove o `valor` da lista
 - `numeros.removeAt(pos)` remove o valor da posição `pos`
 - `print(numeros.last)` retorna o último valor da lista
 - `print(numeros.first)` retorna o primeiro valor da lista

###### Exemplos

```dart
void main() {
  List<int> numeros = [];
  print(numeros);
  print(numeros.length);
  numeros.add(1);
  print(numeros);
  numeros.addAll([2, 3]);
  print(numeros);
  numeros.insert(1, 100);
  print(numeros);
  numeros.insertAll(1, [200, 300]);
  print(numeros);
  numeros = [10, 20, 30];
  print(numeros);
  numeros.remove(20);
  print(numeros);
  numeros.removeAt(0);
  print(numeros);
  numeros = [100, 200, 300];
  print(numeros[1]);
  print(numeros.last);
  print(numeros.first);
}
```
 
```
[]
0
[1]
[1, 2, 3]
[1, 100, 2, 3]
[1, 200, 300, 100, 2, 3]
[10, 20, 30]
[10, 30]
[30]
200
300
100
```

#### Conjuntos

Um conjunto é uma coleção que não tem valores repetidos.

###### Exemplo
```dart
void main() {
  
  Set<int> numeros = {3, 1, 2};
  print(numeros);
  numeros.add(1);
  numeros.add(2);
  numeros.add(3);
  numeros.add(4); // apenas o numero 4 sera adicionado
  print(numeros);
  
}
```
###### Saída

```
{3, 1, 2}
{3, 1, 2, 4}
```

Caso você tenha uma coleção de objetos e quiser eliminar repetições, você pode transformar a sua coleção em um conjunto.

###### Exemplo
```dart
void main() {
  
  List<int> numeros = [1, 1, 2, 2, 3, 3];
  print(numeros);
  Set<int> conjuntoNumeros = Set.of(numeros);
  print(conjuntoNumeros);
  
}
```

###### Saída
```
[1, 1, 2, 2, 3, 3]
{1, 2, 3}
``` 

#### Maps

Enquanto uma lista é indexada por números inteiros começando pelo 0, um map é indexado por uma chave qualquer.

Um map é um mapeamento de um conjunto (chamados `key`) para uma coleção de valores (`values`).

###### Exemplo

```dart
void main() {
  
  Map<String, int> pontos = {
    'Carlos': 30,
    'Ana': 10, 
    'Beto': 20, 
  };
  
  var pessoa = 'Ana';
  print('A pontuacao da ${pessoa} eh ${pontos[pessoa]}');
  pessoa = 'Beto';
  print('A pontuacao da ${pessoa} eh ${pontos[pessoa]}');
  pessoa = 'Dani'; // <- Dani nao esta no map
  print('A pontuacao da ${pessoa} eh ${pontos[pessoa]}');
  
  pontos['Dani'] = 40;  // Inserindo a dupla chave Dani e valor 40
  print('A pontuacao da ${pessoa} eh ${pontos[pessoa]}');
  pontos['Dani'] = 140; // Atualizando o valor da chave Dani para 140
  print('A pontuacao da ${pessoa} eh ${pontos[pessoa]}');
  
  print(pontos);
  print(pontos.keys);
  print(pontos.values);
  
  
}
```

###### Saída
```
A pontuacao da Ana eh 10
A pontuacao da Beto eh 20
A pontuacao da Dani eh null
A pontuacao da Dani eh 40
A pontuacao da Dani eh 140
{Carlos: 30, Ana: 10, Beto: 20, Dani: 140}
(Carlos, Ana, Beto, Dani)
(30, 10, 20, 140)
```


.