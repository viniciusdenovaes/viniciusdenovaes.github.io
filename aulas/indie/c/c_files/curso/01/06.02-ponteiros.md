# Ponteiros

Conhecemos variáveis, que são estruturas usadas para guardar um valor com um nome. 
Através do nome o valor pode ser lido ou modificado.

Uma variável guarda o valor em um lugar da memória, nós não precisamos saber que lugar é esse, precisamos saber apenas o nome da variável para acessar o valor.

Este lugar da memória pode ter apenas um nome, o da variável associada a este. Mas e se precisarmos de mais de uma variável "olhando" para este lugar da memória? E se precisarmos acessar (e modificar) este valor de lugares diferentes do nosso código onde não temos acesso a esta variável?

Nestes casos temos que fazer uso dos ponteiros:

Ponteiro é uma variável em que o valor é um lugar da memória. Todo lugar do programa que tiver acesso a este endereço pode modificar e ler o valor que está ali.

Vamos ver:
* o que ponteiros podem fazer, 
* o que precisamos saber sobre ponteiros,
* o que **não** precisaremos saber sobre ponteiros (quando formos programar em linguagens como Java, Python e C#, que têm garbage collector)


## Ponteiros em C

Um ponteiro guarda o endereço de uma variável, então precisamos fornecer o endereço da variável para ele.

No exemplo abaixo criamos um ponteiro com o modificador de definição de variável `*` antes do nome da variável, para indicar que ela é um ponteiro. 
Ao passar um valor para o ponteiro usamos o operador `&` para acessar o endereço da variável `a`.

``` c
int *pa = &a;
```

Para acessar o **endereço** para onde `pa` aponta lemos o valor de `pa`. 
Para acessar o **valor** que está no endereço para onde `pa` aponta lemos o valor de `*pa`. 
Usamos `%p` para indicar que queremos imprimir um endereço.

``` c
printf("valor do ponteiro pa: %d\n", *pa);
printf("endereco para onde pa aponta: %p\n", pa);
```

Rode o código abaixo e veja qual será o valor que será impresso.

``` c
#include<stdio.h>

int main(){
	int a = 3;
	int *pa = &a;
	printf("valor de a: %d\n", a);
	printf("valor do ponteiro pa: %d\n", *pa);
	printf("endereco de a: %p\n", &a);
	printf("endereco para onde pa aponta: %p\n", pa);
	
	*pa = 5;
	
	printf("valor de a depois de mudar o valor pelo ponteiro: %d\n", a);
	printf("valor do ponteiro pa: %d\n", *pa);
}
```

saída
```
valor de a: 3
valor do ponteiro pa: 3
endereco de a: 0061FF18
endereco para onde pa aponta: 0061FF18
valor de a depois de mudar o valor pelo ponteiro: 5
valor do ponteiro pa: 5
```

## Passagem por referência (Você precisa saber: IMPORTANTE!!!)

O uso mais comum de ponteiros, e o que é usado também em Java, Python e C#, é a passagem para uma função por referência.

Quando passamos um valor de uma variável `a` para uma função, este valor é copiado para a variável de entrada `x`. Não conseguimos modificar o valor da variável `a` de dentro da função.

Veja o exemplo do código abaixo:

``` c
#include<stdio.h>

void muda_valor_sem_referencia(int x){
	x = 5;
	printf("valor de x dentro da funcao: %d\n", x);
}

int main(){
	int a = 3;
	printf("valor de a antes da funcao: %d\n", a);
	muda_valor_sem_referencia(a);
	printf("valor de a depois da funcao: %d\n", a);
}
```

Saída
```
valor de a antes da funcao: 3 
valor de x dentro da funcao: 5
valor de a depois da funcao: 3
```

Mas se passarmos o **endereço da variável** `a`, denotado por `&a`, para um ponteiro `px`, definido por `int *px`. Poderemos, de **dentro da função**, modificar o valor de `a`, a variável que foi definida fora da função.


``` c
#include<stdio.h>

void muda_valor_com_referencia(int *px){
	*px = 5;
	printf("valor de px dentro da funcao: %d\n", *px);
}

int main(){
	int a = 3;
	printf("valor de a antes da funcao: %d\n", a);
	muda_valor_com_referencia(&a);
	printf("valor de a depois da funcao: %d\n", a);
}
```

Saída
```
valor de a antes da funcao: 3
valor de px dentro da funcao: 5
valor de a depois da funcao: 5
```

### Arrays, um caso especial

Quando definimos arrays do seguinte modo `int v[n]`, o valor de `v` já um ponteiro para um lugar na memória. Um lugar com espaço para `n` inteiros.

Então quando passamos um array para uma função, essa passagem **sempre** é uma passagem por referência.

``` c
#include<stdio.h>

void recebe_array_referencia(int v[], int tamanho){
	for(int i=0; i<tamanho; i++){
		v[i] = 11 + i;
	}
}

int main(){
	int a[] = {1, 2, 3};
	int tam = 3;
	printf("valor de a antes da funcao: \n");
	for(int i=0; i<tam; i++){
		printf("%d, ", a[i]);
	}
	printf("\n");
	
	// nao precisamos passar o endereco de a, 
	// pois o valor de um array ja eh seu endereco
	recebe_array_referencia(a, tam);
	
	printf("valor de a depois da funcao: \n");
	for(int i=0; i<tam; i++){
		printf("%d, ", a[i]);
	}
	printf("\n");
}
```

Saída
```
valor de a antes da funcao: 
1, 2, 3,
valor de a depois da funcao:
11, 12, 13,
```

