# Strings

String é um tipo especial de array para representar palavras (ou frases).

Funciona como qualquer array comum, mas temos alguma funcionalidades a mais que veremos a seguir.

## Criando Strings em C

Para criar uma **variavel** de uma String em C podemos criar um array de characteres:

Neste exemplo estamos criando uma String que pode ter, no máximo, 9 letras.
``` c
char s[10];
```
Isso por que na última posição de uma String **sempre tem o símbolo `\0`**

### Criando o literal de uma String

Neste exemplo estamos armazenando a palavra `"casa"` na variavel `s`.
``` c
s = "casa";
```

Isso seria a mesma coisa que fazer
``` c
s[0] = 'c';
s[1] = 'a';
s[2] = 's';
s[3] = 'a';
s[4] = '\0';
```
As outras posições `s[5]` até `s[9]` terão lixo de memória.

## Imprimindo uma String

Usamos `%s` para imprimir uma String usando a função `printf`

``` c
printf("%s", s);
```

## Lendo uma String

Podemos usar a função `scanf` para ler uma string do teclado:

Neste caso
* Não precisamos usar o símbolo `&` antes da variável.
* Será lido a palavra entrada **até o primeiro espaço**

``` c
scanf("%s", s);
```

Para ler uma String até o "enter" (ou new line `\n`) devemos usar a função `gets`
``` c
gets(s);
```

## Funcionalidades

Como sao estruturas especiais, Strings têm várias funcionalidades para facilitar o código

### tamanho de uma string

A função `int strlen(char[])` recebe uma string e retorna o tamanho dela.

``` c
printf("%d", strlen(s));
```
### copiar uma string para outra

A função `strcpy(char *destino, char *origem)` copia o conteúdo da string origem para a string de destino.

``` c
char s2[10];
strcpy(s2, s);
```

### Concatenar strings

Concatenar strings é combinar duas strings uma depois da outra.

Usamos a função `strcat(char *destino, char *origem)` copia o conteúdo da string origem para **o final** da string de destino.

``` c
char s1[10] = "bom ";
char s2[10] = "dia!";
strcat(s1, s2);
printf("%s", s1);
```

### Comparando duas Strings

Para comparar se duas strings são iguais **não podemos** simplesmente testar `s1==s2`.

Temos que usar uma função!

A função para isso é a `strcmp(char *str1, char *str2)` compara o character de cada posição das duas strings e **retorna 0 caso as duas sejam iguais**. Um valor diferente de 0 quer dizer que as duas são diferentes.

``` c
char s1[10] = "igual";
char s2[10] = "igual";
char s3[10] = "diferente";
printf("%d\n", strcmp(s1, s2));
printf("%d\n", strcmp(s1, s3));
```

