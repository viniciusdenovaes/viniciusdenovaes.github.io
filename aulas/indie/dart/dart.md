# Dart Crash Course

Este curso de Dart é destinado a pessoas que sabem os conceitos de Programação Estruturada e de Programação Orientada a Objetos.

Aqui serão apresentados os Core Concepts de Dart e serão comparados com as linguagens mais conhecidas.

Os programas podem ser testados online em [dartpad.dev](https://dartpad.dev).

Uma documentação exaustiva pode ser encontrada em [dart.dev](https://dart.dev/language)

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
    print('o numero $i eh positivo? ${!(i.isNegative)}');
  }
}
```

**Saída**
```
o numero -2 eh positivo? false
o numero -1 eh positivo? false
o numero 0 eh positivo? true
o numero 1 eh positivo? true
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


### Iterando em Coleções

Devemos iterar em coleções usando o comando `foreach`:

###### Exemplo List
```dart 
void main() {
  final List<int> numeros = const [1,2,3,4,5];
  for (int n in numeros) {
    print(n);
  }
}
```

###### Saída
```dart 
1
2
3
4
5
```

###### Exemplo Set
```dart
void main() {
  final Set<int> numeros = {1,2,3};
  numeros.add(1);
  numeros.add(2);
  numeros.add(3);
  numeros.add(4);
  for (var n in numeros) {
    print(n);
  }
}
```
###### Saída
```dart 
1
2
3
4
```

###### Exemplo Map
```dart
void main() {
  final Map<String, int> scores = 
      {'Ana': 1,
       'Beto': 2,
       'Carla': 3, 
      };
  for (var key in scores.keys) {
    print('Chave: ${key}, Valor: ${scores[key]}');
  }
}
```

###### Saída
```
Chave: Ana, Valor: 1
Chave: Beto, Valor: 2
Chave: Carla, Valor: 3
```

Podemos também iterar nas chaves e valores ao mesmo tempo, usando a classe `MapEntry`


###### Exemplo Map
```dart
void main() {
  final Map<String, int> scores = 
      {'Ana': 1,
       'Beto': 2,
       'Carla': 3, 
      };
  for (MapEntry<String, int> entry in scores.entries) {
    print('Entry: $entry');
    print('Chave: ${entry.key}, Valor: ${entry.value}\n');
  }
}
```

###### Saída
```
Entry: MapEntry(Ana: 1)
Chave: Ana, Valor: 1

Entry: MapEntry(Beto: 2)
Chave: Beto, Valor: 2

Entry: MapEntry(Carla: 3)
Chave: Carla, Valor: 3
```


## O elemento `null`

Dart tem uma proteção contra o uso do elemento `null`. Uma variável não pode ser nula a não ser que o código explicite que esta variável pode ser nula usando o modificador `?` na definição de seu tipo.

Por exemplo:
```dart
void main() {
  //int x = null; <- ERRO: uma variavel nao pode ser nula
  int? y = null;
  print(y);
  //print(y.isEven) <- ERRO: nao posso usar o metodo de uma variavel nula
  print(y?.isEven);
  
}
```

###### Saída
```
null
null
```

O operador `?` em `print(y?.isEven);` funciona como uma condicional: ele só faz a operação se `y` não é nulo, caso seja nulo ele retorna `null`.

Paralelamente, o operador `!` no lugar do `?` garante para o compilador que a variável não é nula. Dando erro e parando o programa caso seja nula.

## Funções

Funções têm a mesma sintáxe de `C`.

###### Exemplo
```dart
int soma(int x, int y){
  return x+y;
}

void main() {
  print(soma(1, 2));
}
```

Mas podem ter parâmetros opcionais, assim como Python.
```dart
int soma(int x, int y, [int z=0]){
  return x+y+z;
}

void main() {
  print(soma(1, 2));
  print(soma(1, 2, 3));
}
```
Os argumentos opcionais sempre devem vir por último, e devem estar entre colchetes. 

E assim como Python, podemos nomear os parâmetros explicitamente na chamada da função, fazendo com que não precisemos fornecer os parâmetros na mesma ordem.

```dart
int soma({int x=0, int y=0, int z=0}){
  return x+y+z;
}

void main() {
  print(soma(x:1, y:2));
  print(soma(z:1, y:2, x:3));
}
```

Se usarmos parâmetros nomeados, teremos que fornecer valores default para os argumentos, eles se tornam opcionais. Caso queira que os argumentos sejam nomeados E não opcionais, devemos usar o modificador `required`.

