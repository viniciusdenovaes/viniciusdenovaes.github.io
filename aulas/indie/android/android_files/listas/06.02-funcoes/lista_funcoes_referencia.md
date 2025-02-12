# Continuação Lista Funções e Passagem por Valor ou Referência

Escreva o resultado dos seguintes códigos

### 01 - Ponteiros (Este exercício não cairá na prova)

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


#### 02 - Passagem por valor (estará na prova)

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

#### 03 - Passagem por referência (estará na prova)


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


#### 04 - Arrays (estará na prova)

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

