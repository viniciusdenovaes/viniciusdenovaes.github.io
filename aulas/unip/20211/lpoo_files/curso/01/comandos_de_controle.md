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

### Continuação

Existe muito mais material sobre estes assuntos, alguns serão colocados nesta página, outros serão dados em aula, e outros estão nos livros da ementa.

Alguns assuntos não tratados aqui são:
 - `switch`


## Comandos de Repetição

Em construção

### Continuação

Existe muito mais material sobre estes assuntos, alguns serão colocados nesta página, outros serão dados em aula, e outros estão nos livros da ementa.

Alguns assuntos não tratados aqui são:
 - `for(int i=0; i<n; ++i)`
 - `while`
 - `do{}while`
 - `for(Object object : objects)`
