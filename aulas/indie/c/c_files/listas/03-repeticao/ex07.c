#include <stdio.h>

int main(){
    float soma = 0;
    for(int i=1; i<=10; i++){
        printf("digite o numero %d de 10:\n", i);
        float n;
        scanf("%f", &n);
        soma+=n;
    }
    printf("soma: %f\n", soma);
}
