# Comandos de Controle

## Comando Condicional

O comando condicional `if` tem a seguinte sintaxe em C#:

* `if`: a `condicao` (uma expressão boolean, verdadeiro ou falso) é verificada. Caso seja verdadeira o `//bloco de comandos 01` é executado. Caso não seja, o bloco não será executado.
``` cs
if(condicao){
  //bloco de comandos 01
}
```

* `if-else`: a `condicao` é verificada. Caso seja verdadeira o `//bloco de comandos 01` é executado. Caso não seja, o `//bloco de comandos 02` será executado.
``` cs
if(condicao){
  //bloco de comandos 01
} else{
  //bloco de comandos 02
}
```

* `if-else-if`: a `condicao01` é verificada. Caso a `condicao01` seja verdadeira, o `//bloco de comandos 01` é executado **e** a `condicao02` **não** é verificada, **nem** o `//bloco de comandos 02` será executado. Caso a `condicao01` não seja verdadeira, a `condicao02` será verificada e caso esta seja verdadeira o `//bloco de comandos 02` será executado.
``` cs
if(condicao01){
  //bloco de comandos 01
} else if(condicao02){
  // bloco de comandos 02
}
```

**OBS:** Ao contrário de Python, aqui você precisa usar as chaves `{}`. **NÃO ESQUEÇA**.
Se você esquecer ele executará só o primeiro comando do bloco. Estranho né? Este é o pior tipo de erro que você pode encontrar no código. Por que ele não dará erro na compilação nem na execução. Mas o seu código estará errado **sem você saber**. Evite isso e **sempre use chaves**.

* `switch`: Dada uma `expressao` que pode ser `int`, `char`, `string`, `Enum`, [entre outros](https://learn.microsoft.com/en-us/dotnet/csharp/language-reference/statements/selection-statements). A sua `expressao` será comparada com cada um dos literais e executará o bloco respectivo. Caso nenhuma comparação resulte em verdadeiro, o bloco do `default` será executado.
``` cs
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
``` cs
while(condicao){
  // bloco de comandos 01
  // este bloco se repete enquanto a condicao for satisfeita
}
```


* `do while`: a `condicao` o bloco de comando é executado e **depois** a condição é verificada. Caso seja verdadeira o controle **volta** para o começo do while (e faz a verificação **no final** novamente). Caso não seja, o controle não volta.

OBS1: a única diferença entre este e o `while` é que neste você pode ter certeza de que o bloco será executado na primeira vez, mesmo que a condição seja falsa.

OBS2: perceba que tem um `;` no final do while.

OBS3: este comando não é usado com frequência

``` cs
do{
  // bloco de comandos 01
  // este bloco executa uma vez e
  // se repete enquanto a condicao for satisfeita
}while(condicao);
```


* `for`: é **inicializado** com um `comandoInicializacao`; repete enquanto a `condição` for verdadeira; sempre ao final de cada iteração um `comandoRepeticao` é executado.

``` cs
for(comandoInicializacao; condicao; comandoRepeticao){
  // bloco de comandos 01
  // este bloco se repete enquanto a condicao for satisfeita
  // ao final o comandoRepeticao é executado
}
```

exemplo:

``` cs
for(int i=0; i<5; i++){
  Console.WriteLine(i);
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

``` cs
for(Type object in collection){
  // bloco de comandos 01 usando o objeto object
}
```

exemplos:

``` cs
class Gato{

  String nome;

  public Gato(string aNome){
    this.nome = aNome;
  }

  public void miau(){
    Console.WriteLine(nome + " mia!")

  }

}
```

Usando `array` como coleção

``` cs
public static void Main(String[] args){

  Gato[] gatos = new Gato[3];

  gatos[0] = new Gato("Brutus");
  gatos[1] = new Gato("Chirriro");
  gatos[2] = new Gato("Xitara");

  for(Gato gato in gatos){
    gato.miau();
  }
}
```

usando `List` como coleção

``` cs
public static void Main(String[] args){

  List<Gato> gatos = new List<Gato>();

  gatos.Add(new Gato("Brutus"));
  gatos.Add(new Gato("Chirriro"));
  gatos.Add(new Gato("Xitara"));

  for(Gato gato in gatos){
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
