# Dart Crash Course

Este curso de Dart é destinado a pessoas que sabem os conceitos de Programação Estruturada e de Programação Orientada a Objetos.

Aqui serão apresentados os Core Concepts de Dart e serão comparados com as linguagens mais conhecidas.

Os programas podem ser testados online em [dartpad.dev](https://dartpad.dev).

Uma documentação exaustiva pode ser encontrada em [dart.dev](https://dart.dev/language)


## Aulas
- [01 Hello World, Print e String](aulas/01.hello.html)
- [# Variáveis, Tipos Numéricos e Booleanos, e Operadores](aulas/02.tipos.html)


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

### Interface (de classe, não é GUI)

Classes não podem herdar de mais de uma classe, mas podem implementar várias interfaces (e podem herdar mixin, como veremos abaixo)

```dart
class Animal{
  String nome;
  Animal(this.nome);
  void dorme()=>print('O $nome dorme');
  @override
  String toString() => 'Animal $nome';
}

abstract class Voavel{
  void voa();
}

class Pato extends Animal implements Voavel{
  String cor;
  Pato(String aNome, this.cor):super(aNome);
  @override
  void voa()=>print('O pato $nome $cor voa');
  @override
  String toString() => super.toString() + ': Pato cor $cor';
}

```

Em Dart qualquer classe é uma interface em potencial, com o detalhe de que se uma classe implementa uma segunda, a primeira **precisa** implementar seus métodos.

```dart
class Animal{
  String nome;
  Animal(this.nome);
  void dorme()=>print('O $nome dorme');
  @override
  String toString() => 'Animal $nome';
}

class Voavel{
  void voa() => print('nao sei o que voa');
}

class Pato extends Animal implements Voavel{
  String cor;
  Pato(String aNome, this.cor):super(aNome);
  @override
  void voa()=>print('O pato $nome $cor voa');
  @override
  String toString() => super.toString() + ': Pato cor $cor';
}

```

### Mixin

Mixin é um novo tipo de classe que fornece código que pode ser reutilizado em massa através de uma estrutura de hierarquia.

Como foi visto, uma classe não pode herdar de mais de uma classe, mas pode herdar de múltiplos mixin.

###### Exemplo mixin
```dart
class Animal{
  String nome;
  Animal(this.nome);
  void dorme()=>print('O $nome dorme');
  @override
  String toString() => 'Animal $nome';
}

mixin Voavel{
  void voa() => print('nao sei o que voa');
}

mixin Nadavel{
  void nada() => print('nao sei o que nada');
}

mixin Multimidia{
  void play() => print('toca musica');
}

mixin Brincavel{
  void play() => print('brinca');
}

class Pato extends Animal with Voavel, Nadavel, Multimidia, Brincavel{
  String cor;
  Pato(String aNome, this.cor):super(aNome);
  @override
  String toString() => super.toString() + ': Pato cor $cor';
}

void main(){
  Pato p = Pato('Don', 'Amarelo');
  p.voa();
  p.nada();
  p.play();
}

```
**OBS:** dois mixin com o mesmo método `play` foi atribuído, no resultado somente o último foi usado.

###### Saída
```
nao sei o que voa
nao sei o que nada
brinca
```

Mixin também podem ter atributos, e pode obrigar a classe a definir certos atributos.

No exemplo seguinte o mixin obriga `Pato` a ter `nome` e `velocidade`

```dart
class Animal{
  String nome;
  Animal(this.nome);
  void dorme()=>print('O $nome dorme');
  @override
  String toString() => 'Animal $nome';
}

mixin Voavel{
  // Atributos do mixin que a classe eh obrigada a ter
  String get nome;
  int get velocidade;
  void voa() => print('O $nome voa a $velocidade km/h');
}

class Pato extends Animal with Voavel{
  String cor;
  int velocidade = 1;
  Pato(String aNome, this.cor):super(aNome);
  @override
  String toString() => super.toString() + ': Pato cor $cor';
}

void main(){
  Pato p = Pato('Don', 'Amarelo');
  p.voa();
}
```

###### Saída
```
O Don voa a 1 km/h
```

### *Keyword* `final`

A palavra `final` para uma **classe** significa que esta classe não pode ser herdada.

A palavra `base` para uma classe permite que ela herde de uma classe `final`.

### *Keyword* `static`

Um atributo `static` quer dizer que o atributo pertence à classe e não ao objeto.

Um método `static` pertence à classe e só pode usar atributos pertencentes à classe e não ao objeto.

###### Exemplo `static`
```dart
class Utils{
  static double PI = 3.14;
  static double quadrado(double a) => a*a;
  static double areaCirculo(double raio) => raio*raio*PI;
}

void main(){
  print(Utils.PI);
  print(Utils.quadrado(2));
  print(Utils.areaCirculo(2));
}
```

###### Saída
```
3.14
4
12.56
```

.