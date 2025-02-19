# Comandos de Controle

## Comando Condicional

O comando condicional `if` tem a seguinte sintaxe em Java:

* `if`: a `condicao` (uma expressão boolean, verdadeiro ou falso) é verificada. Caso seja verdadeira o `//bloco de comandos 01` é executado. Caso não seja, o bloco não será executado.
``` java
if(condicao){
  //bloco de comandos 01
}
```

* `if-else`: a `condicao` é verificada. Caso seja verdadeira o `//bloco de comandos 01` é executado. Caso não seja, o `//bloco de comandos 02` será executado.
``` java
if(condicao){
  //bloco de comandos 01
} else{
  //bloco de comandos 02
}
```

* `if-else-if`: a `condicao01` é verificada. Caso a `condicao01` seja verdadeira, o `//bloco de comandos 01` é executado **e** a `condicao02` **não** é verificada, **nem** o `//bloco de comandos 02` será executado. Caso a `condicao01` não seja verdadeira, a `condicao02` será verificada e caso esta seja verdadeira o `//bloco de comandos 02` será executado.
``` java
if(condicao01){
  //bloco de comandos 01
} else if(condicao02){
  // bloco de comandos 02
}
```

Podemos colocar um else no final também

``` java
if(condicao01){
  //bloco de comandos 01
} else if(condicao02){
  // bloco de comandos 02
} else{
  // bloco de comandos 03
}
```

**OBS:** Ao contrário de Python, aqui você precisa usar as chaves `{}`. **NÃO ESQUEÇA**.
Se você esquecer ele executará só o primeiro comando do bloco. Estranho né? Este é o pior tipo de erro que você pode encontrar no código. Por que ele não dará erro na compilação nem na execução. Mas o seu código estará errado **sem você saber**. Evite isso e **sempre use chaves**.

* `switch`: Dada uma `expressao` que pode ser `int`, `char`, `String`, `Enum`, [entre outros](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html). A sua `expressao` será comparada com cada um dos literais e executará o bloco respectivo. Caso nenhuma comparação resulte em verdadeiro, o bloco do `default` será executado.
``` java
switch(expressao){
  case literal01:
    // bloco de comandos 01
    break;
  case literal02:
    // bloco de comandos 02
    break;
  case literal03:
    // bloco de comandos 03
    break;
  default:
    // bloco de comandos 04
}
```


## Comandos de Repetição

* `while`: a `condicao` (uma expressão boolean, verdadeiro ou falso) é verificada. Caso seja verdadeira o `//bloco de comandos 01` é executado e o controle **volta** para o começo do while (e faz a verificação novamente). Caso não seja, o bloco não será executado.
``` java
while(condicao){
  // bloco de comandos 01
  // este bloco se repete enquanto a condicao for satisfeita
}
```


* `do while`: a `condicao` o bloco de comando é executado e **depois** a condição é verificada. Caso seja verdadeira o controle **volta** para o começo do while (e faz a verificação **no final** novamente). Caso não seja, o controle não volta.

``` java
do{
  // bloco de comandos 01
  // este bloco executa uma vez e
  // se repete enquanto a condicao for satisfeita
}while(condicao);
```

OBS1: a única diferença entre este e o `while` é que neste você pode ter certeza de que o bloco será executado na primeira vez, mesmo que a condição seja falsa.

OBS2: perceba que tem um `;` no final do while.

OBS3: este comando não é usado com frequência


* `for`: é **inicializado** com um `comandoInicializacao`; repete enquanto a `condição` for verdadeira; sempre ao final de cada iteração um `comandoRepeticao` é executado.

``` java
for(comandoInicializacao; condicao; comandoRepeticao){
  // bloco de comandos 01
  // este bloco se repete enquanto a condicao for satisfeita
  // ao final o comandoRepeticao é executado
}
```

exemplo:

``` java
for(int i=0; i<5; i++){
  System.out.println(i);
}
```
saída:
```
0
1
2
3
4
```


* `for-each`: Dada uma coleção (`collection`) qualquer, este **iterador** acessa cada objeto dentro da coleção.

``` java
for(Type object: collection){
  // bloco de comandos 01 usando o objeto object
}
```

### Exemplos do `for-each`

#### Iterando usando inteiros com array

``` java
public static void main(String[] args){

  int[] numeros = new int[3];

  numeros[0] = 10;
  numeros[1] = 21;
  numeros[2] = 32;

  for(int n: numeros){
    System.out.println(n);
  }
}
```

##### Usando `List` como coleção

``` java
public static void main(String[] args){

  List<Integer> numeros = new ArrayList<>();

  numeros.add(10);
  numeros.add(21);
  numeros.add(32);

  for(int n: numeros){
    System.out.println(n);
  }
}
```
saída em ambos os programas:
```
10
21
32
```


#### Iterando usando objetos com array

``` java
class Gato{

  String nome;

  public Gato(String aNome){
    this.nome = aNome;
  }

  public void miau(){
    system.out.println(nome + " mia!")

  }

}
```

##### Usando `array` como coleção

``` java
public static void main(String[] args){

  Gato[] gatos = new Gato[3];

  gatos[0] = new Gato("Brutus");
  gatos[1] = new Gato("Chirriro");
  gatos[2] = new Gato("Xitara");

  for(Gato gato: gatos){
    gato.miau();
  }
}
```

##### usando `List` como coleção

``` java
public static void main(String[] args){

  List<Gato> gatos = new ArrayList<>();

  gatos.add(new Gato("Brutus"));
  gatos.add(new Gato("Chirriro"));
  gatos.add(new Gato("Xitara"));

  for(Gato gato: gatos){
    gato.miau();
  }
}
```
saída em ambos os programas:
```
Brutus mia!
Chirriro mia!
Xitara mia!
```



### Continuação

Existe muito mais material sobre estes assuntos, alguns serão colocados nesta página, outros serão dados em aula, e outros estão nos livros da ementa.
