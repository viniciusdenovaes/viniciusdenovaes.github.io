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




.