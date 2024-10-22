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


