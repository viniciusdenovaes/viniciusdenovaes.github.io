#include <stdio.h>

int main(){
    int n;
    scanf("%d", &n);
    float soma = 0;
    for(int i=1; i<=n; i++){
        printf("digite o numero %d de 10:\n", i);
        float numero;
        scanf("%f", &numero);
        soma+=numero;
    }
    printf("soma: %f\n", soma);
}
