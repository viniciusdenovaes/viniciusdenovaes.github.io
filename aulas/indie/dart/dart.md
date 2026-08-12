# Dart Crash Course

Este curso de Dart é destinado a pessoas que sabem os conceitos de Programação Estruturada e de Programação Orientada a Objetos.

Aqui serão apresentados os Core Concepts de Dart e serão comparados com as linguagens mais conhecidas.

Os programas podem ser testados online em [dartpad.dev](https://dartpad.dev).

Uma documentação exaustiva pode ser encontrada em [dart.dev](https://dart.dev/language)


## Aulas
### Parte 1: Programação Estruturada
- [01. Hello World, Print e String](aulas/01.hello.html)
- [02. Variáveis, Tipos Numéricos e Booleanos, e Operadores](aulas/02.tipos.html)
- [03. Comandos Condicionais](aulas/03.condicional.html)
- [04. Estruturas de Dados (Listas, Conjuntos e Maps)](aulas/04.colecoes.html)
- [05. Funções, Expressões *lambda* e o Elemento `null`](aulas/05.funcoes.html)
### Parte 2: Programação Orientada a Objetos
- [06. Classes e Constructor](aulas/06.classes.html)
- [07. Getters e Setters e Inicializadores Tardios](aulas/07.getter_setter.html)
- [08. Herança](aulas/08.heranca.html)


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