```dart
int soma({required int x, required int y, required int z}){
  return x+y+z;
}

void main() {
  //print(soma(x:1, y:2)); <-- ERRO, nao forneceu o argumento z que era obrigatorio
  print(soma(z:1, y:2, x:3));
}

```

Caso uma função possa ser definida em apenas uma linha podemos usar seguinte síntaxe:
```dart
int soma(int x, int y, [int z=0]) => x+y+z;

void main() {
  print(soma(1, 2));
  print(soma(1, 2, 3));
}
``` 

### Expressões Lambda

Algumas vezes precisamos passar uma função como argumento de uma função. Podemos fazer uma variável que é uma função:

```dart
void main() {
  Function quadrado = (int n) => print(n*n);
  quadrado.call(2);
}
```

Podemos criar uma função anônima quando passamos como argumentos para uma função:

```dart
void main() {
  List<int> numeros = [-2, -1, 0, 1, 2, 3];
  numeros.forEach((n)=>print(n*n));
}
```
O método `forEach` recebe uma função que recebe um elemento da lista e retorna nada, e faz isso para cada elemento.
###### Saída
```
4
1
0
1
4
9
```


###### Exemplo 2

```dart
void main() {
  // List.generate(n, f(index)) gera uma lista de n numeros 
  //                            usando a funcao f que recebe 
  //                            o indice de cada numero
  List<int> numerosQuadrados = List.generate(7, (int index) => index*index);
  print(numerosQuadrados);
  // List.where(f(n)) retorna um iterador para numeros da lista 
  //                  onde a funcao f(n) eh verdadeira
  Set<int> numerosQuadradosPares = numerosQuadrados.where((int n)=>n.isEven).toSet();
  print(numerosQuadradosPares);
    
}
```

###### Saída
```
[0, 1, 4, 9, 16, 25, 36]
{0, 4, 16, 36}
```


## Classes

Em Dart temos classes:

```dart
class Aluno{
  // atributos
  String ra;
  String nome;
  // Constructor, nao precisa de corpo
  Aluno(this.ra, this.nome);
  // override do toString
  @override
  String toString() {
    return 'RA: ${ra}, nome: ${nome}';
  }
}

void main() {
  Aluno a = Aluno('123', 'Ana');
  print(a);
  a.ra = '122';
  a.nome = 'Carla';
  print(a);
}
```
###### Saída
``` 
RA: 123, nome: Ana
RA: 122, nome: Carla
```

### Constructor com Nome

Em Dart podemos ter outros constructor com outros nome:
```dart
class Aluno{
  String ra;
  String nome;
  Aluno(this.ra, this.nome);
  Aluno.semRa(this.nome, [this.ra='']);
  @override
  String toString() {
    return 'RA: ${ra}, nome: ${nome}';
  }
}

void main() {
  Aluno a = Aluno.semRa('Ana');
  print(a);
}
```

### Getter e Setter

Dart permite que se defina atributos implícitos calculados em tempo real:

###### [Exemplo](https://dart.dev/language/methods#getters-and-setters)
``` 
/// A rectangle in a screen coordinate system,
/// where the origin `(0, 0)` is in the top-left corner.
class Rectangle {
  double left, top, width, height;

  Rectangle(this.left, this.top, this.width, this.height);

  // Define two calculated properties: right and bottom.
  double get right => left + width;
  set right(double value) => left = value - width;
  double get bottom => top + height;
  set bottom(double value) => top = value - height;
}

void main() {
  var rect = Rectangle(3, 4, 20, 15);
  assert(rect.left == 3);
  rect.right = 12;
  assert(rect.left == -8);
}
```

### Inicializadores tardios (*late*)

Alguns atributos podem depender da inicialização de outros atributos que serão inicializados apenas no constructor.

```dart
double initialX = 1.5;

class Point {
  // OK, can access declarations that do not depend on `this`:
  double? x = initialX;

  // ERROR, can't access `this` in non-`late` initializer:
  double? y = this.x;

  // OK, can access `this` in `late` initializer:
  late double? z = this.x;

  // OK, `this.x` and `this.y` are parameter declarations, not expressions:
  Point(this.x, this.y);
}
```


### Herança

Em Dart também temos herança.

No próximo exemplo vamos fazer duas classes: 

- `Animal`
   - com o atributo `nome`
   - com o método `dorme`
- `Pato`, subclasse de `Animal`
   - com o atributo `cor`
   - com o método `voa`
  
Observe que o `Pato`, além de ter seus atributos e métodos, tem todos os atributos e métodos herdados da classe `Animal`.

