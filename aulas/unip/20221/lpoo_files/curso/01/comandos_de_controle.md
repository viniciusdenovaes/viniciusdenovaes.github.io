# Comandos de Controle

## Comando Condicional

O comando condicional `if` tem a seguinte sitaxe em Java:

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

Em construção

### Continuação

Existe muito mais material sobre estes assuntos, alguns serão colocados nesta página, outros serão dados em aula, e outros estão nos livros da ementa.

Alguns assuntos não tratados aqui são:
 - `for(int i=0; i<n; ++i)`
 - `while`
 - `do{}while`
 - `for(Object object : objects)`
