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