Observe que o constructor da subclasse **deve** chamar o constructor da super classe. A sintaxe é a mesma de `C#` mas usando a palavra `super`.

###### Exemplo Animal Pato

```dart
class Animal{
  String nome;
  Animal(this.nome);
  void dorme()=>print('O $nome dorme');
  @override
  String toString() {
    return 'Animal $nome';
  }
}

class Pato extends Animal{
  String cor;
  Pato(String aNome, this.cor):super(aNome);
  void voa()=>print('O pato $nome $cor voa');
  @override
  String toString() {
    return super.toString() + ': Pato cor $cor';
  }
}

void main(){
  print('\nCriando um Animal');
  Animal a = Animal("Mili");
  print(a);
  a.dorme();
  
  print('\nCriando um Pato');
  Pato p = Pato('Don', 'Amarelo');
  print(p);
  p.dorme();
  p.voa();
}
```

###### Saída

```
Criando um Animal
Animal Mili
O Mili dorme

Criando um Pato
Animal Don: Pato cor Amarelo
O Don dorme
O pato Don Amarelo voa
```

### *Overriding*

No exemplo anterior fizemos *override* de um método conhecido: `toString`

No próximo exemplo, a classe `Pato` vai fazer *override* do método `dorme`

```dart
class Animal{
  String nome;
  Animal(this.nome);
  void dorme()=>print('O $nome dorme');
  @override
  String toString() {
    return 'Animal $nome';
  }
}

class Pato extends Animal{
  String cor;
  Pato(String aNome, this.cor):super(aNome);
  void voa()=>print('O pato $nome $cor voa');
  
  // Podemos fazer override de qualquer metodo 
  //    definido pela superclasse
  //    Lembre de usar a anotacao @override
  @override 
  void dorme()=>print('O Pato $nome $cor dorme');
  
  @override
  String toString() {
    return super.toString() + ': Pato cor $cor';
  }
}
``` 

### Classe Abstrata

Para criar uma classe abstrada precisamos marcar a classe como *abstract* e poderemos ter método **não implementados**.

Classes concretas filhas de classes abstratas precisam implementar todos os métodos abstratos dos pais.

###### Exemplo classe abstrata
```dart
abstract class Animal{
  String nome;
  Animal(this.nome);
  void dorme()=>print('O $nome dorme');
  
  // metodo abstrato, nao precisa marcar como abstract
  //    precisa apenas nao definir o corpo
  void fazBarulho();
  
  @override
  String toString() {
    return 'Animal $nome';
  }
}

class Pato extends Animal{
  String cor;
  Pato(String aNome, this.cor):super(aNome);
  void voa()=>print('O pato $nome $cor voa');
  @override
  fazBarulho()=>print('Quack');
  @override
  String toString() {
    return super.toString() + ': Pato cor $cor';
  }
}

void main(){
  print('\nNao podemos criar um objeto Animal neste exemplo');
  // Animal a = Animal("Mili"); <- ERRO nao podemos criar um objecto de classe abstrata
  
  print('\nCriando um Pato');
  Pato p = Pato('Don', 'Amarelo');
  print(p);
  p.fazBarulho();
}
```

###### Saída
```
Nao podemos criar um objeto Animal neste exemplo

Criando um Pato
Animal Don: Pato cor Amarelo
Quack
```

### Polimorfismo

Polimorfismo é a habilidade que uma variável tem de fazer referência para qualquer objeto de uma subclasse do tipo da variável.

###### Exemplo Polimorfismo
```dart
abstract class Animal{
  String nome;
  Animal(this.nome);
  void dorme()=>print('O $nome dorme');
  void fazBarulho();
  @override
  String toString() => 'Animal $nome';
}

class Pato extends Animal{
  String cor;
  Pato(String aNome, this.cor):super(aNome);
  void voa()=>print('O pato $nome $cor voa');
  @override
  fazBarulho()=>print('Quack');
  @override
  String toString() => super.toString() + ': Pato cor $cor';
}

void main(){
  print('\nCriando um Animal que é um pato');
  Animal a = Pato('Don', 'Amarelo');
  
  a.fazBarulho();
  // a.voa(); <- ERRO: a, sendo do tipo Animal, 
  //                   nao pode usar voa, 
  //                   mesmo fazendo referencia 
  //                   para um objeto do tipo Pato
}

```

###### Saída
```
Criando um Animal que é um pato
Quack
```

## Mixin

Classes não podem herdar de mais de uma classe.

.