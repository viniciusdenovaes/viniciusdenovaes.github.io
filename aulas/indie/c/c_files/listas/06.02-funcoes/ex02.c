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