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